package ca.wstratto.wow4j;

import ca.wstratto.wow4j.constants.Locale;
import ca.wstratto.wow4j.constants.Region;
import ca.wstratto.wow4j.domain.data.Talent;
import ca.wstratto.wow4j.domain.data.talent.Column;
import ca.wstratto.wow4j.domain.data.talent.Tree;
import ca.wstratto.wow4j.gson.deserializer.AchievementDeserializer;
import ca.wstratto.wow4j.gson.deserializer.ZoneDeserializer;
import ca.wstratto.wow4j.gson.deserializer.data.ColumnDeserializer;
import ca.wstratto.wow4j.gson.deserializer.data.TalentDeserializer;
import ca.wstratto.wow4j.gson.deserializer.data.TalentsDeserializer;
import ca.wstratto.wow4j.gson.deserializer.data.TreeDeserializer;
import ca.wstratto.wow4j.response.AbstractResponse;
import ca.wstratto.wow4j.response.Achievement;
import ca.wstratto.wow4j.response.Zone;
import ca.wstratto.wow4j.response.data.Talents;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.lang3.StringUtils;
import org.stringtemplate.v4.ST;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ConcurrentHashMap;

public class Connection {
    private static final String API_BASE_URL = "https://<region>.api.battle.net/";
    private static final ConcurrentHashMap<String, Connection> CONNECTION_INSTANCES = new ConcurrentHashMap<>();
    private static final GsonBuilder GSON_BUILDER = new GsonBuilder();

    public static final Gson GSON;

    private final String apiKey;
    private final Region region;
    private final Locale locale;

    static {
        GSON_BUILDER.registerTypeAdapter(Zone.class, new ZoneDeserializer());
        GSON_BUILDER.registerTypeAdapter(Achievement.class, new AchievementDeserializer());
        GSON_BUILDER.registerTypeAdapter(Talents.class, new TalentsDeserializer());
        GSON_BUILDER.registerTypeAdapter(Talent.class, new TalentDeserializer());
        GSON_BUILDER.registerTypeAdapter(Tree.class, new TreeDeserializer());
        GSON_BUILDER.registerTypeAdapter(Column.class, new ColumnDeserializer());
        GSON = GSON_BUILDER.create();
    }

    private Connection(String apiKey, Region region, Locale locale) {
        this.apiKey = apiKey;
        this.region = region;
        this.locale = locale;
    }

    public static synchronized Connection getInstance(String apiKey, Region region, Locale locale) {
        if (StringUtils.isBlank(apiKey)) {
            throw new IllegalArgumentException("apiKey cannot be null or empty");
        }

        if (region == null) {
            throw new IllegalArgumentException("region cannot be null or empty");
        }

        String hashKey = apiKey + region.getRegion();

        return CONNECTION_INSTANCES.computeIfAbsent(hashKey, key -> new Connection(apiKey, region, locale == null ? Locale.EN_US : locale));
    }

    public static synchronized void flushConnections() {
        CONNECTION_INSTANCES.clear();
    }

    public static synchronized int availableConnections() {
        return CONNECTION_INSTANCES.size();
    }

    public synchronized <T extends AbstractResponse> T getRequestData(Request request) throws UnirestException, UnsupportedEncodingException {
        String url = getRequestUrl(request);
        return GSON.fromJson(new InputStreamReader(Unirest.get(url).asBinary().getBody(), "UTF-8"),
                (Class<T>) request.getRequestType().getResponseType());
    }

    private String getRequestUrl(Request request) {
        String requestUrl = new ST(API_BASE_URL).add("region", this.region.getRegion()).render() + request.getGeneratedUrl();
        String apiKeyAndLocale = "";

        if (!request.hasApiKey()) {
            apiKeyAndLocale += "apiKey=" + this.apiKey;
        }

        if (!request.hasLocale()) {
            if (apiKeyAndLocale.length() != 0) {
                apiKeyAndLocale += "&";
            }

            apiKeyAndLocale += "locale=" + this.locale.getLocale();
        }

        if (!requestUrl.endsWith("?")) {
            requestUrl += "&";
        }

        return requestUrl + apiKeyAndLocale;
    }
}

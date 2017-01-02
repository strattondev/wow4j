package ca.wstratto.wow4j;

import ca.wstratto.wow4j.constants.Locale;
import ca.wstratto.wow4j.constants.Region;
import ca.wstratto.wow4j.response.AbstractResponse;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.apache.commons.lang3.StringUtils;
import org.stringtemplate.v4.ST;

import java.io.InputStreamReader;
import java.util.concurrent.ConcurrentHashMap;

public class Connection {
    private static final String API_BASE_URL = "https://<region>.api.battle.net/";
    private static final ConcurrentHashMap<String, Connection> CONNECTION_INSTANCES = new ConcurrentHashMap<>();
    private final Gson gson = new Gson();
    private final String apiKey;
    private final Region region;
    private final Locale locale;

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

    public synchronized <T extends AbstractResponse> T getRequestData(Request request) throws Exception {
        String url = getRequestUrl(request);
        return gson.fromJson(new InputStreamReader(Unirest.get(url).asBinary().getBody(), "UTF-8"),
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

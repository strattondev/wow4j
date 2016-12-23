package ca.wstratto.wow4j;

import ca.wstratto.wow4j.constants.Locale;
import ca.wstratto.wow4j.constants.Region;
import org.apache.commons.lang3.StringUtils;
import org.stringtemplate.v4.ST;

import java.util.concurrent.ConcurrentHashMap;

public class Connection {
    private static final String API_BASE_URL = "https://<region>.api.battle.net/";
    private static final ConcurrentHashMap<String, Connection> CONNECTION_INSTANCES = new ConcurrentHashMap<>();
    private final String apiKey;
    private final Region region;
    private final Locale locale;

    private Connection(String apiKey, Region region, Locale locale) {
        this.apiKey = apiKey;
        this.region = region;
        this.locale = locale;
    }

    public static Connection getInstance(String apiKey, Region region, Locale locale) {
        if (StringUtils.isBlank(apiKey)) {
            throw new IllegalArgumentException("apiKey cannot be null or empty");
        }

        if (region == null) {
            throw new IllegalArgumentException("region cannot be null or empty");
        }

        if (locale == null) {
            locale = Locale.EN_US;
        }

        String hashKey = apiKey + region.getRegion();

        if (!CONNECTION_INSTANCES.containsKey(hashKey)) {
            CONNECTION_INSTANCES.put(hashKey, new Connection(apiKey, region, locale));
        }

        return CONNECTION_INSTANCES.get(hashKey);
    }

    public static int availableConnections() {
        return CONNECTION_INSTANCES.size();
    }

    private String getRequestUrl(Request request) {
        String requestUrl = new ST(API_BASE_URL).add("region", this.region.getRegion()).render();
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

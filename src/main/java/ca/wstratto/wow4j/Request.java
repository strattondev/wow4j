package ca.wstratto.wow4j;

import ca.wstratto.wow4j.constants.RequestParams;
import ca.wstratto.wow4j.constants.RequestType;
import ca.wstratto.wow4j.exception.MissingRequiredParamException;
import org.stringtemplate.v4.ST;

import java.util.Collections;
import java.util.Map;

public class Request {
    private static final Map<RequestParams, String> EMPTY_REQUIRED_PARAMS = Collections.emptyMap();
    private static final Map<String, String> EMPTY_OPTIONAL_PARAMS = Collections.emptyMap();
    private static final String API_KEY_KEY = "apiKey";
    private static final String LOCALE_KEY = "locale";

    private String generatedUrl;
    private boolean apiKey;
    private boolean locale;

    public Request(RequestType requestType, Map<RequestParams, String> requiredParams, Map<String, String> optionalParams) {
        if (requestType == null) {
            throw new IllegalArgumentException("requestType cannot be null");
        }

        if (requiredParams == null) {
            requiredParams = EMPTY_REQUIRED_PARAMS;
        }

        if (requestType.getRequiredParams().size() > requiredParams.size()) {
            throw new MissingRequiredParamException();
        }

        for (RequestParams element : requestType.getRequiredParams()) {
            if (!requiredParams.containsKey(element)) {
                throw new MissingRequiredParamException();
            }
        }

        this.apiKey = false;
        this.locale = false;

        ST st = new ST(requestType.getDir());

        for (Map.Entry<RequestParams, String> entry : requiredParams.entrySet()) {
            st.add(entry.getKey().getTemplateKey(), entry.getValue());
        }

        this.generatedUrl = st.render() + "?";

        if (optionalParams == null) {
            optionalParams = EMPTY_OPTIONAL_PARAMS;
        }

        for (Map.Entry<String, String> element : optionalParams.entrySet()) {
            if (!this.generatedUrl.endsWith("?")) {
                this.generatedUrl += "&";
            }

            this.generatedUrl += element.getKey() + "=" + element.getValue();

            if (element.getKey().equalsIgnoreCase(API_KEY_KEY)) {
                this.apiKey = true;
            }

            if (element.getKey().equalsIgnoreCase(LOCALE_KEY)) {
                this.locale = true;
            }
        }
    }

    public String getGeneratedUrl() {
        return generatedUrl;
    }

    public boolean hasApiKey() {
        return apiKey;
    }

    public boolean hasLocale() {
        return locale;
    }
}

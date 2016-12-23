package ca.wstratto.wow4j;

import ca.wstratto.wow4j.constants.RequestParams;
import ca.wstratto.wow4j.constants.RequestType;
import ca.wstratto.wow4j.exception.MissingRequiredParamException;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class RequestTest {
    private static final RequestType REQUEST_TYPE_CHALLENGE_MODE = RequestType.CHALLENGE_MODE_REALM_LEADERBOARD;
    private static final Map<RequestParams, String> EMPTY_REQUIRED_PARAMS = Collections.emptyMap();
    private static final Map<RequestParams, String> INVALID_REQUIRED_PARAMS_CHALLENGE_MODE = Collections.singletonMap(RequestParams.CHARACTER_NAME, "puntr");
    private static final Map<RequestParams, String> VALID_REQUIRED_PARAMS_CHALLENGE_MODE = Collections.singletonMap(RequestParams.REALM, "illidan");
    private static final Map<String, String> VALID_OPTIONAL_PARAMS = Collections.singletonMap("opt", "true");
    private static final Map<String, String> VALID_OPTIONAL_PARAMS_WITH_LOCALE = Collections.singletonMap("locale", "en_US");
    private static final Map<String, String> VALID_OPTIONAL_PARAMS_WITH_APIKEY = new HashMap<String, String>() {{
        put("apiKey", "apiKeyValue");
        put("opt", "true");
    }};

    private Request request;

    @Test
    public void testNullParams() {
        try {
            request = new Request(null, null, null);
            fail("Should have thown an exception");
        } catch (IllegalArgumentException expected) {}

        try {
            request = new Request(REQUEST_TYPE_CHALLENGE_MODE, null, null);
            fail("Should have thrown an exception");
        } catch (MissingRequiredParamException expected) {}

        try {
            request = new Request(REQUEST_TYPE_CHALLENGE_MODE, EMPTY_REQUIRED_PARAMS, null);
            fail("Should have thrown an exception");
        } catch (MissingRequiredParamException expected) {}

        try {
            request = new Request(REQUEST_TYPE_CHALLENGE_MODE, INVALID_REQUIRED_PARAMS_CHALLENGE_MODE, null);
            fail("Should have thrown an exception");
        } catch (MissingRequiredParamException expected) {}
    }

    @Test
    public void testValidRequest() {
        request = new Request(REQUEST_TYPE_CHALLENGE_MODE, VALID_REQUIRED_PARAMS_CHALLENGE_MODE, null);
        assertEquals("Strings should equal", "wow/challenge/illidan?", request.getGeneratedUrl());
        assertFalse("hasApiKey should be false", request.hasApiKey());
        assertFalse("hasLocale should be false", request.hasLocale());

        request = new Request(REQUEST_TYPE_CHALLENGE_MODE, VALID_REQUIRED_PARAMS_CHALLENGE_MODE, VALID_OPTIONAL_PARAMS);
        assertEquals("Strings should equal", "wow/challenge/illidan?opt=true", request.getGeneratedUrl());
        assertFalse("hasApiKey should be false", request.hasApiKey());
        assertFalse("hasLocale should be false", request.hasLocale());

        request = new Request(REQUEST_TYPE_CHALLENGE_MODE, VALID_REQUIRED_PARAMS_CHALLENGE_MODE, VALID_OPTIONAL_PARAMS_WITH_APIKEY);
        assertEquals("Strings should equal", "wow/challenge/illidan?opt=true&apiKey=apiKeyValue", request.getGeneratedUrl());
        assertTrue("hasApiKey should be true", request.hasApiKey());
        assertFalse("hasLocale should be false", request.hasLocale());

        request = new Request(REQUEST_TYPE_CHALLENGE_MODE, VALID_REQUIRED_PARAMS_CHALLENGE_MODE, VALID_OPTIONAL_PARAMS_WITH_LOCALE);
        assertEquals("Strings should equal", "wow/challenge/illidan?locale=en_US", request.getGeneratedUrl());
        assertFalse("hasApiKey should be false", request.hasApiKey());
        assertTrue("hasLocale should be true", request.hasLocale());
    }
}

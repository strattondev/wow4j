package ca.wstratto.wow4j.build;

import ca.wstratto.wow4j.Request;
import ca.wstratto.wow4j.builder.RequestBuilder;
import ca.wstratto.wow4j.constants.RequestParams;
import ca.wstratto.wow4j.constants.RequestType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class RequestBuilderTest {
    @Test
    public void testRequestBuilderIncomplete() {
        RequestBuilder requestBuilder = RequestBuilder.create();
        assertFalse("Should not be complete", requestBuilder.isComplete());
        try {
            requestBuilder.build();
            fail("Should have thrown exception");
        } catch (IllegalStateException expected) {}

        requestBuilder.setRequestType(RequestType.CHARACTER);
        assertFalse("Should not be complete", requestBuilder.isComplete());
        try {
            requestBuilder.build();
            fail("Should have thrown exception");
        } catch (IllegalStateException expected) {}

        requestBuilder.addRequiredParamValue(RequestParams.CHARACTER_NAME, "puntr");
        assertFalse("Should not be complete", requestBuilder.isComplete());
        try {
            requestBuilder.build();
            fail("Should have thrown exception");
        } catch (IllegalStateException expected) {}

        requestBuilder.addRequiredParamValue(RequestParams.REALM, "illidan");
        assertTrue("Should be complete", requestBuilder.isComplete());

        Request request = requestBuilder.build();
        assertEquals("Strings should equal", "wow/character/illidan/puntr?", request.getGeneratedUrl());
    }

    @Test
    public void testRequestBuilderComplete() {
        Request request = RequestBuilder.create()
                .setRequestType(RequestType.CHALLENGE_MODE_REALM_LEADERBOARD)
                .addRequiredParamValue(RequestParams.REALM, "illidan")
                .addOptionalParamValues("apiKey", "key")
                .build();
        assertEquals("Strings should equal", "wow/challenge/illidan?apiKey=key", request.getGeneratedUrl());
    }
}

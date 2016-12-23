package ca.wstratto.wow4j;

import ca.wstratto.wow4j.constants.Locale;
import ca.wstratto.wow4j.constants.Region;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConnectionTest {
    private static final String TEST_API_KEY = "NOT_EMPTY";
    private static final String TEST_API_KEY_MORE = TEST_API_KEY + "_MORE";
    private static final Region TEST_REGION = Region.US;
    private static final Locale TEST_LOCALE = Locale.EN_US;

    @Test
    public void testGetInstances() {
        Connection connection;

        try {
            connection = Connection.getInstance(null, TEST_REGION, TEST_LOCALE);
            fail("Should have thrown error");
        } catch (IllegalArgumentException expected) {
        }

        try {
            connection = Connection.getInstance("", TEST_REGION, TEST_LOCALE);
            fail("Should have thrown error");
        } catch (IllegalArgumentException expected) {
        }

        try {
            connection = Connection.getInstance(TEST_API_KEY, null, TEST_LOCALE);
            fail("Should have thrown error");
        } catch (IllegalArgumentException expected) {
        }

        assertEquals("Should have no connections", 0, Connection.availableConnections());

        connection = Connection.getInstance(TEST_API_KEY, TEST_REGION, TEST_LOCALE);
        assertEquals("Should have one connection", 1, Connection.availableConnections());

        connection = Connection.getInstance(TEST_API_KEY, TEST_REGION, TEST_LOCALE);
        assertEquals("Should have one connection", 1, Connection.availableConnections());

        connection = Connection.getInstance(TEST_API_KEY, TEST_REGION, TEST_LOCALE);
        assertEquals("Should have one connection", 1, Connection.availableConnections());

        connection = Connection.getInstance(TEST_API_KEY_MORE, TEST_REGION, TEST_LOCALE);
        assertEquals("Should have two connections", 2, Connection.availableConnections());
    }
}

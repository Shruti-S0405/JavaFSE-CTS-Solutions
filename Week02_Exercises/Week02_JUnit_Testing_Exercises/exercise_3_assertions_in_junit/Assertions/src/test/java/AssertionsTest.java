import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // assertEquals
        assertEquals(5, 2 + 3);

        // assertTrue
        assertTrue(5 > 3);

        // assertFalse
        assertFalse(5 < 3);

        // assertNull
        assertNull(getNullValue());

        // assertNotNull
        assertNotNull(new Object());
    }

    // Helper method
    private Object getNullValue() {
        return null;
    }
}

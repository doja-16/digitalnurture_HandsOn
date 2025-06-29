import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsInJUnit {

    @Test
    public void testStringEquality() {
        String expected = "Hello";
        String actual = "Hello";
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBooleanCondition() {
        boolean status = 5 > 2;
        assertTrue(status);
    }

    @Test
    public void testNullCheck() {
        Object obj = null;
        assertNull(obj);
    }
}

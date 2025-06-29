import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingUpJUnit {

    @Test
    public void testAddition() {
        int result = 5 + 3;
        assertEquals(8, result, "Addition result should be 8");
    }
}

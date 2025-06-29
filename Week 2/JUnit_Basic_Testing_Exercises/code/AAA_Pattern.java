import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AAA_Pattern{

    private List<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
        list.add("Java");
    }

    @Test
    void testAddItem() {
        // Arrange is done in setUp()
        // Act
        list.add("JUnit");

        // Assert
        assertTrue(list.contains("JUnit"));
    }

    @AfterEach
    void tearDown() {
        list.clear();
    }

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Before All Tests");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("After All Tests");
    }
}

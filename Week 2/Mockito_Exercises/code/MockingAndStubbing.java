import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;

public class MockingAndStubbing {

    @Test
    public void testMockingAndStubbing() {
        List<String> mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Mockito Works!");
        System.out.println("Result: " + mockList.get(0));
        when(mockList.size()).thenReturn(3);
        System.out.println("Size: " + mockList.size());
        System.out.println("✅ Test completed");
    }
}

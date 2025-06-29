import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.List;

public class VerifyingInteractions {

    @Test
    void testVerifyInteraction() {
        List<String> mockedList = mock(List.class);

        mockedList.add("Mockito");
        mockedList.clear();

        verify(mockedList).add("Mockito");
        verify(mockedList).clear();
    }
}

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub method to return predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Use the mock in the service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert the stub worked
        assertEquals("Mock Data", result);
    }
}

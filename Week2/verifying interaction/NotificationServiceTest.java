import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class NotificationServiceTest {

    @Mock
    MessageSender messageSender;  // Mock dependency

    NotificationService notificationService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        notificationService = new NotificationService(messageSender);
    }

    @Test
    public void testNotifyUser_VerifyInteraction() {
        // Act
        notificationService.notifyUser("Jashva");

        // Assert: Verify that sendMessage() was called once with expected message
        verify(messageSender).sendMessage("Hello Jashva, You have a new notification.");
    }
}

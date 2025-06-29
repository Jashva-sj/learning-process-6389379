import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {

    @Mock
    UserRepository userRepository;  

    UserService userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);  
        userService = new UserService(userRepository);  
    }

    @Test
    public void testGetUserWelcomeMessage() {
        
        when(userRepository.getUserNameById(1)).thenReturn("Jashva");

        
        String message = userService.getUserWelcomeMessage(1);

        
        assertEquals("Welcome, Jashva", message);

        
        verify(userRepository).getUserNameById(1);
    }
}

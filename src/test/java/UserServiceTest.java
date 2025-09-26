import org.example.User;
import org.example.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserServiceTest {
    UserService service = new UserService();

    @Test
    void testUserExists(){
        User user = service.getUserById(1);
        assertNotNull(user, "User should not be null when ID = 1");
    }

    @Test
    void testUserDoesNotExist(){
        User user = service.getUserById(33);
        assertNull(user, "User should be null when Id is not found");
    }
}

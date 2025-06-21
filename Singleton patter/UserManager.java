public class UserManager {
    public void createUser(String username) {
        Logger logger = Logger.getInstance();
        logger.log("User created: " + username);
    }
}

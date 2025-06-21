public class MainApp {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");

        UserManager userManager = new UserManager();
        userManager.createUser("Jashva");

        Service service = new Service();
        service.startService();

        logger.log("Application finished");
    }
}

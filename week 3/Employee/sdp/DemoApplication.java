import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(EmployeeRepository repo) {
        return args -> {
            Employee emp = new Employee("Alice");
            repo.save(emp);
            System.out.println("Employee saved!");
        };
    }
}

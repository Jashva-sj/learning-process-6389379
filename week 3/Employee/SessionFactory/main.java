import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        Employee emp = new Employee("Alice");
        session.save(emp);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

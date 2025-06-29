import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;  // Test Fixture

    @Before
    public void setUp() throws Exception {
        // Setup / Arrange: Runs before each test
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created.");
    }

    @After
    public void tearDown() throws Exception {
        // Cleanup / Teardown: Runs after each test
        calculator = null;
        System.out.println("Teardown: Calculator object set to null.");
    }

    @Test
    public void testAddition() {
        // Arrange: Already done in setUp()

        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {
        // Arrange: Already done in setUp()

        // Act
        int result = calculator.multiply(4, 3);

        // Assert
        assertEquals(12, result);
    }
}

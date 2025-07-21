import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        // Arrange: create a new Calculator before each test
        calc = new Calculator();
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        // Cleanup after each test
        calc = null;
        System.out.println("After each test");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calc.subtract(5, 3);

        // Assert
        assertEquals(2, result);
    }
}

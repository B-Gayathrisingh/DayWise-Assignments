package JUnitDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddSuccess() {
        assertTrue(calc.add(1, 2) == 3);
    }

    @Test
    public void testAddFailure() {
        assertFalse(calc.add(3, 3) == 5);
    }

    @Test
    public void testSubstractSuccess() {
        assertTrue(calc.substract(6, 3) == 3);
    }

    @Test
    public void testSubstractFailure() {
        assertFalse(calc.substract(0, 1) == 2);
    }

    @Test
    public void testMultiplySuccess() {
        assertTrue(calc.multiply(3, 5) == 15);
    }

    @Test
    public void testMultiplyFailure() {
        assertFalse(calc.multiply(3, 3) == 8);
    }

    @Test
    public void testDivideSuccess() {
        assertTrue(calc.divide(2, 2) == 4);
    }

    @Test
    public void testDivideFailure() {
        assertFalse(calc.divide(1, 2) == 4);
    }
}

	


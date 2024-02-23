package org.example.newCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorStringOperatorTest {
    @Test(expected=ZeroDivisionException.class)
    public void testZeroDivision() throws NoSuchOperatorException, ZeroDivisionException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.3);
        calc.setY(0.0);
        calc.setOperator("/");
        calc.getResult();
    }

    @Test(expected=NoSuchOperatorException.class)
    public void testBAdOperator() throws NoSuchOperatorException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.3);
        calc.setY(3.7);
        calc.setOperator("&");
    }

    @Test
    public void testGetSum() {
        CalculatorStringOperator c = new CalculatorStringOperator();
        double sum = c.getSum(3.7, 6.3);
        double expected = 10.0;
        assertEquals(expected,sum, 0.0);
    }

    @Test
    public void testGetSubtraction() {
        CalculatorStringOperator c = new CalculatorStringOperator();
        double sum = c.getSubtraction(6.39998, 3.73333);
        double sum2 = c.getSubtraction(6.3, 3.7);
        double expected = 2.66665;
        double expected2 = 2.6;
        assertEquals(expected, sum, 0.0);
        assertEquals(expected2, sum2, 0.001);
    }

    @Test
    public void testGetMultiply() {
        CalculatorStringOperator c = new CalculatorStringOperator();
        double mul = c.getMultiply(3.0, 6);
        double expected = 18.0;
        assertEquals(expected, mul, 0.0);
    }

    @Test
    public void testGetDivision() {
        CalculatorStringOperator c = new CalculatorStringOperator();
        double div = c.getDivision(3.0, 6);
        double expected = 0.5;
        assertEquals(expected, div, 0.0);
    }

    @Test
    public void testGetResult() throws ZeroDivisionException, NoSuchOperatorException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.3);
        calc.setY(3.7);
        calc.setOperator("+");
        double result = calc.getResult();
        double expected = 10.0;
        assertEquals(expected, result, 0.0);
    }
}
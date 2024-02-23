import org.example.newCalculator.CalculatorStringOperator;
import org.example.newCalculator.NoSuchOperatorException;
import org.example.newCalculator.ZeroDivisionException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCalculator {
//    CalculatorStringOperator calc = null;
    @Before
    public void setup() {
        CalculatorStringOperator calc = new CalculatorStringOperator();
    }

    @Test
    public void testAdd() throws NoSuchOperatorException, ZeroDivisionException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.3);
        calc.setY(3.7);
        calc.setOperator("+");
        double result = calc.getResult();
        assertTrue(10.0 == result);
    }

    @Test(expected=NoSuchOperatorException.class)
    public void testBAdOperator() throws NoSuchOperatorException, ZeroDivisionException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.3);
        calc.setY(3.7);
        calc.setOperator("&");
        calc.getResult();
    }

    @Test(expected=ZeroDivisionException.class)
    public void testZeroDivision() throws NoSuchOperatorException, ZeroDivisionException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.3);
        calc.setY(0.0);
        calc.setOperator("/");
        calc.getResult();
    }

    @Test
    public void testSub() throws NoSuchOperatorException, ZeroDivisionException {
        CalculatorStringOperator calc = new CalculatorStringOperator();
        calc.setX(6.39998);
        calc.setY(3.73333);
        calc.setOperator("-");
        double result = calc.getResult();
        System.out.println(result);
        assertTrue(2.66665 == result);
    }

}

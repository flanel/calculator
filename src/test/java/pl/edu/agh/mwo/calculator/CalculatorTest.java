package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5,7));
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.sub(7,2));
    }

    @Test
    public void testDiv() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.div(10,2));
    }

    @Test (expected = Exception.class)
    public void testDiv_zero() {
        Calculator calc = new Calculator();
        calc.div(1,0);
    }

    @Test
    public void testMul() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.mul(10,2));
    }

    @public void testAvg() {
        Calculator calc = new Calculator();
        calc.avg();
        assertEquals(1,1);

    }


}

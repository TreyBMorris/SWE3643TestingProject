import calculatorengine.CalculationResult;
import calculatorengine.CalculatorEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorEngineTests
{

    @Test // Test 1
    public void CalculatorEngine_Add_TwoFloatingPointValues_ReturnsSum()
    {
        //Arrange
        CalculatorEngine engine = new CalculatorEngine();
        double firstNum = 5.5;
        double secondNum = -3.15;
        double expected = 2.35;
        //Act
        CalculationResult result = CalculatorEngine.add(firstNum,secondNum);
        //Assert
        assertTrue(result.getSuccess());
        assertEquals(expected, result.getResult());
    }

    @Test /// Test 2
    public void CalculatorEngine_Subtract_TwoFloatingPointValues_ReturnsDifference()
    {
        //Arrange
        CalculatorEngine engine = new CalculatorEngine();
        double firstNum = 27.93;
        double secondNum = 4.0;
        double expected = 23.93;
        //Act
        CalculationResult result = CalculatorEngine.subtract(firstNum,secondNum);
        //Assert
        assertTrue(result.getSuccess());
        assertEquals(expected, result.getResult());

    }

    @Test // Test 3
    public void CalculatorEngine_Multiply_TwoFloatingPointValues_ReturnsProduct()
    {
        double firstNum = 5;
        double secondNum = 7.1;
        double expected = 35.5;

        CalculationResult result = CalculatorEngine.multiplication(firstNum, secondNum);

        assertEquals(expected, result.getResult());
        assertTrue(result.getSuccess());

    }

    @Test // Test 4
    public void CalculatorEngine_Divide_TwoFloatingPointValues_ReturnsQuotient()
    {
        double firstNum = 3.0;
        double secondNum = 9.0;
        double expected = 3.0/9.0;

        CalculationResult result = CalculatorEngine.divide(firstNum,secondNum);

        assertTrue(result.getSuccess());
        assertEquals(result.getResult(),expected);
    }
    @Test // Test 5
    public void CalculatorEngine_Divide_ByZero_ThrowsError()
    {
        double firstNum = 3.0;
        double secondNum = 0.0;

        String error = "Not a Number";
        CalculationResult result = CalculatorEngine.divide(firstNum,secondNum);

        assertFalse(result.getSuccess());
        assertEquals(0.0,result.getResult(),0.0001);
        assertEquals(error,result.getError());
    }
    @Test // Test 6
    public void CalculatorEngine_RaiseToPower_TwoFloatingPointNumbers()
    {
        double firstNum = 2.0;
        double secondNum = 3.0;
        double expected = 8.0;
        String error = "";

        CalculationResult result = CalculatorEngine.power(firstNum,secondNum);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected,result.getResult());
    }

    @Test // Test 7
    public void CalculatorEngine_LogarithmOf_TwoFloatingPointNumbers()
    {
        double firstNum = 8.0;
        double secondNum = 2.0;
        double expected = 3.0;
        String error = "";

        CalculationResult result = CalculatorEngine.logarithm(firstNum,secondNum);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected,result.getResult());
    }

    @Test // Test 8
    public void CalculatorEngine_Logarithm_WhereBaseA_isZeroOrLess_ThrowsError()
    {
        double firstNum = 0.0;
        double secondNum = 2.0;
        String error = "First Number is less than or Equal to 0";

        CalculationResult result = CalculatorEngine.logarithm(firstNum,secondNum);

        assertFalse(result.getSuccess());
        assertEquals(error, result.getError());
        assertEquals(0.0,result.getResult(),0.0001);
    }

    @Test // Test 9
    public void CalculatorEngine_Logarithm_WhereBaseB_isZero_ThrowsError()
    {
        double firstNum = 8.0;
        double secondNum = 0.0;
        String error = "Second Number is Equal to 0";

        CalculationResult result = CalculatorEngine.logarithm(firstNum, secondNum);

        assertFalse(result.getSuccess());
        assertEquals(error, result.getError());
        assertEquals(0.0,result.getResult(), 0.0001);
    }

    @Test // Test 10
    public void CalculatorEngine_NthRoot_OfTwoFloatingPointNumbers()
    {
        double firstNum = 8.0;
        double secondNum = 3.0;
        double expected = 2.0;
        String error = "";

        CalculationResult result = CalculatorEngine.rootOfNumber(firstNum, secondNum);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected,result.getResult());
    }

    @Test // Test 11
    public void CalculatorEngine_Root_WhereRootIsZero_ThrowsError()
    {
        double firstNum = 8.0;
        double secondNum = 0.0;
        String error = "Second Number is Equal to 0";

        CalculationResult result = CalculatorEngine.rootOfNumber(firstNum,secondNum);

        assertFalse(result.getSuccess());
        assertEquals(error, result.getError());
        assertEquals(0.0,result.getResult(),0.0001);
    }

    @Test // Test 12
    public void CalculatorEngine_Factorial_OfAFloatingPointNumber_ReturnsResult()
    {
        double number = 5.0;
        double expected = 120.0;
        String error = "";

        CalculationResult result = CalculatorEngine.factorial(number);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected,result.getResult());
    }

    @Test // Test 13
    public void CalculatorEngine_Factorial_OfZero_ReturnsOne()
    {
        double number = 0.0;
        double expected = 1.0;
        String error = "";

        CalculationResult result = CalculatorEngine.factorial(number);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected, result.getResult());

    }

    @Test // Test 14
    public void CalculatorEngine_Sine_OfAFloatingPointNumber_ReturnsResult()
    {
        double number = 360.0;
        double expected = 0.0;
        String error = "";

        CalculationResult result = CalculatorEngine.sineOfA(number);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected, result.getResult(), 0.01);
    }

    @Test // Test 15
    public void CalculatorEngine_Cosine_OfAFloatingPointNumber_ReturnsResult()
    {
        double number = 360.0;
        double expected = 1.0;
        String error = "";

        CalculationResult result = CalculatorEngine.cosineOfA(number);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected, result.getResult(), 0.01);
    }

    @Test // Test 16
    public void CalculatorEngine_Tangent_OfAFloatingPointNumber_ReturnsResult()
    {
        double number = 360.0;
        double expected = 0.0;
        String error = "";

        CalculationResult result = CalculatorEngine.tangentOfA(number);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected, result.getResult(), 0.01);
    }

    @Test // Test 17
    public void CalculatorEngine_Reciprocal_OfAFloaatingPointNumber_ReturnsResult()
    {
        double number = 8.0;
        double expected = 0.125;
        String error = "";

        CalculationResult result = CalculatorEngine.reciprocalOfA(number);

        assertTrue(result.getSuccess());
        assertEquals(error, result.getError());
        assertEquals(expected,result.getResult());
    }

    @Test // Test 18
    public void CalculatorEngine_Reciprocal_OfA_WhereAIsZero_ThrowsError()
    {
        double number = 0.0;
        double expected = 0.0;
        String error = "Not a Number";

        CalculationResult result = CalculatorEngine.reciprocalOfA(number);

        assertFalse(result.getSuccess());
        assertEquals(error, result.getError());
        assertEquals(expected, result.getResult(), 0.0001);
    }

    @Test //Test 19
    public void CalculatorEngine_CalculatorEngine_Compare_TwoFloatingPointNumbers_ReturnsResult()
    {
        double firstNumber = 123.45678901;
        double secondNumber =  123.45678902;
        double expected = 0.0;
        String error="";

        CalculationResult result = CalculatorEngine.aEqualsBComparison(firstNumber,secondNumber);

        assertTrue(result.getSuccess());
        assertEquals(error,result.getError());
        assertEquals(expected,result.getResult());
    }

}

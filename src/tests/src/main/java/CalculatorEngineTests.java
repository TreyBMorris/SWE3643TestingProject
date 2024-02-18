import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestExecutionListeners;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorEngineTests
{

    @Test
    public void Add_TwoFloatingPointValues_ReturnsSum()
    {
        //Arrange
        CalculatorEngine engine = new CalculatorEngine();
        double firstNum = 5.5;
        double secondNum = -3.15;
        double expected = 2.35;
        //Act
        double result = engine.add(firstNum, secondNum);
        //Assert
        assertEquals(result, expected);
    }

    @Test
    public void Subtract_TwoFloatingPointValues_ReturnsDifference()
    {
        //Arrange
        CalculatorEngine engine = new CalculatorEngine();
        double firstNum = 27.93;
        double secondNum = 4.0;
        double expected = 23.93;
        //Act
        double result = engine.subtract(firstNum, secondNum);
        //Assert
        assertEquals(result, expected);
    }

    @Test
    public void Multiply_TwoFloatingPointValues_ReturnsProduct()
    {
        CalculatorEngine engine = new CalculatorEngine();
        double firstNum = 5;
        double secondNum = 7.1;
        double expected = 35.5;

        double result = engine.multiplication(firstNum,secondNum);

        assertEquals(result,expected);
    }

    @Test
    public void Divide_TwoFloatingPointValues_ReturnsQuotient()
    {
        double firstNum = 3.0;
        double secondNum = 9.0;
        double expected = 3.0/9.0;

        CalculationResult result = CalculatorEngine.divide(firstNum,secondNum);



        assertEquals(result.getResult(),expected);
    }

    @Test
    public void Divide_ByZero_ThrowsError()
    {
        double firstNum = 3.0;
        double secondNum = 0.0;
        boolean isSuccess = false;
        String error = "Division by Zero is not allowed";
        CalculationResult result = CalculatorEngine.divide(firstNum,secondNum);

        assertFalse(result.isSuccess());
        assertEquals(0.0,result.getResult(),0.0001);
        assertEquals(error,result.getError());

    }

}

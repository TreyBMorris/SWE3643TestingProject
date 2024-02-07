import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

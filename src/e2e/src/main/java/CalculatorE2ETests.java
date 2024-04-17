import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorE2ETests
{

    private Playwright playwright;
    private Browser browser;
    private Page page;

    @BeforeEach
    public void setUp()
    {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        page = browser.newPage();
    }

    @AfterEach
    public void tearDown()
    {
        browser.close();
        playwright.close();
    }

    @Test
    public void CalculatorWebUI_PageTitle_IsCalculator()
    {
        //Arrange
        page.navigate("http://localhost:8080/calculator");
        String expectedTitle = "Calculator";

        //Act
        String actualTitle = page.title();

        //Assert
        assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void CalculatorWebUI_TwoInputNumbers_EqualsSum()
    {
        //Arrange
        page.navigate("http://localhost:8080/calculator");
        double expectedResult = 11.0;

        //Act
        page.fill("input[name='num1']", "5.0");
        page.fill("input[name='num2']", "6.0");
        page.click("button[value='add']");

        double actualResult = Double.parseDouble(page.innerText("p.result"));

        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void CalculatorWebUI_WhenDivideByZero_ResultBoxDisplaysNotANumber()
    {
        //Arrange
        page.navigate("http://localhost:8080/calculator");
        String expectedResult = "Not a Number";

        //Act
        page.fill("input[name='num1']", "5.0");
        page.fill("input[name='num2']", "0.0");
        page.click("button[value='divide']");

        String actualResult = page.innerText("p.error");

        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void CalculatorWebUI_WhenInputIsNotDouble_ResultBoxDisplaysInvalidInput()
    {
        //Arrange
        page.navigate("http://localhost:8080/calculator");
        String expectedResult = "Invalid Input, Numbers only";

        //Act
        page.fill("input[name='num1']", "5.0");
        page.fill("input[name='num2']", "five");
        page.click("button[value='add']");

        String actualResult = page.innerText("p.error");

        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void CalculatorWebUI_PressingClearButton_ResetsToDefaultState()
    {
        //Arrange
        page.navigate("http://localhost:8080/calculator");
        String expectedResult = "Enter value(s) below and select an operation";

        //Act
        page.fill("input[name='num1']", "5.0");
        page.fill("input[name='num2']", "5.0");
        page.click("button[value='add']");
        page.click("button[class='clear-button']");

        String actualResult = page.innerText("div.answer-container div.default-state p.default-text");

        //Assert
        assertEquals(expectedResult,actualResult);
    }


}

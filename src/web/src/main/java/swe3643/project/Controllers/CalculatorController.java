package swe3643.project.Controllers;
import calculatorengine.CalculationResult;
import calculatorengine.CalculatorEngine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class CalculatorController
{
    @GetMapping("/calculator")
    public String add(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, @RequestParam String operator, Model model)
    {
        CalculationResult result;
        switch(operator){
            case "+":
                result = CalculatorEngine.add(firstNum, secondNum);
                break;
            case "-":
                result = CalculatorEngine.subtract(firstNum, secondNum);
                break;
            case "/":
                result = CalculatorEngine.divide(firstNum,secondNum);
                break;
            default:
                result = new CalculationResult();
                result.setError("No input");

        }

        if(result.isSuccess())
        {
            model.addAttribute("operation",result.getOperation());
            model.addAttribute("result",result.getResult());
        }
        else
        {
            model.addAttribute("error", result.getError());
        }
        return "view";
    }

}
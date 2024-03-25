package swe3643.project.Controllers;
import calculatorengine.CalculationResult;
import calculatorengine.CalculatorEngine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class CalculatorController
{
    @GetMapping("/add")
    public String add(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.add(firstNum, secondNum);
        if(result.getSuccess())
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
    @GetMapping("/subtract")
    public String subtract(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.subtract(firstNum, secondNum);
        if(result.getSuccess())
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
    @GetMapping("/divide")
    public String divide(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.divide(firstNum, secondNum);
        if(result.getSuccess())
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
    @GetMapping("/multiplication")
    public String multiplication(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.multiplication(firstNum, secondNum);
        if(result.getSuccess())
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
package swe3643.project.Controllers;
import calculatorengine.CalculationResult;
import calculatorengine.CalculatorEngine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import swe3643.project.Models.CalculatorFormModel;

@Controller
public class CalculatorController
{
    @GetMapping("/calculator")
    public String showInputForm(Model model) {
        model.addAttribute("calculatorForm", new CalculatorFormModel());
        return "calculator";
    }
    @PostMapping("/calculate")
    public String calculate(@RequestParam String num1, @RequestParam String num2, @RequestParam String operator, Model model)
    {
        CalculationResult result = new CalculationResult();
        double input1 =0;
        double input2 = 0;
        try
        {
            input1 = Double.parseDouble(num1);
            input2 = Double.parseDouble(num2);
            switch(operator)
            {
                case "add":
                    result = CalculatorEngine.add(input1, input2);
                    break;
                case "subtract":
                    result = CalculatorEngine.subtract(input1,input2);
                    break;
                case "multiply":
                    result = CalculatorEngine.multiplication(input1, input2);
                    break;
                case "divide":
                    result = CalculatorEngine.divide(input1, input2);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "equals":
                    result = CalculatorEngine.aEqualsBComparison(input1, input2);
                    break;

                case "power":
                    result = CalculatorEngine.power(input1, input2);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "log":
                    result = CalculatorEngine.logarithm(input1, input2);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "root":
                    result = CalculatorEngine.rootOfNumber(input1, input2);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "factorial":
                    result = CalculatorEngine.factorial(input1);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "sin":
                    result = CalculatorEngine.sineOfA(input1);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "cos":
                    result = CalculatorEngine.cosineOfA(input1);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "tan":
                    result = CalculatorEngine.tangentOfA(input1);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;
                case "reciprocal":
                    result = CalculatorEngine.reciprocalOfA(input1);
                    if (!result.getSuccess())
                    {
                        model.addAttribute("error", result.getError());
                    }
                    break;

            }
        }
        catch(NumberFormatException e){
            result.setError("Invalid Input, Numbers only");
            model.addAttribute("operation", result.getOperation());
            model.addAttribute("error", result.getError());
        }

        model.addAttribute("operation", result.getOperation());
        model.addAttribute("result", result.getResult());
        return "calculator";
    }






}
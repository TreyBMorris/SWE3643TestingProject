package swe3643.project.Controllers;
import calculatorengine.CalculationResult;
import calculatorengine.CalculatorEngine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import swe3643.project.Models.CalculatorFormModel;

@Controller
public class CalculatorController
{
    /*
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

    @GetMapping("/power")
    public String power(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.power(firstNum, secondNum);
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

    @GetMapping("/log")
    public String logarithm(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.logarithm(firstNum, secondNum);
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
    @GetMapping("/root")
    public String root(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.rootOfNumber(firstNum, secondNum);
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
    @GetMapping("/factorial")
    public String factorial(@RequestParam(defaultValue = "0.0") double firstNum, Model model)
    {
        CalculationResult result = CalculatorEngine.factorial(firstNum);
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
    @GetMapping("/sin")
    public String sine(@RequestParam(defaultValue = "0.0") double firstNum, Model model)
    {
        CalculationResult result = CalculatorEngine.sineOfA(firstNum);
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
    @GetMapping("/cos")
    public String cosine(@RequestParam(defaultValue = "0.0") double firstNum, Model model)
    {
        CalculationResult result = CalculatorEngine.cosineOfA(firstNum);
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
    @GetMapping("/tan")
    public String tangent(@RequestParam(defaultValue = "0.0") double firstNum, Model model)
    {
        CalculationResult result = CalculatorEngine.tangentOfA(firstNum);
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
    @GetMapping("/reciprocal")
    public String reciprocal(@RequestParam(defaultValue = "0.0") double firstNum, Model model)
    {
        CalculationResult result = CalculatorEngine.reciprocalOfA(firstNum);
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
    @GetMapping("/equals")
    public String equals(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum, Model model)
    {
        CalculationResult result = CalculatorEngine.aEqualsBComparison(firstNum,secondNum);
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

    @PostMapping("/submit")
    public String submitForm(CalculatorFormModel formModel)
    {
        double firstNum = formModel.getFirstNum();
        double secondNum = formModel.getSecondNum();
        String operator = formModel.getOperator();

        System.out.println("Received input:" + firstNum + " " +  "operator: " + operator);

        return "redirect:/add?firstNum=%f&secondNum=%s".formatted(firstNum,secondNum);
    }
     */
    @GetMapping("/calculator")
    public String showInputForm(Model model) {
        model.addAttribute("calculatorForm", new CalculatorFormModel());
        return "calculator";
    }
    @PostMapping("/calculate")
    public String calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operator, Model model)
    {
        CalculationResult result = new CalculationResult();
        switch(operator)
        {
            case "add":
                result = CalculatorEngine.add(num1, num2);
                break;
            case "subtract":
                result = CalculatorEngine.subtract(num1,num2);
                break;
            case "multiply":
                result = CalculatorEngine.multiplication(num1, num2);
                break;
            case "divide":
                result = CalculatorEngine.divide(num1,num2);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "equals":
                result = CalculatorEngine.aEqualsBComparison(num1, num2);
                break;

            case "power":
                result = CalculatorEngine.power(num1, num2);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "log":
                result = CalculatorEngine.logarithm(num1, num2);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "root":
                result = CalculatorEngine.rootOfNumber(num1, num2);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "factorial":
                result = CalculatorEngine.factorial(num1);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "sin":
                result = CalculatorEngine.sineOfA(num1);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "cos":
                result = CalculatorEngine.cosineOfA(num1);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "tan":
                result = CalculatorEngine.tangentOfA(num1);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;
            case "reciprocal":
                result = CalculatorEngine.reciprocalOfA(num1);
                if (!result.getSuccess())
                {
                    model.addAttribute("error", result.getError());
                }
                break;

        }
        model.addAttribute("operation", result.getOperation());
        model.addAttribute("result", result.getResult());
        return "calculator";
    }






}
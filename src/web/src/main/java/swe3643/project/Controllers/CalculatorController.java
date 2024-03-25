package swe3643.project.Controllers;
import calculatorengine.CalculationResult;
import calculatorengine.CalculatorEngine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/calculator")
public class CalculatorController
{
    @GetMapping("/add")
    public CalculationResult add(@RequestParam(defaultValue = "0.0") double firstNum, @RequestParam(defaultValue = "0.0") double secondNum)
    {

        CalculationResult result = CalculatorEngine.add(firstNum, secondNum);
        return result;
    }


}
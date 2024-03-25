package calculatorengine;

import calculatorengine.CalculationResult;
import calculatorengine.DivisionByZeroException;
import calculatorengine.LogarithmException;
import calculatorengine.RootException;

public class CalculatorEngine
{
    private double firstNumber;
    private double secondNumber;

    public static CalculationResult add(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setSuccess(true);
        result.setResult(firstNumber+secondNumber);
        result.setOperation(firstNumber + "+" + secondNumber);
        result.setError("");

        return result;
    }

    public static CalculationResult subtract(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setSuccess(true);
        result.setResult(firstNumber-secondNumber);
        result.setOperation(firstNumber + "-" + secondNumber);
        result.setError("");

        return result;
    }

    public static CalculationResult multiplication(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setSuccess(true);
        result.setResult(firstNumber*secondNumber);
        result.setOperation(firstNumber + "*" + secondNumber);
        result.setError("");

        return result;
    }

    public static CalculationResult divide(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation(firstNumber + " / " + secondNumber + " =");

        try
        {
            if(secondNumber == 0)
            {
                throw new DivisionByZeroException("Division by Zero is not allowed");
            }
            result.setResult(firstNumber/secondNumber);
            result.setSuccess(true);
            result.setError("");
        }
        catch(DivisionByZeroException e)
        {
            result.setResult(0.0);
            result.setSuccess(false);
            result.setError(e.getMessage());
        }
        return result;
    }

    public static CalculationResult power(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation(firstNumber + " ^ " + secondNumber + " =");

        double power = Math.pow(firstNumber, secondNumber);

        result.setSuccess(true);
        result.setError("");
        result.setResult(power);

        return result;
    }

    public static CalculationResult logarithm(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation(firstNumber + " log " + secondNumber + " =");
        try
        {
            if (firstNumber<=0)
            {
                throw new LogarithmException("First Number is less than or Equal to 0");
            }
            if(secondNumber == 0)
            {
                throw new LogarithmException("Second Number is Equal to 0");
            }
            double logResult = (Math.log(firstNumber)/Math.log(secondNumber));
            result.setResult(logResult);
            result.setSuccess(true);
            result.setError("");
        }catch(LogarithmException e)
        {
            result.setResult(0.0);
            result.setSuccess(false);
            result.setError(e.getMessage());
        }
        return result;
    }

    public static CalculationResult rootOfNumber(double firstNumber, double secondNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation(secondNumber + " √ " + firstNumber + " =");
        try
        {
            if (secondNumber == 0)
            {
                throw new RootException("Second Number is Equal to 0");
            }
            double rootResult = Math.round(Math.pow(firstNumber, 1.0/secondNumber));
            result.setResult(rootResult);
            result.setSuccess(true);
            result.setError("");
        }catch(RootException e)
        {
            result.setResult(0.0);
            result.setSuccess(false);
            result.setError(e.getMessage());
        }
        return result;
    }

    public static CalculationResult factorial(double firstNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation(firstNumber + "! =");
        if (firstNumber == 0)
        {
            result.setSuccess(true);
            result.setError("");
            result.setResult(1);
        }
        else
        {
            int factorialNum = 1;
            for(int i = 1; i<=firstNumber; i++)
            {
                factorialNum *= i;
            }
            result.setSuccess(true);
            result.setResult(factorialNum);
            result.setError("");
        }
        return result;
    }

    public static CalculationResult sineOfA(double inputNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation("Sin(" + inputNumber + ") =");

        result.setSuccess(true);
        result.setError("");
        result.setResult(Math.sin(Math.toRadians(inputNumber)));
        return result;
    }

    public static CalculationResult cosineOfA(double inputNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation("Cos(" + inputNumber + ") =");

        result.setSuccess(true);
        result.setError("");
        result.setResult(Math.cos(Math.toRadians(inputNumber)));

        return result;
    }

    public static CalculationResult tangentOfA(double inputNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation("Tan(" + inputNumber + ") =");

        result.setSuccess(true);
        result.setError("");
        result.setResult(Math.tan(Math.toRadians(inputNumber)));

        return result;
    }

    public static CalculationResult reciprocalOfA(double inputNumber)
    {
        CalculationResult result = new CalculationResult();
        result.setOperation("1/" + inputNumber + " =");

        try
        {
            if(inputNumber == 0)
            {
                throw new DivisionByZeroException("Division by Zero is not allowed");
            }
            result.setSuccess(true);
            result.setError("");
            result.setResult(1/inputNumber);

        }catch(DivisionByZeroException e)
        {
            result.setResult(0.0);
            result.setError(e.getMessage());
            result.setSuccess(false);
        }
        return result;
    }

}

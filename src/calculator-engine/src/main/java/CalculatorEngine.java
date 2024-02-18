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

}

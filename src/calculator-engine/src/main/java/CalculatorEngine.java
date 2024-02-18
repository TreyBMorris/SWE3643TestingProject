public class CalculatorEngine
{
    private double firstNumber;
    private double secondNumber;

    public double add(double firstNumber, double secondNumber)
    {
        CalculationResult addResult = new CalculationResult();
        addResult.setSuccess(true);
        addResult.setResult(firstNumber+secondNumber);
        addResult.setOperation(firstNumber + "+" + secondNumber);
        addResult.setError("");

        return addResult.getResult();
    }

    public double subtract(double firstNumber, double secondNumber)
    {
        CalculationResult subtractResult = new CalculationResult();
        subtractResult.setSuccess(true);
        subtractResult.setResult(firstNumber-secondNumber);
        subtractResult.setOperation(firstNumber + "-" + secondNumber);
        subtractResult.setError("");
        return subtractResult.getResult();
    }

    public double multiplication(double firstNumber, double secondNumber)
    {
        CalculationResult multiplyResult = new CalculationResult();
        multiplyResult.setSuccess(true);
        multiplyResult.setResult(firstNumber*secondNumber);
        multiplyResult.setOperation(firstNumber + "*" + secondNumber);
        multiplyResult.setError("");
        return multiplyResult.getResult();
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
}

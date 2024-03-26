package calculatorengine;

public class CalculationResult
{
    private double result = 0.0;
    private boolean isSuccess;
    private String operation;
    private String error;

    public double getResult()
    {
        return result;
    }
    public void setResult(double result)
    {
        this.result = result;
    }
    public boolean getSuccess()
    {
        return isSuccess;
    }
    public void setSuccess(boolean success)
    {
        isSuccess = success;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation)
    {
        this.operation = operation;
    }
    public String getError()
    {
        return error;
    }
    public void setError(String error)
    {
        this.error = error;
    }
}
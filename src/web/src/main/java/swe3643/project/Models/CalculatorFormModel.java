package swe3643.project.Models;

public class CalculatorFormModel
{
    private double firstNum;
    private double secondNum;
    private String operator;

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public String getOperator()
    {
        return operator;
    }
    public void setOperator(String operator)
    {
        this.operator = operator;
    }
}

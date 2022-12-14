package task4;

public class Calculator {
    public <T,K> void sum(T num1, K num2)
    {
        System.out.println(Double.parseDouble(num1.toString()) + Double.parseDouble(num2.toString()));
    }
    public <T,K> void multiply(T num1, K num2)
    {
        System.out.println(Double.parseDouble(num1.toString()) * Double.parseDouble(num2.toString()));
    }
    public <T,K> void divide(T num1, K num2)
    {
        System.out.println(Double.parseDouble(num1.toString()) / Double.parseDouble(num2.toString()));
    }
    public <T,K> void subtraction(T num1, K num2)
    {
        System.out.println(Double.parseDouble(num1.toString()) - Double.parseDouble(num2.toString()));
    }
}

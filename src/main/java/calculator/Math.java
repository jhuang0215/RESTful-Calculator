package calculator;

public class Math {

    public CalculatorResource add(double a, double b){
        return new CalculatorResource(a + b);
    }

    public CalculatorResource subtract (double a, double b){
        return new CalculatorResource(a + b);
    }

    public CalculatorResource multiply (double a, double b){
        return new CalculatorResource(a * b);
    }

    public CalculatorResource divide (double a, double b){
        return new CalculatorResource(a / b);
    }
}

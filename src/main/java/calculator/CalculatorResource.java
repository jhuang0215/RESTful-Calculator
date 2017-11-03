package calculator;

public class CalculatorResource {
    private final double value;

    public CalculatorResource(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}

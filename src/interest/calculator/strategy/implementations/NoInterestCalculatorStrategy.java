package interest.calculator.strategy.implementations;

import interest.calculator.strategy.CalculatorStrategy;

// Null Object Pattern
public class NoInterestCalculatorStrategy implements CalculatorStrategy {
    @Override
    public double calc(double balance) {
        return 0;
    }
}

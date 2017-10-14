package interest.calculator.strategy.implementations;

import interest.calculator.strategy.CalculatorStrategy;

public class HighRollerInterestCalculatorStrategy implements CalculatorStrategy {

    @Override
    public double calc(double balance) {
        return balance < 100000.00 ? 0 : balance * (0.075 / 12);
    }
}

package interest.calculator.strategy.implementations;

import interest.calculator.strategy.CalculatorStrategy;

/**
 * cl3ar, 14/10/2017.
 */
public class SavingsInterestCalculatorStrategy implements CalculatorStrategy {

    public double calc(double accountBalance) {
        return accountBalance * (0.04 / 12);
    }
}

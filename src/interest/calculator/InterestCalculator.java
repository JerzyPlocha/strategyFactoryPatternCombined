package interest.calculator;

import interest.calculator.factory.InterestCalculatorStrategyFactory;

public class InterestCalculator {

    private InterestCalculatorStrategyFactory interestCalculatorStrategyFactory = new InterestCalculatorStrategyFactory();

    public double calc(AccountType accountType, double accountBalance) {
        return interestCalculatorStrategyFactory.getFor(accountType).calc(accountBalance);
    }
}
package interest.calculator.factory;

import interest.calculator.AccountType;
import interest.calculator.strategy.*;
import interest.calculator.strategy.implementations.*;
import interest.calculator.strategydZone.strategy.*;

// srp in this class extracted from InterestCalculator
public class InterestCalculatorStrategyFactory {

    private final CurrentInterestCalculatorStrategy currentInterestCalculatorStrategy = new CurrentInterestCalculatorStrategy();
    private final HighRollerInterestCalculatorStrategy highCurrentInterestCalculatorStrategy = new HighRollerInterestCalculatorStrategy();
    private final SavingsInterestCalculatorStrategy savingsInterestCalculatorStrategy = new SavingsInterestCalculatorStrategy();
    private final StandardInterestCalculatorStrategy standartInterestCalculatorStrategy = new StandardInterestCalculatorStrategy();
    private final CalculatorStrategy noInterestCalculatorStrategy = new NoInterestCalculatorStrategy();

    public CalculatorStrategy getFor(AccountType accType) {
        if (accType.equals(AccountType.STANDARD_MONEY_MARKET)) return standartInterestCalculatorStrategy;
        if (accType.equals(AccountType.SAVINGS)) return savingsInterestCalculatorStrategy;
        if (accType.equals(AccountType.HIGH_ROLLER_MONEY_MARKET)) return highCurrentInterestCalculatorStrategy;
        if (accType.equals(AccountType.CURRENT)) return currentInterestCalculatorStrategy;
        return noInterestCalculatorStrategy;
    }
}

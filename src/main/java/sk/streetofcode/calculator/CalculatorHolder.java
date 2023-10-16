package sk.streetofcode.calculator;

import sk.streetofcode.ArithmeticOperator;
import sk.streetofcode.operation.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorHolder {
    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;

    public CalculatorHolder() {
        this.initializeCalculators();
    }

    private void initializeCalculators() {
        final Map<ArithmeticOperator, Operation> basicCalculatorOperationMap = new HashMap<>();
        basicCalculatorOperationMap.put(ArithmeticOperator.ADDITION, new Addition());
        basicCalculatorOperationMap.put(ArithmeticOperator.SUBTRACTION, new Subtraction());

        this.basicCalculator = new BasicCalculator("BasicCalculator", basicCalculatorOperationMap);

        final Map<ArithmeticOperator, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put(ArithmeticOperator.MULTIPLICATION, new Multiplication());
        advancedCalculatorOperationMap.put(ArithmeticOperator.DIVISION, new Division());

        this.advancedCalculator = new AdvancedCalculator("AdvancedCalculator", advancedCalculatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(ArithmeticOperator operator) {
        switch (operator) {
            case ADDITION, SUBTRACTION -> {
                return this.basicCalculator;
            }
            case MULTIPLICATION, DIVISION -> {
                return this.advancedCalculator;
            }
            default -> throw new IllegalArgumentException("Unsupported operation");
        }
    }
}

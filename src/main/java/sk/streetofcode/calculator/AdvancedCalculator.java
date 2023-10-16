package sk.streetofcode.calculator;

import sk.streetofcode.ArithmeticOperator;
import sk.streetofcode.operation.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}

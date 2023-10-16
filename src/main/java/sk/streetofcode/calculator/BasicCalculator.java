package sk.streetofcode.calculator;

import sk.streetofcode.ArithmeticOperator;
import sk.streetofcode.operation.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator {
    public BasicCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}

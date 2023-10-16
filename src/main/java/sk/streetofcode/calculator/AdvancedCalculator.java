package sk.streetofcode.calculator;

import sk.streetofcode.operation.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<Character, Operation> operationMap) {
        super(name, operationMap);
    }
}

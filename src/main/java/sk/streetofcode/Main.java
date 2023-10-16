package sk.streetofcode;

import sk.streetofcode.calculator.AbstractCalculator;
import sk.streetofcode.calculator.CalculatorHolder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static CalculatorHolder calculatorHolder = new CalculatorHolder();
    public static void main(String[] args) {
        do {
            System.out.println("Write number, then type of operation (+, -, *, /) and then write a number again");

            final double left, right;
            final char operator;

            try {
                left = scanner.nextDouble();
                operator = scanner.next().charAt(0);
                right = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            final Operands operands = new Operands(left, right);
            calculatorHolder.getSuitableCalculator(operator).calculate(operands, operator);
        } while (true);
    }
}

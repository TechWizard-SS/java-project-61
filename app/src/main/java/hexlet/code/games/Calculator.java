package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.util.Scanner;

public class Calculator {

    private static final char[] SIGNS = {'+', '-', '*'};
    private static final int MAX_VALUE = 30;

    public static void game2(Scanner scanner) {
        String description = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            char sign = SIGNS[Utils.generateNumber(SIGNS.length - 1)];

            int firstOperand = Utils.generateNumber(MAX_VALUE);
            int secondOperand = Utils.generateNumber(MAX_VALUE);

            int result = calculateExpression(firstOperand, secondOperand, sign);

            questionAndAnswer[i][0] = firstOperand + " " + sign + " " + secondOperand;        // вопрос
            questionAndAnswer[i][1] = String.valueOf(result);        // правильный ответ
        }

        Engine.run2(description, questionAndAnswer, scanner);
    }

    private static int calculateExpression(int firstOperand, int secondOperand, char sign) {
        return switch (sign) {
            case '+' -> firstOperand + secondOperand;
            case '-' -> firstOperand - secondOperand;
            case '*' -> firstOperand * secondOperand;
            default -> throw new IllegalStateException("Unexpected operator: " + sign);
        };
    }

}

package hexlet.code.games;

import java.security.SecureRandom;

import hexlet.code.Engine;

public class Calculator {

    private static final SecureRandom RAND = new SecureRandom();
    private static final char[] signs = {'+', '-', '*'};

    public static void game2() {
        Engine.run("What is the result of the expression?", () -> {
            int a = RAND.nextInt(20) + 1;
            int b = RAND.nextInt(20) + 1;
            char sign = signs[RAND.nextInt(signs.length)];

            int result = switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                default -> throw new IllegalStateException("Unexpected value: " + sign);
            };

            return new Engine.QuestionAndAnswer(a + " " + sign + " " + b, String.valueOf(result));
        });
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Scanner;

public class Calculator {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final SecureRandom RAND = new SecureRandom();
    private static final char[] SIGNS = {'+', '-', '*'};

    //    public static void game2() {
//        Engine.run("What is the result of the expression?", () -> {
//            int a = RAND.nextInt(20) + 1;
//            int b = RAND.nextInt(20) + 1;
//            char sign = signs[RAND.nextInt(signs.length)];
//
//            int result = switch (sign) {
//                case '+' -> a + b;
//                case '-' -> a - b;
//                case '*' -> a * b;
//                default -> throw new IllegalStateException("Unexpected value: " + sign);
//            };
//
//            return new Engine.QuestionAndAnswer(a + " " + sign + " " + b, String.valueOf(result));
//        });
//    }
    public static void game2() {
        String description = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int a = RAND.nextInt(20) + 1;
            int b = RAND.nextInt(20) + 1;
            char sign = SIGNS[RAND.nextInt(SIGNS.length)];
            int result = switch (sign) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                default -> throw new IllegalStateException("Unexpected value: " + sign);
            };

            questionAndAnswer[i][0] = a + " " + sign + " " + b;        // вопрос
            questionAndAnswer[i][1] = String.valueOf(result);        // правильный ответ

        }

        Engine.run2(description, questionAndAnswer);
    }


}

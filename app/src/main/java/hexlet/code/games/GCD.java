package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.security.SecureRandom;
import java.util.Scanner;

public class GCD {
    private static final SecureRandom RAND = new SecureRandom();
    private static final int MAX_VALUE = 100;

    public static void game3(Scanner scanner, String userName) {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int number1 = Utils.generateNumber(MAX_VALUE);
            int number2 = Utils.generateNumber(MAX_VALUE);

            String question = String.valueOf(number1) + " " + String.valueOf(number2);
            String answer = String.valueOf(findGCD(number1, number2));

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }

        Engine.run2(description, questionAndAnswer, userName, scanner);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

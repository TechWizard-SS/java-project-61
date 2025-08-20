package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.security.SecureRandom;
import java.util.Scanner;

public class CheckingForParity {
    private static final SecureRandom RAND = new SecureRandom();
    private static final int MAX_VALUE = 100;

    public static void game1(Scanner scanner, String userName) {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int number = Utils.generateNumber(MAX_VALUE);

            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.run2(description, questionAndAnswer, userName, scanner);
    }
}

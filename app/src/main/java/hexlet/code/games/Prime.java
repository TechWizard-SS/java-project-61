package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.util.Scanner;

public class Prime {
    private static final int MAX_VALUE = 100;
    private static final int PRIME_CHECK_START = 3;
    private static final int PRIME_CHECK_STEP = 2;


    public static void game5(Scanner scanner, String userName) {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(MAX_VALUE);

            String question = String.valueOf(number);
            boolean answer = isPrime(number);

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer ? "yes" : "no";
        }

        Engine.run2(description, questionAndAnswer, userName, scanner);
    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        // Проверяем только нечётные делители до √n
        for (int i = PRIME_CHECK_START; i * i <= num; i += PRIME_CHECK_STEP) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

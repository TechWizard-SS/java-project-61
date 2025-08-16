package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.security.SecureRandom;
import java.util.Scanner;

public class Prime {
    private static final SecureRandom RAND = new SecureRandom();

    private static final int MAX_VALUE = 100;
    private static final int MIN_VALUE = 0;

    private static final int PRIME_CHECK_START = 3;
    private static final int PRIME_CHECK_STEP = 2;


    public static void game5(Scanner scanner, String userName) {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(MIN_VALUE, MAX_VALUE);

            String question = String.valueOf(number);
            String answer = isPrime(number);

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }

        Engine.run2(description, questionAndAnswer, userName, scanner);
    }

    public static String isPrime(int num) {

        if (num < 2) {
            return "no";
        }
        if (num == 2) {
            return "yes";
        }
        if (num % 2 == 0) {
            return "no";
        }
        // Проверяем только нечётные делители до √n
        for (int i = PRIME_CHECK_START; i * i <= num; i += PRIME_CHECK_STEP) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Prime {
    private static final SecureRandom RAND = new SecureRandom();
    private static final int NUMBER_ROUND = 3;
    private static final int MAX_COUNT = 100;

    private static final int PRIME_CHECK_START = 3;
    private static final int PRIME_CHECK_STEP = 2;


//    public static void game5() {
//        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", () -> {
//            int number = RAND.nextInt(100) + 1;
//
//            String question = String.valueOf(number);
//            String answer = isPrime(number);
//
//            return new Engine.QuestionAndAnswer(question, answer);
//        });
//    }

    public static void game5() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[NUMBER_ROUND][2];

        for (int i = 0; i < NUMBER_ROUND; i++) {
            int number = RAND.nextInt(MAX_COUNT) + 1;

            String question = String.valueOf(number);
            String answer = isPrime(number);

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }

        Engine.run2(description, questionAndAnswer);
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

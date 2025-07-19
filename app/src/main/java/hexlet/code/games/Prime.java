package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Prime {
    private static final SecureRandom RAND = new SecureRandom();

    public static void game5() {
        Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", () -> {
            int number = RAND.nextInt();

            String question = String.valueOf(number);
            String answer = isPrime(number);

            return new Engine.QuestionAndAnswer(question, answer);
        });
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
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}

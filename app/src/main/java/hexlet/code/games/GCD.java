package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class GCD {
    private static final SecureRandom RAND = new SecureRandom();

    public static void game3() {
        Engine.run("Find the greatest common divisor of given numbers.", () -> {
            int a = RAND.nextInt(100) + 1;
            int b = RAND.nextInt(100) + 1;

            String question = String.valueOf(a) + " " + String.valueOf(b);
            String answer = String.valueOf(findGCD(a, b));

            return new Engine.QuestionAndAnswer(question, answer);
        });
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

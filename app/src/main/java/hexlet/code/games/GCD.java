package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Random;

public class GCD {
    private static final SecureRandom RAND = new SecureRandom();

    private static final Random RANDOM = new Random();
//    public static void game3() {
//        Engine.run("Find the greatest common divisor of given numbers.", () -> {
//            int a = RAND.nextInt(100) + 1;
//            int b = RAND.nextInt(100) + 1;
//
//            String question = String.valueOf(a) + " " + String.valueOf(b);
//            String answer = String.valueOf(findGCD(a, b));
//
//            return new Engine.QuestionAndAnswer(question, answer);
//        });
//    }

    public static void game3() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int a = RAND.nextInt(100) + 1;
            int b = RAND.nextInt(100) + 1;
            String question = String.valueOf(a) + " " + String.valueOf(b);
            String answer = String.valueOf(findGCD(a, b));

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }

        Engine.run2(description, questionAndAnswer);
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

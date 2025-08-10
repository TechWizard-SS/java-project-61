package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class CheckingForParity {
    private static final SecureRandom RAND = new SecureRandom();
    private static final int ROUNDS_COUNT = 3;
//    public static void game1() {
//        Engine.run("Answer 'yes' if the number is even, otherwise answer 'no'.", () -> {
//            int number = RAND.nextInt(100) + 1;
//            String question = String.valueOf(number);
//            String answer = (number % 2 == 0) ? "yes" : "no";
//            return new Engine.QuestionAndAnswer(question, answer);
//        });
//    }


    public static void game1() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[ROUNDS_COUNT][2];

        int maxValue = 100;
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = RAND.nextInt(maxValue) + 1;
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.run2(description, questionAndAnswer);
    }
}

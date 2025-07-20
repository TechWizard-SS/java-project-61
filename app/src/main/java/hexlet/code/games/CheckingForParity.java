package hexlet.code.games;

import java.security.SecureRandom;

import hexlet.code.Engine;

public class CheckingForParity {
    private static final SecureRandom RAND = new SecureRandom();

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
        String[][] questionAndAnswer = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int number = RAND.nextInt(100) + 1;
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.run2(description, questionAndAnswer);
    }
}

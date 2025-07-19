package hexlet.code.games;

import java.security.SecureRandom;

import hexlet.code.Engine;

public class CheckingForParity {
    private static final SecureRandom RAND = new SecureRandom();

    public static void game1() {
        Engine.run("Answer 'yes' if the number is even, otherwise answer 'no'.", () -> {
            int number = RAND.nextInt(100) + 1;
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";
            return new Engine.QuestionAndAnswer(question, answer);
        });
    }
}

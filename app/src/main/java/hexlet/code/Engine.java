package hexlet.code;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static final Logger LOG = LoggerFactory.getLogger(Engine.class);

    public static void run2(String description, String[][] questionAndAnswer, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");


        System.out.println(description);

        for (String[] qa : questionAndAnswer) {
            String question = qa[0];
            String correctAnswer = qa[1];

            System.out.println("Question: " + question);
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}

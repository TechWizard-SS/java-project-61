package hexlet.code;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static final Logger LOG = LoggerFactory.getLogger(Engine.class);

    public static void run2(String description, String[][] questionAndAnswer, String userName, Scanner scanner) {
        LOG.info(description);


//        for (int i = 0; i < ROUNDS_COUNT; i++) {
//            LOG.info("Question: {}", questionAndAnswer[i][0]);
//            String userAnswer = scanner.nextLine();
//
//            if (userAnswer.equals(questionAndAnswer[i][1])) {
//                LOG.info("Correct!");
//            } else {
//                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
//                        + questionAndAnswer[i][1] + "'.");
//                System.out.println("Let's try again, " + userName + "!");
//
//                return;
//            }
//        }
        for (String[] qa : questionAndAnswer) {
            String question = qa[0];
            String correctAnswer = qa[1];

            LOG.info("Question: {}", question);
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            LOG.info("Correct!");
        }

        LOG.info("Congratulations, {}!", userName);
    }
}

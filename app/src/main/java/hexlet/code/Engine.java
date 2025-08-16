package hexlet.code;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static final Logger LOG = LoggerFactory.getLogger(Engine.class);

    public static void run2(String description, String[][] questionAndAnswer, String userName,final Scanner SCANNER) {
        LOG.info(description);


        for (int i = 0; i < ROUNDS_COUNT; i++) {
            LOG.info("Question: {}", questionAndAnswer[i][0]);
            String userAnswer = SCANNER.nextLine();

            if (userAnswer.equals(questionAndAnswer[i][1])) {
                LOG.info("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionAndAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");

                return;
            }
        }
        LOG.info("Congratulations, {}!", userName);
    }
}

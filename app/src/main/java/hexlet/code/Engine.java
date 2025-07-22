package hexlet.code;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;
    private static final Logger LOG = LoggerFactory.getLogger(Engine.class);
    public static final Scanner SCANNER = new Scanner(System.in);

//        public static void run(String description, Supplier<QuestionAndAnswer> qaSupplier) {
//        LOG.info(description);
//
//        for (int i = 0; i < ROUNDS; i++) {
//            QuestionAndAnswer questionAndAnswer = qaSupplier.get();
//            LOG.info("Question: {}", questionAndAnswer.question);
//
//            String userAnswer = SCANNER.nextLine();
//
//            if (userAnswer.equals(questionAndAnswer.answer)) {
//                LOG.info("Correct!");
//            } else {
//                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
//                      + questionAndAnswer.answer() + "'.");

//                System.out.println("Let's try again, " + Cli.getName() + "!");
//                return;
//            }
//        }
//
//        LOG.info("Congratulations, {}!", Cli.getName());
//    }
//
//public record QuestionAndAnswer(String question, String answer) {}


    public static void run2(String description, String[][] questionAndAnswer) {
        LOG.info(description);

        for (int i = 0; i < ROUNDS; i++) {
            LOG.info("Question: {}", questionAndAnswer[i][0]);
            String userAnswer = SCANNER.nextLine();

            if (userAnswer.equals(questionAndAnswer[i][1])) {
                LOG.info("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionAndAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");

                return;
            }
        }
        LOG.info("Congratulations, {}!", Cli.getName());
    }
}

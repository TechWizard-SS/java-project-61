package hexlet.code;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.function.Supplier;

public class Engine {
    private static final int ROUNDS = 3;
    private static final Logger LOG = LoggerFactory.getLogger(Engine.class);
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void run(String description, Supplier<QuestionAndAnswer> qaSupplier) {
        LOG.info(description);

        for (int i = 0; i < ROUNDS; i++) {
            QuestionAndAnswer questionAndAnswer = qaSupplier.get();
            LOG.info("Question: {}", questionAndAnswer.question);

            String userAnswer = SCANNER.nextLine();

            if (userAnswer.equals(questionAndAnswer.answer)) {
                LOG.info("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + questionAndAnswer.answer() + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }

        LOG.info("Congratulations, {}!", Cli.getName());
    }

    public record QuestionAndAnswer(String question, String answer) {
    }
}

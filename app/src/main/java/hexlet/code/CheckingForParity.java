package hexlet.code;

import java.security.SecureRandom;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckingForParity {
    private static final Logger LOG = LoggerFactory.getLogger(CheckingForParity.class);
    private static final SecureRandom RAND = new SecureRandom();
    private static final Scanner SC = new Scanner(System.in);

    public static void game1() {
        LOG.info("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = RAND.nextInt(100) + 1;
            LOG.info("Question: " + randomNumber);

            String userAnswer = SC.nextLine();
            String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + Cli.getName());
            }

        }
    }
}

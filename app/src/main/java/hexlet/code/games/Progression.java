package hexlet.code.games;

import hexlet.code.Cli;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Scanner;

public class Progression {
    private static final SecureRandom RAND = new SecureRandom();
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final Logger LOG = LoggerFactory.getLogger(Progression.class);
    private static final Scanner SC = new Scanner(System.in);

    public static void game4() {
        for (int i = 0; i < 3; i++) {
            LOG.info("What number is missing in the progression?");
            int hiddenIndex = RAND.nextInt(10);
            int step = RAND.nextInt(10) + 1;
            int start = RAND.nextInt(100) + 1;

            String[] progression = generateProgression(start, step);

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = ("..");

            String question = String.join(" ", progression);
            LOG.info("Question: " + question);

            String userAnswer = SC.nextLine();

            if(userAnswer.equals(correctAnswer)) {
                LOG.info("Correct!");
            } else {
                LOG.info("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + Cli.getName());
                break;
            }
        }
    }

    private static String[] generateProgression(int start, int step) {
        String[] progression = new String[10];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}

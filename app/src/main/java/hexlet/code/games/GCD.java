package hexlet.code.games;

import hexlet.code.Cli;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Scanner;

public class GCD {
    private static final Logger LOG = LoggerFactory.getLogger(CheckingForParity.class);
    private static final SecureRandom RAND = new SecureRandom();
    private static final Scanner SC = new Scanner(System.in);


    public static void game3() {
        LOG.info("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            int randomNumber1 = RAND.nextInt(100) + 1;
            int randomNumber2 = RAND.nextInt(100) + 1;
            LOG.info("Question: " + randomNumber1 + " " + randomNumber2);

            int userAnswer = SC.nextInt();
            int correctAnswer = findGCD(randomNumber1, randomNumber2);

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + Cli.getName());
                break;
            }
        }
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

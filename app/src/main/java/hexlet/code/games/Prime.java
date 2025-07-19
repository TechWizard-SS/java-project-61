package hexlet.code.games;

import hexlet.code.Cli;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Scanner;

public class Prime {
    private static final SecureRandom RAND = new SecureRandom();
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final Logger LOG = LoggerFactory.getLogger(Prime.class);
    private static final Scanner SC = new Scanner(System.in);

    public static void game5(){
        LOG.info("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int num = RAND.nextInt(100);
            LOG.info("Question " + num);
            String correctAnswer;
            String userAnswer = SC.nextLine();
            correctAnswer = isPrime(num);

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

    public static String isPrime(int num) {
        if (num < 2) {
            return "no";
        }
        if (num == 2) {
            return "yes";
        }
        if (num % 2 == 0) {
            return "no";
        }
        // Проверяем только нечётные делители до √n
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

}

package hexlet.code.games;

import java.security.SecureRandom;
import java.util.Scanner;

import hexlet.code.Cli;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Scanner SC = new Scanner(System.in);
    private static final Logger LOG = LoggerFactory.getLogger(Calculator.class);
    private static final SecureRandom RAND = new SecureRandom();

    static char[] signs = {'+', '-', '*'};

    public static void game2() {
        LOG.info("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {
            int randomNumber1 = RAND.nextInt(20) + 1;
            int randomNumber2 = RAND.nextInt(20) + 1;
            char randomSign = signs[RAND.nextInt(signs.length)];

            int correctResult;
            switch (randomSign) {
                case '+':
                    correctResult = randomNumber1 + randomNumber2;
                    break;
                case '-':
                    correctResult = randomNumber1 - randomNumber2;
                    break;
                case '*':
                    correctResult = randomNumber1 * randomNumber2;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + randomSign);
            }

            LOG.info("Question: " + randomNumber1 + " " + randomSign + " " + randomNumber2);
            String userInput = SC.nextLine();


            int userAnswer = Integer.parseInt(userInput);
            if (userAnswer == correctResult) {
                LOG.info("Correct!");
            } else {
                LOG.info("'" + userInput + "' is wrong answer ;(. Correct answer was '" + correctResult + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;  // Завершаем игру при ошибке
            }

        }

        System.out.println("Congratulations, " + Cli.getName() + "!");
    }


}

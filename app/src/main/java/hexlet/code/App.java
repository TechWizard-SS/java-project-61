package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.CheckingForParity;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {
    static final Logger LOG = LoggerFactory.getLogger(App.class);
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_COUNT = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;


    public static void main(String[] args) {


        LOG.info("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        Scanner sc = new Scanner(System.in);
        LOG.info("Your choice: ");

        switch (sc.nextInt()) {
            case EXIT:
                break;
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                Cli.greeting();
                CheckingForParity.game1();
                break;
            case CALC:
                Cli.greeting();
                Calculator.game2();
                break;
            case GCD_COUNT:
                Cli.greeting();
                GCD.game3();
                break;
            case PROGRESSION:
                Cli.greeting();
                Progression.game4();
                break;
            case PRIME:
                Cli.greeting();
                Prime.game5();
                break;
            default:
                break;
        }


    }
}

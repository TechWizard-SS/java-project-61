package hexlet.code;

import hexlet.code.games.CheckingForParity;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {
    static final Logger LOG = LoggerFactory.getLogger(App.class);

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
        int count = sc.nextInt();

        switch (count) {
            case 0:
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Cli.greeting();
                CheckingForParity.game1();
                break;
            case 3:
                Cli.greeting();
                Calculator.game2();
                break;
            case 4:
                Cli.greeting();
                GCD.game3();
                break;
            case 5:
                Cli.greeting();
                Progression.game4();
                break;
            case 6:
                Cli.greeting();
                Prime.game5();
                break;
            default:
                break;
        }


    }
}

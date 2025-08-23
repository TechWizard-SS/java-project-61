package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.CheckingForParity;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD_COUNT = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;


    public static void main(String[] args) {


        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case EXIT:
                break;

            case GREET:
                Cli.greeting(sc);
                break;

            case EVEN:
                CheckingForParity.game1(sc);
                break;

            case CALC:
                Calculator.game2(sc);
                break;

            case GCD_COUNT:
                GCD.game3(sc);
                break;

            case PROGRESSION:
                Progression.game4(sc);
                break;

            case PRIME:
                Prime.game5(sc);
                break;

            default:
                throw new RuntimeException("Unknown input: " + choice);
        }
    }
}

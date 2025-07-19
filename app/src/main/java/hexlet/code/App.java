package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
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
        System.out.print("Your choice: ");
        int count = sc.nextInt();

        switch (count) {
            case 0:
                System.out.println("Вы вышли из игры!");
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
        }


    }
}

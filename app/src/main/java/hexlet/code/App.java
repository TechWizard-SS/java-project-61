package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int count = sc.nextInt();

        switch (count) {
            case 0:
                System.out.println("Вы вышли из игры!");
                break;
            case 1:
                Cli.greeting();  // Приветствие
                break;
            case 2:
                Cli.greeting();  // Приветствие
                CheckingForParity.game1();
                break;
            default:
                throw new IllegalArgumentException("Unknown choice: ");
        }

    }
}

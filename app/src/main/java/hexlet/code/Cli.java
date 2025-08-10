package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String userName;

    public static void yourName() {
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli.yourName();
        System.out.println("Hello, " + Cli.userName + "!");
    }

    public static String getName() {
        return userName;
    }

}

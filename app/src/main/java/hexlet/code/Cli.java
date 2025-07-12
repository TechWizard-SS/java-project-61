package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String name;
    int count;

    public static String yourName() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        return name;
    }

    public static void greeting(){
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli.yourName();
        System.out.println("Hello, " + Cli.name + "!");
    }

}

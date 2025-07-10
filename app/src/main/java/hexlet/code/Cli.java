package hexlet.code;

import java.util.Scanner;

public class Cli {

    static String name;

    public static String yourName() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        return name;
    }
}

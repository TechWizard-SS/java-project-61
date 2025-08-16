package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String greeting(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.nextLine();  // Получаем имя прямо здесь
        System.out.println("Hello, " + userName + "!");
        return userName;  // Возвращаем имя для использования в других методах
    }


}

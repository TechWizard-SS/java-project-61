package Hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Cli.yourName();
        System.out.println("Hello, " + Cli.name + "!");
    }
}
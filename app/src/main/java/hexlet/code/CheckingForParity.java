package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class CheckingForParity {
    private static final Random rand = new Random();
    private static final Scanner sc = new Scanner(System.in);


    public static void game1(){
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("Question: " + randomNumber);

            String userAnswer = sc.nextLine();
            String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";

            System.out.println("Your answer: " + userAnswer);

            if(userAnswer.equals(correctAnswer)){
                System.out.println("Correct!");
            }
            else{
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }

            if(i == 2){
                System.out.println("Congratulations, " + Cli.name);
                break;
            }

        }
    }
}

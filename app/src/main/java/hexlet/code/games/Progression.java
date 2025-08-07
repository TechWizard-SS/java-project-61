package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Progression {
    private static final SecureRandom RAND = new SecureRandom();

//    public static void game4() {
//        Engine.run("What number is missing in the progression?", () -> {
//            int hiddenIndex = RAND.nextInt(10);
//            int step = RAND.nextInt(10) + 1;
//            int start = RAND.nextInt(100) + 1;
//
//            String[] progression = generateProgression(start, step);
//            String answer = progression[hiddenIndex];
//            progression[hiddenIndex] = "..";
//            String question = String.join(" ", progression);
//
//            return new Engine.QuestionAndAnswer(question, answer);
//        });
//    }

    public static void game4() {
        String description = "";
        String[][] questionAndAnswer = new String[3][2];

        for (int i = 0; i < 3; i++) {
            int hiddenIndex = RAND.nextInt(10);
            int step = RAND.nextInt(10) + 1;
            int start = RAND.nextInt(100) + 1;
            String[] progression = generateProgression(start, step);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }

        Engine.run2(description, questionAndAnswer);
    }

    private static String[] generateProgression(int start, int step) {
        String[] progression = new String[10];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}

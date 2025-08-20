package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.util.Scanner;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_STEP_VALUE = 10;
    private static final int MAX_START_VALUE = 100;

    public static void game4(Scanner scanner, String userName) {
        String description = "What number is missing in the progression?";
        String[][] questionAndAnswer = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int hiddenIndex = Utils.generateNumber(MAX_STEP_VALUE - 1);
            int step = Utils.generateNumber(1, MAX_STEP_VALUE);
            int start = Utils.generateNumber(1, MAX_START_VALUE);

            String[] progression = generateProgression(start, step);
            String answer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }

        Engine.run2(description, questionAndAnswer, userName, scanner);
    }

    private static String[] generateProgression(int start, int step) {
        String[] progression = new String[PROGRESSION_LENGTH];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}

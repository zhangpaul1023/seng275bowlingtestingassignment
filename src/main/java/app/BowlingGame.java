package app;

import java.util.ArrayList;

public class BowlingGame {

    public static final int NUMBER_OF_FRAMES = 10;
    private final int[] rolls;

    public BowlingGame(int[] rolls) {
        this.rolls = rolls;
    }

    public int score() {
        int result = 0;
        ArrayList<BowlingFrame> frames = createFrames();
        for (BowlingFrame frame: frames) {
            result += frame.score();
        }
        return result;
    }

    private ArrayList<BowlingFrame> createFrames() {
        ArrayList<BowlingFrame> frames = new ArrayList<>();
        int rollIndex = 0;
        for (int i = 0; i < NUMBER_OF_FRAMES; i++) {
            ArrayList<Integer> frameRolls = new ArrayList<>();

            // add/change code below

            if (rolls[rollIndex] + rolls[rollIndex+1] != 10){
                frameRolls.add(rolls[rollIndex]);
                frameRolls.add(rolls[rollIndex+1]);
            }
            if (rolls[rollIndex] + rolls[rollIndex+1] == 10 && rolls[rollIndex] < 10 && rolls[rollIndex+1] < 10){
                frameRolls.add(rolls[rollIndex]);
                frameRolls.add(rolls[rollIndex+1]);
                frameRolls.add(rolls[rollIndex+2]);
            }
            if (rolls[rollIndex] == 10){
                frameRolls.add(rolls[rollIndex]);
                frameRolls.add(rolls[rollIndex+2]);
                frameRolls.add(rolls[rollIndex+3]);
            }
            rollIndex += 2;

            // add/change code above

            frames.add(new BowlingFrame(frameRolls));
        }
        return frames;
    }



}

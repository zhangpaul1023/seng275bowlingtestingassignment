package unit;

import app.BowlingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingTests {
    @Test
    public void HookUp() {
        assertTrue(true);
    }


    @Test
    public void AllGutterBallsScores0() {
        BowlingGame game = new BowlingGame(new int[] {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0});
        int result = game.score();
        assertEquals(0, result);
    }

    @Test
    public void onePinOnly() {
        BowlingGame game = new BowlingGame(new int[] {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 1,0, 0,0, 0,0, 0,0});
        int result = game.score();
        assertEquals(1, result);
    }

    @Test
    public void spares() {
        BowlingGame game = new BowlingGame(new int[] {4,4, 4,4, 4,4, 4,4, 5,5, 4,4, 4,4, 4,4, 4,4, 4,4});
        int result = game.score();
        assertEquals(86, result);
    }

    @Test
    public void strikes() {
        BowlingGame game = new BowlingGame(new int[] {4,4, 4,4, 4,4, 4,4, 4,4, 4,4, 10,0 , 4,4, 4,4, 4,4});
        int result = game.score();
        assertEquals(90, result);
    }

}

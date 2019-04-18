package newBowlingGameTestPackage;

import newBowlingGameTestPackage.*;
import bowlinggame.BowlGame;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    BowlGame myGame;

    @Before
    public void initialize(){
        myGame = new BowlGame();

    }

    @Test
    public void rollAllGutterBallsTest(){
        //myGame = new BowlGame();
        rollMany(0, 20);
        assertEquals("Gutter game not calculated correctly", 0, myGame.getScore());
    }

    @Test
    public void rollAllOnesTest(){
        myGame = new BowlGame();
        rollMany(1, 20);
        assertEquals("Ones game not calculated correctly", 20, myGame.getScore());
    }

    @Test
    public void rollASpareTest(){
        myGame = new BowlGame();
        myGame.roll(5);
        myGame.roll(5);
        myGame.roll(4);
        rollMany(0,17);
        assertEquals("Spare in game not calculated correctly", 18, myGame.getScore());
    }

    @Test
    public void rollAStrikeTest(){
        myGame = new BowlGame();
        myGame.roll(10);
        myGame.roll(4);
        myGame.roll(5);
        rollMany(0,16);
        assertEquals("Strike in game not calculated correctly", 28, myGame.getScore());
    }

    @Test
    public void rollPerfectGameTest(){
        rollMany(10,12);
        assertEquals("Perfect game not calculated correctly", 300, myGame.getScore());
    }

    private void rollMany(int pins, int rolls){
        for(int i = 0; i < rolls; i++){
            myGame.roll(pins);
        }
    }

}

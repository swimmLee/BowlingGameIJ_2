package newBowlingGameTestPackage;

import bowlinggame.BowlGame;
import bowlinggame.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class PlayersScoresTest {

    Game game;

    @Before
    public void initialize(){
        game = new Game();
        List players = new ArrayList();
    }

    @Test
    public void buildArrayTest(){
        List players = new ArrayList();
        players = game.buildArray("Jerry", players);
        players = game.buildArray("Bob", players);
        assertEquals("buildArray not working properly", 2, players.size());
    }

    //@Test
    /*public void displayScores(){
        BowlGame bowlGame = new BowlGame();
        rollMany(bowlGame,1, 20 );
        players = buildArrayTest();
        game.displayResults(bowlGame, players, game.getNbrPlayers());
    }*/

    public void rollMany(BowlGame bowlGame, int pins, int rolls){
        for(int i = 0; i < rolls; i++){
            bowlGame.roll(pins);
        }
    }





}

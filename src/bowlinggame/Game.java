/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlinggame;

import java.util.ArrayList;
import java.util.List;

/**
 * The Game class asks how many people are playing, their names then, after game is over,
 * displays each name and the score (scoring is done in BowlGame class)
 * @author ayerj
 */
public class Game {
    
    private String player;
    private int nbrPlayers;
    private int gameScore;

    
    public Game (){

        
    }



    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getNbrPlayers(){return nbrPlayers;}
    public void setNbrPlayers(){this.nbrPlayers = nbrPlayers;}

    public int getGameScore() {
        return gameScore;
    }

    public List buildArray(String player, List players){
            players.add(player);
        return players;
    }

   
    public void displayResults(BowlGame myGame, List players, int nbrPlayers){


        for (int i = 0; i< nbrPlayers; i++ ){
            System.out.println(players.get(i));
            myGame.getScore();
        }


    }
}

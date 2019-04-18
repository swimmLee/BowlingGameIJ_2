package bowlinggame;

/**
 * The BowlGame class gets rolls and calculates the score
 *
 * @author Jason Ayer
 */

public class BowlGame {

    private int [] rolls = new int[21];
    private int currentRoll = 0;
    private int score = 0;

    /**
     * The roll method increments the roll array then saves the number of pins to the array element.
     *
     * @param pins the first number
     */
    public void roll(int pins){
        rolls[currentRoll++] = pins;
    }

    /**
     * The getScore method checks for spare, strike or normal frame score and does the proper calculations.
     *
     * @return the score
     */
    public int getScore(){
        int score = 0;
        int rollIndex = 0;

        for (int frameIndex = 0; frameIndex < 10; frameIndex++){
            if(rolls[rollIndex] == 10){ //strike
                score +=rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex++;
            } else if(rolls[rollIndex] + rolls[rollIndex + 1] == 10){ //spare
                score += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 2;
            } else { // normal frame
                score += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }

        }
        return score;
    }
}

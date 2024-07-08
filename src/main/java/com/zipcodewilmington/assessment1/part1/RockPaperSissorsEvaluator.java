package com.zipcodewilmington.assessment1.part1;

import java.awt.print.Paper;
import java.util.Objects;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

    if (handSign.equals(ROCK)){
        return PAPER;
    } else if (handSign.equals(PAPER)) {
        return SCISSOR;

    } else if (handSign.equals(SCISSOR)) {
        return ROCK;
    }
    return handSign;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        if (handSign.equals(PAPER)){
            return ROCK;
        } else if (handSign.equals(SCISSOR)) {
            return PAPER;

        } else if (handSign.equals(ROCK)) {
            return SCISSOR;
        }
        return handSign;
    }


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
       RockPaperSissorsEvaluator rps = new RockPaperSissorsEvaluator();

      if(handSignOfPlayer2.equals(ROCK)) {
          handSignOfPlayer1 = PAPER;
      } else if (handSignOfPlayer2.equals(PAPER)) {
            handSignOfPlayer1 = SCISSOR;
      }else if (handSignOfPlayer2.equals(SCISSOR)) {
          handSignOfPlayer1 = ROCK;

    }
      return handSignOfPlayer1;
}
}

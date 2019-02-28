package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

public class TennisScorerTest {

    @Test
    public void serverWins_GivenZeroZero_WhenServerWinsPoint_ThenScoreIsFifteenZero(){
        TennisScorer scorer = new TennisScorer();

        Assert.assertEquals(0, scorer.getServerScore());
        Assert.assertEquals(0, scorer.getReceiverScore());

        scorer.serverWon();

        Assert.assertEquals(15, scorer.getServerScore());
        Assert.assertEquals(0, scorer.getReceiverScore());
    }
}

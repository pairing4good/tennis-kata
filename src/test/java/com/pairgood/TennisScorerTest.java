package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

public class TennisScorerTest {

    @Test
    public void serverWins_GivenZeroZero_WhenServerWinsPoint_ThenScoreIsFifteenZero(){
        TennisScorer scorer = new TennisScorer(0, 0);

        Assert.assertEquals(0, scorer.getServerScore());
        Assert.assertEquals(0, scorer.getReceiverScore());

        scorer.serverWon();

        Assert.assertEquals(15, scorer.getServerScore());
        Assert.assertEquals(0, scorer.getReceiverScore());
    }

    @Test
    public void receiverWins_GivenFifteenFifteen_WhenReceiverWinsPoint_ThenScoreIsFifteenThirty(){
        TennisScorer scorer = new TennisScorer(15, 15);

        Assert.assertEquals(15, scorer.getServerScore());
        Assert.assertEquals(15, scorer.getReceiverScore());

        scorer.receiverWon();

        Assert.assertEquals(15, scorer.getServerScore());
        Assert.assertEquals(30, scorer.getReceiverScore());
    }
}

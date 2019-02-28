package com.pairgood;

public class TennisScorer {

    private int serverScore = 0;
    private int receiverScore = 0;

    public int getServerScore() {
        return serverScore;
    }

    public int getReceiverScore() {
        return receiverScore;
    }

    public void serverWon() {
        serverScore += 15;
    }
}

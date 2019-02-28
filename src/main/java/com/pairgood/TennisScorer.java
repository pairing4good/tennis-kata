package com.pairgood;

public class TennisScorer {

    public final static int ADVANTAGE = 41;
    private int serverScore;
    private int receiverScore;

    public TennisScorer(int serverScore, int receiverScore) {
        this.serverScore = serverScore;
        this.receiverScore = receiverScore;
    }

    public String getServerScore() {
        if(serverScore > 40){
            return "A";
        }
        return Integer.toString(serverScore);
    }

    public String getReceiverScore() {
        if(receiverScore > 40){
            return "A";
        }
        return Integer.toString(receiverScore);
    }

    public void serverWon() {
        if(serverScore == 30){
            serverScore += 10;
        }else{
            serverScore += 15;
        }
    }

    public void receiverWon() {
        if(serverScore > 40){
            serverScore = 40;
        }else {
            receiverScore += 15;
        }
    }
}

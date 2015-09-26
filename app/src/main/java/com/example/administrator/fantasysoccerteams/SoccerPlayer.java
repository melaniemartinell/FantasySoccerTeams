package com.example.administrator.fantasysoccerteams;

import android.media.Image;

/**
 * Created by martinme18 on 9/25/2015.
 */
public class SoccerPlayer {
    private String playerName;
    private String teamName;
    private int uniformNum;
    private int goals;
    private int assists;
    private int shots;
    private int saves;
    private int yellowCards;
    private int redCards;
    private int gamesPlayed;
    private boolean goalie;
    private String position;
    private Image imageOfPlayer;

    public SoccerPlayer(String playerNameInit, String teamNameInit, int uniformNumInit,String positionInit, boolean goalieInit){
        playerName = playerNameInit;
        teamName = teamNameInit;
        uniformNum = uniformNumInit;
        goals =0;
        assists =0;
        shots=0;
        saves =0;
        yellowCards=0;
        redCards=0;
        gamesPlayed=0;
        goalie = goalieInit;
        position= positionInit;

    }
    public void setPlayerName(String name){
        playerName = name;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setTeamName(String team){
        teamName = team;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setUniformNum(int num){
        uniformNum = num;
    }
    public int getUniformNum(){
        return uniformNum;
    }
    public void addGoal(){
        goals++;
    }
    public int getGoals(){
        return goals;
    }
    public void addAssist(){
        assists++;
    }
    public int getAssists(){
        return assists;
    }
    public void addShot(){
        shots++;
    }
    public int getShots(){
        return shots;
    }
    public void addSave(){
        saves++;
    }
    public int getSaves(){
        return saves;
    }
    public void addYellow(){
        yellowCards++;
    }
    public int getYellowCards(){
        return yellowCards;
    }
    public void addRed(){
        redCards++;
    }
    public int getRedCards(){
        return redCards;
    }
    public void addGamePlayed(){
        gamesPlayed++;
    }
    public int getGamesPlayed(){
        return gamesPlayed;
    }
    public void changePosition(String pos){
        position = pos;
    }
    public String getPosition(){
        return position;
    }
    public boolean isGoalie(){
        return goalie;
    }
    public void setGoalie(boolean isGoalie){
        goalie = isGoalie;
    }
}

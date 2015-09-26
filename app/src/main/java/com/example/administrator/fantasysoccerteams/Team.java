package com.example.administrator.fantasysoccerteams;

import android.media.Image;

import java.util.Hashtable;

/**
 * Created by martinme18 on 9/25/2015.
 */
public class Team {
    private String teamName;
    private int wins;
    private int losses;
    private int ties;
    private int totalGames;
    private int numPlayers;
    private Image teamLogo;
    private final int maxNumPlayers = 11;
    private Hashtable<String,SoccerPlayer> playersOnTeam;

    public Team(String teamNameInit){
        teamName = teamNameInit;
        wins =0;
        losses=0;
        ties=0;
        totalGames=0;
        numPlayers=0;
        playersOnTeam = new Hashtable<String,SoccerPlayer>();
    }
    public void addPlayer(String playerName, SoccerPlayer playerObj){
        playersOnTeam.put(playerName, playerObj);
        numPlayers++;
    }
    public SoccerPlayer getPlayer(String playerName){
        SoccerPlayer player = playersOnTeam.get(playerName);
        return player;

    }
    public void removePlayer(String playerName){
        playersOnTeam.remove(playerName);
        numPlayers--;

    }
    public void setTeamName(String team){
        teamName = team;
    }
    public void addWins(){
        wins++;
    }
    public void addLosses(){
        losses++;
    }
    public int getNumPlayers(){
        return numPlayers;
    }

}

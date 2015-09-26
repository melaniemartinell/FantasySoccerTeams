package com.example.administrator.fantasysoccerteams;

import java.util.Hashtable;

/**
 * Created by martinme18 on 9/25/2015.
 */
public class TeamDatabase {

    private Hashtable<String,Team> teamHash;

    public TeamDatabase(){
        teamHash = new Hashtable<String,Team>();

    }
    public void addTeam(String teamName, Team teamObj){
       teamHash.put(teamName,teamObj);
    }
    public Team getTeam(String teamName){
        if(teamHash.containsKey(teamName)){
            return teamHash.get(teamName);
        }
        else{
            return null;
        }
    }
    public boolean changeTeam(String player,String originalTeam, String moveToTeam){
        if(teamHash.containsKey(originalTeam) && teamHash.containsKey(moveToTeam)){
            Team team = new Team(originalTeam);
            SoccerPlayer playerObj = team.getPlayer(player);
            team.removePlayer(player);
            Team team2 = new Team(moveToTeam);
            team2.addPlayer(player,playerObj);
            return true;
        }

        return false;
    }
}

package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService   {

    public List<Team> getAllTeams(){
        
    }

    public int addTeam(Team team){
        return 1;
    }

    public List<Team> getAllTeamsSortedByName(){
        return null;
    }
}
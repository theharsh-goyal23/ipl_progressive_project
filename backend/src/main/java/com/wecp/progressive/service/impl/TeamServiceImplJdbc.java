package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplJdbc implements TeamService{

    private TeamDAO teamDAO;

    public TeamServiceImplJdbc(TeamDAO teamDAO){
        this.teamDAO = teamDAO;
    }

    public List<Team> getAllTeams(){
        return List.of();
    }

    public int addTeam(Team team){
        return -1;
    }

    public List<Team> getAllTeamsSortedByName(){
        return List.of();
    }
    
    public Team getTeamById(int teamId){
        return null;
    }
    public void updateTeam(Team team){

    }
    public void deleteTeam(int teamId){
        
    }

}
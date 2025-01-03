package com.wecp.progressive.service.impl;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.repository.TeamRepository;
 
@Service
public class TeamServiceImplJpa  {
 
    @Autowired
    private TeamRepository teamRepository;
 
    public List<Team> getAllTeams()
    {
        List<Team> list = new ArrayList<>();
        return list;
    }
 
    public Team getTeamById(int id)
    {
        return null;
    }
 
    public Team addTeam(Team team)
    {
        return null;
    }
 
    public void deleteTeam(int id)
    {}
 
    public void updateTeam(int id , Team team)
    {
 
    }
 
   
 
}
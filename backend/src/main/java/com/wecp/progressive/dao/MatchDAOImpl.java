package com.wecp.progressive.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Date;
import java.util.concurrent.ConcurrentHashMap;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Match;

public class MatchDAOImpl implements MatchDAO{

    @Override
    public int addMatch(Match match) {//throws SQLException {
    //     Connection connection = null;
    //     PreparedStatement statement = null;
    //     int generatedID = -1;

    //     try{
    //         connection = DatabaseConnectionManager.getConnection();
    //         String sql = "INSERT INTO team (first_team_id , second_team_id , match_date , venue , result , status , winner_team_id) VALUES (? , ? , ? , ? , ? , ? ,?)";
    //         statement = connection.prepareStatement(sql , PreparedStatement.RETURN_GENERATED_KEYS);
    //         statement.setInt(1, match.getFirstTeamId());
    //         statement.setInt(2, match.getSecondTeamId());
    //         statement.setDate(3, match.getMatchDate());
    //     }
    // }
    return -1;

    }

    @Override
    public void deleteMatch(int matchId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Match> getAllMatches() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Match getMatchById(int matchId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateMatch(Match match) {
        // TODO Auto-generated method stub
        
    }

}

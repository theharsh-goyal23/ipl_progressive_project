package com.wecp.progressive.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Cricketer;

public class CricketerDAOImpl implements CricketerDAO{

    @Override
    public int addCricketer(Cricketer cricketer){// throws SQLException{
        // Connection connection = null;
        // PreparedStatement statement = null;
        // int generatedID = -1;

        // try{
        //     connection = DatabaseConnectionManager.getConnection();
        //     String sql = "INSERT INTO cricketer (team_id , cricketer_name , age, nationality , experience , role , total_runs , total_wickets) VALUES (? , ? , ? ,? ,? , ?,? , ?)";
        //     statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        //     statement.setInt(1, cricketer.getTeamId());
        //     statement.setString(2, cricketer.getCricketerName());
        //     statement.setInt(3, cricketer.getAge());
        //     statement.setString(4, cricketer.getNationality());
        //     statement.setInt(5, cricketer.getExperience());
        //     statement.setString(6, cricketer.getRole());
        //     statement.setInt(7, cricketer.getTotalRuns());
        //     statement.setInt(8, cricketer.getTotalWickets());
        //     statement.executeUpdate();

        //     ResultSet resultSet = statement.getGeneratedKeys();
        //     if(resultSet.next()){
        //         generatedID = resultSet.getInt(1);
        //         cricketer.setCricketerId(generatedID);
        //     }
        // }
        //     catch(SQLException e){
        //         e.printStackTrace();
        //         throw e;
        //     }
        //     finally{
        //         //close resources in the reverse order of opening
        //         if (statement != null) {
        //             statement.close();
        //         }
        //     }
        //     return generatedID;
        return -1;
    }

    @Override
    public void deleteCricketer(int cricketerId) { //throws SQLException {
        // Connection connection = null;
        // PreparedStatement statement = null;
        // try{
        //     connection = DatabaseConnectionManager.getConnection();
        //     String sql = "DELETE FROM cricketer WHERE cricketer_id = ?";
        //     statement = connection.prepareStatement(sql);
        //     statement.setInt(1, cricketerId);
        //     statement.executeUpdate();
        // }
        // catch(SQLException e){
        //     e.printStackTrace();
        //     throw e;
        // }
        // finally{
        //     if (connection != null) {
        //        connection.close(); 
        //     }
        // }

        
    }

    @Override
    public List<Cricketer> getAllCricketers() {//throws SQLException {
    //     List<Cricketer> cricketers = new ArrayList<>();
    //     Connection connection = null;
    //     PreparedStatement statement = null;
    //     ResultSet resultSet = null;

    //     try{
    //         connection = DatabaseConnectionManager.getConnection();
    //         String sql = "SELECT * FROM cricketer";
    //         statement = connection.prepareStatement(sql);
    //         resultSet = statement.executeQuery();

    //         while ( resultSet.next()) {
    //             Cricketer cricketer = new Cricketer(
    //                 resultSet.getInt("cricketer_id"),
    //                 resultSet.getInt("team_id"),
    //                 resultSet.getString("cricketer_name"),
    //                 resultSet.getInt("age"),
    //                 resultSet.getString("nationality"),
    //                 resultSet.getInt("experience"),
    //                 resultSet.getString("role"),
    //                 resultSet.getInt("total_runs"),
    //                 resultSet.getInt("total_wickets")
    //             );
    //             cricketers.add(cricketer);
    //         }
    //     }
    
    // catch(SQLException e){
    //     e.printStackTrace();
    //     throw e;
    // }
    // finally{
    //     if (connection != null) {
    //        connection.close(); 
    //     }
    // }
    // return cricketers;
    return List.of();
    
}


    @Override
    public Cricketer getCricketerById(int cricketerId){ //throws SQLException{
        // Connection connection = null;
        // PreparedStatement statement = null;
        // ResultSet resultSet = null;

        // try{
        //     connection = DatabaseConnectionManager.getConnection();
        //     String sql = "SELECT * FROM product WHERE cricketer_id = ?";
        //     statement = connection.prepareStatement(sql);
        //     statement.setInt(1, cricketerId);
        //     resultSet = statement.executeQuery();

        //     if (resultSet.next()) {
        //         Cricketer cricketer = new Cricketer(
        //             resultSet.getInt("cricketer_id"),
        //             resultSet.getInt("team_id"),
        //             resultSet.getString("cricketer_name"),
        //             resultSet.getInt("age"),
        //             resultSet.getString("nationality"),
        //             resultSet.getInt("experience"),
        //             resultSet.getString("role"),
        //             resultSet.getInt("total_runs"),
        //             resultSet.getInt("total_wickets")

        //         );
        //         return cricketer;
        //     }
        // }
        //     catch(SQLException e){
        //         e.printStackTrace();
        //         throw e;
        //     }
        //     finally{
        //         if (connection != null) {
        //             connection.close();
        //         }
        //     }
            return null;
        
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {//throws SQLException {
    //     Connection connection = null;
    //     PreparedStatement statement = null;

    //     try{
    //         connection = DatabaseConnectionManager.getConnection();
    //         String sql = "UPDATE cricketer SET team_id = ? , cricketer_name = ? , age = ? , nationality = ? , experience = ? , role = ? , total_runs = ? , total_wickets = ? ";
    //         statement = connection.prepareStatement(sql);
    //         statement.setInt(1, cricketer.getTeamId());
    //         statement.setString(2, cricketer.getCricketerName());
    //         statement.setInt(3, cricketer.getAge());
    //         statement.setString(4, cricketer.getNationality());
    //         statement.setInt(5, cricketer.getExperience());
    //         statement.setString(6, cricketer.getRole());
    //         statement.setInt(7, cricketer.getTotalRuns());
    //         statement.setInt(8, cricketer.getTotalWickets());
    //         statement.executeUpdate();
    //     }
    //     catch(SQLException e){
    //         e.printStackTrace();
    //         throw e;
    //     } finally{
    //         if (connection != null) {
    //             connection.close();
    //         }
    //     }
        
    // }

}
}

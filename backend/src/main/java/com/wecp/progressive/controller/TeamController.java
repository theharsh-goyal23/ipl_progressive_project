package com.wecp.progressive.controller;
 
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
import com.wecp.progressive.service.impl.TeamServiceImplArraylist;
import com.wecp.progressive.service.impl.TeamServiceImplJpa;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.sql.SQLException;
import java.util.List;
 
@RestController
@RequestMapping("/team")
public class TeamController {
 
    @Autowired
    private TeamServiceImplArraylist teamServiceImplArraylist;
 
    @Autowired
    private TeamServiceImplJpa teamServiceImplJpa;
 
    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams() throws SQLException{
        return ResponseEntity.status(HttpStatus.OK).body(teamServiceImplJpa.getAllTeams());
    }
 
    @GetMapping("/{teamID}")
    public ResponseEntity<Team> getTeamById(@PathVariable int teamID) throws SQLException{
        return ResponseEntity.status(HttpStatus.OK).body(teamServiceImplJpa.getTeamById(teamID));
    }
 
    @PostMapping
    public ResponseEntity<Team> addTeam(@RequestBody Team team) throws SQLException{
        return ResponseEntity.status(HttpStatus.OK).body(teamServiceImplJpa.addTeam(team));
    }
 
    @PutMapping("/{teamID}")
    public ResponseEntity<Void> updateTeam(@PathVariable int teamID, @RequestBody Team team) throws SQLException{
        teamServiceImplJpa.updateTeam(teamID, team);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
 
    @DeleteMapping("/{teamID}")
    public ResponseEntity<Void> deleteTeam(@PathVariable int teamID) throws SQLException {
        teamServiceImplJpa.deleteTeam(teamID);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
 
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        return ResponseEntity.status(HttpStatus.OK).body(teamServiceImplArraylist.getAllTeams());
    }
 
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addTeamToArrayList(@RequestBody Team team) {
        return ResponseEntity.status(HttpStatus.CREATED).body(teamServiceImplArraylist.addTeam(team));
    }
 
    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        return ResponseEntity.status(HttpStatus.OK).body(teamServiceImplArraylist.getAllTeamsSortedByName());
    }
}


package com.grsi.department.its.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grsi.department.its.entities.Team;
import com.grsi.department.its.services.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to grsi home page";
	}

	// get the teams
	@GetMapping("/teams")
	public List<Team> getTeams() {

		return this.teamService.getTeams();

	}

	// get the team based on id
	@GetMapping("/teams/{teamId}")
	public Team getTeam(@PathVariable String teamId) {

		return this.teamService.getTeam(Long.parseLong(teamId));

	}

	// Add the team
	@PostMapping(path = "/teams")
	public Team addTeam(@RequestBody Team team) {

		return this.teamService.addTeam(team);

	}

	// Update the team
	@PutMapping(path = "/teams")
	public Team updateTeam(@RequestBody Team team) {

		return this.teamService.updateTeam(team);

	}

	// Delete the team
	@DeleteMapping(path = "/teams/{teamId}")
	public ResponseEntity<HttpStatus> deleteTeam(@PathVariable String teamId) {

		try {

			this.teamService.deleteTeam(Long.parseLong(teamId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}

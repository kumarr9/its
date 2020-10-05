package com.grsi.department.its.services;

import java.util.List;

import com.grsi.department.its.entities.Team;

public interface TeamService {
	
	public List<Team> getTeams();
	public Team getTeam(long teamId);
	public Team addTeam(Team team);
	public Team updateTeam(Team team);
	void deleteTeam(long teamId);

}

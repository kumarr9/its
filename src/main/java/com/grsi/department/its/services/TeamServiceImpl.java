package com.grsi.department.its.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.grsi.department.its.entities.Team;

@Service
public class TeamServiceImpl implements TeamService {
	
	List<Team> teams;

	public TeamServiceImpl() {

		teams = new ArrayList<>();
		teams.add(new Team(100, "OPS", "DEVOPS"));
		teams.add(new Team(101, "Cloud", "AWS"));
		teams.add(new Team(102, "Cloud", "Security"));
	}

	@Override
	public List<Team> getTeams() {
		// TODO Auto-generated method stub
		return teams;
		
	
	}

	@Override
	public Team getTeam(long teamId) {
		
		
		// TODO Auto-generated method stub
		Team team = null;
		for (Team tm : teams) {
			if (tm.getId() == teamId) {
				team = tm;
				break;
			}
		}
		return team;
	}

	@Override
	public Team addTeam(Team team) {
		// TODO Auto-generated method stub
		 teams.add(team);

		 return team;
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
	
		
		teams.forEach(e -> {
			
			if (e.getId() == team.getId()) {
				e.setName(team.getName());
				e.setSpeciality(team.getSpeciality());
			}
		});		
		
		
		return team;
	}
	
	@Override
	public void deleteTeam(long teamId) {
		// TODO Auto-generated method stub
		 teams = this.teams.stream().filter(e -> e.getId() !=teamId).collect(Collectors.toList());

	}

}

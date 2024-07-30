package com.robotics.management;

import java.util.ArrayList;
import java.util.List;

public class TeamManagement {
    private List<Team> teams;
    public TeamManagement() {
        teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(String teamName) {
        teams.removeIf(tmp -> tmp.getTeamName().equals(teamName));
    }

    public List<Team> getTeams() {
        return teams;
    }
}

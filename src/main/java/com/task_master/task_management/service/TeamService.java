package com.task_master.task_management.service;

import com.task_master.task_management.model.Team;
import com.task_master.task_management.model.User;

import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    Team createTeam(Team team);
    Optional<Team> getTeamById(Long id);
    List<Team> getAllTeams();
    Team updateTeam(Long id, Team teamDetails);
    void deleteTeam(Long id);
}
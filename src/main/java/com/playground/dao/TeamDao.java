package com.playground.dao;

import com.playground.domain.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamDao extends CrudRepository<Team, Long> {

    List<Team> findAll();

    Team findByName(String name);
}

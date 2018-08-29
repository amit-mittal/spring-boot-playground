package com.playground.controller;

import com.playground.components.TennisCoach;
import com.playground.dao.TeamDao;
import com.playground.domain.Player;
import com.playground.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class TestRestController {

    @Autowired
    private TennisCoach tennisCoach;

    @Autowired
    private TeamDao teamDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "I see the update: " + tennisCoach.getDailyWorkout();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Team save() {
        Set<Player> players = new HashSet<>();
        Player p1 = new Player("Player-1");
        players.add(p1);

        Team t1 = new Team("Team-1", players);
        t1 = teamDao.save(t1);

        return t1;
    }

    @RequestMapping(value = "/teams/{team}", method = RequestMethod.GET)
    public Team getTeam(@PathVariable String team) {
        Team t1 = teamDao.findByName(team);

        return t1;
    }
}

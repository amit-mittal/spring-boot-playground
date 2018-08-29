package com.playground.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Set<Player> players;

    protected Team() {
    }

    public Team(String name, Set<Player> players) {
        this.name = name;
        this.players = players;
    }
}

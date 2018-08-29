package com.playground.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    protected Player() {
    }

    public Player(String name) {
        this.name = name;
    }
}

package com.c0d3engr.alkiosromtracker.model;

import javax.persistence.*;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    private String characterName;
    private String characterClass;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // Getters and Setters
    // ...
}
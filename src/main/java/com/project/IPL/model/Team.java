package com.project.IPL.model;

import lombok.Data;

import java.util.List;

@Data
public class Team {
    private int id;
    private String name;
    private List<Player> players;
}

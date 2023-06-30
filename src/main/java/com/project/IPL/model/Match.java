package com.project.IPL.model;

import lombok.Data;

import java.util.Date;


@Data
public class Match {
    private int id;
    private String city;
    private Date date;
    private String season;
    private int matchNumber;
    private Team team1;
    private Team team2;
    private String venue;
    private String tossWinner;
    private String tossDecision;
    private boolean superOver;
    private Team winningTeam;
    private int wonBy;
    private String margin;
    private String method;
    private String playerOfMatch;
    private String umpire1;
    private String umpire2;

    public Match(int id, String city, Date date, String season, int matchNumber, Team team1, Team team2, String venue, String tossWinner, String tossDecision, boolean superOver, Team winningTeam, int wonBy, String margin, String method, String playerOfMatch, String umpire1, String umpire2) {
        this.id = id;
        this.city = city;
        this.date = date;
        this.season = season;
        this.matchNumber = matchNumber;
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.tossWinner = tossWinner;
        this.tossDecision = tossDecision;
        this.superOver = superOver;
        this.winningTeam = winningTeam;
        this.wonBy = wonBy;
        this.margin = margin;
        this.method = method;
        this.playerOfMatch = playerOfMatch;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
    }
}

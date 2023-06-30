package com.project.IPL.service;

import com.project.IPL.model.Match;

import java.util.List;

public interface MatchService {
    public List<Match> getAllMatches(String filePath);
    public Match getMatchById(int id);
}

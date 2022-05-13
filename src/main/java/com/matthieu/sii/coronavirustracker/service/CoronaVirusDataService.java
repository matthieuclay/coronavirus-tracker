package com.matthieu.sii.coronavirustracker.service;

import com.matthieu.sii.coronavirustracker.models.LocationStats;

import java.util.List;

public interface CoronaVirusDataService {
    List<LocationStats> getAllStats();
}

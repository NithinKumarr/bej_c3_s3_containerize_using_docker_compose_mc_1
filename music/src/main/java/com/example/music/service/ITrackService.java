package com.example.music.service;

import com.example.music.domain.Track;
import com.example.music.exception.CustomerAlreadyExistException;
import com.example.music.exception.CustomerNotFoundException;

import java.util.List;

public interface ITrackService {
    public Track addTrack(Track track)throws CustomerAlreadyExistException;
    public List<Track> grtAllTrack();
    public String deleteTrack(int trackId)throws CustomerNotFoundException;
    public List<Track>getTrackByArtistName(String artistName);
    public List<Track>getTrackByRatingGreaterThan(int trackrating);
}

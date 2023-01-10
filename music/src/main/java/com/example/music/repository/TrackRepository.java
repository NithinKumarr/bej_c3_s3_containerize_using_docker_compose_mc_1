package com.example.music.repository;

import com.example.music.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
@Query("{'trackArtist.artistName':{$in:[?0]}}")
public List<Track>findAllTrackByArtistName(String trackArtist);
@Query("{'trackRating':{$gt:?0}}")
public List<Track>findAllTrackByRatingGreaterThan(int trackRating);
}

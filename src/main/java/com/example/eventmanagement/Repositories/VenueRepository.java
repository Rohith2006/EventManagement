package com.example.eventmanagement.Repositories;

import com.example.eventmanagement.Models.Venue;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface VenueRepository {

    List<Venue> findAll();

    Optional<Venue> findById(long venueId);

}
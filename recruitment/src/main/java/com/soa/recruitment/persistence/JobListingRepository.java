package com.soa.recruitment.persistence;

import com.soa.recruitment.model.JobListing;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobListingRepository extends JpaRepository<JobListing, Long> {

}


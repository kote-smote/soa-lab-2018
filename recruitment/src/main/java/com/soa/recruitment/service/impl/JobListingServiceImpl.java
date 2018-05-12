package com.soa.recruitment.service.impl;

import com.soa.recruitment.model.JobListing;
import com.soa.recruitment.persistence.JobListingRepository;
import com.soa.recruitment.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobListingServiceImpl implements JobListingService {

    private JobListingRepository jobListingRepository;

    @Autowired
    public JobListingServiceImpl(JobListingRepository jobListingRepository) {
        this.jobListingRepository = jobListingRepository;
    }

    @Override
    public Optional<JobListing> findOne(Long id) {
        return jobListingRepository.findById(id);
    }

    @Override
    public JobListing save(JobListing jobListing) {
        return jobListingRepository.save(jobListing);
    }

    @Override
    public Iterable<JobListing> findAll() {
        return jobListingRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        jobListingRepository.deleteById(id);
    }
}

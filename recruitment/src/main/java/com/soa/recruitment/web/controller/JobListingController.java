package com.soa.recruitment.web.controller;

import com.soa.recruitment.model.JobApplication;
import com.soa.recruitment.model.JobListing;
import com.soa.recruitment.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/recruitment/jobs/listing", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class JobListingController {

    private final JobListingService jobListingService;

    @Autowired
    public JobListingController(JobListingService jobListingService) {
        this.jobListingService = jobListingService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<JobListing> all() {
        return jobListingService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JobListing save(@RequestBody JobListing category){
        return jobListingService.save(category);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        jobListingService.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<JobListing> getJob(@PathVariable Long id) {
        return jobListingService.findOne(id);

    }



}

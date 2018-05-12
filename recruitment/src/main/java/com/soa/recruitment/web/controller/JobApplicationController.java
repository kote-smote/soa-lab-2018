package com.soa.recruitment.web.controller;

import com.soa.recruitment.model.JobApplication;
import com.soa.recruitment.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/recruitment/jobs/application", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class JobApplicationController {

    private JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService){
        this.jobApplicationService = jobApplicationService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<JobApplication> getApplication(@PathVariable Long id) {
        return jobApplicationService.getApplication(id);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteApplication(@PathVariable Long id) {
        jobApplicationService.deleteApplication(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public JobApplication create(@RequestBody JobApplication jobApplication) {
        return jobApplicationService.create(jobApplication);
    }

}

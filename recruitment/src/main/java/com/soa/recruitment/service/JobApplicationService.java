package com.soa.recruitment.service;

import com.soa.recruitment.model.JobApplication;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface JobApplicationService {

    public Optional<JobApplication> getApplication(Long id);

    public void deleteApplication(Long id);

    public JobApplication create(JobApplication jobApplication);
}

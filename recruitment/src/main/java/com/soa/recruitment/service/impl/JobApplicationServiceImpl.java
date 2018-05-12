package com.soa.recruitment.service.impl;

import com.soa.recruitment.model.JobApplication;
import com.soa.recruitment.persistence.JobApplicationRepository;
import com.soa.recruitment.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    private JobApplicationRepository jobApplicationRepository;

    @Autowired
    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository = jobApplicationRepository;
    }

    @Override
    public Optional<JobApplication> getApplication(Long id) {
        return jobApplicationRepository.findById(id);
    }

    @Override
    public JobApplication create(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    @Override
    public void deleteApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }
}

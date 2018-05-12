package com.soa.recruitment.service.impl;

import com.soa.recruitment.model.InterviewFeedback;
import com.soa.recruitment.model.exception.InterviewFeedbackNotPresentException;
import com.soa.recruitment.persistence.InterviewFeedbackRepository;
import com.soa.recruitment.service.InterviewFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewFeedbackServiceImpl implements InterviewFeedbackService {

    private InterviewFeedbackRepository interviewFeedbackRepository;

    @Autowired
    public InterviewFeedbackServiceImpl(InterviewFeedbackRepository interviewFeedbackRepository) {
        this.interviewFeedbackRepository = interviewFeedbackRepository;
    }

    @Override
    public boolean addInterviewFeedback(InterviewFeedback interviewFeedback) {
        return false;
    }

    @Override
    public InterviewFeedback getInterviewFeedback(Long id) {
       return this.interviewFeedbackRepository.findById(id)
               .orElseThrow(InterviewFeedbackNotPresentException::new);
    }

    @Override
    public boolean updateInterviewFeedback(Long id, InterviewFeedback updated) {
        if (this.interviewFeedbackIsPresent(updated.getId())) {
            this.interviewFeedbackRepository.save(updated);
            return true;
        }
        return false;
    }

    @Override
    public void deleteInterviewFeedback(Long id) {
        this.interviewFeedbackRepository.deleteById(id);
    }

    private boolean interviewFeedbackIsPresent(Long id) {
        return this.interviewFeedbackRepository.findById(id).isPresent();
    }
}

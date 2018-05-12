package com.soa.recruitment.service;


import com.soa.recruitment.model.InterviewFeedback;
import org.springframework.stereotype.Service;


public interface InterviewFeedbackService {

    boolean addInterviewFeedback(InterviewFeedback interviewFeedback);

    InterviewFeedback getInterviewFeedback(Long id);

    boolean updateInterviewFeedback(Long id, InterviewFeedback updated);

    void deleteInterviewFeedback(Long id);

}

package com.soa.recruitment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class JobApplication {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private String position;

    private String email;

    private String phoneNumber;

    private String address;

    private String city;

    private String cv;

    private String githubAccount;

    @ManyToOne
    private JobListing jobListing;

    @OneToOne
    private InterviewFeedback interviewFeedback;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getGithubAccount() {
        return githubAccount;
    }

    public void setGithubAccount(String githubAccount) {
        this.githubAccount = githubAccount;
    }

    public JobListing getJobListing() {
        return jobListing;
    }

    public void setJobListing(JobListing jobListing) {
        this.jobListing = jobListing;
    }

    public InterviewFeedback getInterviewFeedback() {
        return interviewFeedback;
    }

    public void setInterviewFeedback(InterviewFeedback interviewFeedback) {
        this.interviewFeedback = interviewFeedback;
    }
}

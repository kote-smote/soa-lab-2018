package com.soa.recruitment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERVIEW_FEEDBACK")
public class InterviewFeedback {

    @Id
    private long id;

    private float firstImpression;

    private float preparation;

    private float personalAttr;

    private float generalAttitude;

    private float responses;

    private float qualified;

    private String[] notes;

    public InterviewFeedback() {}

    public void setFirstImpression(float firstImpression) {
        this.firstImpression = firstImpression;
    }

    public void setPreparation(float preparation) {
        this.preparation = preparation;
    }

    public void setPersonalAttr(float personalAttr) {
        this.personalAttr = personalAttr;
    }

    public void setGeneralAttitude(float generalAttitude) {
        this.generalAttitude = generalAttitude;
    }

    public void setResponses(float responses) {
        this.responses = responses;
    }

    public void setQualified(float qualified) {
        this.qualified = qualified;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public float getFirstImpression() {

        return firstImpression;
    }

    public float getPreparation() {
        return preparation;
    }

    public float getPersonalAttr() {
        return personalAttr;
    }

    public float getGeneralAttitude() {
        return generalAttitude;
    }

    public float getResponses() {
        return responses;
    }

    public float getQualified() {
        return qualified;
    }

    public String[] getNotes() {
        return notes;
    }
}

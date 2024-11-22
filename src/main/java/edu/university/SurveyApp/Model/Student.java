package edu.university.SurveyApp.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_Id")
    private int surveyId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private int zip;

    @Column(name = "phone_Number")
    private long phoneNumber;

    @Column(name = "survey_Date")
    private String surveyDate;

    @Column(name = "thing_liked_On_Campus")
    private String campusLovedThing;

    @Column(name = "What_Intrested_On_University")
    private String whyJoinUni;

    @Column(name = "Recommendation_To_Friend")
    private String recommendFriends;

    // Getter and Setter for surveyId
    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for zip
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    // Getter and Setter for phoneNumber
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for surveyDate
    public String getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(String surveyDate) {
        this.surveyDate = surveyDate;
    }

    // Getter and Setter for campusLovedThing
    public String getCampusLovedThing() {
        return campusLovedThing;
    }

    public void setCampusLovedThing(String campusLovedThing) {
        this.campusLovedThing = campusLovedThing;
    }

    // Getter and Setter for whyJoinUni
    public String getWhyJoinUni() {
        return whyJoinUni;
    }

    public void setWhyJoinUni(String whyJoinUni) {
        this.whyJoinUni = whyJoinUni;
    }

    // Getter and Setter for recommendFriends
    public String getRecommendFriends() {
        return recommendFriends;
    }

    public void setRecommendFriends(String recommendFriends) {
        this.recommendFriends = recommendFriends;
    }
}

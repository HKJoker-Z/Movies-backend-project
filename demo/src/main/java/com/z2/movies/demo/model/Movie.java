package com.z2.movies.demo.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String type;

    //let description column be longtext type
    @Column(columnDefinition="TEXT")
    private String description;
    private String duration;    //it's salary prev in front
    private String companyName; //it's "Julian Zhao" by default prev company.name in front

    @Column(columnDefinition="TEXT")
    private String companyDescription;
    private String companyEmail;
    private String companyPhone;

    private int year;
    private String language;
    private String country;
    private String director;
    private String localPath;

    public Movie(int id, String title, String type, String description, String duration, String companyName, String companyDescription, String companyEmail, String companyPhone, int year, String language, String country, String director, String localPath) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.description = description;
        this.duration = duration;
        this.companyName = companyName;
        this.companyDescription = companyDescription;
        this.companyEmail = companyEmail;
        this.companyPhone = companyPhone;
        this.year = year;
        this.language = language;
        this.country = country;
        this.director = director;
        this.localPath = localPath;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }
}

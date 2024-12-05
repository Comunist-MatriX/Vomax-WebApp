package com.vomax.vomax.Database;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "User_TBL")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String LastName;
    @Column
    private String email;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String profilePic;
    @Column
    private String description;
    @Column
    private Date dateOfbirth;
    @Column
    private String githupUrl;
    @Column
    private Date dateOfsignup;


    // Constructors, Getters, Setters
    public User() {}

    public User(String firstName, String lastName, String email, String username, String password, String profilePic, String description, Date dateOfbirth, String githupUrl, Date dateOfsignup) {

        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.profilePic = profilePic;
        this.description = description;
        this.dateOfbirth = dateOfbirth;
        this.githupUrl = githupUrl;
        this.dateOfsignup = dateOfsignup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGithupUrl() {
        return githupUrl;
    }

    public void setGithupUrl(String githupUrl) {
        this.githupUrl = githupUrl;
    }

    public Date getDateOfsignup() {
        return dateOfsignup;
    }

    public void setDateOfsignup(Date dateOfsignup) {
        this.dateOfsignup = dateOfsignup;
    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", description='" + description + '\'' +
                ", dateOfbirth=" + dateOfbirth +
                ", githupUrl='" + githupUrl + '\'' +
                ", dateOfsignup=" + dateOfsignup +
                '}';
    }
}

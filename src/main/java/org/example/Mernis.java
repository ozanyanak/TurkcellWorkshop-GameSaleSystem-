package org.example;

import java.util.Date;

public class Mernis {

    private String nationalIdentity;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public Mernis() {
    }

    public Mernis(String nationalIdentity, String firstName, String lastName, Date dateOfBirth) {
        this.nationalIdentity = nationalIdentity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

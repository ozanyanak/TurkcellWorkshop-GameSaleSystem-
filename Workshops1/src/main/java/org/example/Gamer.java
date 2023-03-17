package org.example;

import java.util.Date;

public class Gamer extends User {
    private String userName;

    public Gamer() {
    }

    public Gamer(int id, String password, String userName, String firstName, String lastName, String email, String nationalIdentity, Date dateOfBirth) {
        super(id, email, password, nationalIdentity, firstName, lastName, dateOfBirth);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

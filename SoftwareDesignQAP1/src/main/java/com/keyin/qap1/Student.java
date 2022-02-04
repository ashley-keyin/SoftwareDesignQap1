package com.keyin.qap1;

//Student class to take in first and last name along with email and display it formatted
//~ 1 hr
//used old lectures and stackoverflow

public class Student {
    private String lastName;
    private String firstName;
    private String email;

    public void setStudent(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String toString() {
        return ("Student's name is " + this.firstName + " " + this.lastName + " and has email = " + this.email);
    }
}



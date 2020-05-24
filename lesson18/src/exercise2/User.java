package exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String firstName;
    private String lastName;
    private int[] dateOfBirth = new int[3];
    private int day;
    private int month;
    private int year;

    public User(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        setDateOfBirth();
    }

    public String printUser() {
        return this.firstName + " " + this.lastName + " " + getDateOfBirthAsString();
    }

    public String getDateOfBirthAsString() {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < this.dateOfBirth.length; i++) {
            strB.append(this.dateOfBirth[i]);
            if (i < this.dateOfBirth.length - 1) { strB.append("/"); }
        }

        return strB.toString();
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

    public int[] getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth[0] = this.day;
        this.dateOfBirth[1] = this.month;
        this.dateOfBirth[2] = this.year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}

package ru.mirea.task4;

public class author
{
    private String name;
    private String email;
    private char gender;

    public author(String NAME, String EMAIL, char GENDER)
    {
        name = NAME;
        email = EMAIL;
        gender = GENDER;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + ' ' + '{' + gender + '}' + ' ' + "at" + ' ' + email;
    }
}


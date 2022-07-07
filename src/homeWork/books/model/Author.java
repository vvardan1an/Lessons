package homeWork.books.model;

import homeWork.books.enums.AuthorGender;

import java.util.Objects;

public class Author {

    private String name;
    private String surName;
    private String email;
    private AuthorGender gender;

    public Author(String name, String surName, String email, AuthorGender gender) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.gender = gender;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AuthorGender getGender() {
        return gender;
    }

    public void setGender(AuthorGender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

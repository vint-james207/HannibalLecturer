package com.james.entities;

import javax.persistence.*;

/**
 * Created by jamesyburr on 7/1/16.
 */
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String text;

    @Transient
    int lecturerId;

    @Column(nullable = false)
    boolean isGood;

    @ManyToOne
    Lecturer lecturer;

    public Review() {
    }

    public Review(String author, String text, boolean isGood, Lecturer lecturer) {
        this.author = author;
        this.text = text;
        this.isGood = isGood;
        this.lecturer = lecturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getIsGood() {
        return isGood;
    }

    public void setIsGood(boolean good) {
        isGood = good;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public int getLecturerId() {
        return lecturer.id;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturer.id;
    }
}

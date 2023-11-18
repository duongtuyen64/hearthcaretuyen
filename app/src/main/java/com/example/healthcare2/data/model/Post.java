package com.example.healthcare2.data.model;

public class Post {
    private int picture;
    private String name;
    private String comment;
    private String comment1;

    public Post(int picture, String name, String comment, String comment1) {
        this.picture = picture;
        this.name = name;
        this.comment = comment;
        this.comment1 = comment1;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }
}

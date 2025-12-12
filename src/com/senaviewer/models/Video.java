package com.senaviewer.models;

public class Video extends Content {

    private String genre;

    public Video(String title, int duration, String genre) {
        super(title, duration);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Video: " + title + " | Duración: " + duration + " min | Género: " + genre;
    }
}


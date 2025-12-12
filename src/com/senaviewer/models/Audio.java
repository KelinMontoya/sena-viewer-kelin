package com.senaviewer.models;

public class Audio extends Content {

    private String artist;

    public Audio(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Audio: " + title + " | Duración: " + duration + " min | Artista: " + artist;
    }
}

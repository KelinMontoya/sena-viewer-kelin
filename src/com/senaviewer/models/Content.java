package com.senaviewer.models;

public abstract class Content {
    private String id;
    private String title;
    private int durationSeconds; // duración en segundos

    public Content(String id, String title, int durationSeconds) {
        this.id = id;
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getDurationSeconds() { return durationSeconds; }

    public void setTitle(String title) { this.title = title; }
    public void setDurationSeconds(int durationSeconds) { this.durationSeconds = durationSeconds; }

    public abstract void showSpecs();

    public void play() {
        System.out.println("Reproduciendo: " + title + " (" + durationSeconds + "s)");
    }
}

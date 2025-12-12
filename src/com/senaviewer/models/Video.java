package com.senaviewer.models;

public class Video extends Content {
    private String resolution; // e.g. 1920x1080

    public Video(String id, String title, int durationSeconds, String resolution) {
        super(id, title, durationSeconds);
        this.resolution = resolution;
    }

    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    @Override
    public void showSpecs() {
        System.out.println("[Video] " + getTitle() + " - " + resolution + " - " + getDurationSeconds() + "s");
    }
}

package com.senaviewer.models;

public class Audio extends Content {
    private int bitrate; // kbps

    public Audio(String id, String title, int durationSeconds, int bitrate) {
        super(id, title, durationSeconds);
        this.bitrate = bitrate;
    }

    public int getBitrate() { return bitrate; }
    public void setBitrate(int bitrate) { this.bitrate = bitrate; }

    @Override
    public void showSpecs() {
        System.out.println("[Audio] " + getTitle() + " - " + bitrate + "kbps - " + getDurationSeconds() + "s");
    }
}

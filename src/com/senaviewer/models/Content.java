package com.senaviewer.models;

public abstract class Content {

    protected String title;
    protected int duration;
    private String id;

    public Content(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.id = String.valueOf(System.currentTimeMillis());
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public void showSpecs() {
        System.out.println(this.toString());
    }
}

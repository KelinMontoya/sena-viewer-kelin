package com.senaviewer.models;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Content> items = new ArrayList<>();

    public Playlist(String name) { this.name = name; }

    public String getName() { return name; }
    public List<Content> getItems() { return items; }

    public void add(Content c) { items.add(c); }
    public boolean remove(String contentId) {
        return items.removeIf(c -> c.getId().equals(contentId));
    }

    public void list() {
        System.out.println("Playlist: " + name);
        for (int i = 0; i < items.size(); i++) {
            System.out.print((i+1) + ") ");
            items.get(i).showSpecs();
        }
    }
}

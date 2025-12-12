package com.senaviewer.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists = new ArrayList<>();

    public User(String username) { this.username = username; }

    public String getUsername() { return username; }
    public List<Playlist> getPlaylists() { return playlists; }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
    }

    public Playlist findPlaylist(String name) {
        for (Playlist p : playlists) if (p.getName().equalsIgnoreCase(name)) return p;
        return null;
    }
}

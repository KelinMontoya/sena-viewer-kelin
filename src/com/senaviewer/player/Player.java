package com.senaviewer.player;

import com.senaviewer.models.Content;

public class Player {
    private Content current;

    public void play(Content content) {
    System.out.println("▶ Reproduciendo: " + content.getTitle());
        current = content;
        System.out.println("--- Player: Iniciando reproducción ---");
        content.play();
        System.out.println("--- Player: Fin ---\n");
    }

    public Content getCurrent() { return current; }
}

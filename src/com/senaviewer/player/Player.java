package com.senaviewer.player;

import com.senaviewer.models.Content;

public class Player {
    private Content current;

    public void play(Content c) {
        current = c;
        System.out.println("--- Player: Iniciando reproducción ---");
        c.play();
        System.out.println("--- Player: Fin ---\n");
    }

    public Content getCurrent() { return current; }
}

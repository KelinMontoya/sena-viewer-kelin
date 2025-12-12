package com.senaviewer;

import com.senaviewer.models.*;
import com.senaviewer.player.Player;
import com.senaviewer.utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a SENA Viewer (Consola)");

        // datos de ejemplo
        Video v1 = new Video("v001","Introducción a Java", 300, "1920x1080");
        Audio a1 = new Audio("a001","Podcast: Arquitectura", 1800, 128);

        User user = new User("estudiante");
        user.createPlaylist("Favoritos");
        Playlist fav = user.findPlaylist("Favoritos");
        fav.add(v1);
        fav.add(a1);

        Player player = new Player();

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:\n1) Listar contenidos de Favoritos\n2) Reproducir item\n3) Agregar contenido de ejemplo (Video)\n4) Eliminar item por id\n5) Salir");
            int opt = ConsoleUtils.readInt("Selecciona una opción");

            switch (opt) {
                case 1:
                    fav.list();
                    break;
                case 2:
                    fav.list();
                    int idx = ConsoleUtils.readInt("Elige el número a reproducir") - 1;
                    if (idx >= 0 && idx < fav.getItems().size()) {
                        player.play(fav.getItems().get(idx));
                    } else System.out.println("Índice inválido");
                    break;
                case 3:
                    Video vx = new Video("v" + System.currentTimeMillis(),
                            ConsoleUtils.readLine("Título"),
                            ConsoleUtils.readInt("Duración (s)"),
                            ConsoleUtils.readLine("Resolución"));
                    fav.add(vx);
                    System.out.println("Contenido añadido a Favoritos");
                    break;
                case 4:
                    String idToRemove = ConsoleUtils.readLine("ID del contenido a eliminar (ej: v001)");
                    boolean removed = fav.remove(idToRemove);
                    System.out.println(removed ? "Eliminado" : "No se encontró el ID");
                    break;
                case 5:
                    running = false; break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        System.out.println("Gracias por usar SENA Viewer. Hasta luego!");
    }
}

package com.senaviewer.app;

import com.senaviewer.models.Audio;
import com.senaviewer.models.Video;
import com.senaviewer.models.Content;
import com.senaviewer.models.Playlist;
import com.senaviewer.player.Player;
import com.senaviewer.utils.ContentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContentService service = new ContentService();
        List<Playlist> playlists = new ArrayList<>();
        Player player = new Player();

        int option;

        do {
            System.out.println("\n===== SENA VIEWER =====");
            System.out.println("1. Agregar Video");
            System.out.println("2. Agregar Audio");
            System.out.println("3. Listar Contenidos");
            System.out.println("4. Buscar contenido por título");
            System.out.println("5. Reproducir contenido");
            System.out.println("6. Crear Playlist");
            System.out.println("7. Mostrar Playlists");
            System.out.println("8. Salir");
            System.out.print("Opción: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1 -> {
                    System.out.print("Título: ");
                    String title = sc.nextLine();
                    System.out.print("Duración: ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Género: ");
                    String genre = sc.nextLine();

                    Video video = new Video(title, duration, genre);
                    service.addContent(video);
                }

                case 2 -> {
                    System.out.print("Título: ");
                    String title = sc.nextLine();
                    System.out.print("Duración: ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Artista: ");
                    String artist = sc.nextLine();

                    Audio audio = new Audio(title, duration, artist);
                    service.addContent(audio);
                }

                case 3 -> {
                    System.out.println("\n--- CONTENIDOS REGISTRADOS ---");
                    service.getAll().forEach(System.out::println);
                }

                case 4 -> {
                    System.out.print("Ingrese el título a buscar: ");
                    String title = sc.nextLine();

                    Content found = service.searchByTitle(title);

                    if (found != null) System.out.println("Encontrado: " + found);
                    else System.out.println("❌ No se encontró contenido");
                }

                case 5 -> {
                    System.out.print("Título del contenido a reproducir: ");
                    String title = sc.nextLine();

                    Content content = service.searchByTitle(title);

                    if (content != null) player.play(content);
                    else System.out.println("❌ No existe ese contenido");
                }

                case 6 -> {
                    System.out.print("Nombre de la playlist: ");
                    String name = sc.nextLine();

                    Playlist playlist = new Playlist(name);

                    String addMore;
                    do {
                        System.out.print("Agregar título de contenido: ");
                        String title = sc.nextLine();

                        Content content = service.searchByTitle(title);
                        if (content != null) {
                            playlist.add(content);
                            System.out.println("✔ Agregado a la playlist");
                        } else {
                            System.out.println("❌ No encontrado");
                        }

                        System.out.print("¿Agregar otro? (s/n): ");
                        addMore = sc.nextLine();

                    } while (addMore.equalsIgnoreCase("s"));

                    playlists.add(playlist);
                    System.out.println("🎵 Playlist creada correctamente.");
                }

                case 7 -> {
                    System.out.println("\n--- PLAYLISTS ---");
                    if (playlists.isEmpty()) {
                        System.out.println("No hay playlists creadas.");
                    } else {
                        playlists.forEach(System.out::println);
                    }
                }

                case 8 -> {
                    System.out.println("Saliendo del sistema...");
                }

                default -> System.out.println("Opción no válida.");
            }

        } while (option != 8);

        sc.close();
    }

}




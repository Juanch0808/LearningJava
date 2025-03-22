package com.ListaDeCanciones;

import java.util.LinkedList;
import java.util.Scanner;


public class Playlist {

    private Scanner input;
    private LinkedList<Cancion> playList;

    public Playlist(Scanner input) {
        this.input = input;
        this.playList = new LinkedList<>();
    }


    public void mostrarPlaylist() {
        if (this.playList.isEmpty()) {
            System.out.println("La playlist está vacía.");
        } else {
            for (int i = 0; i < this.playList.size(); i++) {
                System.out.println((i + 1) + ". " + this.playList.get(i));
            }
        }
    }

    public void agregarCancion() {
        try {
            System.out.println("Escriba el nombre de la canción: ");
            String nombreCancion = this.input.nextLine();
            System.out.println("Escriba el nombre del artista: ");
            String artista = this.input.nextLine();
            System.out.println("Ingrese el número correspondiente a la opción que desee:  1°Agregar cancion al inicio de la playlist. 2°Agregar canción al final de la playlist.");
            int opcion = Integer.parseInt(input.nextLine());

            Cancion cancion = new Cancion(nombreCancion, artista);

            if (opcion <= 0 || opcion > 2) {
                System.out.println("Opción no válida. Indique correctamente donde quiere agregar la nueva canción.");
            } else if (opcion == 1){
                this.playList.addFirst(cancion);
                System.out.println("La canción ha sido agregada al principio de su playlist.");
            } else {
                this.playList.addLast(cancion);
                System.out.println("La canción ha sido agregada al final de su playlist.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Algo ha salido mal. Verifique los datos ingresados. " + e.getMessage());
        }
    }

    public void eliminarCancion() {
        System.out.println("Escriba la cancion que desea eliminar: ");
        String cancion = this.input.nextLine();
        System.out.println("Escriba el artista: ");
        String artista = this.input.nextLine();
        boolean flag = false;
        for (var c : this.playList) {
            if (c.getNombreDeLaCancion().equalsIgnoreCase(cancion) && c.getArtista().equalsIgnoreCase(artista)) {
                this.playList.remove(c);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Su canción ha sido eliminada de la playlist");
        } else {
            System.out.println("La canción que desea eliminar no existe en la playlist.");
        }

    }

    public void buscarPorArtista() {
        System.out.println("Escriba el nombre del artista: ");
        String artista = this.input.nextLine();
        boolean flag = false;
        for (int i = 0; i < this.playList.size(); i++) {
            if (this.playList.get(i).getArtista().equalsIgnoreCase(artista)) {
                System.out.println((i + 1) + ". " + this.playList.get(i).getArtista() + " | " + this.playList.get(i).getNombreDeLaCancion());
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No se han encontrado canciones del Artista requerido.");
        }
    }
}
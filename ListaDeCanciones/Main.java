package com.ListaDeCanciones;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Cancion tema = new Cancion("Diamonds", "Rihanna");
        Scanner input = new Scanner(System.in);
        String user;
        int userOption;
        Playlist listaDeCanciones = new Playlist(input);
        boolean flag = false;

        do {
            try {
                System.out.println("-----------MENU-----------");
                System.out.println("Ingrese el número que corresponda a la opción que desea.");
                System.out.println("1°: Mostrar playlist. 2°: Agregar cancion a la playlist. 3°: Buscar canción por Artista. 4°: Eliminar cancion. 5°: Salir.");
                user = input.nextLine();
                userOption = Integer.parseInt(user);
                switch (userOption) {
                    case 1:

                        listaDeCanciones.mostrarPlaylist();
                        break;
                    case 2:
                        listaDeCanciones.agregarCancion();
                        break;
                    case 3:
                        listaDeCanciones.buscarPorArtista();
                        break;
                    case 4:
                        listaDeCanciones.eliminarCancion();
                        break;
                    case 5:
                        System.out.println("Hasta luego.");
                        flag = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                    }
                } catch (NumberFormatException e) {
                System.out.println("Algo ha salido mal. Verifique los datos ingresados. " + e.getMessage());
            }
        } while (!flag);
    }
}

package com.AgendaDeContactos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Contacto persona = new Contacto("claveTres", "Carolina", 2323129576L, "sarmiento 1523");
        Contacto persona2 = new Contacto("claveCuatro", "Marta", 2323688732L, "general paz 420");
        new Agenda();
        Scanner inputUser = new Scanner(System.in);
        int option;
        boolean flag = false;

        do {
            try {
                Thread.sleep(2000);
                System.out.println();
                System.out.println("-------MENU PRINCIPAL-------");
                System.out.println("Ingrese la opción númerica que corresponda: 1°Mostrar contactos. 2°Agregar contacto. 3°Eliminar contacto. 4°Actualizar contacto. 5°Buscar contacto. 6°Salir.");
                option = Integer.parseInt(inputUser.nextLine());
                switch (option) {
                    case 1:
                        System.out.println("Mostrando todos los contactos...");
                        Thread.sleep(1000);
                        Agenda.mostrarContactos();
                        break;
                    case 2:
                        Thread.sleep(1000);
                        Agenda.agregarContacto();
                        break;
                    case 3:
                        Thread.sleep(1000);
                        Agenda.eliminarContacto(persona);
                        break;
                    case 4:
                        Thread.sleep(1000);
                        Agenda.actualizarContacto(persona);
                        break;
                    case 5:
                        Thread.sleep(1000);
                        Agenda.buscarContacto(persona2);
                        break;
                    case 6:
                        Thread.sleep(1000);
                        System.out.println("Hasta luego.");
                        flag = true;
                        break;
                    default:
                        Thread.sleep(1000);
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Algo ha ido mal. Verifique los datos ingresados. " + e.getMessage());
            }
            catch (InterruptedException e) {
                System.err.println("Error fatal: " + e.getMessage());
            } finally {
                Thread.sleep(1000);
            }
        } while (!flag);
    }
}

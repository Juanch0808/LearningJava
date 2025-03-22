package com.ListaDeTareas;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ListaDeTareas {

    ArrayList<Tarea> tareas = new ArrayList<>();


    public void addTarea(Tarea tarea) {
        this.tareas.add(tarea);
        System.out.println("Su tarea ha sido guardada correctamente.");
    }

    public void removeTarea(Tarea tarea) {
        int idTareaAeliminar = tarea.getId();
        this.tareas.remove(idTareaAeliminar);
        System.out.println("Su tarea se ha eliminado correctamente.");
        /*
        for (int i = 0; i < this.tareas.size(); i++) {
            this.tareas.remove(id);
        }

        for (var t : tareas) {
            if (t.getId() == idTareaAeliminar) {
                tareas.remove(idTareaAeliminar);
            }
        }
        */
        //this.tareas.remove(tarea);
    }

    public void editTarea(int id) {
        Scanner input = new Scanner(System.in);
        int num;
        String user;
        String editar;
        int userId;
        boolean estadoDeLaTarea;
        boolean flag = false;
        for (var t : tareas) {
            if (t.getId() == id) {
                try {
                    System.out.println("Cual campo de la tarea desea editar? Seleccione el número que corresponda con la opción que desee.");
                    System.out.println("1°: Editar ID. 2°: Editar Nombre. 3°: Editar nombre de la tarea. 4°: Editar estado de la tarea (True o False)");
                    //user = input.nextLine();
                    user = input.nextLine();
                    switch (user) {
                        case "1" -> {
                            System.out.println("ID actual: " + t.getId());
                            System.out.println();
                            System.out.println("Indique el nuevo ID: ");
                            user = input.nextLine();
                            userId = Integer.parseInt(user);
                            t.setId(userId);
                            System.out.println("Su ID ha sido cambiado correctamente.");
                            flag = true;
                        }
                        case "2" -> {
                            System.out.println("Nombre actual: " + t.getName());
                            System.out.println();
                            System.out.println("Indique su nombre: "); // SOLUCIONAR ERROR: EL INPUT RECIBE UN ENTERO

                            user = input.nextLine();
                            t.setName(user);
                            System.out.println("Su nombre ha sido cambiado correctamente");
                            flag = true;
                        }
                        case "3" -> {
                            System.out.println("Tarea actual: " + t.getHomework());
                            System.out.println();
                            System.out.println("Indique el nombre de la tarea a realizar: ");
                            user = input.nextLine();
                            t.setHomework(user);
                            System.out.println("El nombre de la tarea ha sido cambiado correctamente");
                            flag = true;
                        }
                        case "4" -> {
                            System.out.println("Estado actual de la tarea: " + t.isComplete());
                            System.out.println();
                            System.out.println("Indique True o False si la tarea está completada (True = completada. False = No completada): ");
                            estadoDeLaTarea = input.nextBoolean();
                            t.setComplete(estadoDeLaTarea);
                            System.out.println("El estado de la tarea ha sido cambiado correctamente");
                            flag = true;
                        }
                        default -> {
                            System.out.println("Opción incorrecta. Verifique las opciones.");
                            flag = true;
                        }
                    }
                } catch (NumberFormatException | InputMismatchException e) {
                    System.err.println("Ha ocurrido un error inesperado. Verifique los datos que haya ingresado e intentelo nuevamente: " + e);
                }
            }
            if (!flag) {
                System.out.println("Su tarea no ha sido encontrada.");
            }
                }

    }

    public void showTareas() {
        if (this.tareas.isEmpty()) {
            System.out.println("La lista de tareas se encuentra vacia.");
        } else {
            for (var t : tareas) {
                System.out.println("Nombre: " + t.getName() + " || Tarea a realizar: " + t.getHomework() + " || " + t.isComplete());
            }
        }
    }
}

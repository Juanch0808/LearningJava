package com.ListaDeTareas;

public class Main {

    public static void main(String[] args) {

        Tarea tareaEscolar = new Tarea(1, "Juan Cruz", "Programar", true);
        Tarea tareaEscolar2 = new Tarea(2, "José", "Cursar", false);
        Tarea tareaEscolar3 = new Tarea(3, "Claudia", "Estudiar", true);
        Tarea tareaEscolar4 = new Tarea(4, "Juliana", "Trabajar", false);


        ListaDeTareas lista = new ListaDeTareas();
        lista.addTarea(tareaEscolar);
        //lista.addTarea(tareaEscolar2);
        //lista.addTarea(tareaEscolar3);
        System.out.println();
        //lista.editTarea(1);
        lista.showTareas();


        //lista.showTareas();


        /*
        if (t.getId() == id) {
            try {
                System.out.println("Cual campo de la tarea desea editar? Seleccione el número que corresponda con la opción que desee.");
                System.out.println("1°: Editar ID. 2°: Editar Nombre. 3°: Editar nombre de la tarea. 4°: Editar estado de la tarea (True o False)");
                //user = input.nextLine();
                user = input.next();
                if (user.equals("1")) {
                    System.out.println("ID actual: " + t.getId());
                    System.out.println();
                    System.out.println("Indique el nuevo ID: ");
                    userDesicion = input.nextInt();
                    t.setId(userDesicion);
                    System.out.println("Su ID ha sido cambiado correctamente.");
                    flag = true;
                } else if (user.equals("2")) {
                    input.nextLine();
                    System.out.println("Nombre actual: " + t.getName());
                    System.out.println();
                    System.out.println("Indique su nombre: ");
                    user = input.nextLine();
                    t.setName(user);
                    System.out.println("Su nombre ha sido cambiado correctamente");
                    flag = true;
                } else if (user.equals("3")) {
                    System.out.println("Tarea actual: " + t.getHomework());
                    System.out.println();
                    System.out.println("Indique el nombre de la tarea a realizar: ");
                    user = input.nextLine();
                    t.setHomework(user);
                    System.out.println("El nombre de la tarea ha sido cambiado correctamente");
                    flag = true;
                } else if (user.equals("4")) {
                    System.out.println("Estado actual de la tarea: " + t.isComplete());
                    System.out.println();
                    System.out.println("Indique True o False si la tarea está completada (True = completada. False = No completada): ");
                    //user = input.nextLine().toLowerCase();
                    //estadoDeLaTarea = Boolean.parseBoolean(user);
                    estadoDeLaTarea = input.nextBoolean();
                    //System.out.println(estadoDeLaTarea);
                    t.setComplete(estadoDeLaTarea);
                    System.out.println("El estado de la tarea ha sido cambiado correctamente");
                    flag = true;
                } else {
                    System.out.println("Opción incorrecta. Verifique las opciones.");
                    flag = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("Ha ocurrido un error inesperado. Verifique los datos que haya ingresado e intentelo nuevamente: " + e.getMessage());
            }
        }
        if (!flag) {
            System.out.println("Su tarea no ha sido encontrada.");
        }
    }
     */




    }
}

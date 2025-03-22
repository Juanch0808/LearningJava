package com.AgendaDeContactos;

import Tarea18.Persona;

import java.util.HashMap;
import java.util.Scanner;

public class Agenda {

    private static HashMap<String, Contacto> agendaContactos = new HashMap<>();
    private static Scanner input;
    private static String claveDelContacto;
    private static String nombre;
    private static long telefono;
    private static String direccion;
    private static int option;

    // PARA ELIMINAR, ACTUALIZAR O BUSCAR UN CONTACTO SE DEBE INSTANCIAR UN NUEVO OBJETO "Contacto" en el Main para
    // que los metodos mencionados anteriormente ejecuten su funcionalidad.

    public Agenda() {
        // CONTACTOS DE PRUEBA
        agendaContactos.put("claveUno", new Contacto("claveUno", "Carlos", 2323524566L, "dr real 1923"));
        agendaContactos.put("claveDos", new Contacto("claveDos", "Maria", 2323667722L, "san jose 980"));
    }

    public static void mostrarContactos() {
        try {
            if (agendaContactos.isEmpty()) {
                System.out.println("La agenda de contactos está vacia.");
            } else {
                System.out.println("Lista de contactos: ");
                for (String ind : agendaContactos.keySet()) {
                    System.out.println(agendaContactos.get(ind));
                }
            }
        } catch (Exception e) {
            System.err.println("Algo ha ido mal. Error: " + e.getMessage());
        }

    }

    public synchronized static void agregarContacto() {
        input = new Scanner(System.in);
        try {
            System.out.println("Ingrese la opción númerica correspondiente: 1°Añadir el contacto. 2°Regresar al menú");
            option = Integer.parseInt(input.nextLine());
            if (option == 1) {
                System.out.println("Ingrese su clave (Las claves se guardarán en mayúsculas para mayor seguridad): ");
                claveDelContacto = input.nextLine().toUpperCase();
                System.out.println("Ingrese el nombre del nuevo contacto: ");
                nombre = input.nextLine().toLowerCase();
                System.out.println("Ingrese el telefono: ");
                telefono = Long.parseLong(input.nextLine());
                System.out.println("Ingrese la dirección: ");
                direccion = input.nextLine();
                Contacto contacto = new Contacto(claveDelContacto, nombre, telefono, direccion);
                Thread.sleep(1000);
                if (agendaContactos.containsKey(claveDelContacto)) {
                    System.out.println("El contacto ya existe.");
                } else {
                    agendaContactos.put(claveDelContacto, contacto);
                    System.out.println("El contacto ha sido agregado correctamente.");
                }
            } else if (option == 2) {
                System.out.println("Regresando al menú..");
            } else {
                System.err.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Ha ocurrido un error. Verificar los datos ingresados por favor. " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Error fatal: " + e.getMessage());
        }
    }


    public synchronized static void eliminarContacto(Contacto contacto) {
        input = new Scanner(System.in);
        try {
            System.out.println("Ingrese la opción númerica correspondiente: 1°Eliminar el contacto. 2°Regresar al menú");

            option = Integer.parseInt(input.nextLine());
            Thread.sleep(1000);
            if (option == 1) {
                if (agendaContactos.containsKey(contacto.getClaveDelContacto().toUpperCase())) {
                    agendaContactos.remove(contacto.getClaveDelContacto());
                    System.out.println("El contacto se ha eliminado correctamente.");
                } else {
                    System.out.println("El contacto que desea eliminar no existe.");
                }
            } else if (option == 2) {
                System.out.println("Regresando al menú...");
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Algo ha salido mal. Verifique las opciones disponibles al eliminar el contacto para evitar errores. " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Error fatal: " + e.getMessage());
        }
    }

    public synchronized static void buscarContacto(Contacto contacto) {
        input = new Scanner(System.in);
        try {
            System.out.println("Ingrese la opción númerica correspondiente: 1°Escribir la clave para buscar el contacto. 2°Regresar al menú");
            option = Integer.parseInt(input.nextLine());
            Thread.sleep(1000);
            if (option == 1) {
                if (agendaContactos.containsKey(contacto.getClaveDelContacto())) {
                    System.out.println("Se ha encontrado el contacto: ");
                    System.out.println(agendaContactos.get(contacto.getClaveDelContacto().toUpperCase()));
                } else {
                    System.out.println("El contacto que busca no se encuentra en la lista.");
                }
            } else if (option == 2) {
                System.out.println("Regresando al menú...");
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Algo ha salido mal. Verificar las opciones disponibles al buscar el contacto para evitar errores. " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Error fatal: " + e.getMessage());
        }
    }


    public synchronized static void actualizarContacto(Contacto contacto) {
        boolean flag = false;
        int decision;
        input = new Scanner(System.in);

        try {
            System.out.println("Ingrese la opción númerica correspondiente: 1°Actualizar el contacto. 2°Regresar al menú");
            decision = Integer.parseInt(input.nextLine());
            Thread.sleep(1000);
            if (decision == 1) {
                if (agendaContactos.containsKey(contacto.getClaveDelContacto().toUpperCase())) {
                    System.out.println("Sus datos han sido encontrados: ");
                    System.out.println(agendaContactos.get(claveDelContacto));
                    System.out.println("Ingrese la opción númerica que corresponda: 1°Editar clave. 2°Editar nombre. 3°Editar telefono. 4°Editar dirección. 5°Regresar al menú.");
                    option = Integer.parseInt(input.nextLine());
                    Thread.sleep(1000);

                    switch (option) {
                        case 1:
                            System.out.println("Escriba la nueva clave: ");
                            claveDelContacto = input.nextLine();
                            agendaContactos.get(claveDelContacto).setClaveDelContacto(claveDelContacto);
                            flag = true;
                            Thread.sleep(1000);
                            break;
                        case 2:
                            System.out.println("Escriba el nuevo nombre: ");
                            nombre = input.nextLine();
                            agendaContactos.get(claveDelContacto).setNombre(nombre);
                            flag = true;
                            Thread.sleep(1000);
                            break;
                        case 3:
                            System.out.println("Escriba el nuevo telefono: ");
                            telefono = Long.parseLong(input.nextLine());
                            agendaContactos.get(claveDelContacto).setTelefono(telefono);
                            flag = true;
                            Thread.sleep(1000);
                            break;
                        case 4:
                            System.out.println("Escriba la nueva dirección: ");
                            direccion = input.nextLine();
                            agendaContactos.get(claveDelContacto).setDireccion(direccion);
                            flag = true;
                            Thread.sleep(1000);
                            break;
                        case 5:
                            System.out.println("Regresando al menú...");
                            Thread.sleep(1000);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            Thread.sleep(1000);
                            break;
                    }
                } else {
                    System.out.println("El contacto que busca no se encuentra en la lista.");
                }
            } else if (decision == 2) {
                System.out.println("Regresando al menú...");
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (NumberFormatException | InterruptedException e) {
            System.err.println("Algo ha salido mal. Verificar las opciones disponibles al editar el contacto para evitar errores. " + e.getMessage());
        }
        if (flag) System.out.println("Sus datos han sido modificados correctamente.");
    }
}


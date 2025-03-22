package com.GeneradorDeContrasenia;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        GeneradorDeContrasenia user1 = new GeneradorDeContrasenia(input);


        do {
            try {
                System.out.println();
                System.out.println("---- Bienvenido al generador de contraseñas 3000 ----");
                System.out.println("--Explicación de como funciona el programa:");
                Thread.sleep(2000);
                System.out.println("-Las contraseñas de complejidad baja contienen letras minúsculas y mayúsculas aleatoriamente.\n-Las contraseñas de complejidad media contienen letras minúsculas, mayúsculas y números enteros del 1-9 aleatoriamente.\n-Las contraseñas de complejidad alta contienen letras minúsculas, mayúsculas, números enteros del 1-9 y carácteres especiales(*-_.+) aleatoriamente.\n-Las contraseñas aceptarán una longitud máxima de 10 dígitos.");
                System.out.println("*Tenga en cuenta todos los consejos para evitar errores.");
                System.out.println();
                System.out.println("Ingrese la opción númerica que corresponda: 1°: Generar contraseña fácil. 2°: Generar contraseña normal. 3°: Generar contraseña difícil. 4°:Salir");
                int decision = Integer.parseInt(input.nextLine());

                switch (decision) {
                    case 1:
                        user1.generadorDeContraseniaFacil();
                        break;
                    case 2:
                        user1.generadorDeContraseniaMediana();
                        break;
                    case 3:
                        user1.generadorDeContraseniaDificil();
                        break;
                    case 4:
                        System.out.println("Hasta luego");
                        flag = false;
                        break;
                    default:
                        System.err.println("Opción no válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Algo ha ido mal. Verifique que al ingresar una opcion debe ser un número entero. Error: " + e.getMessage());
            } finally {
                Thread.sleep(1000);
            }
        } while (flag);
    }
}
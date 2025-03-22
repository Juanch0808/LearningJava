package com.GeneradorDeContrasenia;

import java.util.Random;
import java.util.Scanner;

public class GeneradorDeContrasenia {

    private Scanner input;
    private String digitosContraseniaFacil = "abcdefghijklmnñopqrstuvwxyz";
    private String digitosContraseniaMedia = "abcdefghijklmnñopqrstuvwxyz123456789";
    private String digitosContraseniaDificil = "abcdefghijklmnñopqrstuvwxyz123456789*-_.+";
    private Random digitoRandom;
    private StringBuffer contraseniaFinal;
    private int longitudContrasenia;


    public GeneradorDeContrasenia(Scanner input) {
        this.input = input;
    }


    public synchronized void generadorDeContraseniaFacil() throws InterruptedException {
        try {
            this.contraseniaFinal = new StringBuffer();
            this.digitoRandom = new Random();
            //char c;
            System.out.println("Escriba la longitud de la contraseña que desea generar: ");
            this.longitudContrasenia = Integer.parseInt(this.input.nextLine());
            if (this.longitudContrasenia > 10 || this.longitudContrasenia < 1) {
                System.err.println("Las contraseñas generadas solamente admiten hasta 10 digitos. Vuelva a intentarlo.");
                Thread.sleep(2000);
            } else {
                System.out.println("Generando contraseña...");
                for (int i = 1; i <= this.longitudContrasenia; i++) {
                    //c = this.digitosContraseniaFacil.charAt(this.digitoRandom.nextInt(this.digitosContraseniaFacil.length()));
                    this.contraseniaFinal.append(this.digitosContraseniaFacil.charAt(this.digitoRandom.nextInt(this.digitosContraseniaFacil.length())));
                }
                Thread.sleep(2000);
                System.out.println("Contraseña generada correctamente.");
                System.out.println("Resultado: " + this.contraseniaFinal);
            }
        } catch (NumberFormatException e) {
            System.err.println("Algo ha ido mal. Verifique que al ingresar la longitud sea un número entero. Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Algo ha ido mal. Error: " + e.getMessage());
        }
        Thread.sleep(3000);
    }


    public synchronized void generadorDeContraseniaMediana() throws InterruptedException {
        try {
            this.contraseniaFinal = new StringBuffer();

            this.digitoRandom = new Random();
            //char c;
            System.out.println("Escriba la longitud de su contraseña (Por ej: Si usted escribe 5, su contraseña tendrá 5 dígitos. Escriba un número entero por favor)");
            this.longitudContrasenia = Integer.parseInt(this.input.nextLine());
            if (this.longitudContrasenia > 10 || this.longitudContrasenia < 1) {
                System.err.println("Las contraseñas generadas solamente admiten hasta 10 digitos. Vuelva a intentarlo.");
                Thread.sleep(2000);
            } else {
                System.out.println("Generando contraseña...");
                for (int i = 1; i <= this.longitudContrasenia; i++) {
                    //c = this.digitosContraseniaFacil.charAt(this.digitoRandom.nextInt(this.digitosContraseniaMedia.length()));
                    this.contraseniaFinal.append(this.digitosContraseniaMedia.charAt(this.digitoRandom.nextInt(this.digitosContraseniaMedia.length())));
                }
                Thread.sleep(2000);
                System.out.println("Contraseña generada correctamente.");
                System.out.println("Resultado: " + this.contraseniaFinal);
            }
        } catch (NumberFormatException e) {
            System.err.println("Algo ha ido mal. Verifique que al ingresar la longitud sea un número entero. Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Algo ha ido mal. Error: " + e.getMessage());
        }
        Thread.sleep(3000);
    }


    public synchronized void generadorDeContraseniaDificil() throws InterruptedException {

        try {
            this.contraseniaFinal = new StringBuffer();

            this.digitoRandom = new Random();
            //char c;
            System.out.println("Escriba la longitud de su contraseña (Por ej: Si usted escribe 5, su contraseña tendrá 5 dígitos. Escriba un número entero por favor)");
            this.longitudContrasenia = Integer.parseInt(this.input.nextLine());
            if (this.longitudContrasenia > 10 || this.longitudContrasenia < 1) {
                System.err.println("Las contraseñas generadas solamente admiten hasta 10 digitos. Vuelva a intentarlo.");
                Thread.sleep(2000);
            } else {
                System.out.println("Generando contraseña...");
                for (int i = 1; i <= this.longitudContrasenia; i++) {
                    //c = this.digitosContraseniaDificil.charAt(this.digitoRandom.nextInt(this.digitosContraseniaDificil.length()));
                    this.contraseniaFinal.append(this.digitosContraseniaDificil.charAt(this.digitoRandom.nextInt(this.digitosContraseniaDificil.length())));
                }
                Thread.sleep(2000);
                System.out.println("Contraseña generada correctamente.");
                System.out.println("Resultado: " + this.contraseniaFinal);
            }
        } catch (NumberFormatException e) {
            System.err.println("Algo ha ido mal. Verifique que al ingresar la longitud sea un número entero. Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Algo ha ido mal. Error: " + e.getMessage());
        }
        Thread.sleep(3000);
    }
}

package com.CuentaDeBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CuentaBanco cliente = new CuentaBanco(232628296,"Roberto", 1000, "roberto.mp.33");
        CuentaBanco cliente2 = new CuentaBanco(279900765,"Abigail", 500, "abi.mp.13");
        Banco bank = new Banco(input);

        //bank.verSaldo();

        System.out.println("Hilo princ");

        Thread client1 = new Thread(() -> {
            bank.retirarDinero(cliente);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread client2 = new Thread(() -> {
            bank.verSaldo(cliente2);
        });
        //bank.verSaldo(cliente2);
        client1.start();
        client2.start();
        try {
            client1.join();
            client2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
        //bank.transferirDinero(cliente2);

        System.out.println("Hilo princ");

        //System.out.println(cliente2.getSaldoActual());
    }
}

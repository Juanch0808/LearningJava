package com.CuentaDeBanco;

import java.util.HashMap;
import java.util.Scanner;

public class Banco {

    private Scanner input;

    public Banco(Scanner input) {
        this.input = input;
    }

    public synchronized void verSaldo(CuentaBanco cuenta) {
        System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
    }

    public synchronized void retirarDinero(CuentaBanco cuenta) {
        try {
            System.out.println("Cuanto dinero desea retirar?: ");
            double retirarDinero = Double.parseDouble(this.input.nextLine());

            if (cuenta.getSaldoActual() >= retirarDinero) {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - retirarDinero);
                System.out.println("Usted ha retirado de su cuenta: " + retirarDinero + " USD.");
                System.out.println("Su balance actual es de: " + cuenta.getSaldoActual() + " USD");
            } else {
                System.out.println("Insuficiencia de fondos. No es posible retirar el monto que desea.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Algo ha salido mal al intentar retirar los fondos. Verifique los datos ingresados. " + e.getMessage());
        }
    }

    public synchronized void depositarDinero(CuentaBanco cuenta) {
        try {
            System.out.println("Cuanto dinero va a depositar?");
            double depositarDinero = Double.parseDouble(this.input.nextLine());
            cuenta.setSaldoActual(cuenta.getSaldoActual() + depositarDinero);
            System.out.println("Dinero depositado correctamente. " + cuenta.getSaldoActual() + " USD");
        } catch (NumberFormatException e) {
            System.err.println("Algo ha salido mal al intentar depositar fondos. Verifique los datos ingresados " + e.getMessage());
        }
    }

    public synchronized void transferirDinero(CuentaBanco cuenta) {
        System.out.println("Ingrese el alias de la cuenta a la que desea transferir: ");
        String alias = this.input.nextLine();
        if (cuenta.getAlias().equals(alias)) {
            System.out.println("Ingrese el monto a transferir: ");
            double transferirDinero = Double.parseDouble(this.input.nextLine());
            cuenta.setSaldoActual(cuenta.getSaldoActual() - transferirDinero);
            System.out.println("Dinero transferido correctamente.");
        } else {
            System.out.println("El alias ingresado no pertenece a una cuenta existente.");
        }
    }
}
package com.CuentaDeBanco;

public class CuentaBanco {

    private final int NUMERO_DE_CUENTA;
    private String nombreDeLaPersona;
    private double saldoActual;
    private String alias;

    public CuentaBanco(int numeroDeCuenta, String nombreDeLaPersona, double saldoActual, String alias) {
        this.NUMERO_DE_CUENTA = numeroDeCuenta;
        this.nombreDeLaPersona = nombreDeLaPersona;
        this.saldoActual = saldoActual;
        this.alias = alias.toLowerCase();
    }

    public int getNUMERO_DE_CUENTA() {
        return NUMERO_DE_CUENTA;
    }

    public String getNombreDeLaPersona() {
        return nombreDeLaPersona;
    }

    public void setNombreDeLaPersona(String nombreDeLaPersona) {
        this.nombreDeLaPersona = nombreDeLaPersona;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombreDeLaPersona() + " - Saldo: " + this.getSaldoActual() + " - Alias: " + this.getAlias();
    }
}

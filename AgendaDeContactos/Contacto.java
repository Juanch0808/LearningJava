package com.AgendaDeContactos;

public class Contacto {

    private String claveDelContacto;
    private String nombre;
    private long telefono;
    private String direccion;


    public Contacto(String claveDelContacto, String nombre, long telefono, String direccion) {
        this.claveDelContacto = claveDelContacto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getClaveDelContacto() {
        return claveDelContacto;
    }

    public void setClaveDelContacto(String claveDelContacto) {
        this.claveDelContacto = claveDelContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clave: " + this.getClaveDelContacto() + " - Nombre: " + this.getNombre() +  " - " + "Telefono: " + this.getTelefono() + " - " + "Dirección: " + this.getDireccion();
    }
}

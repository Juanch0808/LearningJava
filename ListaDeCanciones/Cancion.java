package com.ListaDeCanciones;

public class Cancion {

    private String nombreDeLaCancion;
    private String artista;

    public Cancion(String nombreDeLaCancion, String artista) {
        this.nombreDeLaCancion = nombreDeLaCancion;
        this.artista = artista;
    }

    public String getNombreDeLaCancion() {
        return nombreDeLaCancion;
    }

    public void setNombreDeLaCancion(String nombreDeLaCancion) {
        this.nombreDeLaCancion = nombreDeLaCancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return this.nombreDeLaCancion + " | " + this.artista;
    }
}

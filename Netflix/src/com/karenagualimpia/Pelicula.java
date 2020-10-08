package com.karenagualimpia;

public class Pelicula implements IVisualizable{
    private String titulo;
    private String genero;
    private String creador;
    private int año;
    private int duracion;
    private boolean visto;

    public Pelicula(){
        this.titulo = "";
        this.creador = "";
        this.genero = "";
        this.año = 0;
        this.duracion = 0;
        this.visto = false;
    }

    public Pelicula(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.creador = creador;
        this.año = 0;
        this.duracion = 0;
        this.visto = false;

    }
    public Pelicula(String titulo, String genero, String creador, int año, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.año = año;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void marcarVisto() {
        if (this.visto == false) this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public int tiempoVisto() {
        return this.duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", año=" + año +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }


}

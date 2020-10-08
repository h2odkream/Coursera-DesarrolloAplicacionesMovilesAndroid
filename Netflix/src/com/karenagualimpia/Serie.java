package com.karenagualimpia;

public class Serie extends Pelicula implements IVisualizable{
    private int noDeTemporadas;

    public Serie() {
        super();
        this.noDeTemporadas = 1;
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
        this.noDeTemporadas = 1;
    }

    public Serie(String titulo, int noDeTemporadas, String genero, String creador, int duracion) {
        super(titulo, genero, creador, 0, duracion);
        this.noDeTemporadas = noDeTemporadas;
    }

    public String getTitulo() {
        return super.getTitulo();
    }

    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    public int getNoDeTemporadas() {
        return noDeTemporadas;
    }

    public void setNoDeTemporadas(int noDeTemporadas) {
        this.noDeTemporadas = noDeTemporadas;
    }

    public String getGenero() {
        return super.getGenero();
    }

    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    public String getCreador() {
        return super.getCreador();
    }

    public void setCreador(String creador) {
        super.setCreador(creador);
    }

    public int getDuracion() {
        return super.getDuracion();
    }

    public void setDuracion(int duracion) {
        super.setDuracion(duracion);
    }

    @Override
    public void marcarVisto() {

    }

    @Override
    public boolean esVisto() {
        return false;
    }

    @Override
    public int tiempoVisto() {
        return this.getDuracion();
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", noDeTemporadas=" + noDeTemporadas +
                ", visto=" +  esVisto()+
                ", genero='" + super.getGenero() + '\'' +
                ", creador='" + super.getCreador() + '\'' +
                ", duracion=" + super.getDuracion() +
                '}';
    }
}

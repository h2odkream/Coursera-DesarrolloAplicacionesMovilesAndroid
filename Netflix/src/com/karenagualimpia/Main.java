package com.karenagualimpia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>(5);
        ArrayList<Serie> listaSeries = new ArrayList<>(5);

        Pelicula pelicula1 = new Pelicula();
        Pelicula pelicula2 = new Pelicula("El amor en cuatro estaciones","John Marchall");
        Pelicula pelicula3 = new Pelicula("THE SLEEPOVER", "Comedia","Trish Sie", 2020,100);
        Pelicula pelicula4 = new Pelicula("The Old Guard", "Acción","Gina Prince-Bythewood", 2020,12);
        Pelicula pelicula5 = new Pelicula("Anon", "Thriller","Mark Steven Johnson", 2018, 100);

        Serie serie1 = new Serie();
        Serie serie2 = new Serie("Grey's Anatomy",17, "Drama", "Shonda Rhimes", 43);
        Serie serie3 = new Serie("Dark",3,  "Misterio", "Baran bo Odar", 40);
        Serie serie4 = new Serie("Anne","Moira Walley-Beckett");
        Serie serie5 = new Serie("Anne","");

        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);
        listaPeliculas.add(pelicula3);
        listaPeliculas.add(pelicula4);
        listaPeliculas.add(pelicula5);

        listaSeries.add(serie1);
        listaSeries.add(serie2);
        listaSeries.add(serie3);
        listaSeries.add(serie4);
        listaSeries.add(serie5);

        pelicula3.marcarVisto();
        pelicula4.marcarVisto();

        serie2.marcarVisto();
        serie4.marcarVisto();

        int temporalAñoReciente=0;
        int contadorPelicula=0, indicePelicula =0;
        for (Pelicula pelicula: listaPeliculas) {
            if(pelicula.esVisto()){
                System.out.println(pelicula.getTitulo() + " con "+pelicula.tiempoVisto() + " minutos visualizados");
            }
            if(pelicula.getAño() > temporalAñoReciente){
                temporalAñoReciente = pelicula.getAño();
                indicePelicula = contadorPelicula;
            }
            contadorPelicula++;
        }

        int temporalNoTemporadaSerie=0;
        int contadorSerie=0, indiceSerie =0;
        for (Serie serie: listaSeries) {
            if(serie.esVisto()){
                System.out.println(serie.getTitulo()+ " con "+serie.tiempoVisto() + " minutos visualizados");
            }
            if(serie.getNoDeTemporadas() > temporalNoTemporadaSerie){
                temporalNoTemporadaSerie = serie.getNoDeTemporadas();
                indiceSerie = contadorSerie;
            }
            contadorSerie++;
        }

        System.out.println(listaSeries.get(indiceSerie).getTitulo() + " es la serie con más temporadas, número temporadas " + listaSeries.get(indiceSerie).getNoDeTemporadas());
        System.out.println(listaPeliculas.get(indicePelicula).getTitulo() + " es la pelicula del año más reciente, año reciente " + listaPeliculas.get(indicePelicula).getAño());
    }
}

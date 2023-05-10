package br.com.bigfamous.TestesListas;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        ArrayList<String> artistasDeTrap = new ArrayList<>();
        String artista1= "Travis Scott";
        String artista2= "Drake";
        String artista3= "A$AP Rocky";

        artistasDeTrap.add(artista1);
        artistasDeTrap.add(artista2);
        artistasDeTrap.add(artista3);

            System.out.println("Os artistas do momento são: " +artistasDeTrap);

            for(int i=0 ; i < artistasDeTrap.size(); i++){
                System.out.println("Artista do momento: " + artistasDeTrap.get(i));

            }

        Collections.sort(artistasDeTrap);
        System.out.println("Artista em ordem alfabéticas:");
        System.out.println(artistasDeTrap);

    }
}
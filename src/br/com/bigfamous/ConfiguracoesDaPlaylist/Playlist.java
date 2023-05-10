package br.com.bigfamous.ConfiguracoesDaPlaylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Creditos creditoMusica1 = new Creditos("Travis Scott", "Out West",2);
        Creditos creditoMusica2 = new Creditos("Drake","Jimmy Cooks", 3);
        Creditos creditoMusica3 = new Creditos("A$AP Rocky","L$D" ,4);

        ArrayList<Creditos> creditosDasMusicas = new ArrayList<>();
        creditosDasMusicas.add(creditoMusica1);
        creditosDasMusicas.add(creditoMusica2);
        creditosDasMusicas.add(creditoMusica3);
        System.out.println("Músicas na ordem inseridas: " +creditosDasMusicas);

        Collections.sort(creditosDasMusicas);
        System.out.println("Músicas na ordem alfabética dos artistas: " +creditosDasMusicas);

        creditosDasMusicas.sort(Comparator.comparing(Creditos::getDuracao));
        System.out.println("Músicas na ordem de duração: " +creditosDasMusicas);

        creditosDasMusicas.sort(Comparator.comparing(Creditos::getMusica));
        System.out.println("Músicas na ordem alfabetica dos nomes: " +creditosDasMusicas);

    }
}
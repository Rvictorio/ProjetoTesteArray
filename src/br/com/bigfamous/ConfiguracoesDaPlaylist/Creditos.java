package br.com.bigfamous.ConfiguracoesDaPlaylist;

public class Creditos implements Comparable<Creditos> {
    private String artista;
    private String musica;
  private int duracao;

    public String getArtista() {
        return artista;
    }
    public String getMusica() {
        return musica;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Música: '" +musica +"' do artista: "+artista + " (possui: " +duracao +" minutos de duração)";
    }

    public Creditos(String artista,String musica, int duracao) {
        this.artista = artista;
        this.musica = musica;
        this.duracao = duracao;
    }
    public int compareTo(Creditos creditosDeOutraMusica) {
        return this.artista.compareTo(creditosDeOutraMusica.artista);
    }
}

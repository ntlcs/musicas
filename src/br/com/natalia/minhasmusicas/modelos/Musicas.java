package br.com.natalia.minhasmusicas.modelos;

import br.com.natalia.minhasmusicas.modelos.Audio;

public class Musicas extends Audio {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes()>200) {
            return 10;

        }else {
            return 7;
        }
    }
    public void imprimirDetalhes() {
        System.out.println("Detalhes da Música:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Cantor/Cantora: " + this.getCantor());
        System.out.println("Álbum: " + this.getAlbum());
        System.out.println("Gênero: " + this.getGenero());
    }
}

package br.com.natalia.minhasmusicas.principal;

import br.com.natalia.minhasmusicas.modelos.MinhasPreferidas;
import br.com.natalia.minhasmusicas.modelos.Musicas;
import br.com.natalia.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Baby one more time");
        minhaMusica.setCantor("Britney Spears");
        minhaMusica.setAlbum("Mesmo nome do Título da Música");
        minhaMusica.setGenero("Femenino");

        minhaMusica.imprimirDetalhes();
        
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
            
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Não Inviabilize");
        meuPodcast.setApresentador("Carol Rocha");

        meuPodcast.imprimirDetalhes();

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();

        }

        for (int i = 0; i < 60; i++) {
            meuPodcast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

        }

    }


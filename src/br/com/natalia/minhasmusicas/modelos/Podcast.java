package br.com.natalia.minhasmusicas.modelos;

import br.com.natalia.minhasmusicas.modelos.Audio;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }

    }
    public void imprimirDetalhes() {
        System.out.println("Detalhes do Podcast:");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Apresentador: " + this.getApresentador());

    }

}

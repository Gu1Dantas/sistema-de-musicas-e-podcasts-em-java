package br.com.gui.musics.principal.modelos;

public class Audio {
    private String titulo;
    private int TotalDeReproducoes;
    private int totalDeCurtidas;
    private int Classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return TotalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return Classificacao;
    }
    public void curte(){
        this.totalDeCurtidas++;
    }
    public void reproducoes(){
        this.TotalDeReproducoes++;
    }
}

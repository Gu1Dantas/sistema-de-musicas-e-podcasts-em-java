package br.com.gui.musics.principal.modelos;

public class Musica extends Audio {
    private String Genero;
    private String Album;
    private String Artista;

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 1000){
            return 10;
        } else {
            return 8;
        }
    }
}

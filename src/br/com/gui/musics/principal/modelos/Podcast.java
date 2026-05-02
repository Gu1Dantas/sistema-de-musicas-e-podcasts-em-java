package br.com.gui.musics.principal.modelos;

public class Podcast extends Audio {
    private String Apresendor;
    private String Convidado;

    public String getApresendor() {
        return Apresendor;
    }

    public void setApresendor(String apresendor) {
        Apresendor = apresendor;
    }

    public String getConvidado() {
        return Convidado;
    }

    public void setConvidado(String convidado) {
        Convidado = convidado;
    }

    @Override
    public int getTotalDeReproducoes() {
        if (this.getTotalDeReproducoes() > 2000) {
         return 10;
        }else {
            return 7;
        }
    }
}

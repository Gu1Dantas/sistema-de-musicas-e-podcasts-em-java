package br.com.gui.musics.principal.principal;

import br.com.gui.musics.principal.modelos.Musica;
import br.com.gui.musics.principal.modelos.Podcast;
import br.com.gui.musics.principal.modelos.Preferidas;

public class Principal {
    static void main(String[] args) {
        Musica MDT =  new Musica();
        MDT.setArtista("Matuê");
        MDT.setTitulo("Maquina do Tempo");
        MDT.setAlbum("Maquina do Tempo");
        MDT.setGenero("Trap");

        for (int i = 0; i < 100000; i++) {
            MDT.reproducoes();
        }
        for (int i = 0; i < 50000; i++) {
            MDT.curte();
        }
        Podcast podPah = new Podcast();
        podPah.setTitulo("PodPah");
        podPah.setApresendor("Igao e mitico");
        podPah.setConvidado("Matuê");

        for (int i = 0; i < 1000; i++) {
            podPah.reproducoes();
        }
        for (int i = 0; i < 50; i++) {
            podPah.curte();
        }
        Preferidas pref = new Preferidas();
        pref.inclui(MDT);
        pref.inclui(podPah);
    }
}

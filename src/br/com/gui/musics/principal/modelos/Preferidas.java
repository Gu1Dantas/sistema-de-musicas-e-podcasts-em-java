package br.com.gui.musics.principal.modelos;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo()+"-Perfeita!");
        }else {
            System.out.println(audio.getTitulo()+"-Muito boa");
        }
    }

}

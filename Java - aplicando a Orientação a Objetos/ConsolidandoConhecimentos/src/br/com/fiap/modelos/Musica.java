package br.com.fiap.modelos;

public class Musica extends Audio {
    // Criar uma aplicação de musicas
    // É necessario ter uma superclasse chamada audio
    // Podcasts, Musicas = Herança
    // Classe para controlar as musicas e podcasts preferidas
    // Classe audio = Titulo, duração, total de reproducoes, curtidas

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
    public double getClassificacao() {
        if(this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }


}

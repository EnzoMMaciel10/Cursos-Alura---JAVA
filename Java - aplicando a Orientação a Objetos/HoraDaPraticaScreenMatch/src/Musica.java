public class Musica {
    String nomeMusica;
    String Artista;
    int AnoDeLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("Nome da musica: " + nomeMusica);
        System.out.println("Nome do artista: " + Artista);
        System.out.println("Ano de Lançamento" + AnoDeLancamento);
    }

    void Avaliacao(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaAvaliacao(){
        return avaliacao/numAvaliacao;
    }
}

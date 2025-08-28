public class Servico extends Item implements Tributavel {

    private int quantidadeHoras;

    public double calculaImposto() {
        //serviço tem 12% de imposto:
        return getPreco() * 0.12;
    }

    // outros métodos da classe Servico

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
}
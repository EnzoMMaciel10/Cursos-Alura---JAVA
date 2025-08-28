package Exercicio6;

public class Produto implements Vendavel{
    private int quantidadeComprada;
    private double preco;




    @Override
    public double calcularPrecoFinal() {
        return (quantidadeComprada * preco);
    }

    @Override
    public void calcularDesconto(double desconto) {
        preco -= preco * (desconto/100.0);
    }


}

package Exercicio6;

public class Servico implements Vendavel{
    private double preco;




    @Override
    public double calcularPrecoFinal() {
        return preco;
    }

    @Override
    public void calcularDesconto(double desconto) {
        preco -= preco * (desconto/100.0);
    }


}

package Exercicio1;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.definirModelo("Sedan");
        modeloCarro.definirPreco(30000, 32000, 35000);
        modeloCarro.exibirInfo();
    }


}
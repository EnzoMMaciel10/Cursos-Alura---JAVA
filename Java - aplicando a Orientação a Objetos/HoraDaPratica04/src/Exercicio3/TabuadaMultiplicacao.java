package Exercicio3;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i < 11; i++) {
            int contaTabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + contaTabuada);
        }

    }
}

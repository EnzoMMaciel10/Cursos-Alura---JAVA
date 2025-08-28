package Exercicio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double contaA = altura * largura;
        System.out.println("A área da sala retangular é: " + contaA);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double contaP = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + contaP);
    }


}

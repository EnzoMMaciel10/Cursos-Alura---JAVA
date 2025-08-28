package Exercicio4;

public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperatura();
        conversor.celsiusParaFahrenheit(100);
        conversor.fahrenheitParaCelsius(100);

    }
}

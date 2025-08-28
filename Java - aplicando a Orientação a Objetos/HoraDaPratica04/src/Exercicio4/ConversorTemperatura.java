package Exercicio4;

public class ConversorTemperatura implements ConversorTemperaturaPadrao {


    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double transformacaoParaF = (celsius * 1.8) + 32;
        System.out.println(celsius + "°C é igual a " + transformacaoParaF +"°F ");

    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double transformarParaC =  (fahrenheit - 32) * 5/9 ;
        System.out.println(fahrenheit + "°F é igual a " + transformarParaC + "°C");
    }
}

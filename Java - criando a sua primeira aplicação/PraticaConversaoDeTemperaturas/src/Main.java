
public class Main {
    public static void main(String[] args) {

        double temperaturaGrauCelsius = 30.0;
        double formula = (temperaturaGrauCelsius * 1.8) + 32;
        double tempFahrenheit = formula;

        System.out.println("A temperatura em graus celsius é " + temperaturaGrauCelsius +
                " e a temperatura em Fahrenheit é " + tempFahrenheit);


    }
}



// Resolução do exercicio proposto pelo instrutor

/*
public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }

}
 */
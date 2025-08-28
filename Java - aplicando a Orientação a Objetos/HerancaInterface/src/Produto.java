public class Produto extends Item implements Tributavel {

    private double peso;

    public double calculaImposto() {
        //produto tem 10% de imposto:
        return getPreco() * 0.1;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // métodos getters e setters omitidos

}
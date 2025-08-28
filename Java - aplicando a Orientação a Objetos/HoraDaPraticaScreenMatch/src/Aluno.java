public class Aluno {
    String nome;
    private double nota1;
    private double nota2;

    public void exibirInformacoes() {
        System.out.println("Nome do aluno:" + nome);
        System.out.println("O aluno ficou com a primeira no com " + nota1 +
                " e a segunda nota foi " + nota2);
    }

    public double getMedia(){
        return (nota1 + nota2)/2;
    }



}

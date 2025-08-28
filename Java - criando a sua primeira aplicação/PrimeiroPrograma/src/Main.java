
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Esse filme foi lançado em " + ano);
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;

        // Media calculada pelas 3 notas de tres pessoas
        double media = ((9.8 + 6.3 + 8.0) / 3);
        System.out.println(media);
        String sinopse;
        sinopse= """
                Filme Top gun
                Filme de aventura com galã dos anos 80
                Muito bom! 
                """ + ano;

        System.out.println(sinopse);

        /* Este é um exemplo de comentário
        de várias linhas em Java
        que será ignorado pelo compilador */


        double classificacao;
        classificacao = media / 2;
        System.out.println(classificacao);

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
    }
}
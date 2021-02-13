package exercicio1;

public class PessoaApp {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Peter Lord", 68, Genero.MASCULINO, 5);
        Ator ator = new Ator("Johnny Depp", 57, Genero.MASCULINO, 5);

        System.out.println(diretor);
        System.out.println();
        System.out.println(ator);
    }
}
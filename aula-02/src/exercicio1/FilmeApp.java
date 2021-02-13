package exercicio1;

public class FilmeApp {
    public static void main (String[] args){

        Filme filme1 = new Filme("A Fuga das Galinhas",
                "Um bando de galinhas tentam escapar de uma fazenda para não virarem ingredientes ", 84,
                2000, 5, new Diretor("Peter Lord", 68, Genero.MASCULINO, 10));
        Filme filme2 = new Filme("Nem Que a Vaca Tussa",
                "No Velho Oeste, um trio de vacas tem de capturar um ladrão infame de gado, o Alamenda Slim",
                76,2004, 5, new Diretor("Will Finn", 40, Genero.MASCULINO, 5));

        System.out.println(filme1.reproduzirFilme());
        System.out.println();
        System.out.println(filme2.reproduzirFilme());

    }
}

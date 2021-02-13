package exercicio1;

public class FilmeApp {
    public static void main (String[] args){

        FilmeEntitie filme1 = new FilmeEntitie("A Fuga das Galinhas",
                "Um bando de galinhas tentam escapar de uma fazenda para não virarem ingredientes ", 84,
                2000, 5, new Diretor("Peter Lord", 68, 10));
        FilmeEntitie filme2 = new FilmeEntitie("Nem Que a Vaca Tussa",
                "No Velho Oeste, um trio de vacas tem de capturar um ladrão infame de gado, o Alamenda Slim",
                76,2004, 5, new Diretor("Will Finn", 40, 10));

        System.out.println(filme1.reproduzirFilme());
        System.out.println();
        System.out.println(filme2.reproduzirFilme());
    }
}


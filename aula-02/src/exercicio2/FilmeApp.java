package exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FilmeApp {
    public static void main (String[] args){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataDeNascimento1 = LocalDate.parse("04-02-1990", formatter);
        LocalDate dataDeNascimento2 = LocalDate.parse("20-03-1980", formatter);
        LocalDate dataDeNascimento3 = LocalDate.parse("15-10-1978", formatter);


        List<Pessoa> elenco = new ArrayList<Pessoa>();
        Diretor diretor = new Diretor("Peter Lord", dataDeNascimento1, Genero.MASCULINO, 5);
        elenco.add(diretor);
        elenco.add(new Ator("Fulano", dataDeNascimento2, Genero.MASCULINO, 2));
        elenco.add(new Ator("Beltrano", dataDeNascimento3, Genero.MASCULINO, 1));

        Filme filme = new Filme("Nem Que a Vaca Tussa",
                "No Velho Oeste, um trio de vacas tem de capturar um ladrão infame de gado, o Alamenda Slim",
                76,2004, 5, diretor, elenco);

        filme.exibirCreditos();
    }
}

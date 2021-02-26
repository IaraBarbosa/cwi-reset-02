package exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaApp {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataDeNascimento = LocalDate.parse("04-02-1990", formatter);

        Pessoa pessoa = new Pessoa("Johnny Depp", dataDeNascimento, Genero.MASCULINO);
        pessoa.imprimirInformacoes();

    }
}
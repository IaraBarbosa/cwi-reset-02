package exercicio2;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataDeNascimento, Genero genero) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int calculaIdade(){
        return Period.between(this.dataDeNascimento, LocalDate.now()).getYears();
    }
    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + calculaIdade() + " anos");
        System.out.println("Genero: " + this.genero.getDescricao());
    }
}

package exercicio2;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int quantidadeFilmesDirigidos;

    public Diretor(String nome, LocalDate dataDeNascimento, Genero genero, int quantidadeFilmesDirigidos){
        super(nome, dataDeNascimento, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public void setQuantidadeFilmesDirigidos(int quantidadeFilmesDirigidos) {
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public int getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }

    @Override
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de filmes dirigidos: " + this.quantidadeFilmesDirigidos);
    }
}

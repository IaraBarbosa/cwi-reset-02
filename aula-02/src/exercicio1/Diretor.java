package exercicio1;

public class Diretor extends Pessoa {

    private int quantidadeFilmesDirigidos;

    public Diretor(String nome, int idade, Genero genero, int quantidadeFilmesDirigidos){
        super(nome, idade, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public void setQuantidadeFilmesDirigidos(int quantidadeFilmesDirigidos) {
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public int getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }
}

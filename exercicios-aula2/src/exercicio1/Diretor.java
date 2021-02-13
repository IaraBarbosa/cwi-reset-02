package exercicio1;

public class Diretor {
    private String nome;
    private int idade;
    private int quantidadeFilmesDirigidos;

    public Diretor(String nome, int idade, int quantidadeFilmesDirigidos){
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQuantidadeFilmesDirigidos(int quantidadeFilmesDirigidos) {
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }
}

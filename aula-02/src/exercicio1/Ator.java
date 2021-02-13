package exercicio1;

public class Ator {
    private String nome;
    private int idade;
    private int numeroOscar;
    private Genero genero;

    public Ator(String nome, int idade, int numeroOscar, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroOscar = numeroOscar;
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumeroOscar(int numeroOscar) {
        this.numeroOscar = numeroOscar;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroOscar() {
        return numeroOscar;
    }

    public String toString(){
        return "Nomw: " + this.nome
                + "\nIdade: " + this.idade
                +"\nGenero: " + this.genero.getDescricao();
    }
}

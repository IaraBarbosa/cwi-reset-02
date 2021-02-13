package exercicio1;

public class Ator extends Pessoa {
    private int numeroOscar;


    public Ator(String nome, int idade, Genero genero, int numeroOscar) {
        super(nome, idade, genero);
        this.numeroOscar = numeroOscar;
    }

    public void setNumeroOscar(int numeroOscar) {
        this.numeroOscar = numeroOscar;
    }

    public int getNumeroOscar() {
        return numeroOscar;
    }

}

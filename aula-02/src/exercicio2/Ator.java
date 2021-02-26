package exercicio2;

import java.time.LocalDate;

public class Ator extends Pessoa {
    private int numeroOscar;


    public Ator(String nome, LocalDate dataDeNascimento, Genero genero, int numeroOscar) {
        super(nome, dataDeNascimento, genero);
        this.numeroOscar = numeroOscar;
    }

    public void setNumeroOscar(int numeroOscar) {
        this.numeroOscar = numeroOscar;
    }

    public int getNumeroOscar() {
        return numeroOscar;
    }

    @Override
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de Oscars: " + this.numeroOscar);
    }

}

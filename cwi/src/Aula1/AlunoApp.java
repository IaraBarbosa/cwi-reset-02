package Aula1;
import java.util.Scanner;

public class AlunoApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        AlunoEntitie aluno;

        System.out.print("Nome do aluno: ");
        String nome = sc.next();
        System.out.print("Primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        double nota3 = sc.nextDouble();

        aluno = new AlunoEntitie(nome, nota1, nota2, nota3);

        System.out.println();
        System.out.println(aluno);

        sc.close();
    }
}

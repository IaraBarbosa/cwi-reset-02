package Aula1;
import java.util.Scanner;

public class ComparadorApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        ComparadorEntitie compararNumeros = new ComparadorEntitie();

        System.out.print("Primeiro valor a ser comparado: ");
        int valor1 = sc.nextInt();
        System.out.print("Segundo valor a ser comparado: ");
        int valor2 = sc.nextInt();

        System.out.println(valor1 + " é menor que " + valor2 + "? " + (compararNumeros.menorQue(valor1, valor2)));

        sc.close();
    }
}

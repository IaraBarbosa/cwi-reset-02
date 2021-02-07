package Aula1;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CalculadoraEntitie calculadora = new CalculadoraEntitie();

        System.out.print("Digite o valor 1: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor2 = sc.nextInt();

        System.out.println("Opções: \n1- Soma \n2- Subtração \n3- Multiplicação \n4- Dividisão");
        System.out.print("\nQual operação deseja? ");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println(calculadora.soma(valor1, valor2));
                break;
            case 2:
                System.out.println(calculadora.subtrai(valor1, valor2));
                break;
            case 3:
                System.out.println(calculadora.multiplica(valor1, valor2));
                break;
            case 4:
                if (valor2 != 0){
                    System.out.println(calculadora.divide(valor1, valor2));
                } else{
                    System.out.println("Não é possível dividir por zero");
                }
                break;
            default:
                System.out.println("Opção inválida");
        }
        sc.close();
    }
}

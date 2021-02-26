package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        LocalDate dataInicio = LocalDate.of(2020, 7, 11);
        LocalDate dataFim = LocalDate.of(2020, 7, 20);


        ContaPoupanca conta1 = new ContaPoupanca(123, InstituicaoBancaria.CAIXA, 100.00);
        ContaDigital conta2 = new ContaDigital(456, InstituicaoBancaria.NUBANK, 50.00);
        ContaCorrente conta3 = new ContaCorrente(789, InstituicaoBancaria.BANCO_DO_BRASIL, 70.00);
        ContaDigital conta4 = new ContaDigital(911, InstituicaoBancaria.ITAU, 60.00);

        /*Teste conta digital (exceção)
        ContaDigital conta5 = new ContaDigital(111, InstituicaoBancaria.BRADESCO, 10.00);
        System.out.println(conta2);
        System.out.println(conta4);
        System.out.println(conta5);

        //Teste conta poupança (exceção)
        ContaPoupanca conta6 = new ContaPoupanca(141, InstituicaoBancaria.NUBANK, 25.00);
        System.out.println(conta1);
        System.out.println(conta6);

        // Teste toString
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);

        // Teste saque conta digital (exceção)
        System.out.println(conta4.getSaldoConta());
        conta4.sacar(10.00);
        System.out.println(conta4.getSaldoConta());
        conta4.sacar(5.00);

        // Teste saque conta corrente (exceção)
        System.out.println(conta3.getSaldoConta());
        conta3.sacar(10.00);
        System.out.println(conta3.getSaldoConta());
        conta3.sacar(4.00);

        // Teste saque conta poupança (exceção)
        System.out.println(conta1.getSaldoConta());
        conta1.sacar(50.00);
        System.out.println(conta1.getSaldoConta());
        conta1.sacar(40.00)/

        //Teste saldo insuficiente(exceção)
        System.out.println(conta2.getSaldoConta());
        conta2.sacar(50.00);
        System.out.println(conta2.getSaldoConta());

        //Teste extrato
        conta1.depositar(50.00);
        System.out.println(conta1.getSaldoConta());
        conta1.depositar(20.00);
        System.out.println(conta1.getSaldoConta());
        conta1.sacar(150.00);
        System.out.println(conta1.getSaldoConta());
        conta1.transferir(10.00, conta2);
        System.out.println(conta1.getSaldoConta());
        System.out.println(conta2.getSaldoConta());


        conta1.exibirExtrato(dataInicio, null);
        conta1.exibirExtrato(null, dataFim);
        conta1.exibirExtrato(dataInicio, dataFim);*/


    }

}

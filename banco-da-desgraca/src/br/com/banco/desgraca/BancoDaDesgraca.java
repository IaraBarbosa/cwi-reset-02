package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        LocalDate dataFim = LocalDate.of(2020, 7, 11);

        ContaPoupanca conta = new ContaPoupanca(123, InstituicaoBancaria.CAIXA, 100.00);
        ContaDigital conta2 = new ContaDigital(456, InstituicaoBancaria.NUBANK, 50.00);


        //Teste com data fim
        //Teste com data início
        //Teste entre datas

        //Teste saldo insuficiente
        //Teste valores solicitados


        conta.depositar(50.00);
        System.out.println(conta.getSaldoConta());
        conta.depositar(20.00);
        System.out.println(conta.getSaldoConta());
        conta.sacar(50.00);
        System.out.println(conta.getSaldoConta());
        conta.exibirExtrato(null, dataFim);
        conta.transferir(50.00, conta2);
        System.out.println(conta.getSaldoConta());
        System.out.println(conta2.getSaldoConta());



    }

}

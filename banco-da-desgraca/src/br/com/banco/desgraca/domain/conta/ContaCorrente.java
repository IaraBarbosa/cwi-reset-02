package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.ValorSolicitadoException;


public class ContaCorrente extends Conta {

    private static final Double TAXA_TRASFERENCIA_ENTRE_INSTITUICOES = 0.01;
    private static final String TIPO_DA_CONTA = "Conta Corrente";

    public ContaCorrente(Integer numeroContaCorrente, InstituicaoBancaria instituicaoBancaria, Double saldoConta) {
        super(numeroContaCorrente, instituicaoBancaria, saldoConta);
    }


    @Override
    public void sacar(Double valor) {
        if(getSaldoConta() >= valor){
            if(valor % 5 == 0){
                Transacao saque = new Transacao(TipoTransacao.SAQUE, new Data().getDataTransacao(), valor);
                setSaldoConta(getSaldoConta() - valor);
                System.out.println(saque.registroDaOperacao() + toString());
                super.salvaTransacao("-", valor, saque);
            } else {
                throw new ValorSolicitadoException("Valor solicitado não permitido! Saque apenas para" +
                        " notas de R$ 5,00, R$ 10,00, R$ 20,00, R$ 50,00, R$ 100,00 e R$ 200,00");
            }
        } else{
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if(getSaldoConta() >= valor){
            Transacao transferencia = new Transacao(TipoTransacao.TRANSFERENCIA, new Data().getDataTransacao(), valor);
            contaDestino.depositar(valor);
            super.salvaTransacao("-", valor, transferencia);
            if(getInstituicaoBancaria().equals(contaDestino.getInstituicaoBancaria())){
                setSaldoConta(getSaldoConta() - valor);
            } else{
                setSaldoConta(getSaldoConta() - (valor + (valor * TAXA_TRASFERENCIA_ENTRE_INSTITUICOES)));
            }
            System.out.println(transferencia.registroDaOperacao() + this.toString() + " para " + contaDestino.toString());
        } else{
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
    }


    public String toString(){
        return TIPO_DA_CONTA + " " + super.toString();
    }
}
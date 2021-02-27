package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.ContaInstituicaoException;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.ValorSolicitadoException;

public class ContaPoupanca extends Conta {

    private static final Double TAXA_SAQUE = 0.02;
    private static final Double TAXA_TRASFERENCIA_ENTRE_INSTITUICOES = 0.01;
    private static final Double TAXA_TRASFERENCIA_MESMA_INSTITUICAO = 0.005;
    private static final String TIPO_DA_CONTA = "Conta Poupança";

    public ContaPoupanca(Integer numeroContaCorrente, InstituicaoBancaria instituicaoBancaria, Double saldoConta) {
        super(numeroContaCorrente, instituicaoBancaria, saldoConta);
        validaInstituicao();
    }

    @Override
    public void sacar(Double valor) {
        if (getSaldoConta() >= valor) {
            if (valor >= 50.00) {
                Transacao saque = new Transacao(TipoTransacao.SAQUE, new Data().getDataTransacao(), valor);
                setSaldoConta(getSaldoConta() - (valor + (valor * TAXA_SAQUE)));
                System.out.println(saque.registroDaOperacao() + toString());
                super.salvaTransacao("-", valor, saque);
            } else {
                throw new ValorSolicitadoException("Valor solicitado não permitido! Saque apenas para notas a partir" +
                        "de R$50,00 reais");
            }
        } else {
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (getSaldoConta() >= valor) {
            Transacao transferencia = new Transacao(TipoTransacao.TRANSFERENCIA, new Data().getDataTransacao(), valor);
            contaDestino.depositar(valor);
            super.salvaTransacao("-", valor, transferencia);
            if (getInstituicaoBancaria().equals(contaDestino.getInstituicaoBancaria())) {
                setSaldoConta(getSaldoConta() - (valor + (valor * TAXA_TRASFERENCIA_MESMA_INSTITUICAO)));
            } else {
                setSaldoConta(getSaldoConta() - (valor + (valor * TAXA_TRASFERENCIA_ENTRE_INSTITUICOES)));
            }
            System.out.println(transferencia.registroDaOperacao() + this.toString() + " para " + contaDestino.toString());
        } else {
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
    }


   public void validaInstituicao() {
        if (getInstituicaoBancaria().equals(InstituicaoBancaria.NUBANK)) {
            throw new ContaInstituicaoException(getInstituicaoBancaria().getNomeInstituicaoBancaria()
                    + " não permite conta poupança");
        }
    }

    public String toString(){
        return TIPO_DA_CONTA + " " + super.toString();
    }
}

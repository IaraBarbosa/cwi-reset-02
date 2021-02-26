package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.ContaInstituicaoException;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.ValorSolicitadoException;


public class ContaDigital extends Conta {

    private static final String TIPO_DA_CONTA = "Conta Digital";

    public ContaDigital(Integer numeroContaCorrente, InstituicaoBancaria instituicaoBancaria, Double saldoConta) {
        super(numeroContaCorrente, instituicaoBancaria, saldoConta);
        validaInstituicao();
    }


    @Override
    public void sacar(Double valor) {
        if(getSaldoConta() >= valor){
            if(valor >= 10.00){
                Transacao saque = new Transacao(TipoTransacao.SAQUE, new Data().getDataTransacao(), valor);
                setSaldoConta(getSaldoConta() - valor);
                System.out.println(saque.registroDaOperacao() + toString());
                super.salvaTransacao("-", valor, saque);
            } else {
                throw new ValorSolicitadoException("Valor solicitado não permitido! Saque apenas para notas a partir" +
                        "de R$10,00 reais");
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
            setSaldoConta(getSaldoConta() - valor);
            super.salvaTransacao("-", valor, transferencia);
            System.out.println(transferencia.registroDaOperacao() + this.toString() + " para " + contaDestino.toString());
        } else{
            throw new SaldoInsuficienteException("Saldo Insuficiente!");
        }
    }

    public void validaInstituicao(){
        if(!getInstituicaoBancaria().equals(InstituicaoBancaria.ITAU)
                && !getInstituicaoBancaria().equals(InstituicaoBancaria.NUBANK)){
            throw new ContaInstituicaoException(getInstituicaoBancaria().getNomeInstituicaoBancaria() + " não permite conta digital");
        }
    }

   public String toString(){
        return TIPO_DA_CONTA + " " + super.toString();
    }
}
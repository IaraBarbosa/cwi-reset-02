package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.conta.Conta;

import java.time.LocalDate;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private LocalDate dataTransacao;
    private Double valorTransacao;

    public Transacao(TipoTransacao tipoTransacao, LocalDate dataTransacao, Double valorTransacao){
        this.tipoTransacao = tipoTransacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public String registroDaOperacao(){
        if(this.tipoTransacao.equals(TipoTransacao.DEPOSITO)){
            return  this.tipoTransacao.getTransacao() +
                    " valor R$" + this.valorTransacao
                    + " na ";
        }
        return  this.tipoTransacao.getTransacao() +
                " valor R$" + this.valorTransacao
                + " da ";
    }

}
package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public abstract class Conta implements ContaBancaria{

    private Integer numeroContaCorrente;
    private InstituicaoBancaria instituicaoBancaria;
    private Double saldoConta;
    private Map<String, LocalDate> transacoes = new HashMap<String,LocalDate>();



    public Conta(Integer numeroContaCorrente, InstituicaoBancaria instituicaoBancaria, Double saldoConta){
        this.numeroContaCorrente = numeroContaCorrente;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldoConta = saldoConta;

    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Integer getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldoConta;
    }


    @Override
    public void depositar(Double valor) {
        Transacao deposito = new Transacao(TipoTransacao.DEPOSITO, new Data().getDataTransacao(), valor);
        this.saldoConta += valor;
        System.out.println(deposito.registroDaOperacao() + toString());
        salvaTransacao("+", valor, deposito);
    }

    public void salvaTransacao(String simboloOperacao, Double valor, Transacao deposito) {
        transacoes.put(simboloOperacao + "     " + DecimalFormat.getCurrencyInstance().format(valor)
                + "    ", deposito.getDataTransacao());
    }

    @Override
    public void sacar(Double valor) {
    }


    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
    }


    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if(inicio == null && fim != null){
            System.out.println("----- EXTRATO " + toString());
            for (String key : transacoes.keySet()) {
                if(transacoes.get(key).isBefore(fim)){
                    String dataFormatada = transacoes.get(key).format(formatter);
                    System.out.println(key + dataFormatada);
                }
            }
            System.out.println("-----");

        } else if(inicio != null && fim == null){
            System.out.println("----- EXTRATO " + toString());
            for (String key : transacoes.keySet()) {
                if(transacoes.get(key).isAfter(inicio)) {
                    String dataFormatada = transacoes.get(key).format(formatter);
                    System.out.println(key + dataFormatada);
                }
            }
            System.out.println("-----");
        } else{
            System.out.println("----- EXTRATO " + toString());
            for (String key : transacoes.keySet()) {
                if(transacoes.get(key).isAfter(inicio) && transacoes.get(key).isBefore(fim)) {
                    String dataFormatada = transacoes.get(key).format(formatter);
                    System.out.println(key + dataFormatada);
                }
            }
            System.out.println("-----");
        }

    }

    public String toString(){
        return getInstituicaoBancaria().getNomeInstituicaoBancaria() + " " + getNumeroContaCorrente();
    }


}

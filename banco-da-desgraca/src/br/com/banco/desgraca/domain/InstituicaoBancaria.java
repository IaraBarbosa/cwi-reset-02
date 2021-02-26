package br.com.banco.desgraca.domain;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL ("Banco do Brasil"),
    BRADESCO ("Bradesco"),
    CAIXA ("Caixa Econômica Federal"),
    ITAU ("Itaú"),
    NUBANK ("Nubank");

    private String nomeInstituicaoBancaria;

    InstituicaoBancaria(String nomeInstituicaoBancaria) {
        this.nomeInstituicaoBancaria = nomeInstituicaoBancaria;
    }

    public String getNomeInstituicaoBancaria(){
        return this.nomeInstituicaoBancaria;
    }
}
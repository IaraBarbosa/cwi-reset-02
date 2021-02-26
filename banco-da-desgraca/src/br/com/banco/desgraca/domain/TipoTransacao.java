package br.com.banco.desgraca.domain;

public enum TipoTransacao {

    SAQUE ("Sacando"),
    DEPOSITO ("Depositando"),
    TRANSFERENCIA ("Transferindo");

    private String transacao;

    TipoTransacao(String transacao){
        this.transacao = transacao;
    }

    public String getTransacao(){
        return transacao;
    }


}
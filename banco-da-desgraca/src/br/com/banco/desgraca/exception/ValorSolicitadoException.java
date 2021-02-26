package br.com.banco.desgraca.exception;

public class ValorSolicitadoException extends RuntimeException {

    public ValorSolicitadoException(String mensagemDeErro){
        super(mensagemDeErro);
    }
}
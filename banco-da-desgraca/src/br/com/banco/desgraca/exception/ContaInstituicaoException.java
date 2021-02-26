package br.com.banco.desgraca.exception;

public class ContaInstituicaoException extends RuntimeException{
    public ContaInstituicaoException(String mensagemDeErro){
        super(mensagemDeErro);
    }
}

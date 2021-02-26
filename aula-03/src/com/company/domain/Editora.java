package com.company.domain;

import com.company.exceptions.EditoraException;

public class Editora {

    private String nome;
    private String localização;

    public Editora(String nome, String localização) {
        validarNome(nome);
        this.nome = nome;
        this.localização = localização;
    }

    public String getNome() {
        return nome;
    }

    private void validarNome(String nome) {
        if (nome.equals("DC Comics")) {
            throw new EditoraException("Marvel é melhor!!! Tente de novo");
        }
    }

}

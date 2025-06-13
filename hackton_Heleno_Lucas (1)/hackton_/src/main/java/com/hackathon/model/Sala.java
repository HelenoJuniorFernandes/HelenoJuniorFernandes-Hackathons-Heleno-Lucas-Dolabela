package com.hackathon.model;

public class Sala {
    private String nome;
    private String localizacao;

    public Sala(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String obterNome() {
        return nome;
    }

    public String obterLocalizacao() {
        return localizacao;
    }
}



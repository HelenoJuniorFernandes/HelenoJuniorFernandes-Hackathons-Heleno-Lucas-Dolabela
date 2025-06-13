package com.hackathon.model;

public class Instituicao {
    private String nome;
    private String tipo;

    public Instituicao(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String obterNome() {
        return nome;
    }

    public String obterTipo() {
        return tipo;
    }
}



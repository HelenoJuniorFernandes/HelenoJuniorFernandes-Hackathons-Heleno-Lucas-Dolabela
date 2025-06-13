package com.hackathon.model;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String obterNome() {
        return nome;
    }

    public String obterEmail() {
        return email;
    }
}



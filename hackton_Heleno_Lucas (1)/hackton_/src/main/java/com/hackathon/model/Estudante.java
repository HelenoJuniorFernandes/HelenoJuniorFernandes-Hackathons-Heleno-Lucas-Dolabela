package com.hackathon.model;

public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public String obterMatricula() {
        return matricula;
    }
}



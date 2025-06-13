package com.hackathon.model;

public class Profissional extends Pessoa {
    private String registroProfissional;

    public Profissional(String nome, String email, String registroProfissional) {
        super(nome, email);
        this.registroProfissional = registroProfissional;
    }

    public String obterRegistro() {
        return registroProfissional;
    }
}



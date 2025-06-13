package com.hackathon.model;

public class Jurado extends Profissional {
    private String especialidade;

    public Jurado(String nome, String email, String registroProfissional, String especialidade) {
        super(nome, email, registroProfissional);
        this.especialidade = especialidade;
    }

    public void avaliarProjeto(Projeto projeto) {
        System.out.println("Jurado " + obterNome() + " avaliando o projeto " + projeto.obterNome());
    }
}



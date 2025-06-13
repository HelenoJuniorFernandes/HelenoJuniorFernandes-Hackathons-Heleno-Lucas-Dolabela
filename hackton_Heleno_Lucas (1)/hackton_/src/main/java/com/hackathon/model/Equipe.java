package com.hackathon.model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List<Estudante> membros;
    private Projeto projeto;

    public Equipe() {
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Estudante membro) {
        this.membros.add(membro);
    }

    public List<Estudante> obterMembros() {
        return membros;
    }

    public Projeto obterProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}



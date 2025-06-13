package com.hackathon.collection;

import com.hackathon.model.Equipe;
import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipes;

    private Equipes() {
        equipes = new ArrayList<>();
    }

    public static synchronized Equipes getInstance() {
        if (instance == null) {
            instance = new Equipes();
        }
        return instance;
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public Equipe pesquisarEquipe(String nomeProjeto) {
        for (Equipe equipe : equipes) {
            if (equipe.obterProjeto() != null && equipe.obterProjeto().obterNome().equals(nomeProjeto)) {
                return equipe;
            }
        }
        return null;
    }
}



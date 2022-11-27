package com.pw2.cadastro.model.enumerations;

public enum Perfil {

    ROLE_ADMIN("Admin"),
    ROLE_ALUNO("Aluno"),
    ROLE_PROFESSOR("Professor");

    private final String descricao;

    Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

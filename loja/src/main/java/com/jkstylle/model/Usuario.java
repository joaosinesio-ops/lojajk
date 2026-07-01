package com.jkstylle.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
        private String nome;

    @Column(nullable=false)
        private String cpf;

    @Column(nullable=false)
        private int idade;

    @Column(nullable=false)
        private String telefone;

    public Usuario (){}

        public Usuario(String nome,String cpf, int idade, String telefone) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
            this.telefone = telefone;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


package com.jkstylle.model;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

    @Column(nullable=false)
  private float valor;

    @Column(nullable=false)
  private String tipo;

    @Column(nullable=false)
  private int qtde;

    private String tamanho = "Tamanho Único";

    public Produto(float valor,String tipo, int qtde) {
        this.valor = valor;
        this.tipo = tipo;
        this.qtde = qtde;
        this.tamanho = tamanho;

    }
    public Produto (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}

package com.ajeita.ajeitalar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PK_idclien;
    private String clien_nome;
    private String clien_nasc;
    private String clien_bairro;
    private String clien_rua;
    private int clien_CEP;
    private String clien_CPF;

    public int getPK_idclien() {
        return PK_idclien;
    }

    public void setPK_idclien(int PK_idclien) {
        this.PK_idclien = PK_idclien;
    }

    public String getClien_nome() {
        return clien_nome;
    }

    public void setClien_nome(String clien_nome) {
        this.clien_nome = clien_nome;
    }

    public String getClien_nasc() {
        return clien_nasc;
    }

    public void setClien_nasc(String clien_nasc) {
        this.clien_nasc = clien_nasc;
    }

    public String getClien_bairro() {
        return clien_bairro;
    }

    public void setClien_bairro(String clien_bairro) {
        this.clien_bairro = clien_bairro;
    }

    public String getClien_rua() {
        return clien_rua;
    }

    public void setClien_rua(String clien_rua) {
        this.clien_rua = clien_rua;
    }

    public int getClien_CEP() {
        return clien_CEP;
    }

    public void setClien_CEP(int clien_CEP) {
        this.clien_CEP = clien_CEP;
    }

    public String getClien_CPF() {
        return clien_CPF;
    }

    public void setClien_CPF(String clien_CPF) {
        this.clien_CPF = clien_CPF;
    }
}

package com.ajeita.ajeitalar.model;

import jakarta.persistence.*;

@Entity(name = "Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int PK_idpedi;

    @ManyToOne
    @JoinColumn(name = "FK_idcliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "FK_idcand")
    private Candidatura candidatura;

    private String pedi_img;

    private String ped_tipo_imovel;

    private String pedi_descr;

    private String pedi_status;

    private String pedi_tipo;

    private boolean pedi_nece_material;

    private String pedi_material;

    private String pedi_informacao;

    private String pedi_data;

    public int getPK_idpedi() {
        return PK_idpedi;
    }

    public void setPK_idpedi(int PK_idpedi) {
        this.PK_idpedi = PK_idpedi;
    }

    public String getPedi_img() {
        return pedi_img;
    }

    public void setPedi_img(String pedi_img) {
        this.pedi_img = pedi_img;
    }

    public String getPed_tipo_imovel() {
        return ped_tipo_imovel;
    }

    public void setPed_tipo_imovel(String ped_tipo_imovel) {
        this.ped_tipo_imovel = ped_tipo_imovel;
    }

    public String getPedi_descr() {
        return pedi_descr;
    }

    public void setPedi_descr(String pedi_descr) {
        this.pedi_descr = pedi_descr;
    }

    public String getPedi_status() {
        return pedi_status;
    }

    public void setPedi_status(String pedi_status) {
        this.pedi_status = pedi_status;
    }

    public String getPedi_tipo() {
        return pedi_tipo;
    }

    public void setPedi_tipo(String pedi_tipo) {
        this.pedi_tipo = pedi_tipo;
    }

    public boolean isPedi_nece_material() {
        return pedi_nece_material;
    }

    public void setPedi_nece_material(boolean pedi_nece_material) {
        this.pedi_nece_material = pedi_nece_material;
    }

    public String getPedi_material() {
        return pedi_material;
    }

    public void setPedi_material(String pedi_material) {
        this.pedi_material = pedi_material;
    }

    public String getPedi_informacao() {
        return pedi_informacao;
    }

    public void setPedi_informacao(String pedi_informacao) {
        this.pedi_informacao = pedi_informacao;
    }

    public String getPedi_data() {
        return pedi_data;
    }

    public void setPedi_data(String pedi_data) {
        this.pedi_data = pedi_data;
    }
}

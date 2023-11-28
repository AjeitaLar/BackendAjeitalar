package com.ajeita.ajeitalar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Candidatura")
public class Candidatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PK_idcand;
    private String canda_msg;
    private int FK_idpresta;

    public int getPK_idcand() {
        return PK_idcand;
    }

    public void setPK_idcand(int PK_idcand) {
        this.PK_idcand = PK_idcand;
    }

    public String getCanda_msg() {
        return canda_msg;
    }

    public void setCanda_msg(String canda_msg) {
        this.canda_msg = canda_msg;
    }

    public int getFK_idpresta() {
        return FK_idpresta;
    }

    public void setFK_idpresta(int FK_idpresta) {
        this.FK_idpresta = FK_idpresta;
    }
}

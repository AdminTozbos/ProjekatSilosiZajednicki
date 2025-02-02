/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Miloš
 */
public class Potvrda implements Serializable{
    private int idPotvrda;
    private Date datumIzdavanja;
    private Date datumVazenja;
    private double ukupanIznos;
    private int idRukovodilac;
    private int idKooperant;
    private int koopFlag;

    public Potvrda() {
    }

    public Potvrda(int idPotvrda, Date datumIzdavanja, Date datumVazenja, double ukupanIznos, int idRukovodilac, int idKooperant,int koopFlag) {
        this.idPotvrda = idPotvrda;
        this.datumIzdavanja = datumIzdavanja;
        this.datumVazenja = datumVazenja;
        this.ukupanIznos = ukupanIznos;
        this.idRukovodilac = idRukovodilac;
        this.idKooperant = idKooperant;
        this.koopFlag=koopFlag;
    }

    public int getKoopFlag() {
        return koopFlag;
    }

    public void setKoopFlag(int koopFlag) {
        this.koopFlag = koopFlag;
    }

    public int getIdPotvrda() {
        return idPotvrda;
    }

    public void setIdPotvrda(int idPotvrda) {
        this.idPotvrda = idPotvrda;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Date getDatumVazenja() {
        return datumVazenja;
    }

    public void setDatumVazenja(Date datumVazenja) {
        this.datumVazenja = datumVazenja;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public int getIdRukovodilac() {
        return idRukovodilac;
    }

    public void setIdRukovodilac(int idRukovodilac) {
        this.idRukovodilac = idRukovodilac;
    }

    public int getIdKooperant() {
        return idKooperant;
    }

    public void setIdKooperant(int idKooperant) {
        this.idKooperant = idKooperant;
    }
    
}

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
public class PoljoprivrednaKultura implements Serializable{
    private int idKultura;
    private String nazivKulture;
    private double cena;
    private Mesec mesecZetve;

    public PoljoprivrednaKultura() {
    }

    public PoljoprivrednaKultura(int idKultura, String nazivKulture, double cena, Mesec mesecZetve) {
        this.idKultura = idKultura;
        this.nazivKulture = nazivKulture;
        this.cena = cena;
        this.mesecZetve = mesecZetve;
    }

    public int getIdKultura() {
        return idKultura;
    }

    public void setIdKultura(int idKultura) {
        this.idKultura = idKultura;
    }

    public String getNazivKulture() {
        return nazivKulture;
    }

    public void setNazivKulture(String nazivKulture) {
        this.nazivKulture = nazivKulture;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Mesec getMesecZetve() {
        return mesecZetve;
    }

    public void setMesecZetve(Mesec mesecZetve) {
        this.mesecZetve = mesecZetve;
    }
    
}

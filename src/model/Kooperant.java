/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Miloš
 */
public class Kooperant implements Serializable{
    private int idKooperant;
    private String nazivKooperanta;
    private String mesto;

    public Kooperant() {
    }

    public Kooperant(int idKooperant, String nazivKooperanta, String mesto) {
        this.idKooperant = idKooperant;
        this.nazivKooperanta = nazivKooperanta;
        this.mesto = mesto;
    }

    public int getIdKooperant() {
        return idKooperant;
    }

    public void setIdKooperant(int idKooperant) {
        this.idKooperant = idKooperant;
    }

    public String getNazivKooperanta() {
        return nazivKooperanta;
    }

    public void setNazivKooperanta(String nazivKooperanta) {
        this.nazivKooperanta = nazivKooperanta;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
    
}

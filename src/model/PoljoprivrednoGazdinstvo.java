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
public class PoljoprivrednoGazdinstvo extends Kooperant implements Serializable{
    private String vlasnikGaz;
    private String brojTelefona;

    public PoljoprivrednoGazdinstvo() {
    }

    public PoljoprivrednoGazdinstvo(String vlasnikGaz, String brojTelefona) {
        this.vlasnikGaz = vlasnikGaz;
        this.brojTelefona = brojTelefona;
    }

    public PoljoprivrednoGazdinstvo(String vlasnikGaz, String brojTelefona, int idKooperant, String nazivKooperanta, String mesto) {
        super(idKooperant, nazivKooperanta, mesto);
        this.vlasnikGaz = vlasnikGaz;
        this.brojTelefona = brojTelefona;
    }

    public String getVlasnikGaz() {
        return vlasnikGaz;
    }

    public void setVlasnikGaz(String vlasnikGaz) {
        this.vlasnikGaz = vlasnikGaz;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    
}

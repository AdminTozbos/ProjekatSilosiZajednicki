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
public class RukovodilacKooperacije implements Serializable{
    private int idRukovodilac;
    private String ime;
    private String prezime;
    private String brojTelefona;

    public RukovodilacKooperacije() {
    }

    public RukovodilacKooperacije(int id, String ime, String prezime, String brojTelefona) {
        this.idRukovodilac = id;
        this.ime = ime;
        this.prezime = prezime;
        this.brojTelefona = brojTelefona;
    }

    public int getId() {
        return idRukovodilac;
    }

    public void setId(int id) {
        this.idRukovodilac = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }
    
}

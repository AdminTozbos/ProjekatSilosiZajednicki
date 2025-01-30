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
public class StavkaPotvrde implements Serializable{
    private int idPotvrda;
    private int rb;
    private double cena;
    private double kolicina;
    private double iznos;
    private int idKultura;

    public StavkaPotvrde() {
    }

    public StavkaPotvrde(int idPotvrda, int rb, double cena, double kolicina, double iznos, int idKultura) {
        this.idPotvrda = idPotvrda;
        this.rb = rb;
        this.cena = cena;
        this.kolicina = kolicina;
        this.iznos = iznos;
        this.idKultura = idKultura;
    }

    public int getIdPotvrda() {
        return idPotvrda;
    }

    public void setIdPotvrda(int idPotvrda) {
        this.idPotvrda = idPotvrda;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public int getIdKultura() {
        return idKultura;
    }

    public void setIdKultura(int idKultura) {
        this.idKultura = idKultura;
    }
    
}

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
public class RadnoIskustvo implements Serializable{
    private int idRadnoIskustvo;
    private String radnoMesto;

    public RadnoIskustvo() {
    }

    public RadnoIskustvo(int idRadnoIskustvo, String radnoMesto) {
        this.idRadnoIskustvo = idRadnoIskustvo;
        this.radnoMesto = radnoMesto;
    }

    public int getIdRadnoIskustvo() {
        return idRadnoIskustvo;
    }

    public void setIdRadnoIskustvo(int idRadnoIskustvo) {
        this.idRadnoIskustvo = idRadnoIskustvo;
    }

    public String getRadnoMesto() {
        return radnoMesto;
    }

    public void setRadnoMesto(String radnoMesto) {
        this.radnoMesto = radnoMesto;
    }

    
    
}

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
public class PrRi implements Serializable{
    private int idRukovodilac;
    private int idRadnoIskustvo;
    private String iskustvo;
    private int godineIskustva;

    public PrRi() {
    }

    public PrRi(int idRukovodilac, int idRadnoIskustvo, String iskustvo, int godineIskustva) {
        this.idRukovodilac = idRukovodilac;
        this.idRadnoIskustvo = idRadnoIskustvo;
        this.iskustvo = iskustvo;
        this.godineIskustva = godineIskustva;
    }

    

    public int getIdRukovodilac() {
        return idRukovodilac;
    }

    public void setIdRukovodilac(int idRukovodilac) {
        this.idRukovodilac = idRukovodilac;
    }

    public int getIdRadnoIskustvo() {
        return idRadnoIskustvo;
    }

    public void setIdRadnoIskustvo(int idRadnoIskustvo) {
        this.idRadnoIskustvo = idRadnoIskustvo;
    }

    public String getIskustvo() {
        return iskustvo;
    }

    public void setIskustvo(String iskustvo) {
        this.iskustvo = iskustvo;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }
    
}

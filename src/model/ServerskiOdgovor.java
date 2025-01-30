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
public class ServerskiOdgovor implements Serializable{
    private int operacija;
    private Object odgovor;

    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(int operacija, Object odgovor) {
        this.operacija = operacija;
        this.odgovor = odgovor;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public Object getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }
    
}

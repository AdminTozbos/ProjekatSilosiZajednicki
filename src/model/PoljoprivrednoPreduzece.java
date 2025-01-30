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
public class PoljoprivrednoPreduzece extends Kooperant implements Serializable{
    private String pravniZastupnik;
    private int pib;
    private String email;

    public PoljoprivrednoPreduzece() {
    }

    public PoljoprivrednoPreduzece(String pravniZastupnik, int pib, String email) {
        this.pravniZastupnik = pravniZastupnik;
        this.pib = pib;
        this.email = email;
    }

    

    public String getPravniZastupnik() {
        return pravniZastupnik;
    }

    public void setPravniZastupnik(String pravniZastupnik) {
        this.pravniZastupnik = pravniZastupnik;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
            
}

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
    private String pib;
    private String email;

    public PoljoprivrednoPreduzece() {
    }

    public PoljoprivrednoPreduzece(String pravniZastupnik, String pib, String email) {
        this.pravniZastupnik = pravniZastupnik;
        this.pib = pib;
        this.email = email;
    }

    public PoljoprivrednoPreduzece(String pravniZastupnik, String pib, String email, int idKooperant, String nazivKooperanta, String mesto) {
        super(idKooperant, nazivKooperanta, mesto);
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

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
            
}

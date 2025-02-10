/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Miloš
 */
public class PoljoprivrednaKultura implements Serializable,DomainObject<PoljoprivrednaKultura>{
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

    @Override
    public String getInsertQuery() {
        return "INSERT INTO kultura (naziv,cena,mesec) VALUES (?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, nazivKulture);
            ps.setDouble(2, cena);
            ps.setString(3, String.valueOf(mesecZetve));
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE kultura SET naziv=?,cena=?,mesec=? WHERE id=?";
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, nazivKulture);
            ps.setDouble(2, cena);
            ps.setString(3, String.valueOf(mesecZetve));
            ps.setInt(4, idKultura);
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM kultura WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idKultura);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM kultura";
    }

    @Override
    public PoljoprivrednaKultura createFromResultSet(ResultSet rs) throws SQLException {
                int id=rs.getInt("id");
                String isk=rs.getString("naziv");
                Double cena=rs.getDouble("cena");
                Mesec mesec=Mesec.valueOf(rs.getString("mesec"));
                return new PoljoprivrednaKultura(id, isk, cena, mesec);
    }
    
}

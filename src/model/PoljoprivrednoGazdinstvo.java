/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Miloš
 */
public class PoljoprivrednoGazdinstvo extends Kooperant implements Serializable,DomainObject<PoljoprivrednoGazdinstvo>{
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

    @Override
    public String getInsertQuery() {
        return "INSERT INTO gazdinstvo (naziv,mesto,vlasnik,brtel) VALUES (?,?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, getNazivKooperanta());
            ps.setString(2,getMesto());
            ps.setString(3, vlasnikGaz);
            ps.setString(4, brojTelefona);
           
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE gazdinstvo SET naziv=?,mesto=?,vlasnik=?,brtel=? WHERE id=?";
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, getNazivKooperanta());
            ps.setString(2,getMesto());
            ps.setString(3, vlasnikGaz);
            ps.setString(4, brojTelefona);
            ps.setInt(5, getIdKooperant());
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM gazdinstvo WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, getIdKooperant());
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM gazdinstvo";
    }

    @Override
    public PoljoprivrednoGazdinstvo createFromResultSet(ResultSet rs) throws SQLException {
                int id=rs.getInt("id");
                String naziv=rs.getString("naziv");
                String mesto=rs.getString("mesto");
                String vlasnik=rs.getString("vlasnik");
                String brtel=rs.getString("brtel");
                
                return new PoljoprivrednoGazdinstvo(vlasnik, brtel, id, naziv, mesto);
    }
    
}

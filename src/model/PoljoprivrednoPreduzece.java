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
public class PoljoprivrednoPreduzece extends Kooperant implements Serializable,DomainObject<PoljoprivrednoPreduzece>{
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

    @Override
    public String getInsertQuery() {
        return "INSERT INTO preduzece (naziv,mesto,pib,email,zastupnik) VALUES (?,?,?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, getNazivKooperanta());
            ps.setString(2, getMesto());
            ps.setString(3, pib);
            ps.setString(4, email);
            ps.setString(5, pravniZastupnik);
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE preduzece SET naziv=?,mesto=?,pib=?,email=?,zastupnik=? WHERE id=?";
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, getNazivKooperanta());
            ps.setString(2, getMesto());
            ps.setString(3, pib);
            ps.setString(4, email);
            ps.setString(5, pravniZastupnik);
            ps.setInt(6, getIdKooperant());
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM preduzece WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, getIdKooperant());
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM preduzece";
    }

    @Override
    public PoljoprivrednoPreduzece createFromResultSet(ResultSet rs) throws SQLException {
                int id=rs.getInt("id");
                String naziv=rs.getString("naziv");
                String mesto=rs.getString("mesto");
                String zastupnik=rs.getString("zastupnik");
                String pib=rs.getString("pib");
                String email=rs.getString("email");
                return new PoljoprivrednoPreduzece(zastupnik, pib, email, id, naziv, mesto);
    }
    
            
}

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
public class RukovodilacKooperacije implements Serializable,DomainObject<RukovodilacKooperacije>{
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

    @Override
    public String getInsertQuery() {
        return "INSERT INTO rukovodilac (ime,prezime,brtel) VALUES (?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, ime);
            ps.setString(2, prezime);
            ps.setString(3, brojTelefona);
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE rukovodilac SET ime=?,prezime=?,brtel=? WHERE id=?";
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, ime);
            ps.setString(2, prezime);
            ps.setString(3, brojTelefona);
            ps.setInt(4, idRukovodilac);
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM rukovodilac WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idRukovodilac);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM rukovodilac";
    }

    @Override
    public RukovodilacKooperacije createFromResultSet(ResultSet rs) throws SQLException {
                int id=rs.getInt("id");
                String ime=rs.getString("ime");
                String prezime=rs.getString("prezime");
                String brtel=rs.getString("brtel");
                return new RukovodilacKooperacije(id, ime, prezime, brtel);
    }
    
}

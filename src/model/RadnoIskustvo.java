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
public class RadnoIskustvo implements Serializable,DomainObject<RadnoIskustvo>{
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

    @Override
    public String getInsertQuery() {
        return "INSERT INTO iskustvo (radnomesto) VALUES (?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
        ps.setString(1, radnoMesto);
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE iskustvo SET radnomesto=? WHERE id=?";
        
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
            ps.setString(1, radnoMesto);
            ps.setInt(2, idRadnoIskustvo);
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM iskustvo WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idRadnoIskustvo);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM iskustvo";
    }

    @Override
    public RadnoIskustvo createFromResultSet(ResultSet rs) throws SQLException {
               int id=rs.getInt("id");
               String isk=rs.getString("radnomesto");
               return new RadnoIskustvo(id, isk);
               
    }

    
    
}

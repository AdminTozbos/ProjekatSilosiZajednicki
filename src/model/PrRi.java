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
public class PrRi implements Serializable,DomainObject<PrRi>{
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

    @Override
    public String getInsertQuery() {
        return "INSERT INTO prri (idrukovodilac,idiskustvo,iskustvo,godine) VALUES (?,?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idRukovodilac);
        ps.setInt(2, idRadnoIskustvo);
        ps.setString(3, iskustvo);
        ps.setInt(4, godineIskustva);
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE prri SET iskustvo=?,godine=? WHERE idrukovodilac=? AND idiskustvo=?";
        
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
        
        ps.setString(1, iskustvo);
        ps.setInt(2, godineIskustva);
        ps.setInt(3, idRukovodilac);
        ps.setInt(4, idRadnoIskustvo);
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM prri WHERE idrukovodilac=? AND idiskustvo=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idRukovodilac);
        ps.setInt(2, idRadnoIskustvo);
        //ps.setString(3, iskustvo);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM prri";
    }

    @Override
    public PrRi createFromResultSet(ResultSet rs) throws SQLException {
        int idrukov=rs.getInt("idrukovodilac");
        int idisk=rs.getInt("idiskustvo");
        String isk=rs.getString("iskustvo");
        int staz=rs.getInt("godine");
        return new PrRi(idrukov, idisk, isk, staz);
    }
    
}

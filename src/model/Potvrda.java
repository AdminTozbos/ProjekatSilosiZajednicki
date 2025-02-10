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
public class Potvrda implements Serializable,DomainObject<Potvrda>{
    private int idPotvrda;
    private Date datumIzdavanja;
    private Date datumVazenja;
    private double ukupanIznos;
    private int idRukovodilac;
    private int idKooperant;
    private int koopFlag;

    public Potvrda() {
    }

    public Potvrda(int idPotvrda, Date datumIzdavanja, Date datumVazenja, double ukupanIznos, int idRukovodilac, int idKooperant,int koopFlag) {
        this.idPotvrda = idPotvrda;
        this.datumIzdavanja = datumIzdavanja;
        this.datumVazenja = datumVazenja;
        this.ukupanIznos = ukupanIznos;
        this.idRukovodilac = idRukovodilac;
        this.idKooperant = idKooperant;
        this.koopFlag=koopFlag;
    }

    public int getKoopFlag() {
        return koopFlag;
    }

    public void setKoopFlag(int koopFlag) {
        this.koopFlag = koopFlag;
    }

    public int getIdPotvrda() {
        return idPotvrda;
    }

    public void setIdPotvrda(int idPotvrda) {
        this.idPotvrda = idPotvrda;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Date getDatumVazenja() {
        return datumVazenja;
    }

    public void setDatumVazenja(Date datumVazenja) {
        this.datumVazenja = datumVazenja;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public int getIdRukovodilac() {
        return idRukovodilac;
    }

    public void setIdRukovodilac(int idRukovodilac) {
        this.idRukovodilac = idRukovodilac;
    }

    public int getIdKooperant() {
        return idKooperant;
    }

    public void setIdKooperant(int idKooperant) {
        this.idKooperant = idKooperant;
    }

    @Override
    public String getInsertQuery() {
        return "INSERT INTO potvrda (id,datumizdavanja,datumvazenja,iznos,idkooperanta,idrukovodioca,flag) VALUES (?,?,?,?,?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
            ps.setInt(1, idPotvrda);
            ps.setDate(2,new java.sql.Date(datumIzdavanja.getTime()));
            ps.setDate(3, new java.sql.Date(datumVazenja.getTime()));
            ps.setDouble(4, ukupanIznos);
            ps.setInt(5, idKooperant);
            ps.setInt(6, idRukovodilac);
            ps.setInt(7,koopFlag);
    }

    @Override
    public String getUpdateQuery() {
        return null;
    }

    @Override
    public void fillUpdateStatement(PreparedStatement ps) throws SQLException {
        
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM potvrda WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idPotvrda);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM potvrda";
    }

    @Override
    public Potvrda createFromResultSet(ResultSet rs) throws SQLException {
        int id=rs.getInt("id");
                java.sql.Date datumi=rs.getDate("datumizdavanja");
                java.util.Date datumizd=new java.util.Date(datumi.getTime());
                java.sql.Date datumvaz=rs.getDate("datumvazenja");
                java.util.Date datumvazenja=new java.util.Date(datumvaz.getTime());
                Double iznos=rs.getDouble("iznos");
                int idkoop=rs.getInt("idkooperanta");
                int idrukov=rs.getInt("idrukovodioca");
                int flag=rs.getInt("flag");
                return new Potvrda(id, datumizd, datumvazenja, iznos, idrukov, idkoop, flag);
    }
    
}

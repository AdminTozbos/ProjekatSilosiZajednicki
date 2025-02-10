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
public class StavkaPotvrde implements Serializable,DomainObject<StavkaPotvrde>{
    private int idPotvrda;
    private int rb;
    private double cena;
    private double kolicina;
    private double iznos;
    private int idKultura;

    public StavkaPotvrde() {
    }

    public StavkaPotvrde(int idPotvrda, int rb, double cena, double kolicina, double iznos, int idKultura) {
        this.idPotvrda = idPotvrda;
        this.rb = rb;
        this.cena = cena;
        this.kolicina = kolicina;
        this.iznos = iznos;
        this.idKultura = idKultura;
    }

    public int getIdPotvrda() {
        return idPotvrda;
    }

    public void setIdPotvrda(int idPotvrda) {
        this.idPotvrda = idPotvrda;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public int getIdKultura() {
        return idKultura;
    }

    public void setIdKultura(int idKultura) {
        this.idKultura = idKultura;
    }

    @Override
    public String getInsertQuery() {
        return "INSERT INTO stavka (id,rb,cena,kolicina,iznos,idkulture) VALUES (?,?,?,?,?,?)";
    }

    @Override
    public void fillInsertStatement(PreparedStatement ps) throws SQLException {
            ps.setInt(1,idPotvrda);
            ps.setInt(2,rb);
            ps.setDouble(3, cena);
            ps.setDouble(4, kolicina);
            ps.setDouble(5, iznos);
            ps.setInt(6, idKultura);
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
        return "DELETE FROM stavka WHERE id=?";
    }

    @Override
    public void fillDeleteStatement(PreparedStatement ps) throws SQLException {
        ps.setInt(1, idPotvrda);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT *FROM stavka WHERE id="+idPotvrda;
    }

    @Override
    public StavkaPotvrde createFromResultSet(ResultSet rs) throws SQLException {
                 int id=rs.getInt("id");
                 int rb=rs.getInt("rb");
                 double cena=rs.getDouble("cena");
                 double kolicina=rs.getDouble("kolicina");
                 double iznos=rs.getDouble("iznos");
                 int idkult=rs.getInt("idkulture");
                 return new StavkaPotvrde(id, rb, cena, kolicina, iznos, idkult);
    }
    
}

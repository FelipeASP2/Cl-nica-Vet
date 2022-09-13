/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicavet;

/**
 *
 * @author f169401
 */
import java.sql.Date;
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.Data;

public class ConsultaDAO extends DAO{
    private static ConsultaDAO instance;

    private ConsultaDAO() {
        getConnection();
        createTable();
    }
    
     public static ConsultaDAO getInstance() {
        return (instance==null?(instance = new ConsultaDAO()):instance);
    }
     
     public Consulta create(Calendar data,int horas, String comentario, boolean terminou) {
        try {
            PreparedStatement stmt;
            stmt = DAO.getConnection().prepareStatement("INSERT INTO consulta (data, horas, comentario, terminou) VALUES (?,?,?,?)");
            stmt.setCalendar(1, data);
            //gravar em string e dpois quando puxar dar set no calendar
            stmt.setInt(2, horas);
            stmt.setString(3, comentario);
            stmt.setBoolean(4, terminou);
            executeUpdate(stmt);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.retrieveById(lastId("consulta","id"));
    }
}

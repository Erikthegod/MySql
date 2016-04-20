/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class GestorCoordenadas {

    Connection c = null;//Conexión
    Statement stmt = null;//Sentencia

    public void conectarBBDD(String alias) {
        try {
            String sql = null;//Cadena con la sentencia sql    
            Class.forName("com.mysql.jdbc.Driver");//Carga del driver
            String servidor = "jdbc:mysql://10.10.13.14/naves";
            String user = "kinton";
            String pass = "guapo";
            c = DriverManager.getConnection(servidor, user, pass);
            stmt = c.createStatement();
            sql = "insert into nave values('" + alias + "'," + 100 + "," + 100 + ");";
            stmt.executeUpdate(sql);
            System.out.println("por aqui");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorCoordenadas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestorCoordenadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void arriba(Nave nav) {
        try {
            String sqlUpdate = null;
            stmt = c.createStatement();
            sqlUpdate = "Update nave set posY = posY - 10  where alias ='" + nav.getAlias() + "';";
            stmt.executeUpdate(sqlUpdate);
        } catch (SQLException ex) {
            System.err.println("ERROR DE SQL EXCEPTION");
            ex.printStackTrace();
        }
    }

    public void abajo(Nave nav) {
        try {
            String sqlUpdate = null;
            stmt = c.createStatement();
            sqlUpdate = "Update nave set posY = posY + 10  where alias ='" + nav.getAlias() + "';";
            stmt.executeUpdate(sqlUpdate);
        } catch (SQLException ex) {
            System.err.println("ERROR DE SQL EXCEPTION");
            ex.printStackTrace();
        }
    }

    public void derecha(Nave nav) {
        try {
            String sqlUpdate = null;
            stmt = c.createStatement();
            sqlUpdate = "Update nave set posX = posX + 10  where alias ='" + nav.getAlias() + "';";
            stmt.executeUpdate(sqlUpdate);
        } catch (SQLException ex) {
            System.err.println("ERROR DE SQL EXCEPTION");
            ex.printStackTrace();
        }
    }
    
    public void izquierda(Nave nav){
        try {
            String sqlUpdate = null;
            stmt = c.createStatement();
            sqlUpdate = "Update nave set posX = posX - 10  where alias ='" + nav.getAlias() + "';";
            stmt.executeUpdate(sqlUpdate);
        } catch (SQLException ex) {
            System.err.println("ERROR DE SQL EXCEPTION");
            ex.printStackTrace();
        }
    }

}

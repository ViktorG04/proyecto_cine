
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Salas 
{
    private int id;
    private String NumeroSala;
    
    //Conexion de base datos
    conectar cc = new conectar();
    Connection cn = cc.conexion();
        

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNumeroSala() 
    {
        return NumeroSala;
    }

    public void setNumeroSala(String NumeroSala) 
    {
        this.NumeroSala = NumeroSala;
    }
    
    public String toString()
    {
        return this.NumeroSala;
    }
    
     public Vector<Salas> VistaSalas()
    {
        
        
        Vector<Salas> datos = new Vector<Salas>();
        
        Salas dat = null;
        String sql = "SELECT * FROM sala";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            dat = new Salas();
            dat.setId(0);
            dat.setNumeroSala("SALA");
            datos.add(dat);
            
            while(rs.next())
            {
                dat = new Salas();
                dat.setId(rs.getInt("Cod_Sala"));
                dat.setNumeroSala(rs.getString("Numero_Sala"));
                datos.add(dat);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Salas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }
    
    public Vector<Salas> mostrarSalas(Integer IdCartelera)
    {
        
        Vector<Salas> datos = new Vector<Salas>();
        
        Salas dat = null;
        String sql = "SELECT * FROM sala INNER JOIN cartelera ON sala.Cod_Sala = cartelera.Cod_sala_cartelera "
                + "INNER JOIN peliculas on cartelera.Cod_pelicula_cartelera = peliculas.Cod_pelicula WHERE Cod_cartelera ="+IdCartelera+"";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            dat = new Salas();
            dat.setId(0);
            dat.setNumeroSala("SALA");
            datos.add(dat);
            
            while(rs.next())
            {
                dat = new Salas();
                dat.setId(rs.getInt("Cod_Sala"));
                dat.setNumeroSala(rs.getString("Numero_Sala"));
                datos.add(dat);
                 
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Salas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }
   
}




package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Peliculas 
{
    private int id;
    private String TituloPelicula;

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

    public String getTituloPelicula() 
    {
        return TituloPelicula;
    }

    public void setTituloPelicula(String TituloPelicula) 
    {
        this.TituloPelicula = TituloPelicula;
    }
    
    public String toString()
    {
            return this.TituloPelicula;
    }
    
    public Vector<Peliculas> mostrarPeliculas()
    {
        
        Vector<Peliculas> datos = new Vector<Peliculas>();
        
        Peliculas dat = null;
        String sql = "SELECT DISTINCT Titulo_pelicula, Cod_pelicula FROM peliculas INNER JOIN cartelera "
                + "ON peliculas.Cod_pelicula = cartelera.Cod_pelicula_cartelera";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            dat = new Peliculas();
            dat.setId(0);
            dat.setTituloPelicula("Seleccione:");
            datos.add(dat);
            
            while(rs.next())
            {
                dat = new Peliculas();
                dat.setId(rs.getInt("Cod_pelicula"));
                dat.setTituloPelicula(rs.getString("Titulo_pelicula"));
                datos.add(dat);
            
                
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }
    
    
    public Vector<Peliculas> VistaPeliculas(Integer IdSala)
    {
        Vector<Peliculas> datos = new Vector<Peliculas>();
        
        Peliculas dat = null;
        String sql = "SELECT DISTINCT Titulo_pelicula, Cod_pelicula FROM peliculas INNER JOIN cartelera "
                + "ON peliculas.Cod_pelicula = cartelera.Cod_pelicula_cartelera WHERE cod_sala_cartelera = '"+IdSala+"'";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            dat = new Peliculas();
            dat.setId(0);
            dat.setTituloPelicula("PELICULAS");
            datos.add(dat);
            
            while(rs.next())
            {
                dat = new Peliculas();
                dat.setId(rs.getInt("Cod_pelicula"));
                dat.setTituloPelicula(rs.getString("Titulo_pelicula"));
                datos.add(dat);
            
                
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }
    
    
    public Vector<Peliculas> PeliculasACartelera()
    {
        
        Vector<Peliculas> datos = new Vector<Peliculas>();
        
        Peliculas dat = null;
        String sql = "SELECT * FROM peliculas";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            dat = new Peliculas();
            dat.setId(0);
            dat.setTituloPelicula("Seleccione:");
            datos.add(dat);
            
            while(rs.next())
            {
                dat = new Peliculas();
                dat.setId(rs.getInt("Cod_pelicula"));
                dat.setTituloPelicula(rs.getString("Titulo_pelicula"));
                datos.add(dat);
            
                
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Peliculas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }
}

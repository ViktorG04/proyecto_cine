
package Clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HoraCartelera 
{
    private int id;
    private String Horadisponible;

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getHoradisponible() 
    {
        return Horadisponible;
    }

    public void setHoradisponible(String Horadisponible) 
    {
        this.Horadisponible = Horadisponible;
    }
  
    
    public String toString()
    {
            return this.Horadisponible;
    }
    
    
    public Vector<HoraCartelera> mostrarHorarioDisponible(Integer IdPeliculas)
    {
        
        //Conexion de base datos
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        
        
        Vector<HoraCartelera> datos = new Vector <HoraCartelera>();
        
        HoraCartelera dat = null;
        String sql = "SELECT * FROM cartelera inner join peliculas on peliculas.Cod_pelicula = cartelera.Cod_pelicula_cartelera "
                    + "where Cod_pelicula ="+IdPeliculas+"";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            dat = new HoraCartelera();
            dat.setId(0);
            dat.setHoradisponible("Horario");
            datos.add(dat);
            
            while(rs.next())
            {
                dat = new HoraCartelera();
                dat.setId(rs.getInt("Cod_cartelera"));
                dat.setHoradisponible(rs.getString("Horainicio_cartelera"));
                datos.add(dat);    
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(HoraCartelera.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datos;
    }
}

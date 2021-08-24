
package Clases;

import Ventanas.V3SeleccionAsientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Asientos extends JButton implements ActionListener
{
    public int estado; 
    public static int asientoComprados;
    public V3SeleccionAsientos v3;
    public boolean verCartelera;

    
    public Asientos(int posx, int posy, int ancho, int alto, int estado, V3SeleccionAsientos v3)
    {
       setBounds(posx, posy, ancho, alto);
       addActionListener(this);
       this.estado = estado;
       this.v3 = v3;
       this.verCartelera = false;
    }
    
        public Asientos(int posx, int posy, int ancho, int alto, int estado)
    {
       setBounds(posx, posy, ancho, alto);
       addActionListener(this);
       this.estado = estado;
       this.verCartelera = true;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (!this.verCartelera)
       {
       
        if (estado == 1)  // si esta disponible
        {
            if (Asientos.getAsientoComprados() != 0 )
            {
                this.estado=2;
                ImageIcon Asiento = new ImageIcon(getClass().getResource("/Imagenes/reservado.JPG"));
                setIcon(Asiento);
                Asientos.setAsientoComprados(  Asientos.getAsientoComprados() - 1 );
                this.v3.setNumeroAsiento( Asientos.getAsientoComprados() );

                System.out.println(" Actual disponibles: " +  Asientos.getAsientoComprados());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Ya no dispone de mas asientos","AVISO",JOptionPane.ERROR_MESSAGE);
            }


        } else if (estado == 2)  // si esta deseleccionar
        {
            this.estado=1;
            ImageIcon Asiento = new ImageIcon(getClass().getResource("/Imagenes/disponible.JPG"));
            setIcon(Asiento);
            Asientos.setAsientoComprados(  Asientos.getAsientoComprados() + 1 );
            this.v3.setNumeroAsiento( Asientos.getAsientoComprados() );
        }
     }
       
    }

    public static int getAsientoComprados()
    {
        return asientoComprados;
    }

    public static void setAsientoComprados(int asientoComprados) {
        
        Asientos.asientoComprados = asientoComprados;
    }
    
   
}

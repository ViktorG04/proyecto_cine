
package Clases;

import javax.swing.JOptionPane;


public class Confirmacion
{
    
     public static String strPreguntaSiNo(String strMensaje)
     {
        int seleccion = JOptionPane.showOptionDialog
        (
            null, // Componente padre
            strMensaje, //Mensaje
            "Seleccione una opción", // Título
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
            "Si"
        );
        
        if (seleccion != -1)
        {
            if((seleccion + 1)==1)
            {
                return "SI";
            }
            else
            {
            return "NO";
            }
        }
        return null;
    } 
    
}

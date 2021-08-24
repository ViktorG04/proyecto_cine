package Ventanas;

import Clases.conectar;
import Clases.Asientos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class V3SeleccionAsientos extends javax.swing.JInternalFrame {

    //llamando clase conecta
    conectar cc = new conectar();
    Connection cn = cc.conexion();

    int filas = 7;
    int columnas = 10;
    public static String IDCarteleraSala="";
    public static String NombreCliente;
    public static String ApellidoCliente;
    public static String DUICliente;
    public static int numeroAsiento;
    public static int NumeroAguardar;
    public static String TotalCancelar;
    public static String hora;
    public static String sala;
    String strRespuesta ="";
    
    
    Asientos[][] Botones = new Asientos[filas][columnas];

    //constructor que trae el ID de la Cartelera de Ventana1, para las consultas de asientos
    public V3SeleccionAsientos(String IDCartelera)
    {
        IDCarteleraSala = IDCartelera;
    }
    
    //constructor que trae los Datos de la Ventana2
    public V3SeleccionAsientos(String Nombre, String Apellido, String DUI, int Asientos, String precio)
    {
        NombreCliente = Nombre;
        ApellidoCliente = Apellido;
        DUICliente = DUI;
        numeroAsiento = Asientos;
        TotalCancelar = precio;
        NumeroAguardar = Asientos;
    }
    
    //enviar el numero de asientos a la clase Asientos para llevar la cuenta de los asientos a seleccionar
    public void setNumeroAsiento(int num)
    {
        this.numeroAsiento = num;
        LbNumeroAsientos.setText( String.valueOf(this.numeroAsiento));
    }
    
    public V3SeleccionAsientos() 
    {
        initComponents();
        AsientosBotones();
        TituloPelicula();
        // Cuando Carga
        LbNumeroAsientos.setText( String.valueOf(this.numeroAsiento));
        Asientos.setAsientoComprados(numeroAsiento);
    }
    
    public void TituloPelicula()
    {
        String titulo = "SELECT Titulo_pelicula, Cod_sala_cartelera, HoraInicio_cartelera FROM peliculas INNER JOIN cartelera "
                + "ON peliculas.Cod_pelicula = cartelera.Cod_pelicula_cartelera WHERE Cod_cartelera = "+IDCarteleraSala;
        try
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(titulo);

            while (rs.next()) 
            {
                TxtPelicula.setText(rs.getString("Titulo_pelicula"));
                sala = rs.getString("Cod_sala_cartelera");
                hora = rs.getString("HoraInicio_cartelera");

            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(V3SeleccionAsientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AsientosBotones() 
    {
        String asientosocupados = "";
        List<String> ArryAsientos = new ArrayList<String>();

        ImageIcon Asiento = null;
        int contador = 0;
        int estadoAsiento = 0;
        String sql = "SELECT AsientosVendidos_Cartelera FROM cartelera WHERE Cod_cartelera ='"+IDCarteleraSala+"'";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) 
            {
                asientosocupados = rs.getString("AsientosVendidos_cartelera");

            }
            
            if (!asientosocupados.equals("")) 
            {
                String[] arrayAsientoOcupados = asientosocupados.split(",");
                for (int i = 0; i < arrayAsientoOcupados.length; i++) 
                {
                    ArryAsientos.add(arrayAsientoOcupados[i]);
                }
            }
            
            for (int i = 0; i < filas; i++)
            {
                for (int j = 0; j < columnas; j++) 
                {
                    contador++;
                    if (ArryAsientos.size() > 0) 
                    { 
                       if ( ArryAsientos.contains(String.valueOf(contador))) // el numero actual del contador esta dentro del array de asientos vendidos?
                       {
                            Asiento = new ImageIcon(getClass().getResource("/Imagenes/ocupado.JPG"));
                            estadoAsiento = 3; 
                       }
                       else
                       {
                            Asiento = new ImageIcon(getClass().getResource("/Imagenes/disponible.JPG"));
                            estadoAsiento = 1;
                       }      
                    } 
                    else 
                    {
                        Asiento = new ImageIcon(getClass().getResource("/Imagenes/disponible.JPG"));
                        estadoAsiento = 1;
                    }

                    Botones[i][j] = new Asientos(70 * j, 50 * i, 40, 40, estadoAsiento,this);
                    Botones[i][j].setIcon(Asiento);

                    jPanelVistaAsientos.add(Botones[i][j]);
                }
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(V3SeleccionAsientos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtPelicula = new javax.swing.JTextField();
        LbPantallaIma = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LbNumeroAsientos = new javax.swing.JLabel();
        jPanelVistaAsientos = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("SELECCION DE ASIENTOS");
        setToolTipText("");
        setVisible(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Pelicula:");

        TxtPelicula.setEditable(false);
        TxtPelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtPelicula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(TxtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        LbPantallaIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cine.JPG"))); // NOI18N

        BtnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Seleccionar asientos:");

        LbNumeroAsientos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanelVistaAsientosLayout = new javax.swing.GroupLayout(jPanelVistaAsientos);
        jPanelVistaAsientos.setLayout(jPanelVistaAsientosLayout);
        jPanelVistaAsientosLayout.setHorizontalGroup(
            jPanelVistaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        jPanelVistaAsientosLayout.setVerticalGroup(
            jPanelVistaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanelVistaAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(398, 398, 398)
                            .addComponent(BtnRegresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnRegistrar))
                        .addComponent(LbPantallaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LbPantallaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(LbNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelVistaAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrar)
                    .addComponent(BtnRegresar))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

        V2DatosCliente Venta2 = new V2DatosCliente();
        JDesktopPane x = this.getDesktopPane();
        x.add(Venta2);
        Venta2.setVisible(true);
        V2DatosCliente.TxtNombre.setText(NombreCliente);
        V2DatosCliente.TxtApellido.setText(ApellidoCliente);
        V2DatosCliente.TxtDui.setText(DUICliente);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
       

        // tenes que recorrer de nuevo todos los botones y ver su estado para saber cuales compraron
        int contador = 0 ;
        String asientosCompradosFinal="";
        
        if ( Asientos.getAsientoComprados() == 0)
        {
            for (int i = 0; i < filas; i++) 
            {
                for (int j = 0; j < columnas; j++) 
                {
                    contador++;

                    if (Botones[i][j].estado != 1)
                    {
                        asientosCompradosFinal += String.valueOf(contador) + ",";
                    }
                }
            }
            asientosCompradosFinal = asientosCompradosFinal.substring(0, asientosCompradosFinal.length()-1);
            
            //COnfirmacion
            strRespuesta = Clases.Confirmacion.strPreguntaSiNo("Desea Actualizar los datos");
            if(strRespuesta.equals("SI"))
            {
                String sql = "update cartelera set AsientosVendidos_Cartelera='"+asientosCompradosFinal+"' WHERE Cod_cartelera ='" +IDCarteleraSala+"'";
                String agre = "INSERT INTO cliente (Nombre_cliente, Apellido_cliente, DUI_cliente, Asiento_cliente) VALUES(?,?,?,?)";
            
                try 
                {
                    Statement st = cn.createStatement();
                    PreparedStatement pst = cn.prepareStatement(agre);
                    
                    pst.setString(1, NombreCliente);
                    pst.setString(2, ApellidoCliente);
                    pst.setString(3, DUICliente);
                    pst.setString(4, String.valueOf(NumeroAguardar));
           
                    int n = pst.executeUpdate();
                    int resultado = st.executeUpdate(sql);
               
                    if(n>0 || resultado>0)
                    {
                        String Cod = "";           
                        String cli = "SELECT Cod_cliente FROM cliente WHERE Nombre_cliente = '"+NombreCliente+"'";
                        try
                        {

                            ResultSet rs = st.executeQuery(cli);

                            while (rs.next()) 
                            {
                                Cod = rs.getString("Cod_cliente");
                            }
                            
                            String Cliente = NombreCliente+" "+ApellidoCliente;
                            V4ticket Venta4 = new V4ticket ();
                            JDesktopPane x = this.getDesktopPane();
                            x.add(Venta4);
                            Venta4.setVisible(true);
                            dispose();
                            V4ticket.LbCliente.setText(Cliente);
                            V4ticket.LbPelicula.setText(TxtPelicula.getText());
                            V4ticket.LbSala.setText(sala);
                            V4ticket.LbHoraFuncion.setText(hora);
                            V4ticket.LbAsientos.setText(String.valueOf(NumeroAguardar));
                            V4ticket.LbTotal.setText(TotalCancelar);
                            V4ticket ventana4 = new V4ticket(IDCarteleraSala, Cod);
                            JOptionPane.showMessageDialog(this, "Datos Registrados");
                        }
                        catch (SQLException ex) 
                        {
                        Logger.getLogger(V3SeleccionAsientos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        System.out.println("Error!");
                    }
                }
                catch(SQLException e)
                {
                    System.out.println("Ocurrio un problema: " + e.getMessage());
                }
            }
            else
            {
		JOptionPane.showMessageDialog(null, "Operacion Cancelada");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Favor seleccione los asientos","AVISO",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnRegresar;
    public static javax.swing.JLabel LbNumeroAsientos;
    private javax.swing.JLabel LbPantallaIma;
    private javax.swing.JTextField TxtPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelVistaAsientos;
    // End of variables declaration//GEN-END:variables
}

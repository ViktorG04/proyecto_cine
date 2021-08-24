
package Ventanas;

import Clases.HoraCartelera;
import Clases.Peliculas;
import Clases.Salas;
import Clases.conectar;

import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class V1SeleccionPelicula extends javax.swing.JInternalFrame 
{
    //llamando clase conectar
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    

    
    public V1SeleccionPelicula()
    {
        initComponents();
        
        //llamado de clase pelicula para poblar comobox peliculas
        Peliculas cc = new Peliculas();
        DefaultComboBoxModel llamadopeliculas = new DefaultComboBoxModel(cc.mostrarPeliculas());
        
        CbPelicula.setModel(llamadopeliculas);  
        BtnSiguiente.setVisible(false);
        LbHora.setVisible(false);
        CbHora.setVisible(false);
        LbSalaN.setVisible(false);
        CbSalaN.setVisible(false);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LbPelicula = new javax.swing.JLabel();
        CbPelicula = new javax.swing.JComboBox<>();
        LbSalaN = new javax.swing.JLabel();
        CbSalaN = new javax.swing.JComboBox<>();
        LbHora = new javax.swing.JLabel();
        CbHora = new javax.swing.JComboBox<>();
        jPanelDetaAsientos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LbNuAsiDispo = new javax.swing.JLabel();
        TxtNuAsiDispo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtNuAsiOcu = new javax.swing.JTextField();
        jPanelDescripPeli = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LbDuracion = new javax.swing.JLabel();
        LbFormato = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        TxtClasificacion = new javax.swing.JTextField();
        TxtFormato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtIdioma = new javax.swing.JTextField();
        LbGenero = new javax.swing.JLabel();
        TxtGenero = new javax.swing.JTextField();
        LbClasificacion = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        BtnSiguiente = new javax.swing.JButton();
        LbImagenPortada = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("SELECCION DE PELICULA");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("SELECCION DE PELICULAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(360, 360, 360))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LbPelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPelicula.setText("Pelicula:");

        CbPelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbPelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbPeliculaItemStateChanged(evt);
            }
        });

        LbSalaN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbSalaN.setText("Sala Nº:");

        CbSalaN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbSalaN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbSalaNItemStateChanged(evt);
            }
        });

        LbHora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbHora.setText("Hora:");

        CbHora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbHoraItemStateChanged(evt);
            }
        });

        jPanelDetaAsientos.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(0, 51, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("DETALLE DE ASIENTOS");

        LbNuAsiDispo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbNuAsiDispo.setText("Nº Asientos Disponibles:");

        TxtNuAsiDispo.setEditable(false);
        TxtNuAsiDispo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtNuAsiDispo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("N° Asientos Ocupados:");

        TxtNuAsiOcu.setEditable(false);
        TxtNuAsiOcu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtNuAsiOcu.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelDetaAsientosLayout = new javax.swing.GroupLayout(jPanelDetaAsientos);
        jPanelDetaAsientos.setLayout(jPanelDetaAsientosLayout);
        jPanelDetaAsientosLayout.setHorizontalGroup(
            jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetaAsientosLayout.createSequentialGroup()
                .addGroup(jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetaAsientosLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4))
                    .addGroup(jPanelDetaAsientosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(LbNuAsiDispo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtNuAsiOcu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(TxtNuAsiDispo))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelDetaAsientosLayout.setVerticalGroup(
            jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetaAsientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtNuAsiOcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanelDetaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNuAsiDispo)
                    .addComponent(TxtNuAsiDispo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 150, Short.MAX_VALUE))
        );

        jPanelDescripPeli.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("DESCRIPCION DE LA PELICULA");

        LbDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbDuracion.setText("Duración:");

        LbFormato.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbFormato.setText("Formato:");

        TxtDuracion.setEditable(false);
        TxtDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TxtClasificacion.setEditable(false);
        TxtClasificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TxtFormato.setEditable(false);
        TxtFormato.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Idioma:");

        TxtIdioma.setEditable(false);
        TxtIdioma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LbGenero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbGenero.setText("Género:");

        TxtGenero.setEditable(false);
        TxtGenero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LbClasificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbClasificacion.setText("Clasificación:");

        javax.swing.GroupLayout jPanelDescripPeliLayout = new javax.swing.GroupLayout(jPanelDescripPeli);
        jPanelDescripPeli.setLayout(jPanelDescripPeliLayout);
        jPanelDescripPeliLayout.setHorizontalGroup(
            jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDescripPeliLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
            .addGroup(jPanelDescripPeliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbGenero)
                    .addComponent(LbClasificacion)
                    .addComponent(LbDuracion)
                    .addComponent(LbFormato)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(TxtIdioma)
                    .addComponent(TxtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(TxtDuracion)
                    .addComponent(TxtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelDescripPeliLayout.setVerticalGroup(
            jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescripPeliLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbDuracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbClasificacion))
                .addGap(24, 24, 24)
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbFormato)
                    .addComponent(TxtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelDescripPeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnSiguiente.setText("SIGUIENTE");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(LbPelicula)
                        .addGap(18, 18, 18)
                        .addComponent(CbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(LbHora)
                        .addGap(27, 27, 27)
                        .addComponent(CbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LbImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelDescripPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente))
                    .addComponent(jPanelDetaAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbSalaN)
                        .addGap(29, 29, 29)
                        .addComponent(CbSalaN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPelicula)
                    .addComponent(CbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbHora)
                    .addComponent(CbSalaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbSalaN)
                    .addComponent(CbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LbImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jPanelDescripPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanelDetaAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSiguiente)
                            .addComponent(BtnSalir))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
      
      V2DatosCliente Venta2 = new V2DatosCliente();
      JDesktopPane x = this.getDesktopPane();
      x.add(Venta2);
      Venta2.setVisible(true);
      dispose();
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void CbPeliculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbPeliculaItemStateChanged
        
        InputStream is = null;
        ImageIcon foto = null;
        
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            Peliculas peli = (Peliculas) CbPelicula.getSelectedItem();
            
            String sql="SELECT Duracion_pelicula, Genero_pelicula, Clasificacion_pelicula, Formato_pelicula, Idioma_pelicula, Portada_pelicula FROM peliculas WHERE Cod_pelicula ="+peli.getId();
        
            try
            {
                Statement st = cn.createStatement();
                
                ResultSet rs = st.executeQuery(sql);
           
                while(rs.next())
                {       
                    TxtDuracion.setText(rs.getString("Duracion_pelicula"));
                    TxtGenero.setText(rs.getString("Genero_pelicula"));
                    TxtClasificacion.setText(rs.getString("Clasificacion_pelicula"));
                    TxtFormato.setText(rs.getString("Formato_pelicula"));
                    TxtIdioma.setText(rs.getString("Idioma_pelicula"));
                    is = rs.getBinaryStream(6);
                    BufferedImage b1 = ImageIO.read(is);
                    foto = new ImageIcon(b1.getScaledInstance(250, 400, 400));
                    LbImagenPortada.setIcon(foto);
                    LbHora.setVisible(true);
                    CbHora.setVisible(true);
                }
            }
            catch(SQLException ex)
            {
                Logger.getLogger(V1SeleccionPelicula.class.getName()).log(Level.SEVERE, null, ex);
            }   
            catch (IOException ej) 
            {
                Logger.getLogger(V1SeleccionPelicula.class.getName()).log(Level.SEVERE, null, ej);
            }
            //Codigo para poblar combobox de hora cartelera
            HoraCartelera hora = new HoraCartelera();
            DefaultComboBoxModel llamadohora = new DefaultComboBoxModel(hora.mostrarHorarioDisponible(peli.getId()));
            CbHora.setModel(llamadohora);
        }
    }//GEN-LAST:event_CbPeliculaItemStateChanged
    
    private void CbHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbHoraItemStateChanged
        //Codigo para poblar combobox de sala y detalles
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            HoraCartelera hora = (HoraCartelera) CbHora.getSelectedItem();
        
            Salas numerosala = new Salas();
            DefaultComboBoxModel llamadosala = new DefaultComboBoxModel(numerosala.mostrarSalas(hora.getId()));
            LbSalaN.setVisible(true);
            CbSalaN.setVisible(true);
            CbSalaN.setModel(llamadosala);
        }
    }//GEN-LAST:event_CbHoraItemStateChanged

    private void CbSalaNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbSalaNItemStateChanged
       //eventos al seleccionar el combobox sala
        String IDCartelera = null;
        String asientosocupados =null;
        int AsientosOcupados =0;
        int AsientosDisponibles;
        int contador=0;
        
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            HoraCartelera hora = (HoraCartelera) CbHora.getSelectedItem();
            
            String sql="SELECT Cod_Cartelera, AsientosVendidos_Cartelera FROM cartelera WHERE Cod_cartelera="+hora.getId();
            try
            {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
           
                while(rs.next())
                {   
                    asientosocupados = rs.getString("AsientosVendidos_cartelera");
                    IDCartelera = rs.getString("Cod_Cartelera");
                } 
                
                if(asientosocupados.equals("0"))
                {
                    AsientosOcupados=0;
                    AsientosDisponibles=70;
                    
                }
                else
                {
                    String[] arrayAsientoOcupados = asientosocupados.split(",");
                
                    for (contador= 0; contador < arrayAsientoOcupados.length; contador++) 
                    {
                    }
                    AsientosOcupados+=contador;
                    AsientosDisponibles=70-AsientosOcupados;
                }
                
                TxtNuAsiOcu.setText(String.valueOf(AsientosOcupados));
                TxtNuAsiDispo.setText(String.valueOf(AsientosDisponibles));
                
                V3SeleccionAsientos Venta3 = new V3SeleccionAsientos(IDCartelera);
            }
            catch(SQLException ex)
            {
                Logger.getLogger(V1SeleccionPelicula.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            BtnSiguiente.setVisible(true);

        
        }
    }//GEN-LAST:event_CbSalaNItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JComboBox<String> CbHora;
    private javax.swing.JComboBox<String> CbPelicula;
    private javax.swing.JComboBox<String> CbSalaN;
    private javax.swing.JLabel LbClasificacion;
    private javax.swing.JLabel LbDuracion;
    private javax.swing.JLabel LbFormato;
    private javax.swing.JLabel LbGenero;
    private javax.swing.JLabel LbHora;
    private javax.swing.JLabel LbImagenPortada;
    private javax.swing.JLabel LbNuAsiDispo;
    private javax.swing.JLabel LbPelicula;
    private javax.swing.JLabel LbSalaN;
    private javax.swing.JTextField TxtClasificacion;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtFormato;
    private javax.swing.JTextField TxtGenero;
    private javax.swing.JTextField TxtIdioma;
    private javax.swing.JTextField TxtNuAsiDispo;
    private javax.swing.JTextField TxtNuAsiOcu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDescripPeli;
    private javax.swing.JPanel jPanelDetaAsientos;
    // End of variables declaration//GEN-END:variables
}

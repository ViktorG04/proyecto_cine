package Ventanas;

import Clases.Asientos;
import Clases.HoraCartelera;
import Clases.Peliculas;
import Clases.Salas;
import Clases.conectar;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Ver_Salas extends javax.swing.JInternalFrame 
{

    //llamando clase conectar
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
   // String IDCartelera = null;
    int filas = 7;
    int columnas = 10;
    Asientos[][] Botones = new Asientos[filas][columnas];

    public Ver_Salas() 
    {
        initComponents();

        //llamado de clase VistaSala para poblar combobox Salas
        Salas cc = new Salas();
        DefaultComboBoxModel salas = new DefaultComboBoxModel(cc.VistaSalas());
        CbSalas.setModel(salas);
        bloquear();

    }

    public void bloquear() 
    {
        LbPelicula.setVisible(false);
        CbPelicula.setVisible(false);
        CbHora.setVisible(false);
        LbHora.setVisible(false);
        LbPantallaIma.setVisible(false);
        BtnLimpiar.setVisible(false);
        jPanelVistaAsientos.setVisible(false);
    }

    public void AsientosBotones(String IDCartelera) 
    {
        String sql = "SELECT AsientosVendidos_Cartelera FROM cartelera WHERE Cod_cartelera="+IDCartelera;
        
        String asientosocupados="";
        List<String> ArryAsientos = new ArrayList<String>();
        //contador sirve para comparar el estado de los asientos
        int contador=0;
        ImageIcon Asiento = null;
        int estadoAsiento = 0;
        
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

            //System.out.println(ArryAsientos);
            for (int i = 0; i < filas; i++) 
            {
                for (int j = 0; j < columnas; j++) 
                {
                    contador++;
                    if (ArryAsientos.size() > 0) 
                    {

                        if (ArryAsientos.contains(String.valueOf(contador))) // el numero actual del contador esta dentro del array de asientos vendidos?
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

                    Botones[i][j] = new Asientos(70 * j, 50 * i, 40, 40, estadoAsiento);
                    Botones[i][j].setIcon(Asiento);

                    jPanelVistaAsientos.add(Botones[i][j]);

                }
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Ver_Salas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LbPelicula = new javax.swing.JLabel();
        CbPelicula = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CbSalas = new javax.swing.JComboBox<>();
        LbHora = new javax.swing.JLabel();
        CbHora = new javax.swing.JComboBox<>();
        LbPantallaIma = new javax.swing.JLabel();
        jPanelVistaAsientos = new javax.swing.JPanel();
        BtnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VISTA DE SALAS");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        LbPelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPelicula.setText("Pelicula:");

        CbPelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbPelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbPeliculaItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Sala:");

        CbSalas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbSalas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbSalasItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(LbPelicula)
                .addGap(18, 18, 18)
                .addComponent(CbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(LbHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbPelicula)
                    .addComponent(CbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbHora)
                    .addComponent(CbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        LbPantallaIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cine.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanelVistaAsientosLayout = new javax.swing.GroupLayout(jPanelVistaAsientos);
        jPanelVistaAsientos.setLayout(jPanelVistaAsientosLayout);
        jPanelVistaAsientosLayout.setHorizontalGroup(
            jPanelVistaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        jPanelVistaAsientosLayout.setVerticalGroup(
            jPanelVistaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelVistaAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbPantallaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLimpiar)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LbPantallaIma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelVistaAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbSalasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbSalasItemStateChanged
       
        if (evt.getStateChange() == ItemEvent.SELECTED) 
        {
            Salas vista = (Salas) CbSalas.getSelectedItem();

            Peliculas peli = new Peliculas();

            DefaultComboBoxModel llamadopelicula = new DefaultComboBoxModel(peli.VistaPeliculas(vista.getId()));
            LbPelicula.setVisible(true);
            CbPelicula.setVisible(true);
            CbPelicula.setModel(llamadopelicula);
        }
    }//GEN-LAST:event_CbSalasItemStateChanged

    private void CbPeliculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbPeliculaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) 
        {
            Peliculas peli = (Peliculas) CbPelicula.getSelectedItem();
            
            //Codigo para poblar combobox de hora cartelera
            HoraCartelera hora = new HoraCartelera();
            DefaultComboBoxModel llamadohora = new DefaultComboBoxModel(hora.mostrarHorarioDisponible(peli.getId()));
             LbHora.setVisible(true);
             CbHora.setVisible(true);
            CbHora.setModel(llamadohora);
        }
    }//GEN-LAST:event_CbPeliculaItemStateChanged

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        bloquear();
       String  IDCartelera1="";
        jPanelVistaAsientos.removeAll();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void CbHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbHoraItemStateChanged
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            HoraCartelera hora = (HoraCartelera) CbHora.getSelectedItem();
            LbPantallaIma.setVisible(true);
        jPanelVistaAsientos.setVisible(true);
       
        BtnLimpiar.setVisible(true);
            AsientosBotones(String.valueOf(hora.getId()));
            
        }
    }//GEN-LAST:event_CbHoraItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JComboBox<String> CbHora;
    private javax.swing.JComboBox<String> CbPelicula;
    private javax.swing.JComboBox<String> CbSalas;
    private javax.swing.JLabel LbHora;
    private javax.swing.JLabel LbPantallaIma;
    private javax.swing.JLabel LbPelicula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelVistaAsientos;
    // End of variables declaration//GEN-END:variables
}

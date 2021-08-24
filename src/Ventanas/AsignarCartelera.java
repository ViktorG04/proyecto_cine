
package Ventanas;

import Clases.Peliculas;
import Clases.conectar;
import Clases.Confirmacion;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AsignarCartelera extends javax.swing.JInternalFrame 
{
    
    //Conexion de base datos
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    //LLamando tabla
    DefaultTableModel tabla;
    //ID para modificar una fila de la tabla
    String idfila="";
    String Respuesta="";
    ImageIcon foto; 
    String strRespuesta="";
    
    
    public AsignarCartelera() 
    {
        initComponents();
        MostrarPeliculas();
        ComboPoblarSala();
        BtnGuardar.setVisible(false);
        
        //llamado de clase pelicula para poblar comboBox peliculas
        Peliculas cc = new Peliculas();
        DefaultComboBoxModel llamadopeliculas = new DefaultComboBoxModel(cc.PeliculasACartelera());
        CbPelicula.setModel(llamadopeliculas);
        CbPelicula.setSelectedIndex(0);
        
    }
    
    
    //se realiza directamente porque no hay necesidad de crear un vector
    void ComboPoblarSala()
    {
        String sql = "SELECT * FROM sala";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            CbSala.addItem("Seleccione:");
            
            while(rs.next()) 
            {
                CbSala.addItem(rs.getString("Numero_Sala"));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
   void MostrarPeliculas()
    {
        String [] titulos= {"CODIGO", "SALA", "PELICULA", "DURACION", "HORA INICIO", "HORA FIN", "IDIOMA"};
        tabla=new  DefaultTableModel(null,titulos);   
        String datos []= new String[7];
         String sql="SELECT Cod_cartelera, Numero_Sala, Titulo_pelicula, Duracion_pelicula, Horainicio_cartelera, Horafin_cartelera, Idioma_pelicula  FROM `cartelera`, `peliculas`, `sala` where cartelera.Cod_pelicula_cartelera = peliculas.Cod_pelicula and cartelera.Cod_sala_cartelera = sala.Cod_Sala"; 
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                datos[0]=rs.getString("Cod_cartelera");
                datos[1]=rs.getString("Numero_sala");
                datos[2]= rs.getString("Titulo_pelicula");
                datos[3]= rs.getString("Duracion_pelicula");
                datos[4]=rs.getString("Horainicio_cartelera");
                datos[5]=rs.getString("Horafin_cartelera");
                datos[6]=rs.getString("Idioma_pelicula");
                tabla.addRow(datos);
            }
            TbCartelera.setModel(tabla);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAsignar = new javax.swing.JPanel();
        LbSala = new javax.swing.JLabel();
        CbSala = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CbPelicula = new javax.swing.JComboBox<>();
        LbDuracion = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        LbHoraInicio = new javax.swing.JLabel();
        TxtHoraInicio = new javax.swing.JTextField();
        LbHoraFin = new javax.swing.JLabel();
        TxtHoraFin = new javax.swing.JTextField();
        BtnValidarhora = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        LbAsigCar = new javax.swing.JLabel();
        LbPortada = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TbCartelera = new javax.swing.JTable();
        BtnEliCarte = new javax.swing.JButton();
        LbImagenPortada = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("AGREGAR CARTELERA");

        jPanelAsignar.setBackground(new java.awt.Color(102, 102, 102));

        LbSala.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbSala.setText("Sala:");

        CbSala.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Pelicula:");

        CbPelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbPelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbPeliculaItemStateChanged(evt);
            }
        });

        LbDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbDuracion.setText("Duración:");

        TxtDuracion.setEditable(false);
        TxtDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LbHoraInicio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbHoraInicio.setText("Hora Inicio:");

        TxtHoraInicio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtHoraInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHoraInicioKeyTyped(evt);
            }
        });

        LbHoraFin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbHoraFin.setText("Hora Fin:");

        TxtHoraFin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtHoraFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHoraFinKeyTyped(evt);
            }
        });

        BtnValidarhora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnValidarhora.setText("Validar Hora");
        BtnValidarhora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnValidarhora.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BtnValidarhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidarhoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsignarLayout = new javax.swing.GroupLayout(jPanelAsignar);
        jPanelAsignar.setLayout(jPanelAsignarLayout);
        jPanelAsignarLayout.setHorizontalGroup(
            jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbHoraInicio)
                    .addComponent(LbDuracion)
                    .addComponent(LbHoraFin)
                    .addComponent(jLabel2)
                    .addComponent(LbSala))
                .addGap(18, 18, 18)
                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAsignarLayout.createSequentialGroup()
                        .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtHoraFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(TxtDuracion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtHoraInicio, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(BtnValidarhora, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CbSala, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAsignarLayout.setVerticalGroup(
            jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsignarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbSala))
                .addGap(27, 27, 27)
                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbDuracion)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAsignarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAsignarLayout.createSequentialGroup()
                                .addComponent(LbHoraInicio)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelAsignarLayout.createSequentialGroup()
                                .addComponent(TxtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(jPanelAsignarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbHoraFin))))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsignarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnValidarhora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );

        BtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        LbAsigCar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbAsigCar.setText("Asignar Cartelera");

        LbPortada.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPortada.setText("Portada");

        TbCartelera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TbCartelera);

        BtnEliCarte.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnEliCarte.setText("Eliminar Cartelera");
        BtnEliCarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliCarteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliCarte)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LbAsigCar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbPortada)
                                    .addComponent(LbImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbAsigCar)
                    .addComponent(LbPortada))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LbImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnEliCarte)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
              
        CbSala.setSelectedIndex(0);
        CbPelicula.setSelectedItem(0);
        TxtDuracion.setText(null);
        TxtHoraInicio.setText(null);
        TxtHoraFin.setText(null);
        LbImagenPortada.setIcon(null);
        BtnGuardar.setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

       Peliculas peli = (Peliculas) CbPelicula.getSelectedItem();
       
       int vacio=0;
       
            String ins="INSERT INTO cartelera (Cod_pelicula_cartelera, Cod_sala_cartelera, Horainicio_cartelera, horafin_cartelera,AsientosVendidos_Cartelera) VALUES(?,?,?,?,?)";      
       
            try 
            {
                PreparedStatement pst = cn.prepareStatement(ins);
            
                pst.setString(1, String.valueOf(peli.getId()));
                pst.setString(2, CbSala.getSelectedItem().toString());
                pst.setString(3, TxtHoraInicio.getText());
                pst.setString(4, TxtHoraFin.getText());
                pst.setString(5, String.valueOf(vacio));
           
                int n= pst.executeUpdate();
            
                if(n>0)
                {
                    JOptionPane.showMessageDialog(this, "Se guardaron los datos");
                
                    CbSala.setSelectedIndex(0);
                    CbPelicula.setSelectedIndex(0);
                    TxtDuracion.setText(null);
                    TxtHoraInicio.setText(null);
                    TxtHoraFin.setText(null);
                    LbImagenPortada.setIcon(null);
                    MostrarPeliculas();
                    BtnGuardar.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos");
                }
            
            
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliCarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliCarteActionPerformed
        strRespuesta = Clases.Confirmacion.strPreguntaSiNo("Desea Eliminar la Cartelera");
        
        if(strRespuesta.equals("SI"))
        {
        
            int fila= TbCartelera.getSelectedRow();
        
            if(fila>-1)
            {
                String cod=TbCartelera.getValueAt(fila, 0).toString();
                String sqlElim="DELETE FROM cartelera WHERE Cod_cartelera='"+cod+"'";
            
                try 
                {
                    PreparedStatement pst = cn.prepareStatement(sqlElim);
                    int n=pst.executeUpdate();
                    if(n>0)
                    {
                    
                        JOptionPane.showMessageDialog(null, "Los datos fueron eliminados con exito");
                        MostrarPeliculas();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Hubo Problemas al querer eliminar datos");
                    }
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
	else
	{
            JOptionPane.showMessageDialog(null, "Operacion Cancelada");
	}
    }//GEN-LAST:event_BtnEliCarteActionPerformed

    private void BtnValidarhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarhoraActionPerformed
        
        if("Seleccione:".equals(CbSala.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null, "Seleccione una sala", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if(TxtDuracion.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe Seleccionar una pelicula", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if(TxtHoraInicio.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese una hora inicial", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if(TxtHoraFin.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese una hora final", "error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        
            String validar="SELECT count(*) as resultado FROM cartelera "
                + " WHERE (Horainicio_cartelera BETWEEN '"+TxtHoraInicio.getText()+ "' AND '"+TxtHoraFin.getText()+"')"
                + " AND (Cod_sala_cartelera ='"+CbSala.getSelectedItem().toString()+"')";
        
            try
            {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(validar);
           
                if(rs.next())
                {     
                    int n;
                    
                    n = rs.getInt("resultado");
                        
                    if(n>0)
                    {
                        JOptionPane.showMessageDialog(null, "La hora se cruza con otra, Porfavor cambie la Hora de Inicio");
                        BtnGuardar.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Hora Correcta");
                        BtnGuardar.setVisible(true);
                    }
                }
            }
            catch(SQLException ex)
            {
                Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BtnValidarhoraActionPerformed

    private void CbPeliculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbPeliculaItemStateChanged
           
        InputStream is = null;
        ImageIcon foto = null;
        
        
        if(evt.getStateChange()== ItemEvent.SELECTED)
        {
            Peliculas peli = (Peliculas) CbPelicula.getSelectedItem();
            
                String sql="SELECT Duracion_pelicula, Portada_pelicula FROM peliculas WHERE Cod_pelicula ="+peli.getId();
        
                try
                {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
           
                    while(rs.next())
                    {       

                        TxtDuracion.setText(rs.getString("Duracion_pelicula"));
                        is = rs.getBinaryStream(2);
                        BufferedImage b1 = ImageIO.read(is);
                        foto = new ImageIcon(b1.getScaledInstance(250, 400, 400));
                        LbImagenPortada.setIcon(foto);
                    }
                }
                catch(SQLException ex)
                {
                    Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
                }   
                catch (IOException ex) 
                {
                    Logger.getLogger(AsignarCartelera.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_CbPeliculaItemStateChanged

    private void TxtHoraInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHoraInicioKeyTyped
         char car = evt.getKeyChar();
        if(TxtHoraInicio.getText().length()>=8) evt.consume();
        if((car<'0' || car>'9') && (car<':' || car>':')) evt.consume();
    }//GEN-LAST:event_TxtHoraInicioKeyTyped

    private void TxtHoraFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHoraFinKeyTyped
         char car = evt.getKeyChar();
        if(TxtHoraFin.getText().length()>=8) evt.consume();
        if((car<'0' || car>'9') && (car<':' || car>':')) evt.consume();
    }//GEN-LAST:event_TxtHoraFinKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliCarte;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnValidarhora;
    private javax.swing.JComboBox<String> CbPelicula;
    private javax.swing.JComboBox<String> CbSala;
    private javax.swing.JLabel LbAsigCar;
    private javax.swing.JLabel LbDuracion;
    private javax.swing.JLabel LbHoraFin;
    private javax.swing.JLabel LbHoraInicio;
    private javax.swing.JLabel LbImagenPortada;
    private javax.swing.JLabel LbPortada;
    private javax.swing.JLabel LbSala;
    private javax.swing.JTable TbCartelera;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtHoraFin;
    private javax.swing.JTextField TxtHoraInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelAsignar;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

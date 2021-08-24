
package Ventanas;

import Clases.conectar;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MantenimientoPeliculas extends javax.swing.JInternalFrame 
{

      //Conexion de base datos
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    String strRespuesta="";
    
  
    public MantenimientoPeliculas() 
    {
        initComponents();
        bloquear();
        Agregarlista();
        
    }

    void bloquear()
    {
        TxtTitulo.setEnabled(false);
        TxtDuracion.setEnabled(false);
        CbGenero.setEnabled(false);
        CbClasificacion.setEnabled(false);
        CbFormato.setEnabled(false);
        CbIdioma.setEnabled(false);
        BtnBuscarPortada.setEnabled(false);
        BtnEliminar.setVisible(false);
        BtnActualizar.setVisible(false);
        
    }
    
    void desbloquear()
    {
        TxtTitulo.setEnabled(true);
        TxtDuracion.setEnabled(true);
        CbGenero.setEnabled(true);
        CbClasificacion.setEnabled(true);
        CbFormato.setEnabled(true);
        CbIdioma.setEnabled(true);
        BtnBuscarPortada.setEnabled(true);
        BtnEliminar.setVisible(true);
        BtnActualizar.setVisible(true);
    }
    
    void Agregarlista()
    {
        DefaultListModel peliculas = new DefaultListModel();
        LbListaPeliculas.setModel(peliculas);
        
        String sql1 = "SELECT * FROM peliculas";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            
            while(rs.next())
            {
                peliculas.addElement(rs.getString("Titulo_pelicula"));  
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
      
        }
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LbListaPeliculas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JTextField();
        LbDuracion = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LbFormato = new javax.swing.JLabel();
        CbFormato = new javax.swing.JComboBox<>();
        LbPortada = new javax.swing.JLabel();
        BtnBuscarPortada = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        TxtRutaImagen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CbIdioma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CbClasificacion = new javax.swing.JComboBox<>();
        CbGenero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TxtIDpelicula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        LbImagenPortada = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BtnCargar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MANTENIMIENTO PELICULAS");
        setToolTipText("");

        LbListaPeliculas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jScrollPane1.setViewportView(LbListaPeliculas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Lista de Peliculas");

        jPanelDatos.setBackground(new java.awt.Color(102, 102, 102));

        LbTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbTitulo.setText("Titulo:");

        TxtTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LbDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbDuracion.setText("Duracíon:");

        TxtDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Clasificación:");

        LbFormato.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbFormato.setText("Formato:");

        CbFormato.setEditable(true);
        CbFormato.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));

        LbPortada.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbPortada.setText("Portada:");

        BtnBuscarPortada.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnBuscarPortada.setText("Examinar");
        BtnBuscarPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarPortadaActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        TxtRutaImagen.setEditable(false);
        TxtRutaImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Ruta Imagen:");

        CbIdioma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Idioma:");

        CbClasificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));

        CbGenero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("ID:");

        TxtIDpelicula.setEditable(false);
        TxtIDpelicula.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(LbTitulo)
                    .addComponent(LbDuracion)
                    .addComponent(jLabel3)
                    .addComponent(LbFormato)
                    .addComponent(jLabel6)
                    .addComponent(LbPortada)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(TxtIDpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtRutaImagen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CbIdioma, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE))
                            .addComponent(CbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscarPortada)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtDuracion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CbGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BtnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEliminar)
                .addGap(45, 45, 45))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtIDpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbTitulo)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbDuracion))
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbFormato))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnBuscarPortada)
                            .addComponent(LbPortada))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnEliminar)
                            .addComponent(BtnActualizar))
                        .addGap(126, 126, 126))))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Datos de la Pelicula");

        BtnEditar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Portada");

        BtnCargar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnCargar.setText("Cargar");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnCargar)
                        .addGap(48, 48, 48)
                        .addComponent(BtnEditar)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(LbImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbImagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnEditar)
                            .addComponent(BtnCargar)))
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGap(57, 57, Short.MAX_VALUE))
        );

        LbImagenPortada.getAccessibleContext().setAccessibleParent(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        desbloquear();
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        strRespuesta = Clases.Confirmacion.strPreguntaSiNo("Desea Actualizar los datos");
        
        if(strRespuesta.equals("SI"))
        {
            try
            {
                FileInputStream  archivofoto;
                File nombre= new File(TxtRutaImagen.getText());
                archivofoto = new FileInputStream(nombre);
            
                String sql="UPDATE peliculas SET Titulo_pelicula = ?,Duracion_pelicula = ?,Genero_pelicula = ?,Clasificacion_pelicula = ?,"
                     + "Formato_pelicula = ?,Idioma_pelicula = ?,RutaImagen_pelicula = ?,Portada_pelicula = ? WHERE Cod_pelicula = ?"; 

                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1,TxtTitulo.getText());
                pst.setString(2, TxtDuracion.getText());
                pst.setString(3, CbGenero.getSelectedItem().toString());
                pst.setString(4, CbClasificacion.getSelectedItem().toString());
                pst.setString(5, CbFormato.getSelectedItem().toString());
                pst.setString(6, CbIdioma.getSelectedItem().toString());
                //necesitamos conocer la ruta para guardarlo en la base
                pst.setString(7, TxtRutaImagen.getText());
                archivofoto = new FileInputStream(TxtRutaImagen.getText());
                pst.setBinaryStream(8, archivofoto);
                pst.setString(9,TxtIDpelicula.getText() );
           
                int n= pst.executeUpdate();
            
                 if(n>0)
                {
                    JOptionPane.showMessageDialog(this, "Datos actualizados con exito");
                
                    TxtIDpelicula.setText(null);
                    TxtTitulo.setText(null);
                    TxtDuracion.setText(null);
                    CbGenero.setSelectedIndex(0);
                    CbClasificacion.setSelectedIndex(0);
                    CbFormato.setSelectedIndex(0);
                    CbIdioma.setSelectedIndex(0);
                    TxtRutaImagen.setText(null);
                    LbImagenPortada.setIcon(null);
                    bloquear();
                    Agregarlista();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Hubo un error en el momento de actualizar los datos");
                }
            }
            catch (SQLException ex) 
            {
                Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	else
	{
            JOptionPane.showMessageDialog(null, "Operacion Cancelada");
	}    
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        strRespuesta = Clases.Confirmacion.strPreguntaSiNo("Desea Eliminar la Pelicula");
        
        if(strRespuesta.equals("SI"))
        {
            String elim = "DELETE FROM peliculas WHERE Cod_pelicula= '"+ TxtIDpelicula.getText()+"'";
        
            try 
            {
                PreparedStatement pst = cn.prepareStatement(elim);
                int n=pst.executeUpdate();
                if(n>0)
                {
                     JOptionPane.showMessageDialog(null, "Los datos fueron eliminados con exito");
                     TxtIDpelicula.setText(null);
                     TxtTitulo.setText(null);
                     TxtDuracion.setText(null);
                     CbGenero.setSelectedIndex(0);
                     CbClasificacion.setSelectedIndex(0);
                     CbFormato.setSelectedIndex(0);
                     CbIdioma.setSelectedIndex(0);
                     TxtRutaImagen.setText(null);
                     LbImagenPortada.setIcon(null);
                     bloquear();
                     Agregarlista();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Hubo Problemas al querer eliminar datos");
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	else
	{
		JOptionPane.showMessageDialog(null, "Operacion Cancelada");
	}
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarPortadaActionPerformed
        // Creamos un objeto para usar todos los metodos de la clase jFileChooser
        JFileChooser archivo = new JFileChooser();
        
        archivo.setDialogTitle("Abrir Archivo");
        //Ruta por defecto
         File ruta = new File("C:\\Portadas peliculas");
         archivo.setCurrentDirectory(ruta);
         
         //abrir nuestra ventana por defecto segun la ruta
        int ventana = archivo.showOpenDialog(null);
        
        if(ventana == JFileChooser.APPROVE_OPTION)
        {
            //Agregar la ruta de la imagen
            File file = archivo.getSelectedFile();
            TxtRutaImagen.setText(String.valueOf(file));
            
            //Creamos una variable foto para cargar la foto
             Image foto= getToolkit().getImage(TxtRutaImagen.getText());
             foto= foto.getScaledInstance(300, 400, Image.SCALE_DEFAULT);
             
            //visualizamos la foto
             LbImagenPortada.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_BtnBuscarPortadaActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        
        ImageIcon foto = null;
        InputStream is = null;
        String nombreSeleccion= LbListaPeliculas.getSelectedValue();

        String sql = "SELECT Cod_pelicula, Titulo_pelicula, Duracion_pelicula, Genero_pelicula, Clasificacion_pelicula, Formato_pelicula, "
                + "Idioma_pelicula, RutaImagen_pelicula, Portada_pelicula FROM peliculas WHERE Titulo_pelicula = '"+nombreSeleccion+"'";
        
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String genero_principal = "";
            String clasificacion_principal = "";
            String formato_principal = "";
            String idioma_principal = "";
              
              CbGenero.removeAllItems();
              CbClasificacion.removeAllItems();
              CbFormato.removeAllItems();
              CbIdioma.removeAllItems();
            
            while(rs.next())
            {
                
               TxtIDpelicula.setText(rs.getString("Cod_pelicula"));
               TxtTitulo.setText(rs.getString("Titulo_pelicula"));
               TxtDuracion.setText(rs.getString("Duracion_pelicula"));
               CbGenero.addItem(rs.getString("Genero_pelicula"));
               genero_principal = rs.getString("Genero_pelicula");
               CbClasificacion.addItem(rs.getString("Clasificacion_pelicula"));
               clasificacion_principal = rs.getString("Clasificacion_pelicula");
               CbFormato.addItem(rs.getString("Formato_pelicula"));
               formato_principal = rs.getString("Formato_pelicula");
               CbIdioma.addItem(rs.getString("Idioma_pelicula"));
               idioma_principal = rs.getString("Idioma_pelicula");
               TxtRutaImagen.setText( rs.getString("RutaImagen_pelicula"));
               
              is = rs.getBinaryStream(9);
              BufferedImage b1 = ImageIO.read(is);
              
              foto = new ImageIcon(b1.getScaledInstance(250, 400, 400));
              
              LbImagenPortada.setIcon(foto);
            }
            
            st = cn.createStatement();
            String sql2 = "SELECT Genero_pelicula FROM `peliculas` WHERE Genero_pelicula != '"+genero_principal+"' GROUP BY Genero_pelicula";
            rs = st.executeQuery(sql2);
             while(rs.next())
            {
                   CbGenero.addItem(rs.getString("Genero_pelicula"));
            }
             
             st = cn.createStatement();
            String sql3 = "SELECT Clasificacion_pelicula FROM `peliculas` WHERE Clasificacion_pelicula != '"+clasificacion_principal+"' GROUP BY Clasificacion_pelicula";
            rs = st.executeQuery(sql3);
             while(rs.next())
            {
                   CbClasificacion.addItem(rs.getString("Clasificacion_pelicula"));
                   
            }
             
              st = cn.createStatement();
            String sql4 = "SELECT Formato_pelicula FROM `peliculas` WHERE Formato_pelicula != '"+formato_principal+"' GROUP BY Formato_pelicula";
            rs = st.executeQuery(sql4);
             while(rs.next())
            {
                   CbFormato.addItem(rs.getString("Formato_pelicula"));
                   
            }
             
              st = cn.createStatement();
            String sql5 = "SELECT Idioma_pelicula FROM `peliculas` WHERE Idioma_pelicula != '"+idioma_principal+"' GROUP BY Idioma_pelicula";
            rs = st.executeQuery(sql5);
             while(rs.next())
            {
                   CbIdioma.addItem(rs.getString("Idioma_pelicula"));
                   
            }
        } 
         catch (SQLException ex) 
        {
            Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnBuscarPortada;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JComboBox<String> CbClasificacion;
    private javax.swing.JComboBox<String> CbFormato;
    private javax.swing.JComboBox<String> CbGenero;
    private javax.swing.JComboBox<String> CbIdioma;
    private javax.swing.JLabel LbDuracion;
    private javax.swing.JLabel LbFormato;
    private javax.swing.JLabel LbImagenPortada;
    private javax.swing.JList<String> LbListaPeliculas;
    private javax.swing.JLabel LbPortada;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtIDpelicula;
    private javax.swing.JTextField TxtRutaImagen;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}


package Ventanas;

import Clases.conectar;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AgregarPelicula extends javax.swing.JInternalFrame 
{

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    public AgregarPelicula()
    {
        initComponents();
    }
    
    void limpiar()
    {
        TxtTitulo.setText(null);
        TxtDuracion.setText(null);
        CbGenero.setSelectedIndex(0);
        CbClasificacion.setSelectedIndex(0);
        CbFormato.setSelectedIndex(0);
        CbIdioma.setSelectedIndex(0);
        TxtRutaImagen.setText(null);
        LbImagenportada.setIcon(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatos = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JTextField();
        LbDuracion = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CbGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CbClasificacion = new javax.swing.JComboBox<>();
        LbFormato = new javax.swing.JLabel();
        CbFormato = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CbIdioma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TxtRutaImagen = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnExaminarIma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LbImagenportada = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("AGREGAR PELICULAS");
        setVisible(true);

        jPanelDatos.setBackground(new java.awt.Color(102, 102, 102));

        LbTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbTitulo.setText("Titulo:");

        TxtTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTituloKeyTyped(evt);
            }
        });

        LbDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbDuracion.setText("Duración:");

        TxtDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDuracionKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Genero:");

        CbGenero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Drama", "Comedia", "Acción", "Ciencia ficción", "Fantasía", "Terror", "Romance", "Musical", "Suspenso" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Clasificación:");

        CbClasificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A (Todo Público)", "B (Mayores de 12 años)", "C (Mayores de 15 años)", "D (Mayores de 18 años)" }));

        LbFormato.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbFormato.setText("Formato:");

        CbFormato.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "2D", "3D" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Idioma:");

        CbIdioma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Ingles Subtitulado", "Español latinoamerica" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Ruta Imagen:");

        TxtRutaImagen.setEditable(false);
        TxtRutaImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbFormato)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(LbDuracion)
                            .addComponent(LbTitulo)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TxtRutaImagen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CbIdioma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTitulo))
                .addGap(29, 29, 29)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbDuracion))
                .addGap(27, 27, 27)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbFormato)
                    .addComponent(CbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(353, 353, 353))
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

        BtnExaminarIma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnExaminarIma.setText("Examinar");
        BtnExaminarIma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExaminarImaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Portada");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnExaminarIma)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbImagenportada, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbImagenportada, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCancelar)
                            .addComponent(BtnExaminarIma))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
        if(TxtTitulo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese el Titulo de la pelicula", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if(TxtDuracion.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese la Duracion de la pelicula", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if("Seleccione:".equals(CbGenero.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null, "Seleccione un Genero", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if("Seleccione:".equals(CbClasificacion.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null, "Seleccione una Clasificacion", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if("Seleccione:".equals(CbFormato.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null, "Seleccione un Formato", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if("Seleccione:".equals(CbIdioma.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null, "Seleccione un Idioma", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if(TxtRutaImagen.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese una Portada con el boton EXAMINAR", "error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        
            String ins="INSERT INTO peliculas (Titulo_pelicula, Duracion_pelicula, Genero_pelicula, Clasificacion_pelicula, Formato_pelicula, Idioma_pelicula, RutaImagen_pelicula, Portada_pelicula) VALUES(?,?,?,?,?,?,?,?)";
            try 
            {
                FileInputStream  archivofoto;
                PreparedStatement pst = cn.prepareStatement(ins);
            
                pst.setString(1, TxtTitulo.getText());
                pst.setString(2, TxtDuracion.getText());
                pst.setString(3, CbGenero.getSelectedItem().toString());
                pst.setString(4, CbClasificacion.getSelectedItem().toString());
                pst.setString(5, CbFormato.getSelectedItem().toString());
                pst.setString(6, CbIdioma.getSelectedItem().toString());
                //necesitamos conocer la ruta para guardarlo en la base
                pst.setString(7, TxtRutaImagen.getText());
                archivofoto = new FileInputStream(TxtRutaImagen.getText());
                pst.setBinaryStream(8, archivofoto);
           
                int n= pst.executeUpdate();
            
                if(n>0)
                {
                    JOptionPane.showMessageDialog(this, "Pelicula agregada con exito");
                    limpiar();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error al agregar una pelicula");
                }
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(AgregarPelicula.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnExaminarImaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExaminarImaActionPerformed
       
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
             LbImagenportada.setIcon(new ImageIcon(foto));
        }
        
    }//GEN-LAST:event_BtnExaminarImaActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TxtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTituloKeyTyped
        char car = evt.getKeyChar();  
        if(TxtTitulo.getText().length()>=20) evt.consume();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
        evt.consume();
        }
    }//GEN-LAST:event_TxtTituloKeyTyped

    private void TxtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDuracionKeyTyped
        char car = evt.getKeyChar();
        if(TxtDuracion.getText().length()>=8) evt.consume();
        if((car<'0' || car>'9') && (car<':' || car>':')) evt.consume();
    }//GEN-LAST:event_TxtDuracionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnExaminarIma;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> CbClasificacion;
    private javax.swing.JComboBox<String> CbFormato;
    private javax.swing.JComboBox<String> CbGenero;
    private javax.swing.JComboBox<String> CbIdioma;
    private javax.swing.JLabel LbDuracion;
    private javax.swing.JLabel LbFormato;
    private javax.swing.JLabel LbImagenportada;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtRutaImagen;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelDatos;
    // End of variables declaration//GEN-END:variables
}

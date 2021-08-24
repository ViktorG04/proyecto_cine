
package Ventanas;

import Clases.conectar;
import java.awt.image.BufferedImage;
import java.io.IOException;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class VerCarteleras extends javax.swing.JInternalFrame {

    //Conexion de base datos
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    String consulta="SELECT DISTINCT titulo_pelicula, duracion_pelicula, Clasificacion_pelicula, Portada_pelicula FROM peliculas "
                    + "INNER JOIN cartelera ON peliculas.Cod_pelicula = cartelera.Cod_pelicula_cartelera";
    Statement st = null;
    ResultSet rs = null;
    public String titulo="";
    
    
    public VerCarteleras() 
    {
        try 
        {
            initComponents();
            
             st = cn.createStatement();
             rs = st.executeQuery(consulta);           
            MostrarCartelera();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Agregarlista(String titulolista)
    {
        DefaultListModel horarios = new DefaultListModel();
        JLHorarios.setModel(horarios);
        String sql1 = "SELECT * FROM cartelera INNER JOIN peliculas ON cartelera.Cod_pelicula_cartelera = peliculas.Cod_pelicula WHERE Titulo_pelicula ='"+titulolista+"'";
        try 
        {
            st = cn.createStatement();
            ResultSet rp = st.executeQuery(sql1);
            
            while(rp.next())
            {
                horarios.addElement(rp.getString("HoraInicio_cartelera"));  
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(MantenimientoPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void MostrarCartelera()
    {
        InputStream is = null;
        ImageIcon foto = null;
        
        try
            {
                if(rs.next())
                {       
                    LbTitulo.setText(rs.getString("titulo_pelicula"));
                    titulo = rs.getString("Titulo_pelicula");
                    LbDuracion.setText(rs.getString("duracion_pelicula"));
                    LbClasificacion.setText(rs.getString("Clasificacion_pelicula"));
                    is = rs.getBinaryStream(4);
                    BufferedImage b1 = ImageIO.read(is);
                    foto = new ImageIcon(b1.getScaledInstance(250, 400, 400));
                    LbPortada.setIcon(foto);
                    
                }
                Agregarlista(titulo);
                BtnAnterior.setEnabled(false);
            }
            catch(SQLException ex)
            {
                Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ex);
            }   
            catch (IOException ej) 
            {
                Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ej);
            }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbPortada = new javax.swing.JLabel();
        LbTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbDuracion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LbClasificacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        BtnAnterior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLHorarios = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VER CARTELERAS");

        LbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("DURACION:");

        LbDuracion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbDuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("CLASIFICACION:");

        LbClasificacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbClasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("CARTELERAS DISPONIBLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HORARIOS DISPONIBLES");

        BtnSiguiente.setText("SIGUIENTE");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnAnterior.setText("ANTERIOR");
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });

        JLHorarios.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jScrollPane1.setViewportView(JLHorarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LbPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnAnterior)
                        .addGap(69, 69, 69)
                        .addComponent(BtnSiguiente)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(LbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LbDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(LbDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(LbClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSiguiente)
                            .addComponent(BtnAnterior))
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
       
        InputStream is = null;
        ImageIcon foto = null;
        titulo="";
        try
            {
                
                if(rs.previous())
                {       
                    LbTitulo.setText(rs.getString("titulo_pelicula"));
                    titulo = rs.getString("Titulo_pelicula");
                    LbDuracion.setText(rs.getString("duracion_pelicula"));
                    LbClasificacion.setText(rs.getString("Clasificacion_pelicula"));
                    is = rs.getBinaryStream(4);
                    BufferedImage b1 = ImageIO.read(is);
                    foto = new ImageIcon(b1.getScaledInstance(250, 400, 400));
                    LbPortada.setIcon(foto);
                    Agregarlista(titulo);
                }
                
                else if (rs.first())
                {
                    JOptionPane.showMessageDialog(null, "ESTA EN LA PRIMERA CARTELERA", "AVISO!",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(SQLException ex)
            {
                Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ex);
            }   
            catch (IOException ej) 
            {
                Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ej);
            }
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        InputStream is = null;
        ImageIcon foto = null;
        titulo="";
        try
            {
                
                if(rs.next())
                {       
                    LbTitulo.setText(rs.getString("titulo_pelicula"));
                    titulo = rs.getString("Titulo_pelicula");
                    LbDuracion.setText(rs.getString("duracion_pelicula"));
                    LbClasificacion.setText(rs.getString("Clasificacion_pelicula"));
                    is = rs.getBinaryStream(4);
                    BufferedImage b1 = ImageIO.read(is);
                    foto = new ImageIcon(b1.getScaledInstance(250, 400, 400));
                    LbPortada.setIcon(foto);
                    BtnAnterior.setEnabled(true);
                    Agregarlista(titulo);
                }
                
                else if (rs.last())
                {
                    JOptionPane.showMessageDialog(null, "NO HAY MAS CARTELERAS DISPONIBLES", "AVISO!",JOptionPane.INFORMATION_MESSAGE);
                }
                
                
            }
            catch(SQLException ex)
            {
                Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ex);
            }   
            catch (IOException ej) 
            {
                Logger.getLogger(VerCarteleras.class.getName()).log(Level.SEVERE, null, ej);
            }
    }//GEN-LAST:event_BtnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JList<String> JLHorarios;
    private javax.swing.JLabel LbClasificacion;
    private javax.swing.JLabel LbDuracion;
    private javax.swing.JLabel LbPortada;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

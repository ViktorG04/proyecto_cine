
package Ventanas;
import Clases.Confirmacion;
import Clases.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarUsuario extends javax.swing.JInternalFrame 
{
    //Conexion de base datos
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    //LLamando tabla
    DefaultTableModel tabla;
    
    //ID para modificar una fila de la tabla
    String idfila="";
    
    //Confirmacion
    String strRespuesta="";

    public AgregarUsuario()
    {
        initComponents();
        mostrarusuarios();
        Generarnumeracion();
        BtnActualizar.setVisible(false);
    }

    
    void Generarnumeracion()
    {
     String SQL="select max(Cod_usuario) from usuario";
        
          int c=0;
          int b=0;
        try 
        {
           Statement st = cn.createStatement();
           ResultSet rs=st.executeQuery(SQL);
           
            while(rs.next())
            {              
                 c=rs.getInt(1);
            }
            
           
            if(c==0)
            {
                TxtIDUsuario.setText("1");
            }
            else
            {
                
                TxtIDUsuario.setText(""+(c+1));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
   
    void mostrarusuarios()
    {
        String [] titulos= {"CODIGO","USUARIO","TIPO USUARIO"};
        tabla=new  DefaultTableModel(null,titulos);   
        String datos []= new String[3];
         String sql="SELECT * FROM  usuario"; 
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                datos[0]=rs.getString("Cod_usuario");
                datos[1]=rs.getString("nombre_usuario");
                datos[2]= rs.getString("tipo_usuario");
                tabla.addRow(datos);
            }
            TBusuario.setModel(tabla);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        LbIDusuario = new javax.swing.JLabel();
        LbNombreUsuario = new javax.swing.JLabel();
        Lbpassword = new javax.swing.JLabel();
        LbTipoUsuario = new javax.swing.JLabel();
        TxtIDUsuario = new javax.swing.JTextField();
        TxtNombreUsuario = new javax.swing.JTextField();
        PfPassword = new javax.swing.JPasswordField();
        CbTipoUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBusuario = new javax.swing.JTable();
        BtnActualizar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        jMenuItem1.setText("MODIFICAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONTROL USUARIOS");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        LbIDusuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbIDusuario.setText("ID Usuario:");

        LbNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbNombreUsuario.setText("Nombre:");

        Lbpassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbpassword.setText("Password:");

        LbTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbTipoUsuario.setText("Tipo Usuario:");

        TxtIDUsuario.setEditable(false);
        TxtIDUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        TxtNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        CbTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Administrador", "Vendedor" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbTipoUsuario)
                    .addComponent(Lbpassword)
                    .addComponent(LbNombreUsuario)
                    .addComponent(LbIDusuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbTipoUsuario, 0, 127, Short.MAX_VALUE)
                    .addComponent(PfPassword)
                    .addComponent(TxtNombreUsuario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbIDusuario)
                    .addComponent(TxtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbNombreUsuario)
                    .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbpassword))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbTipoUsuario)
                    .addComponent(CbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Nuevo Usuario");

        BtnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        TBusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBusuario.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(TBusuario);

        BtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminar))
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(BtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnActualizar)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnLimpiar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        
        String password = new String(PfPassword.getPassword());
        
        if(TxtNombreUsuario.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Ingrese un nombre", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if( password.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if( "Seleccione:".equals(CbTipoUsuario.getSelectedItem().toString()) )          
        {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de usuario", "error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            String ins="INSERT INTO usuario (nombre_usuario , password_usuario, tipo_usuario) VALUES(?,?,?)";
            try 
            {
                PreparedStatement pst = cn.prepareStatement(ins);
            
                pst.setString(1, TxtNombreUsuario.getText());
                pst.setString(2,password);
                pst.setString(3, CbTipoUsuario.getSelectedItem().toString());
            
                int n= pst.executeUpdate();
            
                if(n>0)
                {
                    JOptionPane.showMessageDialog(this, "Se guardaron los datos");
                    mostrarusuarios();
                    TxtNombreUsuario.setText(null);
                    PfPassword.setText(null);
                    CbTipoUsuario.setSelectedIndex(0);
                    Generarnumeracion();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error");
                }
            
            
            }
            catch (SQLException ex) 
            {
            Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        strRespuesta = Clases.Confirmacion.strPreguntaSiNo("Desea Eliminar el Usuario");
        
        if(strRespuesta.equals("SI"))
        {
        
            int fila= TBusuario.getSelectedRow();
        
            if(fila<0)
            {
                JOptionPane.showMessageDialog(null, "Seleccione la fila con el usuario que desea eliminar");
            }
            else
            {
                String cod=TBusuario.getValueAt(fila, 0).toString();
                String sqlElim="DELETE FROM usuario WHERE Cod_usuario='"+cod+"'";
            
                try 
                {
                    PreparedStatement pst = cn.prepareStatement(sqlElim);
                    int n=pst.executeUpdate();
                    if(n>0)
                    {
                        JOptionPane.showMessageDialog(null, "Usuario eliminado con exito");
                        mostrarusuarios();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Hubo Problemas al querer eliminar el usuario");
                    }
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Operacion Cancelada");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        BtnActualizar.setVisible(true);
        String IDusuario="";
        
        int fila = TBusuario.getSelectedRow();
        if(fila>=0)
        {
            IDusuario = (TBusuario.getValueAt(fila, 0).toString());
            TxtNombreUsuario.setText(TBusuario.getValueAt(fila, 1).toString());
           CbTipoUsuario.setSelectedItem(TBusuario.getValueAt(fila, 2).toString());
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Seleccione un Usuario que desea modificar");       
        }
        TxtIDUsuario.setText(IDusuario);
        
        String clave = "SELECT password_usuario FROM usuario WHERE Cod_usuario='"+IDusuario+"'";
            try
            {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(clave);

                while (rs.next()) 
                {
                    PfPassword.setText(rs.getString("password_usuario"));    
                }
            }
            catch (SQLException ex) 
            {
                Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        strRespuesta = Clases.Confirmacion.strPreguntaSiNo("Desea Actualizar los datos");
        
        if(strRespuesta.equals("SI"))
        {
            String password = new String(PfPassword.getPassword());
            try
            {
                PreparedStatement pst = cn.prepareStatement("UPDATE usuario SET nombre_usuario='"+TxtNombreUsuario.getText()
                    +"', password_usuario='"+password+"', tipo_Usuario='"+CbTipoUsuario.getSelectedItem().toString()
                    +"' WHERE Cod_usuario='"+TxtIDUsuario.getText()+"'");
                pst.executeUpdate();
            
                int n = pst.executeUpdate();
            
                if(n>0)
                    {
                    JOptionPane.showMessageDialog(null, "Datos actualizados con exito");
                    TxtNombreUsuario.setText(null);
                    PfPassword.setText(null);
                    CbTipoUsuario.setSelectedIndex(0);
                    Generarnumeracion();
                    mostrarusuarios();   
                }   
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada");
        }
        
        
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
       TxtNombreUsuario.setText(null);
        PfPassword.setText(null);
        CbTipoUsuario.setSelectedIndex(0);
        Generarnumeracion();
        mostrarusuarios();
    }//GEN-LAST:event_BtnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JComboBox<String> CbTipoUsuario;
    private javax.swing.JLabel LbIDusuario;
    private javax.swing.JLabel LbNombreUsuario;
    private javax.swing.JLabel LbTipoUsuario;
    private javax.swing.JLabel Lbpassword;
    private javax.swing.JPasswordField PfPassword;
    private javax.swing.JTable TBusuario;
    private javax.swing.JTextField TxtIDUsuario;
    private javax.swing.JTextField TxtNombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

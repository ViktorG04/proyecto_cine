
package Ventanas;

import Clases.conectar;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Acceso extends javax.swing.JFrame {

   conectar cc = new conectar();
   Connection cn = cc.conexion();
   
   
    public Acceso() 
    {
        initComponents();
        cargarIma();
        this.setLocationRelativeTo(null);
        
        
    }
    
    
    void cargarIma()
    {
        ImageIcon login = new ImageIcon(getClass().getResource("/Imagenes/login.PNG"));
        Icon login2 = new ImageIcon(login.getImage().getScaledInstance(LbImagenLogin.getWidth(), LbImagenLogin.getHeight(), Image.SCALE_DEFAULT));
        LbImagenLogin.setIcon(login2);
        this.repaint();
    }
    
    void Acceder(String usuario, String pass)
    {
        if(usuario.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Ingrese su usuario", "error",JOptionPane.ERROR_MESSAGE);
        }
        else if(pass.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Ingrese su password", "error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String cap= "";
            String sql = "SELECT * FROM usuario WHERE nombre_usuario='"+usuario +"'&& password_usuario='"+pass +"'";
    
            try
            {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
           
                while (rs.next())
                {
                    cap = rs.getString("tipo_usuario");
               
                }
           
                if(cap.equals("Administrador"))
                {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "BIENVENIDO");
                    MenuPrincipal ingreso = new MenuPrincipal();
                    ingreso.setVisible(true);
                    ingreso.pack();
                    MenuPrincipal.LbUsuarioConectado.setText(usuario); 
                    
                }    
           
                if(cap.equals("Vendedor"))
                {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "BIENVENIDO");
                    MenuVendedor vendedor = new MenuVendedor();
                    vendedor.setVisible(true);
                    vendedor.pack();
                    MenuVendedor.LbUsuarioConectado.setText(usuario);
                    
                }
            
                if((!cap.equals("Administrador")) && (!cap.equals("Vendedor")))
                {
                    JOptionPane.showMessageDialog(null, "No existen sus datos");
                }
               
                V4ticket ventana4 = new V4ticket(usuario);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotones = new javax.swing.JPanel();
        TxtUsuario = new javax.swing.JTextField();
        LbUsuario = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        LbContraseña = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LbImagenLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso al sistema");

        jPanelBotones.setBackground(new java.awt.Color(102, 102, 102));

        TxtUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        LbUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbUsuario.setText("USUARIO:");

        LbContraseña.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbContraseña.setText("CONTRASEÑA:");

        BtnIngresar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnIngresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                        .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbContraseña, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbUsuario)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbContraseña))
                .addGap(32, 32, 32)
                .addComponent(BtnIngresar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA ADMINISTRATIVO CINE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LbImagenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbImagenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked
        
        String Usuario= TxtUsuario.getText();
        String Pass = new String(Password.getPassword());
        
        Acceder(Usuario, Pass);
    }//GEN-LAST:event_BtnIngresarMouseClicked

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        TxtUsuario.requestFocus();
    }//GEN-LAST:event_TxtUsuarioActionPerformed
        
    
  
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
          
            public void run() 
            {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JLabel LbContraseña;
    private javax.swing.JLabel LbImagenLogin;
    private javax.swing.JLabel LbUsuario;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBotones;
    // End of variables declaration//GEN-END:variables

}

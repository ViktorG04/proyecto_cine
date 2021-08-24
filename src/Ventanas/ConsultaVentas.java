
package Ventanas;

import Clases.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ConsultaVentas extends javax.swing.JInternalFrame {
    
    //Conexion de base datos
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    //LLamando tabla
    DefaultTableModel tabla;
    
    public String Vendedor="";
    
    public ConsultaVentas() 
    {
        initComponents();
        Bloquear();
        ComboPoblarVendedor();
    }
    
    public void Bloquear()
    {
        FechaX.setEnabled(false);
        FechaY.setEnabled(false);
        BtnLimpiar.setVisible(false);
        LbCantidad.setVisible(false);
        LbVentas.setVisible(false);
    }
    
    public void Limpiar()
    {
        FechaX.setText("");
        FechaY.setText("");
        CbVendedor.setSelectedIndex(0);
        TaConsultas.removeAll();
        LbCantidad.setVisible(false);
        LbVentas.setVisible(false);
    }
    
    //se realiza directamente porque no hay necesidad de crear un vector
    void ComboPoblarVendedor()
    {
        String sql = "SELECT * FROM usuario WHERE tipo_usuario='Vendedor'";
        try 
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            CbVendedor.addItem("Seleccione:");
            
            while(rs.next()) 
            {
                CbVendedor.addItem(rs.getString("nombre_usuario"));
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBoton = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaConsultas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        RBtnFecha = new javax.swing.JRadioButton();
        FechaX = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        FechaY = new javax.swing.JFormattedTextField();
        RBtnTodos = new javax.swing.JRadioButton();
        BtnConsultar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        CbVendedor = new javax.swing.JComboBox<>();
        LbCantidad = new javax.swing.JLabel();
        LbVentas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA DE VENTAS");

        TaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TaConsultas);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        GrupoBoton.add(RBtnFecha);
        RBtnFecha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RBtnFecha.setSelected(true);
        RBtnFecha.setText("Mostrar de Fecha X:");
        RBtnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnFechaActionPerformed(evt);
            }
        });

        try {
            FechaX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FechaX.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FechaX.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("a Fecha Y:");

        try {
            FechaY.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FechaY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FechaY.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        GrupoBoton.add(RBtnTodos);
        RBtnTodos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RBtnTodos.setText("Mostrar todos los datos");
        RBtnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnTodosActionPerformed(evt);
            }
        });

        BtnConsultar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnConsultar.setText("CONSULTAR");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        CbVendedor.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CbVendedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbVendedorItemStateChanged(evt);
            }
        });

        LbCantidad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbCantidad.setText("Cantidad de ventas realizadas:");

        LbVentas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Ventas por Cajero:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LbCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(LbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RBtnFecha)
                                .addGap(18, 18, 18)
                                .addComponent(FechaX, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(RBtnTodos))
                        .addGap(18, 18, 18)
                        .addComponent(FechaY, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnConsultar))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(CbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBtnFecha)
                    .addComponent(FechaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(FechaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBtnTodos))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBtnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnFechaActionPerformed
        if(RBtnFecha.isSelected()==true)
        {
            FechaX.setEnabled(true);
            FechaY.setEnabled(true);
            RBtnTodos.setEnabled(false);
            BtnLimpiar.setVisible(true);
            CbVendedor.setEnabled(false);
        }
    }//GEN-LAST:event_RBtnFechaActionPerformed

    private void RBtnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnTodosActionPerformed
        if(RBtnTodos.isSelected()==true)
        {
            RBtnFecha.setEnabled(false);
            BtnLimpiar.setVisible(true);
            CbVendedor.setEnabled(false);
        }
    }//GEN-LAST:event_RBtnTodosActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        RBtnFecha.setEnabled(true);
       
        RBtnTodos.setEnabled(true);
        FechaX.setEnabled(false);
        FechaY.setEnabled(false);
        BtnLimpiar.setVisible(false);
        CbVendedor.setEnabled(true);
        Limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        Statement st = null;
        ResultSet rs = null;
        
        if(!CbVendedor.getSelectedItem().toString().equals("Seleccione:"))
        {
            int contador=0;
            String datos []= new String[4];
            String [] titulos= {"TICKET", "FECHA", "HORA", "MONTO TOTAL"};
            tabla=new  DefaultTableModel(null,titulos); 
            String consulta1 = "SELECT Cod_ticket, Fecha_ticket, Hora_ticket, Monto_ticket FROM detalle_ticket WHERE Vendedor_ticket ='"+Vendedor+"'";
            try 
            { 
                LbCantidad.setVisible(true);
                LbVentas.setVisible(true);
                st = cn.createStatement();
                rs = st.executeQuery(consulta1);                
                
               while(rs.next())
                {
                    datos[0]=rs.getString("Cod_ticket");
                    datos[1]=rs.getString("Fecha_ticket");
                    datos[2]=rs.getString("Hora_ticket");
                    datos[3]=rs.getString("Monto_ticket");
                    tabla.addRow(datos);
                    contador++;
                }
                LbVentas.setText(String.valueOf(contador));
                
            }
            catch (SQLException ex) 
            {
            Logger.getLogger(ConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(RBtnFecha.isSelected()==true)
        {
            String datos []= new String[7];
            String [] titulos= {"TICKET", "HORA", "CLIENTE", "ASIENTOS", "MONTO TOTAL", "SALA", "PELICULA"};
            tabla=new  DefaultTableModel(null,titulos);  
            String consulta1 ="SELECT Cod_ticket, Hora_ticket, Nombre_cliente, Asiento_Cliente, Monto_ticket, Cod_sala_Cartelera, titulo_pelicula "
                    + "FROM cliente INNER JOIN detalle_ticket ON cliente.cod_Cliente = detalle_ticket.Cod_cliente_ticket "
                    + "INNER JOIN cartelera ON detalle_ticket.Cod_cartelera_ticket = cartelera.Cod_cartelera "
                    + "INNER JOIN peliculas ON cartelera.Cod_pelicula_cartelera = peliculas.Cod_pelicula "
                    + "WHERE Fecha_ticket BETWEEN '"+FechaX.getText()+"' AND '"+FechaY.getText()+"'";
            
            try 
            {
                st = cn.createStatement();
                rs = st.executeQuery(consulta1);
            
                while(rs.next())
                {
                    datos[0]=rs.getString("Cod_ticket");
                    datos[1]=rs.getString("Hora_ticket");
                    datos[2]= rs.getString("Nombre_cliente");
                    datos[3]= rs.getString("Asiento_cliente");
                    datos[4]=rs.getString("Monto_ticket");
                    datos[5]=rs.getString("Cod_sala_Cartelera");
                    datos[6]=rs.getString("titulo_pelicula");
                    tabla.addRow(datos);
                }
                
            } 
            catch (SQLException ex) 
            {
            Logger.getLogger(ConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        else if(RBtnTodos.isSelected()==true)
        {
            String datos []= new String[9];
            String [] titulos= {"TICKET", "FECHA", "HORA", "VENDEDOR", "CLIENTE", "ASIENTOS", "MONTO TOTAL", "SALA", "PELICULA"};
            tabla=new  DefaultTableModel(null,titulos);  
            String consulta1 ="SELECT Cod_ticket, Fecha_ticket, Hora_ticket, Vendedor_ticket, Nombre_cliente, Asiento_Cliente, Monto_ticket, Cod_sala_Cartelera, titulo_pelicula "
                    + "FROM cliente INNER JOIN detalle_ticket ON cliente.cod_Cliente = detalle_ticket.Cod_cliente_ticket "
                    + "INNER JOIN cartelera ON detalle_ticket.Cod_cartelera_ticket = cartelera.Cod_cartelera "
                    + "INNER JOIN peliculas ON cartelera.Cod_pelicula_cartelera = peliculas.Cod_pelicula";
            
            try 
            {
                st = cn.createStatement();
                rs = st.executeQuery(consulta1);
            
                while(rs.next())
                {
                    datos[0]=rs.getString("Cod_ticket");
                    datos[1]=rs.getString("Fecha_ticket");
                    datos[2]=rs.getString("Hora_ticket");
                    datos[3]=rs.getString("Vendedor_ticket");
                    datos[4]= rs.getString("Nombre_cliente");
                    datos[5]= rs.getString("Asiento_cliente");
                    datos[6]=rs.getString("Monto_ticket");
                    datos[7]=rs.getString("Cod_sala_Cartelera");
                    datos[8]=rs.getString("titulo_pelicula");
                    tabla.addRow(datos);
                }
                
            } 
            catch (SQLException ex) 
            {
            Logger.getLogger(ConsultaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   
        TaConsultas.setModel(tabla);
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void CbVendedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbVendedorItemStateChanged
        if(!CbVendedor.getSelectedItem().toString().equals("Seleccione:"))
        {
            Vendedor = CbVendedor.getSelectedItem().toString();
            BtnLimpiar.setVisible(true);
            RBtnFecha.setEnabled(false);
            RBtnTodos.setEnabled(false);
        }
    }//GEN-LAST:event_CbVendedorItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JComboBox<String> CbVendedor;
    private javax.swing.JFormattedTextField FechaX;
    private javax.swing.JFormattedTextField FechaY;
    private javax.swing.ButtonGroup GrupoBoton;
    private javax.swing.JLabel LbCantidad;
    private javax.swing.JLabel LbVentas;
    private javax.swing.JRadioButton RBtnFecha;
    private javax.swing.JRadioButton RBtnTodos;
    private javax.swing.JTable TaConsultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

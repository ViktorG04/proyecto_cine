
package Ventanas;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;


public class V2DatosCliente extends javax.swing.JInternalFrame 
{
    
    public V2DatosCliente()
    {
        initComponents();
        BtnSiguiente.setVisible(false);
    }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LbNombre = new javax.swing.JLabel();
        LbApellido = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtDui = new javax.swing.JTextField();
        BtnSiguiente = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jPanelAsiprefe = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LbCantidad = new javax.swing.JLabel();
        LbCosUni = new javax.swing.JLabel();
        LbSubTotal = new javax.swing.JLabel();
        Lb3raedadAsiTra = new javax.swing.JLabel();
        LbAdultoAsiTra = new javax.swing.JLabel();
        LbniñoAsiTra = new javax.swing.JLabel();
        txt3raEdadAsiTra = new javax.swing.JTextField();
        TxtAdultoAsiTra = new javax.swing.JTextField();
        TxtNiñoAsiTra = new javax.swing.JTextField();
        Lbprecio3raedadAsiTra = new javax.swing.JLabel();
        LbprecioAdultoAsiTra = new javax.swing.JLabel();
        LbprecioNiñoAsiTra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LbsubtotalAdultoAsiTra = new javax.swing.JLabel();
        LbsubtotalNiñoAsiTra = new javax.swing.JLabel();
        LbMontoTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LbTotalPagar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Lbsubtotal3raedadAsiTra = new javax.swing.JLabel();
        BtnGenerar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DATOS DEL CLIENTE");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese los Datos del Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LbNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbNombre.setText("Nombre:");

        LbApellido.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbApellido.setText("Apellido:");

        TxtNombre.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });

        TxtApellido.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("DUI:");

        TxtDui.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtDui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDuiKeyTyped(evt);
            }
        });

        BtnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnSiguiente.setText("SIGUIENTE");
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        BtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnRegresar.setText("REGRESAR");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jPanelAsiprefe.setBackground(new java.awt.Color(102, 102, 102));
        jPanelAsiprefe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 51, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Escoger Asientos");

        LbCantidad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCantidad.setText("Cantidad");

        LbCosUni.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbCosUni.setText("Costo Unitario");

        LbSubTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbSubTotal.setText("Sub Total");

        Lb3raedadAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lb3raedadAsiTra.setText("3ra Edad:");

        LbAdultoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbAdultoAsiTra.setText("Adulto:");

        LbniñoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbniñoAsiTra.setText("Niños:");

        txt3raEdadAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt3raEdadAsiTra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3raEdadAsiTra.setText("0");

        TxtAdultoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtAdultoAsiTra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAdultoAsiTra.setText("0");

        TxtNiñoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TxtNiñoAsiTra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNiñoAsiTra.setText("0");

        Lbprecio3raedadAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbprecio3raedadAsiTra.setText("3.50");

        LbprecioAdultoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbprecioAdultoAsiTra.setText("4.75");

        LbprecioNiñoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbprecioNiñoAsiTra.setText("3.50");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("$");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("$");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("$");

        LbsubtotalAdultoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbsubtotalAdultoAsiTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LbsubtotalNiñoAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbsubtotalNiñoAsiTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LbMontoTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbMontoTotal.setText("Monto Total:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("$");

        LbTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LbTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("$");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("$");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("$");

        Lbsubtotal3raedadAsiTra.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lbsubtotal3raedadAsiTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelAsiprefeLayout = new javax.swing.GroupLayout(jPanelAsiprefe);
        jPanelAsiprefe.setLayout(jPanelAsiprefeLayout);
        jPanelAsiprefeLayout.setHorizontalGroup(
            jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsiprefeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(184, 184, 184))
            .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LbMontoTotal))
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LbCantidad))
                            .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                                        .addComponent(Lb3raedadAsiTra)
                                        .addGap(39, 39, 39)
                                        .addComponent(txt3raEdadAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LbAdultoAsiTra)
                                            .addComponent(LbniñoAsiTra))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtAdultoAsiTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtNiñoAsiTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(LbCosUni))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsiprefeLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lbprecio3raedadAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelAsiprefeLayout.createSequentialGroup()
                                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LbprecioNiñoAsiTra)
                                            .addComponent(LbprecioAdultoAsiTra))))
                                .addGap(19, 19, 19)))))
                .addGap(41, 41, 41)
                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbSubTotal)
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbsubtotalNiñoAsiTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbTotalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbsubtotalAdultoAsiTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbsubtotal3raedadAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanelAsiprefeLayout.setVerticalGroup(
            jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCantidad)
                    .addComponent(LbCosUni)
                    .addComponent(LbSubTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lb3raedadAsiTra)
                        .addComponent(Lbprecio3raedadAsiTra)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(txt3raEdadAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lbsubtotal3raedadAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAsiprefeLayout.createSequentialGroup()
                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAdultoAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbAdultoAsiTra)
                            .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(LbprecioAdultoAsiTra)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbsubtotalNiñoAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LbniñoAsiTra)
                                .addComponent(TxtNiñoAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LbprecioNiñoAsiTra)
                                .addComponent(jLabel8))))
                    .addComponent(LbsubtotalAdultoAsiTra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAsiprefeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbMontoTotal)
                    .addComponent(jLabel3)
                    .addComponent(LbTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        BtnGenerar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BtnGenerar.setText("GENERAR");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnRegresar)
                        .addGap(107, 107, 107)
                        .addComponent(BtnGenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSiguiente)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(LbNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(LbApellido))
                            .addComponent(TxtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(154, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanelAsiprefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanelAsiprefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente)
                    .addComponent(BtnGenerar)
                    .addComponent(BtnRegresar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
       
        V3SeleccionAsientos Venta3 = new V3SeleccionAsientos ();
        JDesktopPane x = this.getDesktopPane();
        x.add(Venta3);
        Venta3.setVisible(true);
        dispose();
        Venta3.pack();
        
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        V1SeleccionPelicula Venta1 = new V1SeleccionPelicula();
        JDesktopPane x = this.getDesktopPane();
        x.add(Venta1);
        Venta1.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
       
        String Nombre = TxtNombre.getText();
        String Apellido = TxtApellido.getText();
        String DUI = TxtDui.getText();
        //creamos un constructor de la clase DecimalFormat para delimitar el numero de decimales
        DecimalFormat df = new DecimalFormat("0.00");
        int Asientos;
        double AntesdelIva;
        double IVA;
        String MontoTotal;
        
       if(Nombre.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Ingrese el nombre del cliente", "error",JOptionPane.ERROR_MESSAGE);
       }
       else if(Apellido.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Ingrese el Apellido del cliente", "error",JOptionPane.ERROR_MESSAGE);
       }
       else if(DUI.isEmpty())
       {
           JOptionPane.showMessageDialog(null, "Ingrese el numero de DUI", "error",JOptionPane.ERROR_MESSAGE);
       }
       else
       {
           
            int asiento1;
            int asiento2;
            int asiento3;
        
            double precio1;
            double precio2;
            double precio3;
            
            double subtotal1;
            double subtotal2;
            double subtotal3;
            
            try
            {
                asiento1 = Integer.parseInt(txt3raEdadAsiTra.getText());
                asiento2 = Integer.parseInt(TxtAdultoAsiTra.getText());
                asiento3 = Integer.parseInt(TxtNiñoAsiTra.getText());
        
                precio1 = Double.parseDouble(Lbprecio3raedadAsiTra.getText());
                precio2 = Double.parseDouble(LbprecioAdultoAsiTra.getText());
                precio3 = Double.parseDouble(LbprecioNiñoAsiTra.getText());
            }
            catch (Exception ex)
            {
                return;
            }
        
            if(asiento1 >0)
            {
                subtotal1 = asiento1 * precio1;
            }
            else
            {
                subtotal1=0.00;
            }
       
            Lbsubtotal3raedadAsiTra.setText(String.valueOf(subtotal1));
                
            if(asiento2 >0)
            {
                subtotal2 = asiento2 * precio2;     
            }
            else
            {
                subtotal2 =0.00;
            }
        
            LbsubtotalAdultoAsiTra.setText(String.valueOf(subtotal2));
          
            if(asiento3 >0)
            {
                subtotal3 = asiento3 * precio3;        
            }
            else
            {
                subtotal3 = 0.00;      
            }
            LbsubtotalNiñoAsiTra.setText(String.valueOf(subtotal3));
        
            Asientos = asiento1 + asiento2 + asiento3 ;
            AntesdelIva = subtotal1 + subtotal2 + subtotal3;
            IVA= (AntesdelIva*0.13);
            MontoTotal = df.format(AntesdelIva+IVA);
            LbTotalPagar.setText(MontoTotal);
            BtnSiguiente.setVisible(true);
            V3SeleccionAsientos Ventana3 = new V3SeleccionAsientos (Nombre, Apellido, DUI, Asientos, MontoTotal);
       }
            
    }//GEN-LAST:event_BtnGenerarActionPerformed

    private void TxtDuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDuiKeyTyped
       char car = evt.getKeyChar();
        if(TxtDui.getText().length()>=10) evt.consume();
        if((car<'0' || car>'9') && (car<'-' || car>'-')) evt.consume();
    }//GEN-LAST:event_TxtDuiKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        char car = evt.getKeyChar();  
        if(TxtNombre.getText().length()>=20) evt.consume();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
        evt.consume();
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoKeyTyped
        char car = evt.getKeyChar();
        if(TxtApellido.getText().length()>=20) evt.consume();
        if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)KeyEvent.VK_SPACE))
        {
         evt.consume();
        }
    }//GEN-LAST:event_TxtApellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BtnGenerar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JLabel Lb3raedadAsiTra;
    private javax.swing.JLabel LbAdultoAsiTra;
    private javax.swing.JLabel LbApellido;
    private javax.swing.JLabel LbCantidad;
    private javax.swing.JLabel LbCosUni;
    private javax.swing.JLabel LbMontoTotal;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JLabel LbSubTotal;
    private javax.swing.JLabel LbTotalPagar;
    private javax.swing.JLabel LbniñoAsiTra;
    private javax.swing.JLabel Lbprecio3raedadAsiTra;
    private javax.swing.JLabel LbprecioAdultoAsiTra;
    private javax.swing.JLabel LbprecioNiñoAsiTra;
    private javax.swing.JLabel Lbsubtotal3raedadAsiTra;
    private javax.swing.JLabel LbsubtotalAdultoAsiTra;
    private javax.swing.JLabel LbsubtotalNiñoAsiTra;
    private javax.swing.JTextField TxtAdultoAsiTra;
    public static javax.swing.JTextField TxtApellido;
    public static javax.swing.JTextField TxtDui;
    private javax.swing.JTextField TxtNiñoAsiTra;
    public static javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAsiprefe;
    private javax.swing.JTextField txt3raEdadAsiTra;
    // End of variables declaration//GEN-END:variables


}

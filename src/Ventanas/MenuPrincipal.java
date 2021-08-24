
package Ventanas;

import Clases.ImagenFondo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MenuPrincipal extends JFrame implements Runnable
{
    String hora,minutos,segundos;
    public String guardarhora;
    
    Thread hilo;
  
    public MenuPrincipal() 
    {
        initComponents();
        //creamos un objeto de la clase ImagenFondo
        DPescritorio.setBorder(new ImagenFondo());
        
        //para que aparezca en el centro
        this.setLocationRelativeTo(null);
        
        //hilo de ejecucion para la hora
        hilo = new Thread((Runnable) this);
        hilo.start(); 
        run();
        
        //Codigo para cambiar interfaz de java
        try
        {
          MenuPrincipal.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e)
        {
        }
        
    }
    
    public void hora()
    {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run()
    {
        Thread current=Thread.currentThread();
        
        while(current==hilo)
        {
            hora();
            guardarhora = (hora+":"+minutos+":"+segundos);
            LbHora.setText(guardarhora);
            
        }
         

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DPescritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        LbUsuarioConectado = new javax.swing.JLabel();
        LbHora = new javax.swing.JLabel();
        Menuprin = new javax.swing.JMenuBar();
        jMenuSalas = new javax.swing.JMenu();
        MAsignarCartelera = new javax.swing.JMenuItem();
        MSalas = new javax.swing.JMenuItem();
        VerCartelera = new javax.swing.JMenuItem();
        jMenuPeliculas = new javax.swing.JMenu();
        MAgregarP = new javax.swing.JMenuItem();
        MAmantenimiento = new javax.swing.JMenuItem();
        MAVerCartelera = new javax.swing.JMenuItem();
        jMenuVentas = new javax.swing.JMenu();
        MCompBoleto = new javax.swing.JMenuItem();
        jMenuAdministrador = new javax.swing.JMenu();
        MAgregarUsuarios = new javax.swing.JMenuItem();
        jMenuReportes = new javax.swing.JMenu();
        MReporteVentas = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        MCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout DPescritorioLayout = new javax.swing.GroupLayout(DPescritorio);
        DPescritorio.setLayout(DPescritorioLayout);
        DPescritorioLayout.setHorizontalGroup(
            DPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DPescritorioLayout.setVerticalGroup(
            DPescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Usuario Conectado:");

        LbUsuarioConectado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LbHora.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jMenuSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salas.png"))); // NOI18N
        jMenuSalas.setText("Control Salas");
        jMenuSalas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MAsignarCartelera.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MAsignarCartelera.setText("Asignar Cartelera");
        MAsignarCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAsignarCarteleraActionPerformed(evt);
            }
        });
        jMenuSalas.add(MAsignarCartelera);

        MSalas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MSalas.setText("Ver Salas");
        MSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSalasActionPerformed(evt);
            }
        });
        jMenuSalas.add(MSalas);

        VerCartelera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VerCartelera.setText("Ver Cartelera");
        VerCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCarteleraActionPerformed(evt);
            }
        });
        jMenuSalas.add(VerCartelera);

        Menuprin.add(jMenuSalas);

        jMenuPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula.png"))); // NOI18N
        jMenuPeliculas.setText("Peliculas");
        jMenuPeliculas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MAgregarP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MAgregarP.setText("Agregar Pelicula");
        MAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAgregarPActionPerformed(evt);
            }
        });
        jMenuPeliculas.add(MAgregarP);

        MAmantenimiento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MAmantenimiento.setText("Mantenimiento");
        MAmantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAmantenimientoActionPerformed(evt);
            }
        });
        jMenuPeliculas.add(MAmantenimiento);

        MAVerCartelera.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MAVerCartelera.setText("Ver Lista Peliculas");
        MAVerCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAVerCarteleraActionPerformed(evt);
            }
        });
        jMenuPeliculas.add(MAVerCartelera);

        Menuprin.add(jMenuPeliculas);

        jMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta.jpg"))); // NOI18N
        jMenuVentas.setText("Ventas");
        jMenuVentas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MCompBoleto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MCompBoleto.setText("Comprar Boleto");
        MCompBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCompBoletoActionPerformed(evt);
            }
        });
        jMenuVentas.add(MCompBoleto);

        Menuprin.add(jMenuVentas);

        jMenuAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrador.jpg"))); // NOI18N
        jMenuAdministrador.setText("Administrar");
        jMenuAdministrador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MAgregarUsuarios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MAgregarUsuarios.setText("Control de Usuarios");
        MAgregarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAgregarUsuariosActionPerformed(evt);
            }
        });
        jMenuAdministrador.add(MAgregarUsuarios);

        Menuprin.add(jMenuAdministrador);

        jMenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.JPG"))); // NOI18N
        jMenuReportes.setText("Reportes");
        jMenuReportes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MReporteVentas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MReporteVentas.setText("Reporte Ventas");
        MReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MReporteVentasActionPerformed(evt);
            }
        });
        jMenuReportes.add(MReporteVentas);

        Menuprin.add(jMenuReportes);

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.JPG"))); // NOI18N
        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MCerrarSesion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MCerrarSesion.setText("Cerrar Sesión");
        MCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCerrarSesionActionPerformed(evt);
            }
        });
        jMenuSalir.add(MCerrarSesion);

        Menuprin.add(jMenuSalir);

        setJMenuBar(Menuprin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LbUsuarioConectado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 690, Short.MAX_VALUE)
                .addComponent(LbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(DPescritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DPescritorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbUsuarioConectado)
                    .addComponent(LbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Llamando a los formularios
    private void MAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAgregarPActionPerformed
        AgregarPelicula AgrePe = new AgregarPelicula();
        DPescritorio.add(AgrePe);
        AgrePe.show();
    }//GEN-LAST:event_MAgregarPActionPerformed

    private void MAmantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAmantenimientoActionPerformed
         MantenimientoPeliculas Mantenimiento = new MantenimientoPeliculas();
        DPescritorio.add(Mantenimiento);
        Mantenimiento.show();
    }//GEN-LAST:event_MAmantenimientoActionPerformed

    private void MCompBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCompBoletoActionPerformed
        V1SeleccionPelicula Venta1 = new V1SeleccionPelicula();
        DPescritorio.add(Venta1);
        Venta1.show();
        
    }//GEN-LAST:event_MCompBoletoActionPerformed

    private void MAVerCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAVerCarteleraActionPerformed
        ListaPeliculas Cartelera = new ListaPeliculas();
        DPescritorio.add(Cartelera);
        Cartelera.setVisible(true);
    }//GEN-LAST:event_MAVerCarteleraActionPerformed

    private void MAgregarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAgregarUsuariosActionPerformed
       AgregarUsuario Usuario = new AgregarUsuario();
        DPescritorio.add(Usuario);
        Usuario.show();
    }//GEN-LAST:event_MAgregarUsuariosActionPerformed

    private void MCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCerrarSesionActionPerformed
       Acceso principal= new Acceso();
        principal.setVisible(true);
        principal.pack();
        this.setVisible(false);

    }//GEN-LAST:event_MCerrarSesionActionPerformed

    private void MAsignarCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAsignarCarteleraActionPerformed
        AsignarCartelera AsigCar = new AsignarCartelera();
        DPescritorio.add(AsigCar);
        AsigCar.show();
    }//GEN-LAST:event_MAsignarCarteleraActionPerformed

    private void MSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSalasActionPerformed
        Ver_Salas salas = new Ver_Salas();
        DPescritorio.add(salas);
        salas.show();
    }//GEN-LAST:event_MSalasActionPerformed

    private void VerCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCarteleraActionPerformed
        VerCarteleras Cartelera = new VerCarteleras();
        DPescritorio.add(Cartelera);
        Cartelera.setVisible(true);
    }//GEN-LAST:event_VerCarteleraActionPerformed

    private void MReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MReporteVentasActionPerformed
        ConsultaVentas ventas = new ConsultaVentas();
        DPescritorio.add(ventas);
        ventas.setVisible(true);
    }//GEN-LAST:event_MReporteVentasActionPerformed

    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DPescritorio;
    private javax.swing.JLabel LbHora;
    public static javax.swing.JLabel LbUsuarioConectado;
    private javax.swing.JMenuItem MAVerCartelera;
    private javax.swing.JMenuItem MAgregarP;
    private javax.swing.JMenuItem MAgregarUsuarios;
    private javax.swing.JMenuItem MAmantenimiento;
    private javax.swing.JMenuItem MAsignarCartelera;
    private javax.swing.JMenuItem MCerrarSesion;
    private javax.swing.JMenuItem MCompBoleto;
    private javax.swing.JMenuItem MReporteVentas;
    private javax.swing.JMenuItem MSalas;
    private javax.swing.JMenuBar Menuprin;
    private javax.swing.JMenuItem VerCartelera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAdministrador;
    private javax.swing.JMenu jMenuPeliculas;
    private javax.swing.JMenu jMenuReportes;
    private javax.swing.JMenu jMenuSalas;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuVentas;
    // End of variables declaration//GEN-END:variables
}

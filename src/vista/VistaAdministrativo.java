/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package vista;

import dao.MedicamentoDAO;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaAdministrativo extends javax.swing.JFrame implements Runnable {
    
    String columnas[] = {"CODIGO","NOMBRE","FORMATO","GR/ML","LABORATORIO","DISPONIBLE"};
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    MedicamentoDAO dao = new MedicamentoDAO();
    ArrayList<Object[]> data = new ArrayList<>();
    int hora, minutos, segundos;
    Calendar calendario;
    Thread h1;
    
    public VistaAdministrativo() {
        initComponents();
        setSize(825, 498);
        setResizable(false);
        setLocationRelativeTo(null);		
        setVisible(true); 
        lblfecha.setText(fecha());
        h1 = new Thread(this);
        h1.start();
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/recursos/icono12x12.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
    }
    
    public void cerrarSesion(){
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"¿En realidad desea cerrar su sesión?","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Usted a cerrado sesión con exito");
            Login l = new Login();
            l.setVisible(true);
            this.dispose();
        }
    }
    
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-YYYY");
        return formatofecha.format(fecha);
    }
    
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lblhora.setText(hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public void calcula(){
        Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY)-1;
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        panelarriba1 = new keeptoo.KGradientPanel();
        panelabajo = new keeptoo.KGradientPanel();
        panelizquierdo = new keeptoo.KGradientPanel();
        panelderecho = new keeptoo.KGradientPanel();
        panelderecho1 = new keeptoo.KGradientPanel();
        panelarriba2 = new keeptoo.KGradientPanel();
        lblversion = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lblbienvenido = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblsubtitulo = new javax.swing.JLabel();
        lbllogo1 = new javax.swing.JLabel();
        lbllogo2 = new javax.swing.JLabel();
        btnpacientes = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btncarnet = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btncerrarSesion = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        panelarriba3 = new keeptoo.KGradientPanel();
        panelabajo1 = new keeptoo.KGradientPanel();
        panelderecho3 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelprincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelarriba1.setkEndColor(new java.awt.Color(33, 52, 110));
        panelarriba1.setkGradientFocus(700);
        panelarriba1.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelarriba1Layout = new javax.swing.GroupLayout(panelarriba1);
        panelarriba1.setLayout(panelarriba1Layout);
        panelarriba1Layout.setHorizontalGroup(
            panelarriba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelarriba1Layout.setVerticalGroup(
            panelarriba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelprincipal.add(panelarriba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 10));

        panelabajo.setkEndColor(new java.awt.Color(255, 255, 255));
        panelabajo.setkGradientFocus(700);
        panelabajo.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelabajoLayout = new javax.swing.GroupLayout(panelabajo);
        panelabajo.setLayout(panelabajoLayout);
        panelabajoLayout.setHorizontalGroup(
            panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelabajoLayout.setVerticalGroup(
            panelabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelprincipal.add(panelabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 820, 10));

        panelizquierdo.setkEndColor(new java.awt.Color(33, 52, 110));
        panelizquierdo.setkGradientFocus(50);
        panelizquierdo.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelizquierdoLayout = new javax.swing.GroupLayout(panelizquierdo);
        panelizquierdo.setLayout(panelizquierdoLayout);
        panelizquierdoLayout.setHorizontalGroup(
            panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelizquierdoLayout.setVerticalGroup(
            panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelprincipal.add(panelizquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 470));

        panelderecho.setkEndColor(new java.awt.Color(255, 255, 255));
        panelderecho.setkGradientFocus(50);
        panelderecho.setkStartColor(new java.awt.Color(33, 52, 110));

        panelderecho1.setkEndColor(new java.awt.Color(255, 255, 255));
        panelderecho1.setkGradientFocus(50);
        panelderecho1.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelderecho1Layout = new javax.swing.GroupLayout(panelderecho1);
        panelderecho1.setLayout(panelderecho1Layout);
        panelderecho1Layout.setHorizontalGroup(
            panelderecho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelderecho1Layout.setVerticalGroup(
            panelderecho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelderechoLayout = new javax.swing.GroupLayout(panelderecho);
        panelderecho.setLayout(panelderechoLayout);
        panelderechoLayout.setHorizontalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelderechoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelderecho1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelderechoLayout.setVerticalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelderechoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelderecho1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelprincipal.add(panelderecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 10, 470));

        panelarriba2.setkEndColor(new java.awt.Color(33, 52, 110));
        panelarriba2.setkGradientFocus(700);
        panelarriba2.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelarriba2Layout = new javax.swing.GroupLayout(panelarriba2);
        panelarriba2.setLayout(panelarriba2Layout);
        panelarriba2Layout.setHorizontalGroup(
            panelarriba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelarriba2Layout.setVerticalGroup(
            panelarriba2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelprincipal.add(panelarriba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, 10));

        lblversion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblversion.setForeground(new java.awt.Color(33, 52, 110));
        lblversion.setText("v3.0");
        panelprincipal.add(lblversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(33, 52, 110));
        lblfecha.setText("DD/MM/YYYY");
        panelprincipal.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        lblhora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(33, 52, 110));
        lblhora.setText("00:00:00");
        panelprincipal.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        lblbienvenido.setText("BIENVENIDO(A):");
        panelprincipal.add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo.setText("GESTION DE CONTROL DE STOCK Y ENTREGA DE MEDICAMENTOS CESTOCK");
        panelprincipal.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblsubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsubtitulo.setText("MENU PRINCIPAL ADMINISTRATIVO");
        panelprincipal.add(lblsubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 40));

        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        btnpacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/paciente.png"))); // NOI18N
        btnpacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpacientesMouseClicked(evt);
            }
        });
        panelprincipal.add(btnpacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 50, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 52, 110));
        jLabel13.setText("GESTION");
        panelprincipal.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 52, 110));
        jLabel12.setText("PACIENTES");
        panelprincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 20));

        btncarnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/carnet.jpg"))); // NOI18N
        btncarnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncarnetMouseClicked(evt);
            }
        });
        panelprincipal.add(btncarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 50, 50));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(33, 52, 110));
        jLabel28.setText("CARNET");
        panelprincipal.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 20));

        btncerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrarsesion.jpg"))); // NOI18N
        btncerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarSesionMouseClicked(evt);
            }
        });
        panelprincipal.add(btncerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 50, 50));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(33, 52, 110));
        jLabel37.setText("GESTION");
        panelprincipal.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        panelarriba3.setkEndColor(new java.awt.Color(33, 52, 110));
        panelarriba3.setkGradientFocus(700);
        panelarriba3.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelarriba3Layout = new javax.swing.GroupLayout(panelarriba3);
        panelarriba3.setLayout(panelarriba3Layout);
        panelarriba3Layout.setHorizontalGroup(
            panelarriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        panelarriba3Layout.setVerticalGroup(
            panelarriba3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelprincipal.add(panelarriba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 820, 10));

        panelabajo1.setkEndColor(new java.awt.Color(255, 255, 255));
        panelabajo1.setkGradientFocus(700);
        panelabajo1.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelabajo1Layout = new javax.swing.GroupLayout(panelabajo1);
        panelabajo1.setLayout(panelabajo1Layout);
        panelabajo1Layout.setHorizontalGroup(
            panelabajo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        panelabajo1Layout.setVerticalGroup(
            panelabajo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelprincipal.add(panelabajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 820, 10));

        panelderecho3.setkEndColor(new java.awt.Color(255, 255, 255));
        panelderecho3.setkGradientFocus(50);
        panelderecho3.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelderecho3Layout = new javax.swing.GroupLayout(panelderecho3);
        panelderecho3.setLayout(panelderecho3Layout);
        panelderecho3Layout.setHorizontalGroup(
            panelderecho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelderecho3Layout.setVerticalGroup(
            panelderecho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        panelprincipal.add(panelderecho3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 10, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo_medicamentos.jpg"))); // NOI18N
        panelprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 290));

        lblnombre.setText("NOMBRE USUARIO");
        panelprincipal.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(33, 52, 110));
        jLabel38.setText("CERRAR");
        panelprincipal.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 20));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(33, 52, 110));
        jLabel39.setText("SESIÓN");
        panelprincipal.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnpacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpacientesMouseClicked
        VistaPacientes vp = new VistaPacientes();
        vp.lblnombre.setText(lblnombre.getText());
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpacientesMouseClicked

    private void btncarnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncarnetMouseClicked
//        VistaCarnetPaciente vcp = new VistaCarnetPaciente();
//        vcp.lblnombre.setText(lblnombre.getText());
//        vcp.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btncarnetMouseClicked

    private void btncerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarSesionMouseClicked
        cerrarSesion();
    }//GEN-LAST:event_btncerrarSesionMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaAdministrativo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncarnet;
    private javax.swing.JLabel btncerrarSesion;
    private javax.swing.JLabel btnpacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel lblbienvenido;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    public javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblversion;
    private keeptoo.KGradientPanel panelabajo;
    private keeptoo.KGradientPanel panelabajo1;
    private keeptoo.KGradientPanel panelarriba1;
    private keeptoo.KGradientPanel panelarriba2;
    private keeptoo.KGradientPanel panelarriba3;
    private keeptoo.KGradientPanel panelderecho;
    private keeptoo.KGradientPanel panelderecho1;
    private keeptoo.KGradientPanel panelderecho3;
    private keeptoo.KGradientPanel panelizquierdo;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables

    

}

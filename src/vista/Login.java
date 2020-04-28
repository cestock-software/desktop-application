/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package vista;

import dao.UsuarioDAO;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import modelo.Usuario;

public class Login extends javax.swing.JFrame {
    
    Usuario us = new Usuario();
    UsuarioDAO daou = new UsuarioDAO();
    
    public Login() {
        initComponents();
        setSize(415, 318);
        setResizable(false);
        setLocationRelativeTo(null);		
        setVisible(true); 
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/recursos/icono12x12.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
    }
    
    public void ingresar(){
        us.setRut_usuario(txtnombre.getText());
        us.setContrasena(txtcontrasena.getText());
        
        try {
            daou.acceder(us);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelarriba1 = new keeptoo.KGradientPanel();
        panelizquierdo = new keeptoo.KGradientPanel();
        panelderecho = new keeptoo.KGradientPanel();
        panelabajo = new keeptoo.KGradientPanel();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lblcontrasena = new javax.swing.JLabel();
        btningresar = new keeptoo.KButton();
        lbltitulo = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();
        panelabajo1 = new keeptoo.KGradientPanel();
        panelabajo2 = new keeptoo.KGradientPanel();
        panelizquierdo1 = new keeptoo.KGradientPanel();
        panelizquierdo2 = new keeptoo.KGradientPanel();
        lbllogo2 = new javax.swing.JLabel();
        lbllogo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelarriba1.setkEndColor(new java.awt.Color(33, 52, 110));
        panelarriba1.setkGradientFocus(700);
        panelarriba1.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelarriba1Layout = new javax.swing.GroupLayout(panelarriba1);
        panelarriba1.setLayout(panelarriba1Layout);
        panelarriba1Layout.setHorizontalGroup(
            panelarriba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        panelarriba1Layout.setVerticalGroup(
            panelarriba1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(panelarriba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 10));

        panelizquierdo.setkEndColor(new java.awt.Color(33, 52, 110));
        panelizquierdo.setkGradientFocus(50);
        panelizquierdo.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelizquierdoLayout = new javax.swing.GroupLayout(panelizquierdo);
        panelizquierdo.setLayout(panelizquierdoLayout);
        panelizquierdoLayout.setHorizontalGroup(
            panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelizquierdoLayout.setVerticalGroup(
            panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel1.add(panelizquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 280));

        panelderecho.setkEndColor(new java.awt.Color(255, 255, 255));
        panelderecho.setkGradientFocus(50);
        panelderecho.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelderechoLayout = new javax.swing.GroupLayout(panelderecho);
        panelderecho.setLayout(panelderechoLayout);
        panelderechoLayout.setHorizontalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelderechoLayout.setVerticalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel1.add(panelderecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 10, 290));

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

        jPanel1.add(panelabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 410, 10));

        lblnombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(33, 52, 110));
        lblnombre.setText("NOMBRE");
        jPanel1.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(33, 52, 110));
        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 30));

        lblcontrasena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcontrasena.setForeground(new java.awt.Color(33, 52, 110));
        lblcontrasena.setText("CONTRASEÑA");
        jPanel1.add(lblcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        btningresar.setText("INGRESAR");
        btningresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btningresar.setkEndColor(new java.awt.Color(255, 255, 255));
        btningresar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btningresar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btningresar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btningresar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btningresar.setkStartColor(new java.awt.Color(33, 52, 110));
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, 50));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(33, 52, 110));
        lbltitulo.setText("INICIO DE SESIÓN");
        jPanel1.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        txtcontrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcontrasena.setForeground(new java.awt.Color(33, 52, 110));
        txtcontrasena.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        jPanel1.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 150, 30));

        panelabajo1.setkEndColor(new java.awt.Color(255, 255, 255));
        panelabajo1.setkGradientFocus(700);
        panelabajo1.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelabajo1Layout = new javax.swing.GroupLayout(panelabajo1);
        panelabajo1.setLayout(panelabajo1Layout);
        panelabajo1Layout.setHorizontalGroup(
            panelabajo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        panelabajo1Layout.setVerticalGroup(
            panelabajo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(panelabajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 10));

        panelabajo2.setkEndColor(new java.awt.Color(255, 255, 255));
        panelabajo2.setkGradientFocus(700);
        panelabajo2.setkStartColor(new java.awt.Color(33, 52, 110));

        javax.swing.GroupLayout panelabajo2Layout = new javax.swing.GroupLayout(panelabajo2);
        panelabajo2.setLayout(panelabajo2Layout);
        panelabajo2Layout.setHorizontalGroup(
            panelabajo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        panelabajo2Layout.setVerticalGroup(
            panelabajo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(panelabajo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 310, 10));

        panelizquierdo1.setkEndColor(new java.awt.Color(33, 52, 110));
        panelizquierdo1.setkGradientFocus(50);
        panelizquierdo1.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelizquierdo1Layout = new javax.swing.GroupLayout(panelizquierdo1);
        panelizquierdo1.setLayout(panelizquierdo1Layout);
        panelizquierdo1Layout.setHorizontalGroup(
            panelizquierdo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelizquierdo1Layout.setVerticalGroup(
            panelizquierdo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(panelizquierdo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 10, 120));

        panelizquierdo2.setkEndColor(new java.awt.Color(33, 52, 110));
        panelizquierdo2.setkGradientFocus(50);
        panelizquierdo2.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelizquierdo2Layout = new javax.swing.GroupLayout(panelizquierdo2);
        panelizquierdo2.setLayout(panelizquierdo2Layout);
        panelizquierdo2Layout.setHorizontalGroup(
            panelizquierdo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        panelizquierdo2Layout.setVerticalGroup(
            panelizquierdo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(panelizquierdo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 10, 120));

        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        jPanel1.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 40, 40));

        lbllogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        jPanel1.add(lbllogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        ingresar();
    }//GEN-LAST:event_btningresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public keeptoo.KButton btningresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lbllogo2;
    private javax.swing.JLabel lbllogo3;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltitulo;
    private keeptoo.KGradientPanel panelabajo;
    private keeptoo.KGradientPanel panelabajo1;
    private keeptoo.KGradientPanel panelabajo2;
    private keeptoo.KGradientPanel panelarriba1;
    private keeptoo.KGradientPanel panelderecho;
    private keeptoo.KGradientPanel panelizquierdo;
    private keeptoo.KGradientPanel panelizquierdo1;
    private keeptoo.KGradientPanel panelizquierdo2;
    public javax.swing.JPasswordField txtcontrasena;
    public javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

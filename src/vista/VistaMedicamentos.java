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
import modelo.Medicamento;

public class VistaMedicamentos extends javax.swing.JFrame implements Runnable{
    
    String columnas[] = {"CODIGO","NOMBRE","FORMATO","GR/ML","LABORATORIO","DISPONIBLE"};
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    MedicamentoDAO dao = new MedicamentoDAO();
    ArrayList<Object[]> data = new ArrayList<>();
    int hora, minutos, segundos;
    Calendar calendario;
    Thread h1;
    
    public VistaMedicamentos() {
        initComponents();
        setSize(825, 498);
        setResizable(false);
        setLocationRelativeTo(null);		
        setVisible(true); 
        cargar();
        h1 = new Thread(this);
        h1.start();
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/recursos/icono12x12.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
        lblfecha.setText(fecha());
    }
    
    private void cargar(){
        this.data = dao.consultar();
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablamedicamentos.setModel(modelo);
    }
    
    private void cargarBuscar(String valor){
        this.data = dao.filtrar(valor);
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablamedicamentos.setModel(modelo);
    }
    
    private void limpiar(){
        txtcodigo.setText("");
        txtnombre.setText("");
        txtformato.setText("");
        txtgr.setText("");
        txtlaboratorio.setText("");
        txtcodigo.setEnabled(true);
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
        panelarriba2 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamedicamentos = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtformato = new javax.swing.JTextField();
        txtgr = new javax.swing.JTextField();
        txtlaboratorio = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        lblGr = new javax.swing.JLabel();
        lblLaboratorio = new javax.swing.JLabel();
        btnagregar = new keeptoo.KButton();
        btneliminar = new keeptoo.KButton();
        btnlimpiar = new keeptoo.KButton();
        btnvolver = new keeptoo.KButton();
        lblversion = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lblbienvenido = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblsubtitulo = new javax.swing.JLabel();
        lblbuscar = new javax.swing.JLabel();
        lbllogo1 = new javax.swing.JLabel();
        lbllogo2 = new javax.swing.JLabel();
        btnmodificar1 = new keeptoo.KButton();

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

        javax.swing.GroupLayout panelderechoLayout = new javax.swing.GroupLayout(panelderecho);
        panelderecho.setLayout(panelderechoLayout);
        panelderechoLayout.setHorizontalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelderechoLayout.setVerticalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        tablamedicamentos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        tablamedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablamedicamentos.setGridColor(new java.awt.Color(255, 255, 255));
        tablamedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamedicamentosMouseClicked(evt);
            }
        });
        tablamedicamentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablamedicamentosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablamedicamentos);

        panelprincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 510, 310));

        txtbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(33, 52, 110));
        txtbuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });
        panelprincipal.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 380, 30));

        txtcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(33, 52, 110));
        txtcodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 30));

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(33, 52, 110));
        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 30));

        txtformato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtformato.setForeground(new java.awt.Color(33, 52, 110));
        txtformato.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtformato, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, 30));

        txtgr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgr.setForeground(new java.awt.Color(33, 52, 110));
        txtgr.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 160, 30));

        txtlaboratorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtlaboratorio.setForeground(new java.awt.Color(33, 52, 110));
        txtlaboratorio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtlaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 160, 30));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(33, 52, 110));
        lblCodigo.setText("CODIGO");
        panelprincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(33, 52, 110));
        lblNombre.setText("NOMBRE");
        panelprincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormato.setForeground(new java.awt.Color(33, 52, 110));
        lblFormato.setText("FORMATO");
        panelprincipal.add(lblFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblGr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGr.setForeground(new java.awt.Color(33, 52, 110));
        lblGr.setText("GR/ML");
        panelprincipal.add(lblGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblLaboratorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLaboratorio.setForeground(new java.awt.Color(33, 52, 110));
        lblLaboratorio.setText("LABORATORIO");
        panelprincipal.add(lblLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnagregar.setText("AGREGAR");
        btnagregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnagregar.setkEndColor(new java.awt.Color(255, 255, 255));
        btnagregar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnagregar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnagregar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnagregar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnagregar.setkStartColor(new java.awt.Color(33, 52, 110));
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        panelprincipal.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 90, 40));

        btneliminar.setText("ELIMINAR");
        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btneliminar.setkEndColor(new java.awt.Color(255, 255, 255));
        btneliminar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btneliminar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btneliminar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btneliminar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btneliminar.setkStartColor(new java.awt.Color(33, 52, 110));
        btneliminar.setMaximumSize(null);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        panelprincipal.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, 40));

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlimpiar.setkEndColor(new java.awt.Color(255, 255, 255));
        btnlimpiar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnlimpiar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnlimpiar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnlimpiar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnlimpiar.setkStartColor(new java.awt.Color(33, 52, 110));
        btnlimpiar.setMaximumSize(null);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        panelprincipal.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 90, 40));

        btnvolver.setText("VOLVER");
        btnvolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnvolver.setkEndColor(new java.awt.Color(255, 255, 255));
        btnvolver.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnvolver.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnvolver.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnvolver.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnvolver.setkStartColor(new java.awt.Color(33, 52, 110));
        btnvolver.setMaximumSize(null);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        panelprincipal.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 90, 40));

        lblversion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblversion.setForeground(new java.awt.Color(33, 52, 110));
        lblversion.setText("v3.0");
        panelprincipal.add(lblversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(33, 52, 110));
        lblfecha.setText("DD/MM/YYYY");
        panelprincipal.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        lblhora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(33, 52, 110));
        lblhora.setText("00:00:00");
        panelprincipal.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        lblbienvenido.setText("BIENVENIDO(A):");
        panelprincipal.add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo.setText("GESTION DE CONTROL DE STOCK Y ENTREGA DE MEDICAMENTOS CESTOCK");
        panelprincipal.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblnombre.setText("NOMBRE USUARIO");
        panelprincipal.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 170, -1));

        lblsubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsubtitulo.setText("GESTION MEDICAMENTOS");
        panelprincipal.add(lblsubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbuscar.setText("BUSCAR");
        panelprincipal.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 40));

        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        btnmodificar1.setText("MODIFICAR");
        btnmodificar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmodificar1.setkEndColor(new java.awt.Color(255, 255, 255));
        btnmodificar1.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnmodificar1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnmodificar1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnmodificar1.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnmodificar1.setkStartColor(new java.awt.Color(33, 52, 110));
        btnmodificar1.setMaximumSize(null);
        btnmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificar1ActionPerformed(evt);
            }
        });
        panelprincipal.add(btnmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, 40));

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

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Medicamento m = new Medicamento(Integer.parseInt(txtcodigo.getText()),
                                        txtnombre.getText(),
                                        txtformato.getText(),
                                        txtgr.getText(),
                                        txtlaboratorio.getText(),0,0,0);
        if(dao.eliminar(m)){
            JOptionPane.showMessageDialog(this, "Se ha eliminado el medicamento correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido eliminar el medicamento");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
      Medicamento m = new Medicamento(Integer.parseInt(txtcodigo.getText()),
                                        txtnombre.getText(),
                                        txtformato.getText(),
                                        txtgr.getText(),
                                        txtlaboratorio.getText(),0,0,0);
        if(dao.insertar(m)){
            JOptionPane.showMessageDialog(this, "Se ha agregado un medicamento correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido agregar el medicamento");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar1ActionPerformed
        Medicamento m = new Medicamento(Integer.parseInt(txtcodigo.getText()),
                                        txtnombre.getText(),
                                        txtformato.getText(),
                                        txtgr.getText(),
                                        txtlaboratorio.getText(),0,0,0);
        if(dao.modificar(m)){
            JOptionPane.showMessageDialog(this, "Se ha modificado correctamente el medicamento");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido modificar el medicamento");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnmodificar1ActionPerformed

    private void tablamedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamedicamentosMouseClicked
        this.txtcodigo.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 0).toString());
        VistaMedicamentos.txtnombre.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 1).toString());
        VistaMedicamentos.txtformato.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 2).toString());
        VistaMedicamentos.txtgr.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 3).toString());
        VistaMedicamentos.txtlaboratorio.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 4).toString());
        txtcodigo.setEnabled(false);
    }//GEN-LAST:event_tablamedicamentosMouseClicked

    private void tablamedicamentosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablamedicamentosKeyReleased
        this.txtcodigo.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 0).toString());
        VistaMedicamentos.txtnombre.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 1).toString());
        VistaMedicamentos.txtformato.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 2).toString());
        VistaMedicamentos.txtgr.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 3).toString());
        VistaMedicamentos.txtlaboratorio.setText(tablamedicamentos.getValueAt(tablamedicamentos.getSelectedRow(), 4).toString());
        txtcodigo.setEnabled(false);
    }//GEN-LAST:event_tablamedicamentosKeyReleased

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        cargarBuscar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        VistaFarmaceutico vf = new VistaFarmaceutico();
        vf.lblnombre.setText(lblnombre.getText());
        vf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaMedicamentos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public keeptoo.KButton btnagregar;
    public keeptoo.KButton btneliminar;
    public keeptoo.KButton btnlimpiar;
    public keeptoo.KButton btnmodificar1;
    public keeptoo.KButton btnvolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblGr;
    private javax.swing.JLabel lblLaboratorio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblbienvenido;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    public javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblversion;
    private keeptoo.KGradientPanel panelabajo;
    private keeptoo.KGradientPanel panelarriba1;
    private keeptoo.KGradientPanel panelarriba2;
    private keeptoo.KGradientPanel panelderecho;
    private keeptoo.KGradientPanel panelizquierdo;
    private javax.swing.JPanel panelprincipal;
    public static javax.swing.JTable tablamedicamentos;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtformato;
    public static javax.swing.JTextField txtgr;
    public static javax.swing.JTextField txtlaboratorio;
    public static javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

}

/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package vista;

import dao.MedicamentoDAO;
import dao.ReposicionMedicamentoDAO;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ReposicionMedicamento;

public class VistaReposicionMedicamento extends javax.swing.JFrame implements Runnable{
    
    String columnas[] = {"CODIGO","NOMBRE","FORMATO","GR/ML","LABORATORIO","DISPONIBLE"};
    String columnas2[] = {"ID","CODIGO","CANTIDAD","REPOSICION","VENCIMIENTO","FARMACEUTICO"};
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    DefaultTableModel modelo2 = new DefaultTableModel(columnas2,0);
    MedicamentoDAO dao = new MedicamentoDAO();
    ReposicionMedicamentoDAO dao2 = new ReposicionMedicamentoDAO();
    ArrayList<Object[]> data = new ArrayList<>();
    ArrayList<Object[]> data2 = new ArrayList<>();
    int hora, minutos, segundos;
    Calendar calendario;
    Thread h1;
    
    public VistaReposicionMedicamento() {
        initComponents();
        setSize(825, 498);
        setResizable(false);
        setLocationRelativeTo(null);		
        setVisible(true); 
        cargar();
        cargarReposicion();
        lblfecha.setText(fecha());
        h1 = new Thread(this);
        h1.start();
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/recursos/icono12x12.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
        idreposicion.setEnabled(false);
    }
    
    private void cargar(){
        this.data = dao.consultar();
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablamedicamentos.setModel(modelo);
    }
    
    private void cargarReposicion(){
        this.data2 = dao2.consultar();
        modelo2.setNumRows(0);
        this.data2.forEach((dato) -> {
            this.modelo2.addRow(dato);
        });
        tablamedicamentosrespuestos.setModel(modelo2);
    }
    
    private void filtrar(String valor){
        this.data = dao.filtrar(valor);
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablamedicamentos.setModel(modelo);
    }
    
    private void filtrarClick(String dao){
        this.data2 = dao2.filtrarClick(dao);
        modelo2.setNumRows(0);
        this.data2.forEach((dato) -> {
            this.modelo2.addRow(dato);
        });
        tablamedicamentosrespuestos.setModel(modelo2);
    }
    
    public static String fecha(){
        java.util.Date fecha = new java.util.Date();
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
        txtbuscar = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        lblcantidad = new javax.swing.JLabel();
        btnagregar = new keeptoo.KButton();
        btneliminar = new keeptoo.KButton();
        btnlimpiar = new keeptoo.KButton();
        btnvolver = new keeptoo.KButton();
        lblversion = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblbuscar = new javax.swing.JLabel();
        lbllogo1 = new javax.swing.JLabel();
        lbllogo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablamedicamentos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablamedicamentosrespuestos = new javax.swing.JTable();
        lblsubtitulo1 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lblCodigo1 = new javax.swing.JLabel();
        lblcantidad1 = new javax.swing.JLabel();
        lblbienvenido = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        vencimientoChooser = new rojeru_san.componentes.RSDateChooser();
        reposicionChooser = new rojeru_san.componentes.RSDateChooser();
        lblcantidad2 = new javax.swing.JLabel();
        idreposicion = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();

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

        txtbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(33, 52, 110));
        txtbuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });
        panelprincipal.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 280, 30));

        txtcantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(33, 52, 110));
        txtcantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 160, 30));

        lblcantidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcantidad.setForeground(new java.awt.Color(33, 52, 110));
        lblcantidad.setText("REPOSICION");
        panelprincipal.add(lblcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnagregar.setText("REPONER");
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
        panelprincipal.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, 30));

        btneliminar.setText("ELIMINAR");
        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btneliminar.setkEndColor(new java.awt.Color(255, 255, 255));
        btneliminar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btneliminar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btneliminar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btneliminar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btneliminar.setkStartColor(new java.awt.Color(33, 52, 110));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        panelprincipal.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, 30));

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
        panelprincipal.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 90, 30));

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
        panelprincipal.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 90, 30));

        lblversion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblversion.setForeground(new java.awt.Color(33, 52, 110));
        lblversion.setText("v3.0");
        panelprincipal.add(lblversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(33, 52, 110));
        lblfecha.setText("DD/MM/YYYY");
        panelprincipal.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        lblhora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(33, 52, 110));
        lblhora.setText("00:00:00");
        panelprincipal.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo.setText("GESTION DE CONTROL DE STOCK Y ENTREGA DE MEDICAMENTOS CESTOCK");
        panelprincipal.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbuscar.setText("BUSCAR");
        panelprincipal.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 40));

        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

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
        jScrollPane2.setViewportView(tablamedicamentos);

        panelprincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 110, 410, 300));

        tablamedicamentosrespuestos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        tablamedicamentosrespuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablamedicamentosrespuestos.setGridColor(new java.awt.Color(255, 255, 255));
        tablamedicamentosrespuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamedicamentosrespuestosMouseClicked(evt);
            }
        });
        tablamedicamentosrespuestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablamedicamentosrespuestosKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablamedicamentosrespuestos);

        panelprincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 180));

        lblsubtitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsubtitulo1.setText("MEDICAMENTOS REPUESTOS");
        panelprincipal.add(lblsubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 30));

        txtcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(33, 52, 110));
        txtcodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 90, 30));

        lblCodigo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(33, 52, 110));
        lblCodigo1.setText("ID");
        panelprincipal.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lblcantidad1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcantidad1.setForeground(new java.awt.Color(33, 52, 110));
        lblcantidad1.setText("CANTIDAD");
        panelprincipal.add(lblcantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        lblbienvenido.setText("BIENVENIDO(A):");
        panelprincipal.add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        lblnombre.setText("NOMBRE USUARIO");
        panelprincipal.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 120, -1));

        vencimientoChooser.setColorBackground(new java.awt.Color(33, 52, 110));
        vencimientoChooser.setColorSelForeground(new java.awt.Color(33, 52, 110));
        vencimientoChooser.setFormatoFecha("dd-MM-yyyy");
        vencimientoChooser.setPlaceholder("Fecha Vencimiento");
        panelprincipal.add(vencimientoChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 160, 30));

        reposicionChooser.setColorBackground(new java.awt.Color(33, 52, 110));
        reposicionChooser.setColorForeground(new java.awt.Color(33, 52, 110));
        reposicionChooser.setFormatoFecha("dd-MM-yyyy");
        reposicionChooser.setPlaceholder("Fecha reposicion");
        reposicionChooser.setPreferredSize(new java.awt.Dimension(150, 40));
        panelprincipal.add(reposicionChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 160, 30));

        lblcantidad2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcantidad2.setForeground(new java.awt.Color(33, 52, 110));
        lblcantidad2.setText("VENCIMIENTO");
        panelprincipal.add(lblcantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        idreposicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idreposicionActionPerformed(evt);
            }
        });
        panelprincipal.add(idreposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 80, 30));

        lblCodigo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(33, 52, 110));
        lblCodigo2.setText("CODIGO");
        panelprincipal.add(lblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

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
        String formatoFecha = "dd-MM-yyyy";
        Date fecha = vencimientoChooser.getDatoFecha();
        Date fecha2 = reposicionChooser.getDatoFecha();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
        ReposicionMedicamento rm = new ReposicionMedicamento
                            (Integer.parseInt(idreposicion.getText()),Integer.parseInt(txtcodigo.getText()),
                                    Integer.parseInt(txtcantidad.getText()),
                                    formateador.format(fecha2),
                                    formateador.format(fecha),
                                    lblnombre.getText());
        if(dao2.eliminar(rm)){
            JOptionPane.showMessageDialog(this, "Se ha eliminado una nueva reposición correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido realizar la reposición");
        }
        cargarReposicion(); 
        cargar(); 
        txtcodigo.setEnabled(true);
        txtcantidad.setEnabled(true);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        String formatoFecha = "dd-MM-yyyy";
        Date fecha = vencimientoChooser.getDatoFecha();
        Date fecha2 = reposicionChooser.getDatoFecha();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
        ReposicionMedicamento rm = new ReposicionMedicamento
                            (Integer.parseInt(txtcodigo.getText()),Integer.parseInt(txtcodigo.getText()),
                                    Integer.parseInt(txtcantidad.getText()),
                                    formateador.format(fecha2),
                                    formateador.format(fecha),
                                    lblnombre.getText());
        if(dao2.insertar(rm)){
            JOptionPane.showMessageDialog(this, "Se ha agregado una nueva reposición correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido realizar la reposición");
        }
        cargarReposicion();
        cargar();
        txtcodigo.setEnabled(true);
        txtcantidad.setEnabled(true);
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void tablamedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamedicamentosMouseClicked
        int filaseleccionada = tablamedicamentos.rowAtPoint(evt.getPoint());
        int filaseleccionada2 = tablamedicamentos.getSelectedRow();
        String dao = (String)tablamedicamentos.getValueAt(filaseleccionada2, 0);
        txtcodigo.setText(tablamedicamentos.getValueAt(filaseleccionada,0).toString());
        txtcantidad.setText("");
        filtrarClick(dao);
        reposicionChooser.setDatoFecha(null);
        vencimientoChooser.setDatoFecha(null);
    }//GEN-LAST:event_tablamedicamentosMouseClicked

    private void tablamedicamentosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablamedicamentosKeyReleased
        int filaseleccionada = tablamedicamentos.getSelectedRow();
        int filaseleccionada2 = tablamedicamentos.getSelectedRow();
        String dao = (String)tablamedicamentos.getValueAt(filaseleccionada2, 0);
        txtcodigo.setText(tablamedicamentos.getValueAt(filaseleccionada,0).toString());      
        txtcantidad.setText("");
        filtrarClick(dao);
        reposicionChooser.setDatoFecha(null);
        vencimientoChooser.setDatoFecha(null);
    }//GEN-LAST:event_tablamedicamentosKeyReleased

    private void tablamedicamentosrespuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamedicamentosrespuestosMouseClicked
        int filaseleccionada = tablamedicamentosrespuestos.rowAtPoint(evt.getPoint());
        idreposicion.setText(tablamedicamentosrespuestos.getValueAt(filaseleccionada,0).toString());
        txtcodigo.setText(tablamedicamentosrespuestos.getValueAt(filaseleccionada,1).toString());
        txtcantidad.setText(tablamedicamentosrespuestos.getValueAt(filaseleccionada,2).toString());
        reposicionChooser.setDatoFecha((Date)tablamedicamentosrespuestos.getValueAt(filaseleccionada,3));
        vencimientoChooser.setDatoFecha((Date)tablamedicamentosrespuestos.getValueAt(filaseleccionada,4));
        txtcodigo.setEnabled(false);
        txtcantidad.setEnabled(false);

    }//GEN-LAST:event_tablamedicamentosrespuestosMouseClicked

    private void tablamedicamentosrespuestosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablamedicamentosrespuestosKeyReleased
        int filaseleccionada = tablamedicamentosrespuestos.getSelectedRow();
        idreposicion.setText(tablamedicamentosrespuestos.getValueAt(filaseleccionada,0).toString());
        txtcodigo.setText(tablamedicamentosrespuestos.getValueAt(filaseleccionada,1).toString());
        txtcantidad.setText(tablamedicamentosrespuestos.getValueAt(filaseleccionada,2).toString());
        reposicionChooser.setDatoFecha((Date)tablamedicamentosrespuestos.getValueAt(filaseleccionada,3));
        vencimientoChooser.setDatoFecha((Date)tablamedicamentosrespuestos.getValueAt(filaseleccionada,4));
        txtcodigo.setEnabled(false);
        txtcantidad.setEnabled(false);
    }//GEN-LAST:event_tablamedicamentosrespuestosKeyReleased

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        filtrar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        VistaFarmaceutico vf = new VistaFarmaceutico();
        vf.lblnombre.setText(lblnombre.getText());
        vf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        btnagregar.setEnabled(true);
        idreposicion.setText(" ");
        txtcodigo.setText(" ");
        txtcantidad.setText(" ");
        reposicionChooser.setDatoFecha(null);
        vencimientoChooser.setDatoFecha(null);
        txtcodigo.setEnabled(true);
        txtcantidad.setEnabled(true);

        cargarReposicion();
        cargar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void idreposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idreposicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idreposicionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaReposicionMedicamento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public keeptoo.KButton btnagregar;
    public keeptoo.KButton btneliminar;
    public keeptoo.KButton btnlimpiar;
    public keeptoo.KButton btnvolver;
    private javax.swing.JTextField idreposicion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblbienvenido;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblcantidad1;
    private javax.swing.JLabel lblcantidad2;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    public javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsubtitulo1;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblversion;
    private keeptoo.KGradientPanel panelabajo;
    private keeptoo.KGradientPanel panelarriba1;
    private keeptoo.KGradientPanel panelarriba2;
    private keeptoo.KGradientPanel panelderecho;
    private keeptoo.KGradientPanel panelizquierdo;
    private javax.swing.JPanel panelprincipal;
    private rojeru_san.componentes.RSDateChooser reposicionChooser;
    public static javax.swing.JTable tablamedicamentos;
    public static javax.swing.JTable tablamedicamentosrespuestos;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txtcantidad;
    public javax.swing.JTextField txtcodigo;
    private rojeru_san.componentes.RSDateChooser vencimientoChooser;
    // End of variables declaration//GEN-END:variables
}

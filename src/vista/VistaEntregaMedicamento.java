/** SATELITE CESTOCK 2020 ** @author Nicolás Miranda * */
package vista;

import dao.AtencionMedicaDAO;
import dao.MedicamentoRecetadoDAO;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaEntregaMedicamento extends javax.swing.JFrame implements Runnable {

    String columnas[] = {"ID RECETA", "ID ATENCIÓN", "NRO FICHA", "RUT PACIENTE", "FECHA RECETA"};
    String columnas2[] = {"ID RECETA", "ID MED RECETADO", "ID MEDICAMENTO", "DURACIÓN", "FRECUENCIA", "CANT. RECETADA"};
    String columnas3[] = {};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    DefaultTableModel modelo2 = new DefaultTableModel(columnas2, 0);
    AtencionMedicaDAO dao = new AtencionMedicaDAO();
    MedicamentoRecetadoDAO dao2 = new MedicamentoRecetadoDAO();
    ArrayList<Object[]> data = new ArrayList<>();
    ArrayList<Object[]> data2 = new ArrayList<>();
    int hora, minutos, segundos;
    Calendar calendario;
    Thread h1;

    public VistaEntregaMedicamento() {
        initComponents();
        setSize(1177, 579);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        lblfecha.setText(fecha());
        h1 = new Thread(this);
        h1.start();
        cargar();
        cargarRecetados();
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/recursos/icono12x12.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
        idmedicamento.setEnabled(false);
    }

    private void cargar() {
        this.data = dao.consultar();
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablarecetasmedicas.setModel(modelo);
    }

    private void cargarRecetados(){
        this.data2 = dao2.consultar();
        modelo2.setNumRows(0);
        this.data2.forEach((dato) -> {
            this.modelo2.addRow(dato);
        });
        tablamedicamentosrecetados.setModel(modelo2);
    }
    
    private void filtrar(String valor) {
        this.data = dao.filtrar(valor);
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablarecetasmedicas.setModel(modelo);
    }

    private void filtrarClick(String dao) {
        this.data2 = dao2.filtrarClick(dao);
        modelo2.setNumRows(0);
        this.data2.forEach((dato) -> {
            this.modelo2.addRow(dato);
        });
        tablamedicamentosrecetados.setModel(modelo2);
    }

    public static String fecha() {
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

    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY) - 1;
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        panelarriba1 = new keeptoo.KGradientPanel();
        panelderecho = new keeptoo.KGradientPanel();
        panelabajo = new keeptoo.KGradientPanel();
        panelizquierdo = new keeptoo.KGradientPanel();
        panelarriba2 = new keeptoo.KGradientPanel();
        txtbuscar = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnentregar = new keeptoo.KButton();
        btnreservar = new keeptoo.KButton();
        btnlimpiar = new keeptoo.KButton();
        btnmedicamentosentregados = new keeptoo.KButton();
        lblversion = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblbuscar = new javax.swing.JLabel();
        lbllogo1 = new javax.swing.JLabel();
        lbllogo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablamedicamentosreservados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablamedicamentosrecetados = new javax.swing.JTable();
        lblsubtitulo1 = new javax.swing.JLabel();
        idmedicamento = new javax.swing.JTextField();
        lblcantidad1 = new javax.swing.JLabel();
        lblbienvenido = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblCodigo2 = new javax.swing.JLabel();
        lblsubtitulo2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablarecetasmedicas = new javax.swing.JTable();
        lblsubtitulo3 = new javax.swing.JLabel();
        btnvolver = new keeptoo.KButton();
        btnverstock = new keeptoo.KButton();
        btnveratencion = new keeptoo.KButton();

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

        panelprincipal.add(panelarriba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 10));

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

        panelprincipal.add(panelderecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 10, 540));

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

        panelprincipal.add(panelabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1160, 10));

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

        panelprincipal.add(panelizquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 550));

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

        panelprincipal.add(panelarriba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1160, 10));

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
        panelprincipal.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 280, 30));

        txtcantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(33, 52, 110));
        txtcantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 200, 30));

        btnentregar.setText("ENTREGAR");
        btnentregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnentregar.setkEndColor(new java.awt.Color(255, 255, 255));
        btnentregar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnentregar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnentregar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnentregar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnentregar.setkStartColor(new java.awt.Color(33, 52, 110));
        btnentregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentregarActionPerformed(evt);
            }
        });
        panelprincipal.add(btnentregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 110, 30));

        btnreservar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnreservar.setkEndColor(new java.awt.Color(255, 255, 255));
        btnreservar.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnreservar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnreservar.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnreservar.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnreservar.setkStartColor(new java.awt.Color(33, 52, 110));
        btnreservar.setLabel("RESERVAR");
        btnreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservarActionPerformed(evt);
            }
        });
        panelprincipal.add(btnreservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 110, 30));

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
        panelprincipal.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 110, 30));

        btnmedicamentosentregados.setText("ENTREGADOS");
        btnmedicamentosentregados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmedicamentosentregados.setkEndColor(new java.awt.Color(255, 255, 255));
        btnmedicamentosentregados.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnmedicamentosentregados.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnmedicamentosentregados.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnmedicamentosentregados.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnmedicamentosentregados.setkStartColor(new java.awt.Color(33, 52, 110));
        btnmedicamentosentregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmedicamentosentregadosActionPerformed(evt);
            }
        });
        panelprincipal.add(btnmedicamentosentregados, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 110, 30));

        lblversion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblversion.setForeground(new java.awt.Color(33, 52, 110));
        lblversion.setText("v3.0");
        panelprincipal.add(lblversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, -1, -1));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(33, 52, 110));
        lblfecha.setText("DD/MM/YYYY");
        panelprincipal.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, -1, -1));

        lblhora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(33, 52, 110));
        lblhora.setText("00:00:00");
        panelprincipal.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, -1, -1));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo.setText("GESTIÓN DE CONTROL DE STOCK Y ENTREGA DE MEDICAMENTOS CESTOCK");
        panelprincipal.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbuscar.setText("BUSCAR");
        panelprincipal.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 40, 40));

        lbllogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        tablamedicamentosreservados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        tablamedicamentosreservados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablamedicamentosreservados.setGridColor(new java.awt.Color(255, 255, 255));
        tablamedicamentosreservados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamedicamentosreservadosMouseClicked(evt);
            }
        });
        tablamedicamentosreservados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablamedicamentosreservadosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablamedicamentosreservados);

        panelprincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 350, 250));

        tablamedicamentosrecetados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        tablamedicamentosrecetados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablamedicamentosrecetados.setGridColor(new java.awt.Color(255, 255, 255));
        tablamedicamentosrecetados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamedicamentosrecetadosMouseClicked(evt);
            }
        });
        tablamedicamentosrecetados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablamedicamentosrecetadosKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablamedicamentosrecetados);

        panelprincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 250));

        lblsubtitulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsubtitulo1.setText("MEDICAMENTOS RESERVADOS");
        panelprincipal.add(lblsubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, 30));

        idmedicamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idmedicamento.setForeground(new java.awt.Color(33, 52, 110));
        idmedicamento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(idmedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 200, 30));

        lblcantidad1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcantidad1.setForeground(new java.awt.Color(33, 52, 110));
        lblcantidad1.setText("CANTIDAD");
        panelprincipal.add(lblcantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        lblbienvenido.setText("BIENVENIDO(A):");
        panelprincipal.add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        lblnombre.setText("NOMBRE USUARIO");
        panelprincipal.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 120, -1));

        lblCodigo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(33, 52, 110));
        lblCodigo2.setText("ID MEDICAMENTO");
        panelprincipal.add(lblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        lblsubtitulo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsubtitulo2.setText("MEDICAMENTOS RECETADOS");
        panelprincipal.add(lblsubtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 30));

        tablarecetasmedicas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        tablarecetasmedicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablarecetasmedicas.setGridColor(new java.awt.Color(255, 255, 255));
        tablarecetasmedicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablarecetasmedicasMouseClicked(evt);
            }
        });
        tablarecetasmedicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablarecetasmedicasKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tablarecetasmedicas);

        panelprincipal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 350, 250));

        lblsubtitulo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsubtitulo3.setText("LISTA DE RECETAS MÉDICAS");
        panelprincipal.add(lblsubtitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 30));

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
        panelprincipal.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, 110, 30));

        btnverstock.setText("VER STOCK");
        btnverstock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnverstock.setkEndColor(new java.awt.Color(255, 255, 255));
        btnverstock.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnverstock.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnverstock.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnverstock.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnverstock.setkStartColor(new java.awt.Color(33, 52, 110));
        btnverstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverstockActionPerformed(evt);
            }
        });
        panelprincipal.add(btnverstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 110, 30));

        btnveratencion.setText("VER ATENCIÓN");
        btnveratencion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnveratencion.setkEndColor(new java.awt.Color(255, 255, 255));
        btnveratencion.setkHoverEndColor(new java.awt.Color(33, 52, 110));
        btnveratencion.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnveratencion.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnveratencion.setkSelectedColor(new java.awt.Color(102, 255, 102));
        btnveratencion.setkStartColor(new java.awt.Color(33, 52, 110));
        btnveratencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnveratencionActionPerformed(evt);
            }
        });
        panelprincipal.add(btnveratencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablarecetasmedicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablarecetasmedicasKeyReleased
        int filaseleccionada = tablarecetasmedicas.getSelectedRow();
        int filaseleccionada2 = tablarecetasmedicas.getSelectedRow();
        String dao = (String) tablarecetasmedicas.getValueAt(filaseleccionada2, 0);
        System.out.println(dao);
        idmedicamento.setText(tablarecetasmedicas.getValueAt(filaseleccionada,0).toString());      
        txtcantidad.setText("");
        filtrarClick(dao);
    }//GEN-LAST:event_tablarecetasmedicasKeyReleased

    private void tablarecetasmedicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablarecetasmedicasMouseClicked
        int filaseleccionada = tablarecetasmedicas.rowAtPoint(evt.getPoint());
        int filaseleccionada2 = tablarecetasmedicas.getSelectedRow();
        String dao = (String) tablarecetasmedicas.getValueAt(filaseleccionada2, 0);
        System.out.println(dao);
        idmedicamento.setText(tablarecetasmedicas.getValueAt(filaseleccionada,0).toString());      
        txtcantidad.setText("");
        filtrarClick(dao);
    }//GEN-LAST:event_tablarecetasmedicasMouseClicked

    private void tablamedicamentosrecetadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablamedicamentosrecetadosKeyReleased
        int filaseleccionada = tablamedicamentosrecetados.getSelectedRow();
        idmedicamento.setText(tablamedicamentosrecetados.getValueAt(filaseleccionada,1).toString());
        txtcantidad.setText(tablamedicamentosrecetados.getValueAt(filaseleccionada,5).toString());
        txtcantidad.setEnabled(false);
    }//GEN-LAST:event_tablamedicamentosrecetadosKeyReleased

    private void tablamedicamentosrecetadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamedicamentosrecetadosMouseClicked
        int filaseleccionada = tablamedicamentosrecetados.rowAtPoint(evt.getPoint());
        idmedicamento.setText(tablamedicamentosrecetados.getValueAt(filaseleccionada,1).toString());
        txtcantidad.setText(tablamedicamentosrecetados.getValueAt(filaseleccionada,5).toString());
        txtcantidad.setEnabled(false);
    }//GEN-LAST:event_tablamedicamentosrecetadosMouseClicked

    private void tablamedicamentosreservadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablamedicamentosreservadosKeyReleased
        //        int filaseleccionada = tablamedicamentosreservados.getSelectedRow();
        //        int filaseleccionada2 = tablamedicamentosreservados.getSelectedRow();
        //        String dao = (String)tablamedicamentosreservados.getValueAt(filaseleccionada2, 0);
        //        txtcodigo.setText(tablamedicamentosreservados.getValueAt(filaseleccionada,0).toString());
        //        txtcantidad.setText(" ");
        //        filtrarClick(dao);
        //        reposicionChooser.setDatoFecha(null);
        //        vencimientoChooser.setDatoFecha(null);
    }//GEN-LAST:event_tablamedicamentosreservadosKeyReleased

    private void tablamedicamentosreservadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamedicamentosreservadosMouseClicked
        //        int filaseleccionada = tablamedicamentosreservados.rowAtPoint(evt.getPoint());
        //        int filaseleccionada2 = tablamedicamentosreservados.getSelectedRow();
        //        String dao = (String)tablamedicamentosreservados.getValueAt(filaseleccionada2, 0);
        //        txtcodigo.setText(tablamedicamentosreservados.getValueAt(filaseleccionada,0).toString());
        //        txtcantidad.setText(" ");
        //        filtrarClick(dao);
        //        reposicionChooser.setDatoFecha(null);
        //        vencimientoChooser.setDatoFecha(null);
    }//GEN-LAST:event_tablamedicamentosreservadosMouseClicked

    private void btnmedicamentosentregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmedicamentosentregadosActionPerformed

    }//GEN-LAST:event_btnmedicamentosentregadosActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
//        btnentregar.setEnabled(true);
//        idreposicion.setText(" ");
//        txtcodigo.setText(" ");
//        txtcantidad.setText(" ");
//        reposicionChooser.setDatoFecha(null);
//        vencimientoChooser.setDatoFecha(null);
//        txtcodigo.setEnabled(true);
//        txtcantidad.setEnabled(true);
//
//        cargarReposicion();
//        cargar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservarActionPerformed
//        String formatoFecha = "dd-MM-yyyy";
//        Date fecha = vencimientoChooser.getDatoFecha();
//        Date fecha2 = reposicionChooser.getDatoFecha();
//        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
//        ReposicionMedicamento rm = new ReposicionMedicamento
//        (Integer.parseInt(idreposicion.getText()),Integer.parseInt(txtcodigo.getText()),
//            Integer.parseInt(txtcantidad.getText()),
//            formateador.format(fecha2),
//            formateador.format(fecha),
//            lblnombre.getText());
//        if(dao2.eliminar(rm)){
//            JOptionPane.showMessageDialog(this, "Se ha eliminado una nueva reposición correctamente");
//        }else{
//            JOptionPane.showMessageDialog(this, "Error, no se ha podido realizar la reposición");
//        }
//        cargarReposicion();
//        cargar();
//        txtcodigo.setEnabled(true);
//        txtcantidad.setEnabled(true);
    }//GEN-LAST:event_btnreservarActionPerformed

    private void btnentregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentregarActionPerformed
//        String formatoFecha = "dd-MM-yyyy";
//        Date fecha = vencimientoChooser.getDatoFecha();
//        Date fecha2 = reposicionChooser.getDatoFecha();
//        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
//        ReposicionMedicamento rm = new ReposicionMedicamento
//        (Integer.parseInt(txtcodigo.getText()),Integer.parseInt(txtcodigo.getText()),
//            Integer.parseInt(txtcantidad.getText()),
//            formateador.format(fecha2),
//            formateador.format(fecha),
//            lblnombre.getText());
//        if(dao2.insertar(rm)){
//            JOptionPane.showMessageDialog(this, "Se ha agregado una nueva reposición correctamente");
//        }else{
//            JOptionPane.showMessageDialog(this, "Error, no se ha podido realizar la reposición");
//        }
//        cargarReposicion();
//        cargar();
//        txtcodigo.setEnabled(true);
//        txtcantidad.setEnabled(true);
    }//GEN-LAST:event_btnentregarActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped

    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        filtrar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        VistaFarmaceutico vf = new VistaFarmaceutico();
        vf.lblnombre.setText(lblnombre.getText());
        vf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnverstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnverstockActionPerformed

    private void btnveratencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnveratencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnveratencionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaEntregaMedicamento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public keeptoo.KButton btnentregar;
    public keeptoo.KButton btnlimpiar;
    public keeptoo.KButton btnmedicamentosentregados;
    public keeptoo.KButton btnreservar;
    public keeptoo.KButton btnveratencion;
    public keeptoo.KButton btnverstock;
    public keeptoo.KButton btnvolver;
    public javax.swing.JTextField idmedicamento;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblbienvenido;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JLabel lblcantidad1;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    public javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsubtitulo1;
    private javax.swing.JLabel lblsubtitulo2;
    private javax.swing.JLabel lblsubtitulo3;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblversion;
    private keeptoo.KGradientPanel panelabajo;
    private keeptoo.KGradientPanel panelarriba1;
    private keeptoo.KGradientPanel panelarriba2;
    private keeptoo.KGradientPanel panelderecho;
    private keeptoo.KGradientPanel panelizquierdo;
    private javax.swing.JPanel panelprincipal;
    public static javax.swing.JTable tablamedicamentosrecetados;
    public static javax.swing.JTable tablamedicamentosreservados;
    public static javax.swing.JTable tablarecetasmedicas;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}

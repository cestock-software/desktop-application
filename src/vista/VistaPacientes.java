/** SATELITE CESTOCK 2020 ** @author Hans Benavides **/
package vista;

import dao.PacienteDAO;
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
import modelo.Paciente;

public class VistaPacientes extends javax.swing.JFrame implements Runnable{
    
    String columnas[] = {"RUT","NOMBRE","PATERNO","MATERNO","DIRECCION","EMAIL",
                         "CELULAR","F.NAC","SEXO","COMUNA","FAMILIAR","T_FAMILIAR","E_FAMILIAR"};
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);
    PacienteDAO dao = new PacienteDAO();
    ArrayList<Object[]> data = new ArrayList<>();
    int hora, minutos, segundos;
    Calendar calendario;
    Thread h1;
    
    public VistaPacientes() {
        initComponents();
        setSize(1135, 620);
        setResizable(false);
        setLocationRelativeTo(null);		
        setVisible(true); 
        cargar();
        h1 = new Thread(this);
        h1.start();
        lblfecha.setText(fecha());
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/recursos/icono12x12.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
    }
    
    private void cargar(){
        this.data = dao.consultar();
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablapacientes.setModel(modelo);
    }
    
    private void cargarBuscar(String valor){
        this.data = dao.filtrar(valor);
        modelo.setNumRows(0);
        this.data.forEach((dato) -> {
            this.modelo.addRow(dato);
        });
        tablapacientes.setModel(modelo);
    }
    
    private void limpiar(){
        txtrut.setText("");
        txtnombre.setText("");
        txtpaterno.setText("");
        txtmaterno.setText("");
        txtdireccion.setText("");
        txtemail.setText("");
        txtcelular.setText("");
        fechanacimiento.setDatoFecha(null);
        txtsexo.setText("");
        txtcomuna.setText("");
        txtnombrefamiliar.setText("");
        txttelefonofamiliar.setText("");
        txtemailfamiliar.setText("");
        txtrut.setEnabled(true);
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
        tablapacientes = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        txtrut = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtpaterno = new javax.swing.JTextField();
        txtmaterno = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
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
        lblbuscar = new javax.swing.JLabel();
        lbllogo1 = new javax.swing.JLabel();
        lbllogo2 = new javax.swing.JLabel();
        btnmodificar1 = new keeptoo.KButton();
        lblCodigo1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        lblFormato1 = new javax.swing.JLabel();
        txtcomuna = new javax.swing.JTextField();
        lblGr1 = new javax.swing.JLabel();
        txtnombrefamiliar = new javax.swing.JTextField();
        lblLaboratorio1 = new javax.swing.JLabel();
        txttelefonofamiliar = new javax.swing.JTextField();
        lblLaboratorio2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblLaboratorio3 = new javax.swing.JLabel();
        txtemailfamiliar = new javax.swing.JTextField();
        lblLaboratorio4 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        fechanacimiento = new rojeru_san.componentes.RSDateChooser();

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

        panelprincipal.add(panelarriba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 10));

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

        panelprincipal.add(panelabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1130, 10));

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

        panelprincipal.add(panelizquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 580));

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

        panelprincipal.add(panelderecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 10, 580));

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

        panelprincipal.add(panelarriba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1120, 10));

        tablapacientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        tablapacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablapacientes.setGridColor(new java.awt.Color(255, 255, 255));
        tablapacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapacientesMouseClicked(evt);
            }
        });
        tablapacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablapacientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablapacientes);

        panelprincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1080, 290));

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
        panelprincipal.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 480, 30));

        txtrut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtrut.setForeground(new java.awt.Color(33, 52, 110));
        txtrut.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, 30));

        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(33, 52, 110));
        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 30));

        txtpaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpaterno.setForeground(new java.awt.Color(33, 52, 110));
        txtpaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtpaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 30));

        txtmaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmaterno.setForeground(new java.awt.Color(33, 52, 110));
        txtmaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 160, 30));

        txtdireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtdireccion.setForeground(new java.awt.Color(33, 52, 110));
        txtdireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 30));

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(33, 52, 110));
        lblCodigo.setText("RUT");
        panelprincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(33, 52, 110));
        lblNombre.setText("NOMBRE");
        panelprincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblFormato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormato.setForeground(new java.awt.Color(33, 52, 110));
        lblFormato.setText("A. PATERNO");
        panelprincipal.add(lblFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblGr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGr.setForeground(new java.awt.Color(33, 52, 110));
        lblGr.setText("A.MATERNO");
        panelprincipal.add(lblGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        lblLaboratorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLaboratorio.setForeground(new java.awt.Color(33, 52, 110));
        lblLaboratorio.setText("DIRECCION");
        panelprincipal.add(lblLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

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
        panelprincipal.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 90, 40));

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
        panelprincipal.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 90, 40));

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
        panelprincipal.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, 90, 40));

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
        panelprincipal.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 90, 40));

        lblversion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblversion.setForeground(new java.awt.Color(33, 52, 110));
        lblversion.setText("v3.0");
        panelprincipal.add(lblversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 550, -1, -1));

        lblfecha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(33, 52, 110));
        lblfecha.setText("DD/MM/YYYY");
        panelprincipal.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        lblhora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(33, 52, 110));
        lblhora.setText("00:00:00");
        panelprincipal.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

        lblbienvenido.setForeground(new java.awt.Color(33, 52, 110));
        lblbienvenido.setText("BIENVENIDO(A):");
        panelprincipal.add(lblbienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        lbltitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltitulo.setText("GESTION DE CONTROL DE STOCK Y ENTREGA DE MEDICAMENTOS CESTOCK - GESTION PACIENTES");
        panelprincipal.add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lblnombre.setForeground(new java.awt.Color(33, 52, 110));
        lblnombre.setText("NOMBRE USUARIO");
        panelprincipal.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 310, -1));

        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbuscar.setForeground(new java.awt.Color(33, 52, 110));
        lblbuscar.setText("BUSCAR");
        panelprincipal.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 50, -1));

        lbllogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo_33_39.jpg"))); // NOI18N
        panelprincipal.add(lbllogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 40, 40));

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
        panelprincipal.add(btnmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 90, 40));

        lblCodigo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(33, 52, 110));
        lblCodigo1.setText("F. NACIMIENTO");
        panelprincipal.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(33, 52, 110));
        lblNombre1.setText("SEXO");
        panelprincipal.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        txtsexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsexo.setForeground(new java.awt.Color(33, 52, 110));
        txtsexo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        txtsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexoActionPerformed(evt);
            }
        });
        panelprincipal.add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 110, 30));

        lblFormato1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormato1.setForeground(new java.awt.Color(33, 52, 110));
        lblFormato1.setText("COMUNA");
        panelprincipal.add(lblFormato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        txtcomuna.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcomuna.setForeground(new java.awt.Color(33, 52, 110));
        txtcomuna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtcomuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 110, 30));

        lblGr1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGr1.setForeground(new java.awt.Color(33, 52, 110));
        lblGr1.setText("N. FAMILIAR");
        panelprincipal.add(lblGr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        txtnombrefamiliar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnombrefamiliar.setForeground(new java.awt.Color(33, 52, 110));
        txtnombrefamiliar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtnombrefamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 110, 30));

        lblLaboratorio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLaboratorio1.setForeground(new java.awt.Color(33, 52, 110));
        lblLaboratorio1.setText("T. FAMILIAR");
        panelprincipal.add(lblLaboratorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        txttelefonofamiliar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttelefonofamiliar.setForeground(new java.awt.Color(33, 52, 110));
        txttelefonofamiliar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txttelefonofamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 110, 30));

        lblLaboratorio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLaboratorio2.setForeground(new java.awt.Color(33, 52, 110));
        lblLaboratorio2.setText("EMAIL");
        panelprincipal.add(lblLaboratorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtemail.setForeground(new java.awt.Color(33, 52, 110));
        txtemail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, 30));

        lblLaboratorio3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLaboratorio3.setForeground(new java.awt.Color(33, 52, 110));
        lblLaboratorio3.setText("E. FAMILIAR");
        panelprincipal.add(lblLaboratorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        txtemailfamiliar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtemailfamiliar.setForeground(new java.awt.Color(33, 52, 110));
        txtemailfamiliar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtemailfamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 110, 30));

        lblLaboratorio4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLaboratorio4.setForeground(new java.awt.Color(33, 52, 110));
        lblLaboratorio4.setText("NRO CELULAR");
        panelprincipal.add(lblLaboratorio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        txtcelular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcelular.setForeground(new java.awt.Color(33, 52, 110));
        txtcelular.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(33, 52, 110)));
        panelprincipal.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, 30));

        fechanacimiento.setColorBackground(new java.awt.Color(33, 52, 110));
        fechanacimiento.setColorForeground(new java.awt.Color(33, 52, 110));
        fechanacimiento.setFormatoFecha("dd-MM-yyyy");
        panelprincipal.add(fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String formatoFecha = "dd-MM-yyyy";
        Date fecha = fechanacimiento.getDatoFecha();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
        
        Paciente p = new Paciente(txtrut.getText(),
                                        txtnombre.getText(),
                                        txtpaterno.getText(),
                                        txtmaterno.getText(),
                                        txtdireccion.getText(),
                                        txtemail.getText(),
                                        txtcelular.getText(),
                                        formateador.format(fecha),
                                        txtsexo.getText(),
                                        txtcomuna.getText(),
                                        txtnombrefamiliar.getText(),
                                        txttelefonofamiliar.getText(),
                                        txtemailfamiliar.getText());
        if(dao.eliminar(p)){
            JOptionPane.showMessageDialog(this, "Se ha eliminado el paciente correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido eliminar el paciente");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
      String formatoFecha = "dd-MM-yyyy";
        Date fecha = fechanacimiento.getDatoFecha();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
        
        Paciente p = new Paciente(txtrut.getText(),
                                        txtnombre.getText(),
                                        txtpaterno.getText(),
                                        txtmaterno.getText(),
                                        txtdireccion.getText(),
                                        txtemail.getText(),
                                        txtcelular.getText(),
                                        formateador.format(fecha),
                                        txtsexo.getText(),
                                        txtcomuna.getText(),
                                        txtnombrefamiliar.getText(),
                                        txttelefonofamiliar.getText(),
                                        txtemailfamiliar.getText());
        if(dao.insertar(p)){
            JOptionPane.showMessageDialog(this, "Se ha agregado el paciente correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido agregar el paciente");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar1ActionPerformed
        String formatoFecha = "dd-MM-yyyy";
        Date fecha = fechanacimiento.getDatoFecha();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
        
        Paciente p = new Paciente(txtrut.getText(),
                                        txtnombre.getText(),
                                        txtpaterno.getText(),
                                        txtmaterno.getText(),
                                        txtdireccion.getText(),
                                        txtemail.getText(),
                                        txtcelular.getText(),
                                        formateador.format(fecha),
                                        txtsexo.getText(),
                                        txtcomuna.getText(),
                                        txtnombrefamiliar.getText(),
                                        txttelefonofamiliar.getText(),
                                        txtemailfamiliar.getText());
        if(dao.modificar(p)){
            JOptionPane.showMessageDialog(this, "Se ha modificado el paciente correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Error, no se ha podido modificar el paciente");
        }
        cargar();
        limpiar();
    }//GEN-LAST:event_btnmodificar1ActionPerformed

    private void tablapacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapacientesMouseClicked
        txtrut.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 0).toString());
        txtnombre.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 1).toString());
        txtpaterno.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 2).toString());
        txtmaterno.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 3).toString());
        txtdireccion.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 4).toString());
        txtemail.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 5).toString());
        txtcelular.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 6).toString());
        fechanacimiento.setDatoFecha((Date)tablapacientes.getValueAt(tablapacientes.getSelectedRow(),7));
        txtsexo.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 8).toString());
        txtcomuna.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 9).toString());
        txtnombrefamiliar.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 10).toString());
        txttelefonofamiliar.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 11).toString());
        txtemailfamiliar.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 12).toString());
        
        txtrut.setEnabled(false);
    }//GEN-LAST:event_tablapacientesMouseClicked

    private void tablapacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablapacientesKeyReleased
        txtrut.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 0).toString());
        txtnombre.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 1).toString());
        txtpaterno.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 2).toString());
        txtmaterno.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 3).toString());
        txtdireccion.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 4).toString());
        txtemail.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 5).toString());
        txtcelular.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 6).toString());
        fechanacimiento.setDatoFecha((Date)tablapacientes.getValueAt(tablapacientes.getSelectedRow(),7));
        txtsexo.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 8).toString());
        txtcomuna.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 9).toString());
        txtnombrefamiliar.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 10).toString());
        txttelefonofamiliar.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 11).toString());
        txtemailfamiliar.setText(tablapacientes.getValueAt(tablapacientes.getSelectedRow(), 12).toString());
        txtrut.setEnabled(false);
    }//GEN-LAST:event_tablapacientesKeyReleased

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        cargarBuscar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        VistaAdministrativo va = new VistaAdministrativo();
        va.lblnombre.setText(lblnombre.getText());
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void txtsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPacientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public keeptoo.KButton btnagregar;
    public keeptoo.KButton btneliminar;
    public keeptoo.KButton btnlimpiar;
    public keeptoo.KButton btnmodificar1;
    public keeptoo.KButton btnvolver;
    private rojeru_san.componentes.RSDateChooser fechanacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblFormato1;
    private javax.swing.JLabel lblGr;
    private javax.swing.JLabel lblGr1;
    private javax.swing.JLabel lblLaboratorio;
    private javax.swing.JLabel lblLaboratorio1;
    private javax.swing.JLabel lblLaboratorio2;
    private javax.swing.JLabel lblLaboratorio3;
    private javax.swing.JLabel lblLaboratorio4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblbienvenido;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lbllogo1;
    private javax.swing.JLabel lbllogo2;
    public javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblversion;
    private keeptoo.KGradientPanel panelabajo;
    private keeptoo.KGradientPanel panelarriba1;
    private keeptoo.KGradientPanel panelarriba2;
    private keeptoo.KGradientPanel panelderecho;
    private keeptoo.KGradientPanel panelizquierdo;
    private javax.swing.JPanel panelprincipal;
    public static javax.swing.JTable tablapacientes;
    public javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtcelular;
    public static javax.swing.JTextField txtcomuna;
    public static javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtemail;
    public static javax.swing.JTextField txtemailfamiliar;
    public static javax.swing.JTextField txtmaterno;
    public static javax.swing.JTextField txtnombre;
    public static javax.swing.JTextField txtnombrefamiliar;
    public static javax.swing.JTextField txtpaterno;
    public javax.swing.JTextField txtrut;
    public static javax.swing.JTextField txtsexo;
    public static javax.swing.JTextField txttelefonofamiliar;
    // End of variables declaration//GEN-END:variables

}

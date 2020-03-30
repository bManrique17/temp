/** *********************************************************************
 * Título:     Proyecto #3 Simulación de una central de telecomunicaciones.
 *
 * Propósito:  Aplicar el uso de grafos a la vida real usando la libreria
 * GraphStream.
 *
 * Clase:      CCC209 – Q3 – 2018
 *
 * Autor:      Bryan Manrique Amador Mena
 *
 * Fecha:      13 - agosto - 2018
 *********************************************************************** */
package Principal;

//librerias necesarias
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.algorithm.Kruskal;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

//Declaracion de JFrame principal
public class Home extends javax.swing.JFrame {

//  Constructor del JFrame principal
//  Params: N/A          
//  Returna: N/A
//  Errores: N/A
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        GrafoRedDeTelecomunicacion = new SingleGraph("Grafo Principal");
        GrafoRedDeTelecomunicacion.setStrict(false);
        enlacesDedicados = 0;
        enlacesHogarHogar = 0;
        styleSheet = "";
        
        //formatear los cuadros de avisos
        String avisoEstadoFinanciero = jl_avisoEstadoFinanciero.getText();
        jl_avisoEstadoFinanciero.setText("<html><body><P ALIGN=\"justify\">" + avisoEstadoFinanciero + "</html></body>");

        String avisoTransmisionSenal = jl_avisoTransmisionSenal.getText();
        jl_avisoTransmisionSenal.setText("<html><body><P ALIGN=\"justify\">" + avisoTransmisionSenal + "</html></body>");

        String avisoTerminalesCriticas = jl_avisoTerminalesCriticas.getText();
        jl_avisoTerminalesCriticas.setText("<html><body><P ALIGN=\"justify\">" + avisoTerminalesCriticas + "</html></body>");

        String bienvenida = jl_bienvenida.getText();
        jl_bienvenida.setText("<html><body><P ALIGN=\"justify\">" + bienvenida + "</html></body>");
    }

//  Inicializa los componentes agregados por medio del motor gráfico 
//  Params: N/A          
//  Returna: N/A
//  Errores: N/A    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtp_home = new javax.swing.JTabbedPane();
        jp_paginaPrincipal = new javax.swing.JPanel();
        jb_cargarArchivo = new javax.swing.JButton();
        jp_decoracion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jli_plantasPrincipales = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jli_antenas = new javax.swing.JList<>();
        jl_ANT = new javax.swing.JLabel();
        jl_codigoColores = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jli_hogares = new javax.swing.JList<>();
        jl_CC = new javax.swing.JLabel();
        jl_bienvenida = new javax.swing.JLabel();
        jl_PP = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jp_estadoFinanciero = new javax.swing.JPanel();
        jb_calcularFinanzas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jl_costoTotal = new javax.swing.JLabel();
        jl_gananciaTotal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jl_gananciaNeta = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jp_Kruskal = new javax.swing.JPanel();
        jb_hacerSimulacro = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jl_enlacesHogarHogar = new javax.swing.JLabel();
        jl_avisoEstadoFinanciero = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_balanceFinanciero = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_logo = new javax.swing.JLabel();
        jl_enlacesDedicados = new javax.swing.JLabel();
        jp_decoracion1 = new javax.swing.JPanel();
        jp_transmisiónSenal = new javax.swing.JPanel();
        jb_calcularCamino = new javax.swing.JButton();
        jcb_lugarFinal = new javax.swing.JComboBox<>();
        jcb_lugarInicial = new javax.swing.JComboBox<>();
        jp_Dijkstra = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jl_avisoTransmisionSenal = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jp_decoracion2 = new javax.swing.JPanel();
        jl_logo1 = new javax.swing.JLabel();
        jp_terminalesCriticas = new javax.swing.JPanel();
        jb_terminalesFuncionamiento = new javax.swing.JButton();
        jp_PuntosArticulacion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jli_termianlesFuncionamiento = new javax.swing.JList<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl_avisoTerminalesCriticas = new javax.swing.JLabel();
        jp_decoracion3 = new javax.swing.JPanel();
        jl_logo2 = new javax.swing.JLabel();
        jp_diagramaDeZona = new javax.swing.JPanel();
        jp_diagramaZona = new javax.swing.JPanel();
        jp_decoracion4 = new javax.swing.JPanel();
        jl_logo3 = new javax.swing.JLabel();
        jl_codigoColores1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtp_home.setBackground(new java.awt.Color(204, 204, 204));
        jtp_home.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 102, 0)));
        jtp_home.setToolTipText("");
        jtp_home.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jtp_home.setMinimumSize(new java.awt.Dimension(1280, 1024));
        jtp_home.setPreferredSize(new java.awt.Dimension(1280, 1024));
        jtp_home.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtp_homeStateChanged(evt);
            }
        });

        jp_paginaPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        jp_paginaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_cargarArchivo.setBackground(new java.awt.Color(51, 255, 51));
        jb_cargarArchivo.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jb_cargarArchivo.setForeground(new java.awt.Color(0, 51, 102));
        jb_cargarArchivo.setText("Cargar archivo");
        jb_cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cargarArchivoActionPerformed(evt);
            }
        });
        jp_paginaPrincipal.add(jb_cargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 300, 40));

        jp_decoracion.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jp_decoracionLayout = new javax.swing.GroupLayout(jp_decoracion);
        jp_decoracion.setLayout(jp_decoracionLayout);
        jp_decoracionLayout.setHorizontalGroup(
            jp_decoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jp_decoracionLayout.setVerticalGroup(
            jp_decoracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jp_paginaPrincipal.add(jp_decoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 860));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/1_Primary_logo_on_transparent_405x63.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 204, 102)));
        jp_paginaPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 1120, 90));

        jLabel33.setFont(new java.awt.Font("Cambria Math", 3, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Inventario");
        jLabel33.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_paginaPrincipal.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 630, 30));

        jli_plantasPrincipales.setBackground(new java.awt.Color(255, 102, 0));
        jli_plantasPrincipales.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jli_plantasPrincipales.setForeground(new java.awt.Color(0, 51, 102));
        jli_plantasPrincipales.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Lista vacia>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jli_plantasPrincipales);

        jp_paginaPrincipal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 190, 410));

        jli_antenas.setBackground(new java.awt.Color(255, 102, 0));
        jli_antenas.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jli_antenas.setForeground(new java.awt.Color(0, 51, 102));
        jli_antenas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Lista vacia>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jli_antenas);

        jp_paginaPrincipal.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 190, 410));

        jl_ANT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_ANT.setForeground(new java.awt.Color(255, 255, 255));
        jl_ANT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ANT.setText("Antenas");
        jl_ANT.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jp_paginaPrincipal.add(jl_ANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 190, 33));

        jl_codigoColores.setFont(new java.awt.Font("Cambria Math", 2, 18)); // NOI18N
        jl_codigoColores.setForeground(new java.awt.Color(255, 255, 255));
        jl_codigoColores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_codigoColores.setText("Código de colores");
        jp_paginaPrincipal.add(jl_codigoColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 150, 40));

        jli_hogares.setBackground(new java.awt.Color(255, 102, 0));
        jli_hogares.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jli_hogares.setForeground(new java.awt.Color(0, 51, 102));
        jli_hogares.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Lista vacia>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jli_hogares);

        jp_paginaPrincipal.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 190, 410));

        jl_CC.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_CC.setForeground(new java.awt.Color(255, 255, 255));
        jl_CC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_CC.setText("Hogares");
        jl_CC.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jp_paginaPrincipal.add(jl_CC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 190, 33));

        jl_bienvenida.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        jl_bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jl_bienvenida.setText("Bienvenido a BMA Telecomunicaciones!  Somos una empresa de telecomunicaciones especializada en el desarrollo de infraestructura y diseño de sistemas que permitan la transmisión y recepción de información. Nos caracterizamos por utilizar tecnología de punta para dar a nuestros usuarios un servicio de alta calidad; pioneros en la implementación de técnicas estratégicas hacemos de su necesidad de comunicarse, un deseo de divertirse. Nuestro software permite una vista general de la empresa, seleccione el botón  'cargar archivo' para implementar la información necesaria. ");
        jl_bienvenida.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_paginaPrincipal.add(jl_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 420, 280));

        jl_PP.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_PP.setForeground(new java.awt.Color(255, 255, 255));
        jl_PP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_PP.setText("Plantas Principales");
        jl_PP.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jp_paginaPrincipal.add(jl_PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 190, 33));

        jLabel10.setBackground(new java.awt.Color(0, 0, 204));
        jLabel10.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Antena (ANT)");
        jLabel10.setOpaque(true);
        jp_paginaPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 150, 40));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Planta Principal (PP)");
        jLabel11.setOpaque(true);
        jp_paginaPrincipal.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 150, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 0));
        jLabel12.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Hogar (CC)");
        jLabel12.setOpaque(true);
        jp_paginaPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, 150, 40));

        jtp_home.addTab("Página Principal", jp_paginaPrincipal);

        jp_estadoFinanciero.setBackground(new java.awt.Color(0, 102, 102));
        jp_estadoFinanciero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_calcularFinanzas.setBackground(new java.awt.Color(51, 255, 51));
        jb_calcularFinanzas.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jb_calcularFinanzas.setForeground(new java.awt.Color(0, 51, 102));
        jb_calcularFinanzas.setText("Calcular costo");
        jb_calcularFinanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularFinanzasActionPerformed(evt);
            }
        });
        jp_estadoFinanciero.add(jb_calcularFinanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 540, 180, 40));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Balance Financiero");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_estadoFinanciero.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 510, -1));

        jl_costoTotal.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_costoTotal.setForeground(new java.awt.Color(255, 255, 255));
        jl_costoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_costoTotal.setText("Selecione 'calcular costo'");
        jl_costoTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jp_estadoFinanciero.add(jl_costoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 250, 30));

        jl_gananciaTotal.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_gananciaTotal.setForeground(new java.awt.Color(255, 255, 255));
        jl_gananciaTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_gananciaTotal.setText("Selecione 'calcular costo'");
        jl_gananciaTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jp_estadoFinanciero.add(jl_gananciaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 250, 33));

        jLabel23.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Ganancia neta");
        jp_estadoFinanciero.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 210, 30));

        jl_gananciaNeta.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_gananciaNeta.setForeground(new java.awt.Color(255, 255, 255));
        jl_gananciaNeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_gananciaNeta.setText("Selecione 'calcular costo'");
        jl_gananciaNeta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        jp_estadoFinanciero.add(jl_gananciaNeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 250, 30));

        jLabel26.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ingreso total de la planta");
        jp_estadoFinanciero.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 250, 29));

        jp_Kruskal.setLayout(new java.awt.GridLayout(1, 0));
        jp_estadoFinanciero.add(jp_Kruskal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 580, 480));

        jb_hacerSimulacro.setBackground(new java.awt.Color(51, 255, 51));
        jb_hacerSimulacro.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jb_hacerSimulacro.setForeground(new java.awt.Color(0, 51, 102));
        jb_hacerSimulacro.setText("Hacer simulacro");
        jb_hacerSimulacro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_hacerSimulacroActionPerformed(evt);
            }
        });
        jp_estadoFinanciero.add(jb_hacerSimulacro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, 190, 40));

        jLabel24.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Número de enlaces hogar-hogar:");
        jp_estadoFinanciero.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 300, 32));

        jLabel27.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Número de enlaces dedicados:");
        jp_estadoFinanciero.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 260, 32));

        jl_enlacesHogarHogar.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_enlacesHogarHogar.setForeground(new java.awt.Color(255, 255, 255));
        jl_enlacesHogarHogar.setText("---");
        jp_estadoFinanciero.add(jl_enlacesHogarHogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 100, 32));

        jl_avisoEstadoFinanciero.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_avisoEstadoFinanciero.setForeground(new java.awt.Color(255, 255, 255));
        jl_avisoEstadoFinanciero.setText("En caso de que la empresa enfrente una situación económica complicada, se ha decidido que se suspenderán temporalmente los enlaces dedicados, enlaces hogar-hogar, y cualquier otro tipo de enlace que se considere como no indispensable. Si desea visualizar como quedaría nuestra empresa si dicho momento llegase, presionar  'Hacer simulacro'. Los enlaces que aparezcan en color gris son los considerados no indispensables.");
        jl_avisoEstadoFinanciero.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 102)));
        jp_estadoFinanciero.add(jl_avisoEstadoFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 520, 180));

        jLabel30.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Diagrama de red con costos");
        jLabel30.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_estadoFinanciero.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 580, -1));

        jt_balanceFinanciero.setBackground(new java.awt.Color(255, 102, 0));
        jt_balanceFinanciero.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        jt_balanceFinanciero.setForeground(new java.awt.Color(255, 255, 255));
        jt_balanceFinanciero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Costo por Planta (PP)", "3,000.00 $"},
                {"Costo por Antena (ANT)", "1,200.00$"},
                {"Costo por metro de fibra óptica", "15.00 $"},
                {"Coto por conexión en hogar", "250.00 $"},
                {"Mano de obra total", "12,000.00 $"},
                {"Mantenimiento de maquinaria", "5,000.00 $"},
                {"Alquiler de edificios", "50,000.00 $"},
                {"Costos adicionales", "10,000.00 $"}
            },
            new String [] {
                "Elemento", "Valor ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_balanceFinanciero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jt_balanceFinanciero.setFocusTraversalPolicyProvider(true);
        jt_balanceFinanciero.setRowHeight(20);
        jt_balanceFinanciero.setRowMargin(5);
        jt_balanceFinanciero.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(jt_balanceFinanciero);

        jp_estadoFinanciero.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 510, 190));

        jLabel31.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Costos total de la planta");
        jp_estadoFinanciero.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 250, 29));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Análisis financiero");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_estadoFinanciero.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 510, -1));

        jl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/1_Primary_logo_on_transparent_300x50.png"))); // NOI18N
        jp_estadoFinanciero.add(jl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 330, 60));

        jl_enlacesDedicados.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_enlacesDedicados.setForeground(new java.awt.Color(255, 255, 255));
        jl_enlacesDedicados.setText("---");
        jp_estadoFinanciero.add(jl_enlacesDedicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 100, 32));

        jp_decoracion1.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jp_decoracion1Layout = new javax.swing.GroupLayout(jp_decoracion1);
        jp_decoracion1.setLayout(jp_decoracion1Layout);
        jp_decoracion1Layout.setHorizontalGroup(
            jp_decoracion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jp_decoracion1Layout.setVerticalGroup(
            jp_decoracion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jp_estadoFinanciero.add(jp_decoracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 860));

        jtp_home.addTab("Estado Financiero", jp_estadoFinanciero);

        jp_transmisiónSenal.setBackground(new java.awt.Color(0, 102, 102));
        jp_transmisiónSenal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_calcularCamino.setBackground(new java.awt.Color(51, 255, 51));
        jb_calcularCamino.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jb_calcularCamino.setForeground(new java.awt.Color(0, 51, 102));
        jb_calcularCamino.setText("Calcular");
        jb_calcularCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calcularCaminoActionPerformed(evt);
            }
        });
        jp_transmisiónSenal.add(jb_calcularCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, 240, 60));

        jcb_lugarFinal.setBackground(new java.awt.Color(255, 102, 0));
        jcb_lugarFinal.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jcb_lugarFinal.setForeground(new java.awt.Color(0, 51, 102));
        jcb_lugarFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>" }));
        jp_transmisiónSenal.add(jcb_lugarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 400, 240, 40));

        jcb_lugarInicial.setBackground(new java.awt.Color(255, 102, 0));
        jcb_lugarInicial.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jcb_lugarInicial.setForeground(new java.awt.Color(0, 51, 102));
        jcb_lugarInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>" }));
        jp_transmisiónSenal.add(jcb_lugarInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, 240, 40));

        jp_Dijkstra.setLayout(new java.awt.GridLayout(1, 0));
        jp_transmisiónSenal.add(jp_Dijkstra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 820, 490));

        jLabel28.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Terminal Final");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 0)));
        jp_transmisiónSenal.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 350, 240, 30));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Transmisión de Señal");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_transmisiónSenal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1130, -1));

        jl_avisoTransmisionSenal.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_avisoTransmisionSenal.setForeground(new java.awt.Color(255, 255, 255));
        jl_avisoTransmisionSenal.setText("Genera el enlace con menor uso de fibra óptica de un componente a otro,  se genera el camino en color verde del mismo. Seleccionar ambas terminales y presionar  'Calcular'  para visualizarlo.");
        jl_avisoTransmisionSenal.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 102)));
        jp_transmisiónSenal.add(jl_avisoTransmisionSenal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 1130, 70));

        jLabel32.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Terminal de Inicio");
        jLabel32.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 0)));
        jp_transmisiónSenal.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 240, 30));

        jp_decoracion2.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jp_decoracion2Layout = new javax.swing.GroupLayout(jp_decoracion2);
        jp_decoracion2.setLayout(jp_decoracion2Layout);
        jp_decoracion2Layout.setHorizontalGroup(
            jp_decoracion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jp_decoracion2Layout.setVerticalGroup(
            jp_decoracion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jp_transmisiónSenal.add(jp_decoracion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 860));

        jl_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/1_Primary_logo_on_transparent_300x50.png"))); // NOI18N
        jp_transmisiónSenal.add(jl_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 330, 60));

        jtp_home.addTab("Transmisión de Señal", jp_transmisiónSenal);

        jp_terminalesCriticas.setBackground(new java.awt.Color(0, 102, 102));
        jp_terminalesCriticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_terminalesFuncionamiento.setBackground(new java.awt.Color(51, 255, 51));
        jb_terminalesFuncionamiento.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jb_terminalesFuncionamiento.setForeground(new java.awt.Color(0, 51, 102));
        jb_terminalesFuncionamiento.setText("Mostrar");
        jb_terminalesFuncionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_terminalesFuncionamientoActionPerformed(evt);
            }
        });
        jp_terminalesCriticas.add(jb_terminalesFuncionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 290, 60));

        jp_PuntosArticulacion.setBackground(new java.awt.Color(255, 255, 255));
        jp_PuntosArticulacion.setLayout(new java.awt.GridLayout(1, 0));
        jp_terminalesCriticas.add(jp_PuntosArticulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 800, 490));

        jli_termianlesFuncionamiento.setBackground(new java.awt.Color(255, 102, 0));
        jli_termianlesFuncionamiento.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jli_termianlesFuncionamiento.setForeground(new java.awt.Color(0, 51, 102));
        jli_termianlesFuncionamiento.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Seleccione 'Mostrar'>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jli_termianlesFuncionamiento);

        jp_terminalesCriticas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 290, 230));

        jLabel29.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Terminales en funcionamiento");
        jLabel29.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 102, 0)));
        jp_terminalesCriticas.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 290, 50));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Terminales Críticas");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 102)));
        jp_terminalesCriticas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1130, -1));

        jl_avisoTerminalesCriticas.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jl_avisoTerminalesCriticas.setForeground(new java.awt.Color(255, 255, 255));
        jl_avisoTerminalesCriticas.setText("Colorea en verde las antenas y plantas en uso; de la misma manera, adjunta el nombre de cada componente que cumpla con la condición anterior en la tabla 'Terminales en funcionamiento'. Presione 'mostrar' para visualizar.");
        jl_avisoTerminalesCriticas.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 102)));
        jp_terminalesCriticas.add(jl_avisoTerminalesCriticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 1130, 70));

        jp_decoracion3.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jp_decoracion3Layout = new javax.swing.GroupLayout(jp_decoracion3);
        jp_decoracion3.setLayout(jp_decoracion3Layout);
        jp_decoracion3Layout.setHorizontalGroup(
            jp_decoracion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jp_decoracion3Layout.setVerticalGroup(
            jp_decoracion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jp_terminalesCriticas.add(jp_decoracion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 860));

        jl_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/1_Primary_logo_on_transparent_300x50.png"))); // NOI18N
        jp_terminalesCriticas.add(jl_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 330, 60));

        jtp_home.addTab("Terminales Críticas", jp_terminalesCriticas);

        jp_diagramaDeZona.setBackground(new java.awt.Color(0, 102, 102));
        jp_diagramaDeZona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_diagramaZona.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 102, 0)));
        jp_diagramaZona.setLayout(new java.awt.GridLayout(1, 0));
        jp_diagramaDeZona.add(jp_diagramaZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 970, 550));

        jp_decoracion4.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jp_decoracion4Layout = new javax.swing.GroupLayout(jp_decoracion4);
        jp_decoracion4.setLayout(jp_decoracion4Layout);
        jp_decoracion4Layout.setHorizontalGroup(
            jp_decoracion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jp_decoracion4Layout.setVerticalGroup(
            jp_decoracion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jp_diagramaDeZona.add(jp_decoracion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 860));

        jl_logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/1_Primary_logo_on_transparent_300x50.png"))); // NOI18N
        jp_diagramaDeZona.add(jl_logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 330, 60));

        jl_codigoColores1.setFont(new java.awt.Font("Cambria Math", 2, 18)); // NOI18N
        jl_codigoColores1.setForeground(new java.awt.Color(255, 255, 255));
        jl_codigoColores1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_codigoColores1.setText("Código de colores");
        jp_diagramaDeZona.add(jl_codigoColores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 150, 40));

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Planta Principal (PP)");
        jLabel13.setOpaque(true);
        jp_diagramaDeZona.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 150, 40));

        jLabel14.setBackground(new java.awt.Color(0, 0, 204));
        jLabel14.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Antena (ANT)");
        jLabel14.setOpaque(true);
        jp_diagramaDeZona.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 150, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 0));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hogar (CC)");
        jLabel15.setOpaque(true);
        jp_diagramaDeZona.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 150, 40));

        jtp_home.addTab("Diagrama de Zona", jp_diagramaDeZona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 707, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//  Actualiza el grafo en el panel contenido en cada pestaña del JTabbedPane al momento de
//  visualizarse.
//  Params: javax.swing.event.ChangeEvent evt, evento de cambio en un JTabbedPane
//  Returna: N/A
//  Errores: Monta el grafo este tiene elementos y es desigual de null
    private void jtp_homeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtp_homeStateChanged
        if (GrafoRedDeTelecomunicacion != null) {
            if (GrafoRedDeTelecomunicacion.getNodeCount() != 0) {
                if (jp_diagramaZona.isShowing()) {
                    MontarGrafo(jp_diagramaZona, GrafoRedDeTelecomunicacion, styleSheet);
                }

                if (jp_PuntosArticulacion.isShowing()) {
                    MontarGrafo(jp_PuntosArticulacion, GrafoRedDeTelecomunicacion, styleSheet);
                }

                if (jp_Dijkstra.isShowing()) {
                    MontarGrafo(jp_Dijkstra, GrafoRedDeTelecomunicacion, styleSheet);
                }

                if (jp_Kruskal.isShowing()) {
                    MontarGrafo(jp_Kruskal, DuplicarGrafo(GrafoRedDeTelecomunicacion, false, true), styleSheet);
                }
            }
        }
    }//GEN-LAST:event_jtp_homeStateChanged

//  LLama al metodo que carga el archivo que contiene la informacion del grafo
//  Params: java.awt.event.ActionEvent evt, evento de presionar el boton 'cargar archivo'
//  Returna: N/A
//  Errores: N/A
    private void jb_cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cargarArchivoActionPerformed
        GenerarGrafo();
    }//GEN-LAST:event_jb_cargarArchivoActionPerformed

//  LLama al metodo que busca los puntos de articulacion en un grafo
//  Params: java.awt.event.ActionEvent evt, evento de presionar el boton 'terminalesFuncionamiento'
//  Returna: N/A
//  Errores: Se hace el llamado del metodo mecionado solo si el grafo no esta vacio y es desigual
//  de null, de lo contrario se le comunica al usuario que cargue la informacion    
    private void jb_terminalesFuncionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_terminalesFuncionamientoActionPerformed
        if (GrafoRedDeTelecomunicacion != null) {
            if (GrafoRedDeTelecomunicacion.getNodeCount() != 0) {
                PuntosArticulacion();
            } else {
                JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
        }
    }//GEN-LAST:event_jb_terminalesFuncionamientoActionPerformed

//  LLama al metodo que genera el arbol de costo minimo del grafo
//  Params: java.awt.event.ActionEvent evt, evento de presionar el boton 'jb_hacerSimulacro'
//  Returna: N/A
//  Errores: Se hace el llamado del metodo mecionado solo si el grafo no esta vacio y es desigual
//  de null, de lo contrario se le comunica al usuario que cargue la informacion
    private void jb_hacerSimulacroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_hacerSimulacroActionPerformed
        if (GrafoRedDeTelecomunicacion != null) {
            if (GrafoRedDeTelecomunicacion.getNodeCount() != 0) {
                Kruskal();
            } else {
                JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
        }
    }//GEN-LAST:event_jb_hacerSimulacroActionPerformed

//  LLama al metodo que realiza un recorrido en profundidad del grafo para calcular el costo total
//  Params: java.awt.event.ActionEvent evt, evento de presionar el boton 'jb_calcularFinanzas'
//  Returna: N/A
//  Errores: Se hace el llamado del metodo mecionado solo si el grafo no esta vacio y es desigual
//  de null, de lo contrario se le comunica al usuario que cargue la informacion
    private void jb_calcularFinanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularFinanzasActionPerformed
        if (GrafoRedDeTelecomunicacion != null) {
            if (GrafoRedDeTelecomunicacion.getNodeCount() != 0) {
                RecorridoProfundidad();
            } else {
                JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
        }
    }//GEN-LAST:event_jb_calcularFinanzasActionPerformed

//  LLama al metodo que encuentra el camino mas barato entre los elementos seleccionados 
//  en los comboBox correspondientes
//  Params: java.awt.event.ActionEvent evt, evento de presionar el boton 'jb_calcularCamino'
//  Returna: N/A
//  Errores: Se hace el llamado del metodo mecionado solo si el grafo no esta vacio y es desigual
//  de null, de lo contrario se le comunica al usuario que cargue la informacion
    private void jb_calcularCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calcularCaminoActionPerformed
        if (GrafoRedDeTelecomunicacion != null) {
            if (GrafoRedDeTelecomunicacion.getNodeCount() != 0) {
                Dijkstra(jcb_lugarInicial.getSelectedItem() + "", jcb_lugarFinal.getSelectedItem() + "");
            } else {
                JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ha cargado la informacion, dirijase a 'Pagina Principal' para hacerlo.");
        }
    }//GEN-LAST:event_jb_calcularCaminoActionPerformed

//  Aplica el algoritmo de Kruskal utilizando la libreria GraphStream
//  Params: N/A
//  Returna: N/A
//  Errores: N/A
    private void Kruskal() {
        //hacer copia del grafo principal
        Graph grafoTemporal = DuplicarGrafo(GrafoRedDeTelecomunicacion, false, true);

        //formato para colorear las aristas a desactivar en color gris
        String formatoAristas = "edge .aristasNoNecesarias {size:2px;fill-color:gray;} "
                + "edge .aristasNecesarias {size:2px;fill-color:black;}";

        //realizar algoritmo
        Kruskal kruskal = new Kruskal("ui.class", "aristasNecesarias", "aristasNoNecesarias");
        kruskal.init(grafoTemporal);
        kruskal.compute();

        //montar el grafo resultante en su respectivo panel
        MontarGrafo(jp_Kruskal, grafoTemporal, styleSheet + formatoAristas);
    }

//  Aplica el algoritmo de Dijkstra utilizando la libreria GraphStream
//  Params: String desde, nombre del nodo donde iniciara el camino 
//          String hacia, nombre del nodo donde finalizara el camino
//  Returna: N/A
//  Errores: Si el camino no existe, se le informa al usuario
    private void Dijkstra(String desde, String hacia) {
        //hacer copia del grafo principal
        Graph grafoTemporal = DuplicarGrafo(GrafoRedDeTelecomunicacion, true, true);

        //iteradores de nodos y aristas
        Iterator<Node> nodos = GrafoRedDeTelecomunicacion.getNodeIterator();
        Iterator<Edge> aristas = GrafoRedDeTelecomunicacion.getEdgeIterator();

        //realizar algoritmo
        Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "peso");
        dijkstra.init(grafoTemporal);
        dijkstra.setSource(grafoTemporal.getNode(desde));
        dijkstra.compute();

        //formato para colorear las aristas en el camino de color verde
        String formatoAristas = "";
        int numeroAristas = 0;
        for (Edge edge : dijkstra.getPathEdges(grafoTemporal.getNode(hacia))) {
            formatoAristas += "edge#" + edge.getId() + "{fill-color:green;size:4px;}";
            numeroAristas++;
        }

        //montar el grafo resultante en su respectivo panel
        MontarGrafo(jp_Dijkstra, grafoTemporal, (styleSheet + formatoAristas));

        //indicar al usuario si no hay camino
        if (numeroAristas == 0) {
            JOptionPane.showMessageDialog(null, "No hay transmision de señal desde " + desde + " hasta " + hacia);
        }
    }

//  Realiza un recorrido en profundidad utilizando un iterador proporcionado por
//  la libreria GraphStream para calcular el costo total de la empresa
//  Params: N/A
//  Returna: N/A
//  Errores: Si el camino no existe, se le informa al usuario   
    private void RecorridoProfundidad() {
        Iterator<Node> nodosRecorridoProfundidad = GrafoRedDeTelecomunicacion.getNode(0).getDepthFirstIterator();
        int gastoTotal = 0;
        while (nodosRecorridoProfundidad.hasNext()) {
            char tipoObjeto = nodosRecorridoProfundidad.next().toString().charAt(0);
            switch (tipoObjeto) {
                case 'P':
                    gastoTotal += 3000;
                    break;
                case 'A':
                    gastoTotal += 1200;
                    break;
                case 'C':
                    gastoTotal += 250;
                    break;
            }
        }

        Iterator<Edge> aristas = GrafoRedDeTelecomunicacion.getEdgeIterator();
        while (aristas.hasNext()) {
            gastoTotal += Integer.parseInt(aristas.next().getAttribute("peso")) * 15;
        }

        gastoTotal += 12000 + 5000 + 50000 + 10000;
        jl_costoTotal.setText(gastoTotal + " $");
        jl_gananciaNeta.setText((180000 - gastoTotal) + " $");
        jl_gananciaTotal.setText("180,000.00 $");
    }

//  Busca los puntos de articulacion del grafo en cuestion utilizando la herramienta
//  ConnectedComponents proporcionada por la libreria GraphStream
//  Params: N/A
//  Returna: N/A
//  Errores: Si no hay puntos de articulacion, se le informa al usuario
    private void PuntosArticulacion() {
        Graph grafoTemporal;
        //lista con los puntos de articulacion
        ArrayList<Node> puntosArticulacion = new ArrayList();

        //comprobar con cada nodo si al retirarse, el grafo sigue conectado
        for (int i = 0; i < GrafoRedDeTelecomunicacion.getNodeCount(); i++) {
            //duplicar el grafo principal para realizar la prueba
            grafoTemporal = DuplicarGrafo(GrafoRedDeTelecomunicacion, false, false);

            //herramienta para verificar si el grafo sigue conectado
            ConnectedComponents conectedComponents = new ConnectedComponents();
            conectedComponents.init(grafoTemporal);

            //nodo a retirar
            Node aRetirar = grafoTemporal.getNode(i);

            //agregar como atributo su posicion para, en un futuro, tener acceso en el grafo principal
            aRetirar.addAttribute("posicion", i);

            //remover nodo
            grafoTemporal.removeNode(i);

            //reali<ar algoritmo
            conectedComponents.compute();

            //agrega a la lista de puntos de articulacion el nodo si el grafo se dividio en subgrafos
            if (conectedComponents.getConnectedComponentsCount() > 1) {
                puntosArticulacion.add(aRetirar);
            }
        }

        grafoTemporal = DuplicarGrafo(GrafoRedDeTelecomunicacion, false, false);

        //formato de los puntos de articulacion
        String formatoPuntosArticulacion = "";

        //modelo de la lista donde se agregaran los puntos de articulacion 
        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        //para cada punto de articulacion, se guarda en el modelo de la lista su nombre y
        //se guarda su formato de impresion como atributo
        for (int i = 0; i < puntosArticulacion.size(); i++) {
            String nombre = puntosArticulacion.get(i).toString();
            int posicionNodo = puntosArticulacion.get(i).getAttribute("posicion");
            modeloLista.addElement(nombre);
            grafoTemporal.getNode(posicionNodo).addAttribute("ui.label", nombre);
            formatoPuntosArticulacion += "node#" + puntosArticulacion.get(i) + "{fill-color:green;}";
        }

        //informa al usuario su no hay puntos de articulacion
        if (modeloLista.getSize() == 0) {
            modeloLista.addElement("<Lista vacia>");
            JOptionPane.showMessageDialog(null, "No hay terminales en funcionamiento.");
        }

        //agregar el modelo a la lista
        jli_termianlesFuncionamiento.setModel(modeloLista);

        //montar el grafo en el panel correspondiente
        MontarGrafo(jp_PuntosArticulacion, grafoTemporal, (styleSheet + formatoPuntosArticulacion));
    }

//  Genera el grafo a partir de un archivo seleccionado por el usuario   
//  Params: N/A
//  Returna: N/A
//  Errores: Si el archivo no se pudo abrir se le comunica al usuario.
//           Si el archivo de texto no contiene el formato necesario, se le 
//           informa al usuario. En ambos casos , se reinician los componentes de
//           la interfaz a sus valores por defecto.             
    private void GenerarGrafo() {
        //colocar los valores por defectos a los componentes de la interfaz grafica
        ReiniciarComponentes();

        //JFileChooser para que el usuario escoja el archivo
        JFileChooser buscadorArchivo = new JFileChooser();
        buscadorArchivo.showOpenDialog(buscadorArchivo);

        //bloque try-catch para capturar la excepcion del archivo a leer
        try {
            //herramientas para leer el archivo
            String ubicacionArchivo = buscadorArchivo.getSelectedFile().getAbsolutePath();
            BufferedReader BF = new BufferedReader(new FileReader(ubicacionArchivo));
            String lineaLeida = "";

            //variable para tener acceso a la arista creada
            int contadorAristas = 0;

            while ((lineaLeida = BF.readLine()) != null) {
                //parseo de cada elemento de la linea leida
                String[] elementosLinea = lineaLeida.split(",");

                //agregar los nodos leidos
                GrafoRedDeTelecomunicacion.addNode(elementosLinea[0]).addAttribute("ui.label", elementosLinea[0]);
                GrafoRedDeTelecomunicacion.addNode(elementosLinea[1]).addAttribute("ui.label", elementosLinea[1]);

                //aumentar contador de enlaces dedicados
                if (elementosLinea[0].charAt(0) == 'P' && elementosLinea[1].charAt(0) == 'C') {
                    enlacesDedicados++;
                }

                //aumentar contador de enlaces hogar-hogar
                if (elementosLinea[0].charAt(0) == 'C' && elementosLinea[1].charAt(0) == 'C') {
                    enlacesHogarHogar++;
                }

                //agregar arista con su respectivo peso y cinta como atributo
                GrafoRedDeTelecomunicacion.addEdge(contadorAristas + "", elementosLinea[0], elementosLinea[1], true);
                GrafoRedDeTelecomunicacion.getEdge(contadorAristas).addAttribute("peso", elementosLinea[2]);
                GrafoRedDeTelecomunicacion.getEdge(contadorAristas).addAttribute("ui.label", elementosLinea[2]);

                contadorAristas++;
                //generar la hoja de formato CSS para la impresion del grafo
                ConstruirStyleSheet(elementosLinea);
            }

            //colocar los datos de enlaces especiales donde corresponden
            jl_enlacesDedicados.setText(enlacesDedicados + "");
            jl_enlacesHogarHogar.setText(enlacesHogarHogar + "");

            //llenar la listas y comboBox con sus respectivos datos
            DefaultComboBoxModel<String> modeloCB1 = new DefaultComboBoxModel();
            DefaultComboBoxModel<String> modeloCB2 = new DefaultComboBoxModel();
            DefaultListModel<String> modeloListaPP = new DefaultListModel<>();
            DefaultListModel<String> modeloListaANT = new DefaultListModel<>();
            DefaultListModel<String> modeloListaCC = new DefaultListModel<>();
            int PP = 0, ANT = 0, CC = 0;

            //bandera para verificar que el grafo generado sea con el formato requerido 
            boolean formatoIncorrecto = false;

            //iterador de los nodos del grafo principal
            Iterator<Node> nodos = GrafoRedDeTelecomunicacion.getNode(0).getBreadthFirstIterator();
            while (nodos.hasNext() && !formatoIncorrecto) {
                Node nodoTemp = nodos.next();

                //segun el tipo de elemento, se agrega a la tabla o comboBox donde corresponde
                char tipoElemento = nodoTemp.toString().charAt(0);
                switch (tipoElemento) {
                    case 'P':
                        PP++;
                        modeloListaPP.addElement(nodoTemp.toString());
                        break;
                    case 'A':
                        ANT++;
                        modeloListaANT.addElement(nodoTemp.toString());
                        break;
                    case 'C':
                        CC++;
                        modeloListaCC.addElement(nodoTemp.toString());
                        break;
                    default:
                        formatoIncorrecto = true;
                }
                modeloCB1.addElement(nodoTemp.toString());
                modeloCB2.addElement(modeloCB1.getElementAt(modeloCB1.getSize() - 1));
            }

            //si el formato es incorrecto informa al usuario
            if (!formatoIncorrecto) {
                //se agregan los valores leidos a los componentes correspondientes
                jl_ANT.setText(jl_ANT.getText().substring(0, 7) + " (" + ANT + ")");
                jl_PP.setText(jl_PP.getText().substring(0, 19) + " (" + PP + ")");
                jl_CC.setText(jl_CC.getText().substring(0, 7) + " (" + CC + ")");
                jli_antenas.setModel(modeloListaANT);
                jli_plantasPrincipales.setModel(modeloListaPP);
                jli_hogares.setModel(modeloListaCC);
                jcb_lugarInicial.setModel(modeloCB1);
                jcb_lugarFinal.setModel(modeloCB2);
                JOptionPane.showMessageDialog(null, "Diagrama creado, ir la pestaña 'Diagrama de zona' para visualizar");
            } else {
                JOptionPane.showMessageDialog(null, "El formato del archivo es incorrecto, asegurese de escoger un archivo válido");
                ReiniciarComponentes();
            }
        } catch (Exception e) {            
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema con el archivo, intente nuevamente");
            ReiniciarComponentes();
        }
    }

//  Coloca los valores por defecto a los componentes de la interfaz grafica
//  Params: N/A
//  Returna: N/A
//  Errores: N/A
    public void ReiniciarComponentes() {
        //Componentes de 'Pagina principal'
        DefaultListModel<String> modeloListaPP = new DefaultListModel<>();
        modeloListaPP.addElement("<Lista vacia>");
        DefaultListModel<String> modeloListaANT = new DefaultListModel<>();
        modeloListaANT.addElement("<Lista vacia>");
        DefaultListModel<String> modeloListaCC = new DefaultListModel<>();
        modeloListaCC.addElement("<Lista vacia>");
        jli_antenas.setModel(modeloListaANT);
        jli_plantasPrincipales.setModel(modeloListaPP);
        jli_hogares.setModel(modeloListaCC);
        jl_PP.setText("Plantas Principales");
        jl_ANT.setText("Antenas");
        jl_CC.setText("Hogares");
        enlacesDedicados = 0;
        enlacesHogarHogar = 0;
        
        //Componentes de 'Estado Financiero'
        jl_costoTotal.setText("Seleccione calcular costo");
        jl_gananciaTotal.setText("Seleccione calcular costo");
        jl_gananciaNeta.setText("Seleccione calcular costo");
        jl_enlacesDedicados.setText("---");
        jl_enlacesHogarHogar.setText("---");
        jp_Kruskal.removeAll();

        //Componentes de 'Distribucion fibra optica'
        DefaultComboBoxModel<String> modeloCB1 = new DefaultComboBoxModel();
        modeloCB1.addElement("<Seleccione>");
        DefaultComboBoxModel<String> modeloCB2 = new DefaultComboBoxModel();
        modeloCB2.addElement("<Seleccione>");
        jcb_lugarInicial.setModel(modeloCB1);
        jcb_lugarFinal.setModel(modeloCB2);
        jp_Dijkstra.removeAll();
        
        //Componentes de 'Terminales criticas'
        DefaultListModel<String> modeloListaTC = new DefaultListModel<>();
        modeloListaTC.addElement("<Lista vacia>");
        jp_PuntosArticulacion.removeAll();
        
        //limpiar diagrama de zona
        jp_diagramaZona.removeAll();
        
        //reiniciar styleSheet
        styleSheet = "";
        
        //Limpiar grafo principal
        GrafoRedDeTelecomunicacion.clear();
    }

//  Monta el diagrama del grafo en un panel especificado
//  Params: JPanel pizarra, panel donde se montara el grafo
//          Graph grafo, grafo a dibujar
//          String styleSheet, codigo CSS de formato de dibujado
//  Returna: N/A
//  Errores: N/A
    private void MontarGrafo(JPanel pizarra, Graph grafo, String styleSheet) {
        //limpiar pizarra
        pizarra.removeAll();
        
        //agregar como atributo al grafo la hoja CSS de formato de impresion
        grafo.addAttribute("ui.stylesheet", styleSheet);
        
        //viewer para capturar el grafo
        Viewer viewer = new Viewer(grafo, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        ViewPanel viewPanel = viewer.addDefaultView(false);
        viewer.enableAutoLayout();
        
        //agregar el viewer a la pizarra
        pizarra.add(viewPanel);
        pizarra.updateUI();
    }

//  Adjunta a la hoja CSS principal el formato de cada componente indicado
//  Params: String [] nombreElementos, nombre de los elementos cuyos formatos de impresion
//          seran guardados.    
//  Returna: N/A
//  Errores: N/A  
    private void ConstruirStyleSheet(String[] nombreElementos) {
        //formato de impresion para cada tipo de objeto de la planta
        String colorPlanta = "fill-color:red;";
        String colorAntena = "fill-color:blue;";
        String colorCasa = "fill-color:yellow;";
        String tamanoPlanta = "size:40px;";
        String tamanoAntena = "size:30px;";
        String tamanoCasa = "size:20px;";
        
        //recorrer el arreglo donde estan los objetos de la planta
        for (int i = 0; i < 2; i++) {
            //verificar que tipo de objeto es
            char temp = nombreElementos[i].charAt(0);
            switch (temp) {
                //planta principal
                case 'P':
                    styleSheet += "node#" + nombreElementos[i] + "{" + tamanoPlanta + colorPlanta;
                    break;
                //antena
                case 'A':
                    styleSheet += "node#" + nombreElementos[i] + "{" + tamanoAntena + colorAntena;
                    break;
                //hogar
                case 'C':
                    styleSheet += "node#" + nombreElementos[i] + "{" + tamanoCasa + colorCasa;
                    break;
            }
            styleSheet += "}";
        }
    }

//  Hace una copia del grafo enviado como parametro
//  Params: Graph grafoACopiar, grafo del cual se desea hacer una copia
//          boolean labelNodo, indica si se copia tambien la cinta de los nodos
//          boolean labelArista, indica si se copia tambien la cinta de las aristas
//  Returna: La copia del grafo
//  Errores: Si el grafo a copiar es null, retorna null    
    private Graph DuplicarGrafo(Graph grafoACopiar, boolean labelNodo, boolean labelArista) {
        if (grafoACopiar == null) {
            return null;
        }
        
        //grafo de copia
        Graph copiaGrafo = new SingleGraph("Copia");

        //iteradores de nodos y aristas
        Iterator<Node> nodos = grafoACopiar.getNodeIterator();
        Iterator<Edge> aristas = grafoACopiar.getEdgeIterator();
        
        //copia cada nodo, agrega su label nombre si el parametro lo requiere
        while (nodos.hasNext()) {
            Node nodoTemp = nodos.next();
            if (labelNodo) {
                String nombreNodo = nodoTemp.toString();
                copiaGrafo.addNode(nombreNodo).addAttribute("ui.label", nombreNodo);
            } else {
                String nombreNodo = nodoTemp.toString();
                copiaGrafo.addNode(nombreNodo);
            }
        }
        
        //copia cada nodo, agrega su label nombre y su label peso si el parametro lo requiere
        int contadorAristas = 0;
        while (aristas.hasNext()) {
            Edge aristaTemp = aristas.next();
            String nombreNodo1 = aristaTemp.getNode0().toString();
            String nombreNodo2 = aristaTemp.getNode1().toString();
            if (labelArista) {
                int pesoArista = Integer.parseInt(aristaTemp.getAttribute("peso"));
                copiaGrafo.addEdge(contadorAristas + "", nombreNodo1, nombreNodo2, true);
                copiaGrafo.getEdge(contadorAristas).addAttribute("peso", pesoArista);
                copiaGrafo.getEdge(contadorAristas).addAttribute("ui.label", pesoArista);
            } else {
                int pesoArista = Integer.parseInt(aristaTemp.getAttribute("peso"));
                copiaGrafo.addEdge(contadorAristas + "", nombreNodo1, nombreNodo2, true);
                copiaGrafo.getEdge(contadorAristas).addAttribute("peso", pesoArista);
            }
            contadorAristas++;
        }
        return copiaGrafo;
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }
    
    //Se optó por no nombrar con nombres significativos a los objetos jLabel que
    //sirven solamente como decoracion
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jb_calcularCamino;
    private javax.swing.JButton jb_calcularFinanzas;
    private javax.swing.JButton jb_cargarArchivo;
    private javax.swing.JButton jb_hacerSimulacro;
    private javax.swing.JButton jb_terminalesFuncionamiento;
    private javax.swing.JComboBox<String> jcb_lugarFinal;
    private javax.swing.JComboBox<String> jcb_lugarInicial;
    private javax.swing.JLabel jl_ANT;
    private javax.swing.JLabel jl_CC;
    private javax.swing.JLabel jl_PP;
    private javax.swing.JLabel jl_avisoEstadoFinanciero;
    private javax.swing.JLabel jl_avisoTerminalesCriticas;
    private javax.swing.JLabel jl_avisoTransmisionSenal;
    private javax.swing.JLabel jl_bienvenida;
    private javax.swing.JLabel jl_codigoColores;
    private javax.swing.JLabel jl_codigoColores1;
    private javax.swing.JLabel jl_costoTotal;
    private javax.swing.JLabel jl_enlacesDedicados;
    private javax.swing.JLabel jl_enlacesHogarHogar;
    private javax.swing.JLabel jl_gananciaNeta;
    private javax.swing.JLabel jl_gananciaTotal;
    private javax.swing.JLabel jl_logo;
    private javax.swing.JLabel jl_logo1;
    private javax.swing.JLabel jl_logo2;
    private javax.swing.JLabel jl_logo3;
    private javax.swing.JList<String> jli_antenas;
    private javax.swing.JList<String> jli_hogares;
    private javax.swing.JList<String> jli_plantasPrincipales;
    private javax.swing.JList<String> jli_termianlesFuncionamiento;
    private javax.swing.JPanel jp_Dijkstra;
    private javax.swing.JPanel jp_Kruskal;
    private javax.swing.JPanel jp_PuntosArticulacion;
    private javax.swing.JPanel jp_decoracion;
    private javax.swing.JPanel jp_decoracion1;
    private javax.swing.JPanel jp_decoracion2;
    private javax.swing.JPanel jp_decoracion3;
    private javax.swing.JPanel jp_decoracion4;
    private javax.swing.JPanel jp_diagramaDeZona;
    private javax.swing.JPanel jp_diagramaZona;
    private javax.swing.JPanel jp_estadoFinanciero;
    private javax.swing.JPanel jp_paginaPrincipal;
    private javax.swing.JPanel jp_terminalesCriticas;
    private javax.swing.JPanel jp_transmisiónSenal;
    private javax.swing.JTable jt_balanceFinanciero;
    private javax.swing.JTabbedPane jtp_home;
    // End of variables declaration//GEN-END:variables

    //variables adicionales
    Graph GrafoRedDeTelecomunicacion;
    int enlacesDedicados, enlacesHogarHogar;
    String styleSheet;
}

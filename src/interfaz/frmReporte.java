package interfaz;

import database.Reportes;
import java.awt.Color;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReporte extends javax.swing.JInternalFrame {

    //Titulo de las tablas
    String tituloVenta[] = {
        "Codigo",
        "Cod_emp",
        "Cod_cli",
        "Cod_art",
        "Fecha",
        "Hora",
        "Cantidad",
        "Valor"
    };

    String titulosClientes[] = {
        "Codigo",
        "Nombre",
        "Apellido",
        "Edad",
        "Dirección",
        "Teléfono",};

    String titulosEmpleados[] = {
        "Codigo",
        "Nombre",
        "Apellido",
        "Edad",
        "Fecha nacimiento",
        "Teléfono",
        "Usuario",
        "Contraseña"
    };

    String titulosArticulos[] = {
        "Codigo",
        "Titulo",
        "Género",
        "Precio",
        "Cantidad",
        "Tipo"
    };

    //Tabla para clientes,modelos,articulos,ventas
    DefaultTableModel modeloGeneral = new DefaultTableModel();

    //Tablas del modelo general
    DefaultTableModel modeloIDcliente = new DefaultTableModel();
    DefaultTableModel modeloIDempleado = new DefaultTableModel();
    DefaultTableModel modeloIDarticulo = new DefaultTableModel();

    DefaultTableModel modeloBusquedaGeneral = new DefaultTableModel();
    DefaultTableModel modeloBusquedaInfo = new DefaultTableModel();

    public frmReporte() {
        initComponents();
    }

    //Detectar la tecla enter
    private boolean teclaEnter(java.awt.event.KeyEvent evt) {
        boolean result = false;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            result = true;
        }
        return result;
    }

    //Realizar verficiacion de que sea tipo:codigo
    private boolean verificarInputBuscarEmpleadoxArticulo() {
        boolean result = false;

        String consulta = buscadorReporte.getText();
        String tipoBusqueda = consulta.trim().toLowerCase();

        String regex = "(.)*\\:(\\d)(.)*";

        //Verificar que el formato de la consulta si sea tipo:codigo
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(consulta);
        boolean isMatched = matcher.matches();

        if ((tipoBusqueda.indexOf("empleado") != -1 && isMatched) || (tipoBusqueda.indexOf("articulo") != -1 && isMatched)) {
            result = true;
        }

        return result;
    }

    private void filtrarEmpleadoxArticulo(String codigo) throws SQLException {

        Reportes ventasVendedor = new Reportes();
        ResultSet rs = ventasVendedor.ventasXVendedor(codigo);

        modeloBusquedaGeneral.setRowCount(0);

        ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();

        String[] data = new String[numberOfColumns];

        while (rs.next()) {
            for (int i = 0; i < data.length; i++) {
                data[i] = rs.getString((i + 1));
            }
            modeloBusquedaGeneral.addRow(data);
        }
        rs.close();
    }

    private void DatosVendedores(String codigo) throws SQLException {

        Reportes vendedoresxProducto = new Reportes();
        ResultSet rs = vendedoresxProducto.DatosVendedores(codigo);

        modeloBusquedaInfo.setRowCount(0);

        ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();

        String[] data = new String[numberOfColumns];

        while (rs.next()) {
            for (int i = 0; i < data.length; i++) {
                data[i] = rs.getString((i + 1));
            }
            modeloBusquedaInfo.addRow(data);
        }
        rs.close();
    }

    //Realizar busqued para las tablas Empleados X Articulos
    private void realizarBusquedaEmpleadoxArticulo() {
        String consulta = buscadorReporte.getText();
        String[] separador = consulta.split(":");
        String tipoBusqueda = separador[0].trim().toLowerCase();
        String codigoBusqueda = separador[1].trim();

        switch (tipoBusqueda) {
            case "empleado": {
                try {

                    txt_infoBusqueda.setText("Información del articulo");

                    modeloBusquedaGeneral.setColumnIdentifiers(tituloVenta); //Asignar titulos a la tabla

                    filtrarEmpleadoxArticulo(codigoBusqueda);
                    tabla_resultadoGeneral.setModel(modeloBusquedaGeneral);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            break;

            case "articulo": {

                try {

                    txt_infoBusqueda.setText("Información de los empleados");

                    modeloBusquedaGeneral.setColumnIdentifiers(titulosArticulos); //Asignar titulos a la tabla

                    filtrarCodigo("Select * from articulo where codigo = '" + codigoBusqueda + "'", modeloBusquedaGeneral);
                    tabla_resultadoGeneral.setModel(modeloBusquedaGeneral);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

             {

                try {
                    modeloBusquedaInfo.setColumnIdentifiers(titulosEmpleados); //Asignar titulos a la tabla

                    DatosVendedores(codigoBusqueda);
                    tabla_empleadoxarticulo.setModel(modeloBusquedaInfo);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicial = new javax.swing.JPanel();
        cont_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_filtrarLista = new javax.swing.JButton();
        list_buscador = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        tabla_principalVentas = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        tabla_clientePrincipal = new javax.swing.JScrollPane();
        tabla_clienteInterna = new javax.swing.JTable();
        tabla_empleadoPrincipal = new javax.swing.JScrollPane();
        tabla_empleadoInterna = new javax.swing.JTable();
        tabla_articuloPrincipal = new javax.swing.JScrollPane();
        tabla_articuloInterna = new javax.swing.JTable();
        tituloCliente = new javax.swing.JPanel();
        lbl_infoCliente = new javax.swing.JLabel();
        tituloEmpleado = new javax.swing.JPanel();
        lbl_infoEmpleado = new javax.swing.JLabel();
        tituloEmpleado1 = new javax.swing.JPanel();
        lbl_infoArticulo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        buscadorReporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tabla_principal_empleadoxarticulo = new javax.swing.JScrollPane();
        tabla_empleadoxarticulo = new javax.swing.JTable();
        tabla_principal_resultadoGenerales = new javax.swing.JScrollPane();
        tabla_resultadoGeneral = new javax.swing.JTable();
        piePagina = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_infoBusqueda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setTitle("Reportes");
        setPreferredSize(new java.awt.Dimension(1292, 916));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panelInicial.setBackground(new java.awt.Color(255, 255, 255));

        cont_titulo.setBackground(new java.awt.Color(46, 53, 137));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Days One", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("REPORTES");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultar CLIENTES, EMPLEADOS, ARTICULOS Y VENTAS realizadas.");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout cont_tituloLayout = new javax.swing.GroupLayout(cont_titulo);
        cont_titulo.setLayout(cont_tituloLayout);
        cont_tituloLayout.setHorizontalGroup(
            cont_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_tituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        cont_tituloLayout.setVerticalGroup(
            cont_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cont_tituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btn_filtrarLista.setBackground(new java.awt.Color(74, 79, 231));
        btn_filtrarLista.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_filtrarLista.setForeground(new java.awt.Color(255, 255, 255));
        btn_filtrarLista.setText("Realizar búsqueda");
        btn_filtrarLista.setBorder(null);
        btn_filtrarLista.setBorderPainted(false);
        btn_filtrarLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_filtrarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_filtrarListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_filtrarListaMouseExited(evt);
            }
        });
        btn_filtrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarListaActionPerformed(evt);
            }
        });

        list_buscador.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        list_buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar clientes", "Mostrar empleados", "Mostrar articulos", "Mostrar ventas" }));
        list_buscador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(list_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_filtrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_filtrarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(list_buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabla_ventas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventasMouseClicked(evt);
            }
        });
        tabla_principalVentas.setViewportView(tabla_ventas);

        tabla_clientePrincipal.setBackground(new java.awt.Color(255, 255, 255));

        tabla_clienteInterna.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_clienteInterna.setForeground(new java.awt.Color(51, 51, 51));
        tabla_clienteInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_clienteInterna.setAutoscrolls(false);
        tabla_clienteInterna.setGridColor(new java.awt.Color(102, 102, 102));
        tabla_clienteInterna.setRowHeight(20);
        tabla_clienteInterna.setRowMargin(5);
        tabla_clientePrincipal.setViewportView(tabla_clienteInterna);

        tabla_empleadoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        tabla_empleadoPrincipal.setOpaque(false);

        tabla_empleadoInterna.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_empleadoInterna.setForeground(new java.awt.Color(51, 51, 51));
        tabla_empleadoInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_empleadoInterna.setAutoscrolls(false);
        tabla_empleadoInterna.setGridColor(new java.awt.Color(204, 204, 204));
        tabla_empleadoInterna.setRowHeight(20);
        tabla_empleadoInterna.setRowMargin(5);
        tabla_empleadoPrincipal.setViewportView(tabla_empleadoInterna);

        tabla_articuloPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        tabla_articuloPrincipal.setOpaque(false);

        tabla_articuloInterna.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_articuloInterna.setForeground(new java.awt.Color(51, 51, 51));
        tabla_articuloInterna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_articuloInterna.setAutoscrolls(false);
        tabla_articuloInterna.setGridColor(new java.awt.Color(204, 204, 204));
        tabla_articuloInterna.setRowHeight(20);
        tabla_articuloInterna.setRowMargin(5);
        tabla_articuloPrincipal.setViewportView(tabla_articuloInterna);

        tituloCliente.setBackground(new java.awt.Color(74, 79, 231));

        lbl_infoCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_infoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infoCliente.setText("----.----");
        lbl_infoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout tituloClienteLayout = new javax.swing.GroupLayout(tituloCliente);
        tituloCliente.setLayout(tituloClienteLayout);
        tituloClienteLayout.setHorizontalGroup(
            tituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_infoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tituloClienteLayout.setVerticalGroup(
            tituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_infoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        tituloEmpleado.setBackground(new java.awt.Color(74, 79, 231));

        lbl_infoEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_infoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infoEmpleado.setText("----.----");
        lbl_infoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout tituloEmpleadoLayout = new javax.swing.GroupLayout(tituloEmpleado);
        tituloEmpleado.setLayout(tituloEmpleadoLayout);
        tituloEmpleadoLayout.setHorizontalGroup(
            tituloEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloEmpleadoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_infoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tituloEmpleadoLayout.setVerticalGroup(
            tituloEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_infoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        tituloEmpleado1.setBackground(new java.awt.Color(74, 79, 231));

        lbl_infoArticulo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_infoArticulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infoArticulo.setText("----.----");
        lbl_infoArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout tituloEmpleado1Layout = new javax.swing.GroupLayout(tituloEmpleado1);
        tituloEmpleado1.setLayout(tituloEmpleado1Layout);
        tituloEmpleado1Layout.setHorizontalGroup(
            tituloEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloEmpleado1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_infoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tituloEmpleado1Layout.setVerticalGroup(
            tituloEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_infoArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(tabla_principalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla_articuloPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabla_empleadoPrincipal)
                    .addComponent(tituloCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabla_clientePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloEmpleado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabla_clientePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tituloEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabla_empleadoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(tituloEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabla_articuloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabla_principalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btn_buscar.setBackground(new java.awt.Color(74, 79, 231));
        btn_buscar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("Filtrar búsqueda");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        buscadorReporte.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        buscadorReporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        buscadorReporte.setText("Empleado:código o Articulo:codigo");
        buscadorReporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscadorReporteFocusLost(evt);
            }
        });
        buscadorReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscadorReporteMouseClicked(evt);
            }
        });
        buscadorReporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscadorReporteKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel3.setText("Consultar mediante el código del empleado o articulo. * [ empleado:codigo o articulo:codigo ]");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(buscadorReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscadorReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
        );

        tabla_empleadoxarticulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_empleadoxarticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_empleadoxarticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_empleadoxarticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_empleadoxarticuloMouseClicked(evt);
            }
        });
        tabla_principal_empleadoxarticulo.setViewportView(tabla_empleadoxarticulo);

        tabla_resultadoGeneral.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_resultadoGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_resultadoGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_resultadoGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_resultadoGeneralMouseClicked(evt);
            }
        });
        tabla_principal_resultadoGenerales.setViewportView(tabla_resultadoGeneral);

        piePagina.setBackground(new java.awt.Color(46, 53, 137));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Todos los derechos reservados - copyright 2020 - - - Versión de software 1.0 - - - Tech & chill");

        javax.swing.GroupLayout piePaginaLayout = new javax.swing.GroupLayout(piePagina);
        piePagina.setLayout(piePaginaLayout);
        piePaginaLayout.setHorizontalGroup(
            piePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(piePaginaLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        piePaginaLayout.setVerticalGroup(
            piePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(74, 79, 231));

        txt_infoBusqueda.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_infoBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txt_infoBusqueda.setText("----.-----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt_infoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_infoBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelInicialLayout = new javax.swing.GroupLayout(panelInicial);
        panelInicial.setLayout(panelInicialLayout);
        panelInicialLayout.setHorizontalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(piePagina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cont_titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInicialLayout.createSequentialGroup()
                        .addComponent(tabla_principal_resultadoGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tabla_principal_empleadoxarticulo)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInicialLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap())
        );
        panelInicialLayout.setVerticalGroup(
            panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cont_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabla_principal_resultadoGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInicialLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabla_principal_empleadoxarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(piePagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarTablas(String query) throws SQLException {

        Reportes mostrarClientes = new Reportes();
        String SQL = query;
        ResultSet rs = mostrarClientes.listar(SQL);

        modeloGeneral.setRowCount(0);

        ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();

        String[] data = new String[numberOfColumns];

        while (rs.next()) {
            for (int i = 0; i < data.length; i++) {
                data[i] = rs.getString((i + 1));
            }
            modeloGeneral.addRow(data);
        }
        rs.close();
    }

    private void filtrarCodigo(String query, DefaultTableModel modelo) throws SQLException {

        Reportes filtrarID = new Reportes();
        String SQL = query;
        ResultSet rs = filtrarID.buscar(query);
        int numeroIntentos = 0;

        modelo.setRowCount(0);

        ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();

        String[] data = new String[numberOfColumns];

        while (rs.next()) {
            for (int i = 0; i < data.length; i++) {
                data[i] = rs.getString((i + 1));
            }
            modelo.addRow(data);

            return;
        }
        rs.close();
    }

    private void btn_filtrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarListaActionPerformed

        String resultLista = list_buscador.getSelectedItem().toString();

        lbl_infoCliente.setText("----.----");
        lbl_infoEmpleado.setText("----.----");
        lbl_infoArticulo.setText("----.----");

        switch (resultLista) {
            case "Mostrar clientes": {
                try {

                    modeloGeneral.setColumnIdentifiers(titulosClientes); //Asignar titulos a la tabla

                    listarTablas("SELECT * from cliente");
                    tabla_ventas.setModel(modeloGeneral);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case "Mostrar empleados": {
                try {

                    modeloGeneral.setColumnIdentifiers(titulosEmpleados); //Asignar titulos a la tabla

                    listarTablas("SELECT * from empleado");
                    tabla_ventas.setModel(modeloGeneral);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            break;
            case "Mostrar articulos": {
                try {

                    modeloGeneral.setColumnIdentifiers(titulosArticulos); //Asignar titulos a la tabla

                    listarTablas("SELECT * from articulo");
                    tabla_ventas.setModel(modeloGeneral);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "Mostrar ventas": {

                lbl_infoCliente.setText("Información Cliente:");
                lbl_infoEmpleado.setText("Información Empleado:");
                lbl_infoArticulo.setText("Información Articulo:");

                try {

                    modeloGeneral.setColumnIdentifiers(tituloVenta); //Asignar titulos a la tabla

                    listarTablas("SELECT * from venta");
                    tabla_ventas.setModel(modeloGeneral);

                } catch (SQLException ex) {
                    Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
        }

        if (!(list_buscador.getSelectedItem() == "Mostrar ventas")) {

            DefaultTableModel modeloCliente = new DefaultTableModel(); //Crear el modelo a la tabla
            tabla_clienteInterna.setModel(modeloCliente);
            modeloCliente.setRowCount(0);

            DefaultTableModel modeloEmpleado = new DefaultTableModel(); //Crear el modelo a la tabla
            tabla_empleadoInterna.setModel(modeloEmpleado);
            modeloEmpleado.setRowCount(0);

            DefaultTableModel modeloArticulo = new DefaultTableModel(); //Crear el modelo a la tabla
            tabla_articuloInterna.setModel(modeloArticulo);
            modeloArticulo.setRowCount(0);
        }

    }//GEN-LAST:event_btn_filtrarListaActionPerformed

    private void tabla_ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventasMouseClicked
        //Es almacenar la posicion de la fila seleccionada en la TABLA
        int fila = tabla_ventas.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla");
        } else {

            if (list_buscador.getSelectedItem() == "Mostrar ventas") {

                //Tabla ID:CLIENTE
                {
                    try {

                        modeloIDcliente.setColumnIdentifiers(titulosClientes); //Asignar titulos a la tabla

                        filtrarCodigo("SELECT cliente.codigo, cliente.nombre, cliente.apellido, cliente.edad, cliente.dir, cliente.telefono from venta inner join cliente on " + tabla_ventas.getValueAt(fila, 2).toString() + "= cliente.codigo", modeloIDcliente);
                        tabla_clienteInterna.setModel(modeloIDcliente);

                    } catch (SQLException ex) {
                        Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                //Tabla ID: EMPLEADO               
                {
                    try {

                        modeloIDempleado.setColumnIdentifiers(titulosEmpleados); //Asignar titulos a la tabla

                        filtrarCodigo("SELECT empleado.codigo, empleado.nombre, empleado.apellido, empleado.edad, empleado.fecha_nacimiento, empleado.telefono, empleado.usuario, empleado.contrasena from venta inner join empleado on " + tabla_ventas.getValueAt(fila, 1).toString() + "= empleado.codigo", modeloIDempleado);
                        tabla_empleadoInterna.setModel(modeloIDempleado);

                    } catch (SQLException ex) {
                        Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                //Tabla ID: ARTICULO               
                {
                    try {

                        modeloIDarticulo.setColumnIdentifiers(titulosArticulos); //Asignar titulos a la tabla

                        filtrarCodigo("SELECT articulo.codigo, articulo.titulo, articulo.genero, articulo.precio, articulo.cantidad, articulo.tipo from venta inner join articulo on '" + tabla_ventas.getValueAt(fila, 3).toString() + "'= articulo.codigo", modeloIDarticulo);
                        tabla_articuloInterna.setModel(modeloIDarticulo);

                    } catch (SQLException ex) {
                        Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        }
    }//GEN-LAST:event_tabla_ventasMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        if (verificarInputBuscarEmpleadoxArticulo()) {
            realizarBusquedaEmpleadoxArticulo();
        } else {
            JOptionPane.showMessageDialog(this, "Digitar el tipo de búsqueda y código correspondiente, empleado:codigo o articulo:codigo");
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tabla_empleadoxarticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_empleadoxarticuloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_empleadoxarticuloMouseClicked

    private void tabla_resultadoGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_resultadoGeneralMouseClicked
        String consulta = buscadorReporte.getText();
        String[] separador = consulta.split(":");
        String tipoBusqueda = separador[0].trim().toLowerCase();
        String codigoBusqueda = separador[1].trim();

        //Es almacenar la posicion de la fila seleccionada en la TABLA
        int fila = tabla_resultadoGeneral.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla");
        } else {
            if (tipoBusqueda.equals("empleado")) {

                {
                    try {

                        modeloBusquedaInfo.setColumnIdentifiers(titulosArticulos); //Asignar titulos a la tabla

                        filtrarCodigo("SELECT articulo.codigo, articulo.titulo, articulo.genero, articulo.precio, articulo.cantidad, articulo.tipo from venta inner join articulo on '" + tabla_resultadoGeneral.getValueAt(fila, 3).toString() + "'= articulo.codigo", modeloBusquedaInfo);
                        tabla_empleadoxarticulo.setModel(modeloBusquedaInfo);

                    } catch (SQLException ex) {
                        Logger.getLogger(frmReporte.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } else if (tipoBusqueda.equals("articulo")) {
            }
        }
    }//GEN-LAST:event_tabla_resultadoGeneralMouseClicked

    private void buscadorReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorReporteMouseClicked
        buscadorReporte.requestFocus();
        buscadorReporte.selectAll();
    }//GEN-LAST:event_buscadorReporteMouseClicked

    private void buscadorReporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscadorReporteFocusLost
        if (buscadorReporte.getText().equals("")) {

            buscadorReporte.setText("Empleado:código o Articulo:codigo");
        }
    }//GEN-LAST:event_buscadorReporteFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        panelInicial.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void buscadorReporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorReporteKeyPressed
        if (teclaEnter(evt)) {
            if (verificarInputBuscarEmpleadoxArticulo()) {
                realizarBusquedaEmpleadoxArticulo();
            } else {
                JOptionPane.showMessageDialog(this, "Digitar el tipo de búsqueda y código correspondiente, empleado:codigo o articulo:codigo");
            }

        }

    }//GEN-LAST:event_buscadorReporteKeyPressed

    private void btn_filtrarListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtrarListaMouseEntered
        Color btnHoverOn = new Color(39, 48, 114);
        btn_filtrarLista.setBackground(btnHoverOn);
    }//GEN-LAST:event_btn_filtrarListaMouseEntered

    private void btn_filtrarListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_filtrarListaMouseExited
        Color btnHoverOut = new Color(74, 79, 231);
        btn_filtrarLista.setBackground(btnHoverOut);
    }//GEN-LAST:event_btn_filtrarListaMouseExited

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered
        Color btnHoverOn = new Color(39, 48, 114);
        btn_buscar.setBackground(btnHoverOn);
    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
        Color btnHoverOut = new Color(74, 79, 231);
        btn_buscar.setBackground(btnHoverOut);
    }//GEN-LAST:event_btn_buscarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_filtrarLista;
    private javax.swing.JTextField buscadorReporte;
    private javax.swing.JPanel cont_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl_infoArticulo;
    private javax.swing.JLabel lbl_infoCliente;
    private javax.swing.JLabel lbl_infoEmpleado;
    private javax.swing.JComboBox<String> list_buscador;
    private javax.swing.JPanel panelInicial;
    private javax.swing.JPanel piePagina;
    private javax.swing.JTable tabla_articuloInterna;
    private javax.swing.JScrollPane tabla_articuloPrincipal;
    private javax.swing.JTable tabla_clienteInterna;
    private javax.swing.JScrollPane tabla_clientePrincipal;
    private javax.swing.JTable tabla_empleadoInterna;
    private javax.swing.JScrollPane tabla_empleadoPrincipal;
    private javax.swing.JTable tabla_empleadoxarticulo;
    private javax.swing.JScrollPane tabla_principalVentas;
    private javax.swing.JScrollPane tabla_principal_empleadoxarticulo;
    private javax.swing.JScrollPane tabla_principal_resultadoGenerales;
    private javax.swing.JTable tabla_resultadoGeneral;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JPanel tituloCliente;
    private javax.swing.JPanel tituloEmpleado;
    private javax.swing.JPanel tituloEmpleado1;
    private javax.swing.JLabel txt_infoBusqueda;
    // End of variables declaration//GEN-END:variables
}

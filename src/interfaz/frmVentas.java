package interfaz;

// Redimensionar imagenes
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmVentas extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    int precioUnidad;

    public frmVentas() {
        initComponents();
    }

    private void RealizarVentar() {
        if (txt_buscarInformacion.getText().equals("Código cliente, Código empleado, Código articulo")) {
            JOptionPane.showMessageDialog(this, "Es necesario brindar los tres códigos para realizar la correcta búsqueda");
        } else {
            String cadenaDatos = "";
            cadenaDatos = txt_buscarInformacion.getText();
            String[] Codigos_separados = cadenaDatos.split(",");

            if (Codigos_separados.length != 3) {
                JOptionPane.showMessageDialog(this, "Es necesario suministrar los 3 códigos.");

                txt_nombreCliente.setText("--.--");
                txt_apellidoCliente.setText("--.--");
                txt_nombreEmpleado.setText("--.--");
                txt_apellidoEmpleado.setText("--.--");
                txt_nombreArticulo.setText("--.--");
                txt_precio.setText("--.--");
                txt_cantidad.setText("--.--");
                txt_cantidadArticulos.setText("");
                txt_totalPagar.setText("--.--");

                txt_buscarInformacion.setText("Código cliente, Código empleado, Código articulo");
                txt_buscarInformacion.requestFocus();
                txt_buscarInformacion.selectAll();

                //Luego de guardar en la db ventas: no permite que se pueda escribir la cantidad
                txt_cantidadArticulos.setEnabled(false);

            } else {

                boolean habilitarCantidad = false;

                // CONSULTAR DB CLIENTES
                if (Integer.parseInt(Codigos_separados[0]) == 1) {
                    txt_nombreCliente.setText("Andrés");
                    txt_apellidoCliente.setText("Serna Muñoz");

                    habilitarCantidad = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Código del cliente " + Codigos_separados[0] + " no está registrado en el sistema.");
                    txt_nombreCliente.setText("--.--");
                    txt_apellidoCliente.setText("--.--");

                    //evitar agregar cantidad si el codigo es incorrecto
                    habilitarCantidad = false;
                }

                //CONSULTAR DB EMPLEADO
                if (Integer.parseInt(Codigos_separados[1]) == 2) {
                    txt_nombreEmpleado.setText("Mateo");
                    txt_apellidoEmpleado.setText("Arboleda Beltrán");

                    habilitarCantidad = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Código del empleado " + Codigos_separados[1] + " no está registrado en el sistema.");
                    txt_nombreEmpleado.setText("--.--");
                    txt_apellidoEmpleado.setText("--.--");

                    //evitar agregar cantidad si el codigo es incorrecto
                    habilitarCantidad = false;
                }

                //CONSULTAR DB ARTICULOS
                if (Integer.parseInt(Codigos_separados[2]) == 3) {
                    txt_nombreArticulo.setText("Intelestelar");
                    txt_precio.setText("25000");
                    txt_cantidad.setText("10");

                    precioUnidad = Integer.parseInt(txt_precio.getText());
                    habilitarCantidad = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Código del articulo " + Codigos_separados[2] + " no está registrado en el sistema.");
                    txt_nombreArticulo.setText("--.--");
                    txt_precio.setText("--.--");
                    txt_cantidad.setText("--.--");

                    habilitarCantidad = false;
                }

                if (habilitarCantidad) {
                    //PERMITE AGREGAR CANTIDAD AL INPUT
                    txt_cantidadArticulos.setEnabled(true);
                } else {
                    //evitar agregar cantidad si el codigo es incorrecto
                    txt_cantidadArticulos.setEnabled(false);    
                }
                
            }

        }
    }

    //Permitir solo numeros en el input
    private void inputNumeros(java.awt.event.KeyEvent evt) {
        char key = (char) evt.getKeyChar();
        if (Character.isDigit(key)) {
            evt.setKeyChar(key);
        } else {
            evt.consume();
        }
    }

    //Detectar la tecla enter
    private boolean teclaEnter(java.awt.event.KeyEvent evt) {
        boolean result = false;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            result = true;
        }
        return result;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_buscarInformacion = new javax.swing.JTextField();
        btn_buscarCliente = new javax.swing.JButton();
        contCliente = new javax.swing.JPanel();
        lbl_nombreCliente = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JLabel();
        lbl_apellidoCliente = new javax.swing.JLabel();
        txt_apellidoCliente = new javax.swing.JLabel();
        tituloCliente = new javax.swing.JPanel();
        lbl_infoCliente = new javax.swing.JLabel();
        contEmpleado = new javax.swing.JPanel();
        lbl_nombreEmpleado = new javax.swing.JLabel();
        txt_nombreEmpleado = new javax.swing.JLabel();
        lbl_apellidoEmpleado = new javax.swing.JLabel();
        txt_apellidoEmpleado = new javax.swing.JLabel();
        tituloCliente1 = new javax.swing.JPanel();
        lbl_infoEmpleado = new javax.swing.JLabel();
        contEmpleado1 = new javax.swing.JPanel();
        lbl_nombreArticulo = new javax.swing.JLabel();
        txt_nombreArticulo = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        txt_precio = new javax.swing.JLabel();
        tituloCliente2 = new javax.swing.JPanel();
        lbl_infoArticulos = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        tituloCliente3 = new javax.swing.JPanel();
        lbl_cantidadArticulos = new javax.swing.JLabel();
        txt_cantidadArticulos = new javax.swing.JTextField();
        txt_totalPagar = new javax.swing.JLabel();
        lbl_totalPagar = new javax.swing.JLabel();
        cont_logo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cont_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestión de vetnas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVisible(true);
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_buscarInformacion.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_buscarInformacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscarInformacion.setText("Código cliente, Código empleado, Código articulo");
        txt_buscarInformacion.setToolTipText("");
        txt_buscarInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_buscarInformacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscarInformacionFocusLost(evt);
            }
        });
        txt_buscarInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_buscarInformacionMouseClicked(evt);
            }
        });
        txt_buscarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarInformacionActionPerformed(evt);
            }
        });
        txt_buscarInformacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarInformacionKeyPressed(evt);
            }
        });

        btn_buscarCliente.setBackground(new java.awt.Color(74, 79, 231));
        btn_buscarCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_buscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarCliente.setText("Realizar búsqueda");
        btn_buscarCliente.setBorder(null);
        btn_buscarCliente.setBorderPainted(false);
        btn_buscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarClienteActionPerformed(evt);
            }
        });

        contCliente.setBackground(new java.awt.Color(255, 255, 255));
        contCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 79, 231)));

        lbl_nombreCliente.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_nombreCliente.setText("Nombre:");
        lbl_nombreCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_nombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_nombreCliente.setText("--.--");
        txt_nombreCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_nombreCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreClienteMouseClicked(evt);
            }
        });

        lbl_apellidoCliente.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_apellidoCliente.setText("Apellido:");
        lbl_apellidoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_apellidoCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_apellidoCliente.setText("--.--");
        txt_apellidoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_apellidoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoClienteMouseClicked(evt);
            }
        });

        tituloCliente.setBackground(new java.awt.Color(74, 79, 231));

        lbl_infoCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_infoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infoCliente.setText("Información Cliente:");
        lbl_infoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tituloClienteLayout = new javax.swing.GroupLayout(tituloCliente);
        tituloCliente.setLayout(tituloClienteLayout);
        tituloClienteLayout.setHorizontalGroup(
            tituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_infoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tituloClienteLayout.setVerticalGroup(
            tituloClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloClienteLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lbl_infoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contClienteLayout = new javax.swing.GroupLayout(contCliente);
        contCliente.setLayout(contClienteLayout);
        contClienteLayout.setHorizontalGroup(
            contClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbl_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tituloCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contClienteLayout.setVerticalGroup(
            contClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contClienteLayout.createSequentialGroup()
                .addComponent(tituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        contEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        contEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 79, 231)));

        lbl_nombreEmpleado.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_nombreEmpleado.setText("Nombre:");
        lbl_nombreEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_nombreEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_nombreEmpleado.setText("--.--");
        txt_nombreEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_nombreEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreEmpleadoMouseClicked(evt);
            }
        });

        lbl_apellidoEmpleado.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_apellidoEmpleado.setText("Apellido:");
        lbl_apellidoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_apellidoEmpleado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_apellidoEmpleado.setText("--.--");
        txt_apellidoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_apellidoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoEmpleadoMouseClicked(evt);
            }
        });

        tituloCliente1.setBackground(new java.awt.Color(74, 79, 231));

        lbl_infoEmpleado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_infoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infoEmpleado.setText("Información Empleado:");
        lbl_infoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tituloCliente1Layout = new javax.swing.GroupLayout(tituloCliente1);
        tituloCliente1.setLayout(tituloCliente1Layout);
        tituloCliente1Layout.setHorizontalGroup(
            tituloCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_infoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tituloCliente1Layout.setVerticalGroup(
            tituloCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloCliente1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lbl_infoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contEmpleadoLayout = new javax.swing.GroupLayout(contEmpleado);
        contEmpleado.setLayout(contEmpleadoLayout);
        contEmpleadoLayout.setHorizontalGroup(
            contEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbl_apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_apellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tituloCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contEmpleadoLayout.setVerticalGroup(
            contEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEmpleadoLayout.createSequentialGroup()
                .addComponent(tituloCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        contEmpleado1.setBackground(new java.awt.Color(255, 255, 255));
        contEmpleado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(74, 79, 231)));

        lbl_nombreArticulo.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_nombreArticulo.setText("Nombre:");
        lbl_nombreArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_nombreArticulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_nombreArticulo.setText("--.--");
        txt_nombreArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_nombreArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreArticuloMouseClicked(evt);
            }
        });

        lbl_precio.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_precio.setText("Precio c/u");
        lbl_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_precio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_precio.setText("--.--");
        txt_precio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_precioMouseClicked(evt);
            }
        });

        tituloCliente2.setBackground(new java.awt.Color(74, 79, 231));

        lbl_infoArticulos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_infoArticulos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infoArticulos.setText("Información Articulo:");
        lbl_infoArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tituloCliente2Layout = new javax.swing.GroupLayout(tituloCliente2);
        tituloCliente2.setLayout(tituloCliente2Layout);
        tituloCliente2Layout.setHorizontalGroup(
            tituloCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloCliente2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_infoArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tituloCliente2Layout.setVerticalGroup(
            tituloCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloCliente2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lbl_infoArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl_cantidad.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        lbl_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantidad.setText("Cantidad bodega:");
        lbl_cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_cantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cantidad.setText("--.--");
        txt_cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cantidadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contEmpleado1Layout = new javax.swing.GroupLayout(contEmpleado1);
        contEmpleado1.setLayout(contEmpleado1Layout);
        contEmpleado1Layout.setHorizontalGroup(
            contEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEmpleado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(tituloCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contEmpleado1Layout.setVerticalGroup(
            contEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contEmpleado1Layout.createSequentialGroup()
                .addComponent(tituloCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contEmpleado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tituloCliente3.setBackground(new java.awt.Color(74, 79, 231));

        lbl_cantidadArticulos.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        lbl_cantidadArticulos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cantidadArticulos.setText("Cantidad articulos:");
        lbl_cantidadArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_cantidadArticulos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_cantidadArticulos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cantidadArticulos.setBorder(null);
        txt_cantidadArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadArticulosActionPerformed(evt);
            }
        });
        txt_cantidadArticulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantidadArticulosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadArticulosKeyTyped(evt);
            }
        });

        txt_totalPagar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txt_totalPagar.setForeground(new java.awt.Color(255, 255, 255));
        txt_totalPagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_totalPagar.setText("--.--");
        txt_totalPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_totalPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_totalPagarMouseClicked(evt);
            }
        });

        lbl_totalPagar.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        lbl_totalPagar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_totalPagar.setText("Total a pagar:");
        lbl_totalPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tituloCliente3Layout = new javax.swing.GroupLayout(tituloCliente3);
        tituloCliente3.setLayout(tituloCliente3Layout);
        tituloCliente3Layout.setHorizontalGroup(
            tituloCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloCliente3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(lbl_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tituloCliente3Layout.setVerticalGroup(
            tituloCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloCliente3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tituloCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tituloCliente3Layout.createSequentialGroup()
                        .addGroup(tituloCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloCliente3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_cantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_cantidadArticulos, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_buscarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tituloCliente3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contEmpleado1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contEmpleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(contCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(contEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(contEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        cont_logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        cont_titulo.setBackground(new java.awt.Color(46, 53, 137));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Days One", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR VENTAS");

        javax.swing.GroupLayout cont_tituloLayout = new javax.swing.GroupLayout(cont_titulo);
        cont_titulo.setLayout(cont_tituloLayout);
        cont_tituloLayout.setHorizontalGroup(
            cont_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        cont_tituloLayout.setVerticalGroup(
            cont_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cont_logoLayout = new javax.swing.GroupLayout(cont_logo);
        cont_logo.setLayout(cont_logoLayout);
        cont_logoLayout.setHorizontalGroup(
            cont_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_logoLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cont_logoLayout.setVerticalGroup(
            cont_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cont_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Permite realizar la venta de los articulos, mediante, el cliente, empleado y el articulo.");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("* Para buscar la información es necesario separar los identificadores por coma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(554, 554, 554))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cont_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel5.setBackground(new java.awt.Color(46, 53, 137));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Todos los derechos reservados - copyright 2020 - - - Versión de software 1.0 - - - Tech & chill");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(46, 46, 46))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(200, 20, 747, 967);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarInformacionMouseClicked

        txt_buscarInformacion.requestFocus();
        txt_buscarInformacion.selectAll();
    }//GEN-LAST:event_txt_buscarInformacionMouseClicked

    private void txt_buscarInformacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarInformacionFocusLost
        if (txt_buscarInformacion.getText().equals("")) {

            txt_buscarInformacion.setText("Buscar cliente por código de registro");

        }
    }//GEN-LAST:event_txt_buscarInformacionFocusLost

    private void btn_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarClienteActionPerformed
        RealizarVentar();
    }//GEN-LAST:event_btn_buscarClienteActionPerformed

    private void txt_buscarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarInformacionActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txt_buscarInformacion.requestFocus();
        txt_buscarInformacion.selectAll();

        txt_cantidadArticulos.setEnabled(false);

    }//GEN-LAST:event_formInternalFrameActivated

    private void txt_nombreClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreClienteMouseClicked

    private void txt_apellidoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoClienteMouseClicked

    private void txt_nombreEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreEmpleadoMouseClicked

    private void txt_apellidoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoEmpleadoMouseClicked

    private void txt_nombreArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreArticuloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreArticuloMouseClicked

    private void txt_precioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_precioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioMouseClicked

    private void txt_cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadMouseClicked

    private void txt_totalPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_totalPagarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalPagarMouseClicked

    private void txt_buscarInformacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarInformacionKeyPressed
        if (teclaEnter(evt)) {
            RealizarVentar();
        }
    }//GEN-LAST:event_txt_buscarInformacionKeyPressed

    private void txt_cantidadArticulosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadArticulosKeyTyped
        inputNumeros(evt);
    }//GEN-LAST:event_txt_cantidadArticulosKeyTyped

    private void txt_cantidadArticulosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadArticulosKeyPressed
        if (teclaEnter(evt)) {
            double totalPagar = 0;
            totalPagar = precioUnidad * Integer.parseInt(txt_cantidadArticulos.getText());
            txt_totalPagar.setText("" + totalPagar);

            int seleccion = JOptionPane.showConfirmDialog(this,
                    "Desea realizar la venta del articulo.",
                    "Confirmar venta",
                    JOptionPane.YES_NO_OPTION);

            if (seleccion == 0) {
                JOptionPane.showMessageDialog(this, "Venta realizada con exito.");
                txt_nombreCliente.setText("--.--");
                txt_apellidoCliente.setText("--.--");
                txt_nombreEmpleado.setText("--.--");
                txt_apellidoEmpleado.setText("--.--");
                txt_nombreArticulo.setText("--.--");
                txt_precio.setText("--.--");
                txt_cantidad.setText("--.--");
                txt_cantidadArticulos.setText("");
                txt_totalPagar.setText("--.--");

                txt_buscarInformacion.setText("Código cliente, Código empleado, Código articulo");
                txt_buscarInformacion.requestFocus();
                txt_buscarInformacion.selectAll();

                //Luego de guardar en la db ventas: no permite que se pueda escribir la cantidad
                txt_cantidadArticulos.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(this, "No se realizó la venta.");
            }

        }
    }//GEN-LAST:event_txt_cantidadArticulosKeyPressed

    private void txt_cantidadArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadArticulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadArticulosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarCliente;
    private javax.swing.JPanel contCliente;
    private javax.swing.JPanel contEmpleado;
    private javax.swing.JPanel contEmpleado1;
    private javax.swing.JPanel cont_logo;
    private javax.swing.JPanel cont_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_apellidoCliente;
    private javax.swing.JLabel lbl_apellidoEmpleado;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_cantidadArticulos;
    private javax.swing.JLabel lbl_infoArticulos;
    private javax.swing.JLabel lbl_infoCliente;
    private javax.swing.JLabel lbl_infoEmpleado;
    private javax.swing.JLabel lbl_nombreArticulo;
    private javax.swing.JLabel lbl_nombreCliente;
    private javax.swing.JLabel lbl_nombreEmpleado;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_totalPagar;
    private javax.swing.JPanel tituloCliente;
    private javax.swing.JPanel tituloCliente1;
    private javax.swing.JPanel tituloCliente2;
    private javax.swing.JPanel tituloCliente3;
    private javax.swing.JLabel txt_apellidoCliente;
    private javax.swing.JLabel txt_apellidoEmpleado;
    private javax.swing.JTextField txt_buscarInformacion;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JTextField txt_cantidadArticulos;
    private javax.swing.JLabel txt_nombreArticulo;
    private javax.swing.JLabel txt_nombreCliente;
    private javax.swing.JLabel txt_nombreEmpleado;
    private javax.swing.JLabel txt_precio;
    private javax.swing.JLabel txt_totalPagar;
    // End of variables declaration//GEN-END:variables
}

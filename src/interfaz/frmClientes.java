package interfaz;

// Redimensionar imagenes
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmClientes
     */
    public frmClientes() {
        initComponents();
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
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_edad = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_buscarCliente = new javax.swing.JTextField();
        btn_buscarCliente = new javax.swing.JButton();
        btn_registrarCliente = new javax.swing.JButton();
        btn_actualizarCliente = new javax.swing.JButton();
        btn_eliminarCliente = new javax.swing.JButton();
        cont_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cont_logo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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
        setMaximizable(true);
        setTitle("Gestión de clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_codigo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_codigo.setText("Código:");
        lbl_codigo.setToolTipText("");
        lbl_codigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_codigo.setName(""); // NOI18N
        lbl_codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_codigoMouseClicked(evt);
            }
        });

        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_nombre.setText("Nombre:");
        lbl_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nombreMouseClicked(evt);
            }
        });

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
        });

        lbl_apellido.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_apellido.setText("Apellido:");
        lbl_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_apellidoMouseClicked(evt);
            }
        });

        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyPressed(evt);
            }
        });

        lbl_edad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_edad.setText("Edad:");
        lbl_edad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_edadMouseClicked(evt);
            }
        });

        txt_edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_edadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });

        lbl_direccion.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_direccion.setText("Dirección:");
        lbl_direccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_direccionMouseClicked(evt);
            }
        });

        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_direccionKeyPressed(evt);
            }
        });

        lbl_telefono.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_telefono.setText("Teléfono:");
        lbl_telefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_telefonoMouseClicked(evt);
            }
        });

        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyPressed(evt);
            }
        });

        txt_buscarCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscarCliente.setText("Buscar cliente por código de registro");
        txt_buscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_buscarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_buscarClienteFocusLost(evt);
            }
        });
        txt_buscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_buscarClienteMouseClicked(evt);
            }
        });
        txt_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarClienteActionPerformed(evt);
            }
        });

        btn_buscarCliente.setBackground(new java.awt.Color(74, 79, 231));
        btn_buscarCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_buscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarCliente.setText("Buscar cliente");
        btn_buscarCliente.setBorder(null);
        btn_buscarCliente.setBorderPainted(false);
        btn_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarClienteActionPerformed(evt);
            }
        });

        btn_registrarCliente.setBackground(new java.awt.Color(74, 79, 231));
        btn_registrarCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_registrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarCliente.setText("Registrar cliente");
        btn_registrarCliente.setBorder(null);
        btn_registrarCliente.setBorderPainted(false);
        btn_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarClienteActionPerformed(evt);
            }
        });

        btn_actualizarCliente.setBackground(new java.awt.Color(74, 79, 231));
        btn_actualizarCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_actualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizarCliente.setText("Actualizar");
        btn_actualizarCliente.setToolTipText("");
        btn_actualizarCliente.setBorder(null);
        btn_actualizarCliente.setBorderPainted(false);

        btn_eliminarCliente.setBackground(new java.awt.Color(74, 79, 231));
        btn_eliminarCliente.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_eliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarCliente.setText("Eliminar");
        btn_eliminarCliente.setToolTipText("");
        btn_eliminarCliente.setBorder(null);
        btn_eliminarCliente.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_telefono)
                                .addGap(18, 18, 18)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion)
                                    .addComponent(btn_registrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_actualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        cont_titulo.setBackground(new java.awt.Color(46, 53, 137));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Days One", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR CLIENTES");

        javax.swing.GroupLayout cont_tituloLayout = new javax.swing.GroupLayout(cont_titulo);
        cont_titulo.setLayout(cont_tituloLayout);
        cont_tituloLayout.setHorizontalGroup(
            cont_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cont_tituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cont_tituloLayout.setVerticalGroup(
            cont_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cont_logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        javax.swing.GroupLayout cont_logoLayout = new javax.swing.GroupLayout(cont_logo);
        cont_logo.setLayout(cont_logoLayout);
        cont_logoLayout.setHorizontalGroup(
            cont_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cont_logoLayout.setVerticalGroup(
            cont_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Permite registrar, buscar, actuailizar y eliminar los datos de los clientes.");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Es necesario llenar todos los campos");

        jPanel5.setBackground(new java.awt.Color(46, 53, 137));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Todos los derechos reservados - copyright 2020 - - - Versión de software 1.0 - - - Tech & chill");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cont_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cont_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cont_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cont_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setBounds(200, 20, 756, 874);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_codigoMouseClicked
        txt_codigo.requestFocus();
    }//GEN-LAST:event_lbl_codigoMouseClicked

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped

        inputNumeros(evt);

    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped

        inputNumeros(evt);

    }//GEN-LAST:event_txt_edadKeyTyped

    private void lbl_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nombreMouseClicked
        txt_nombre.requestFocus();
    }//GEN-LAST:event_lbl_nombreMouseClicked

    private void lbl_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_apellidoMouseClicked
        txt_apellido.requestFocus();
    }//GEN-LAST:event_lbl_apellidoMouseClicked

    private void lbl_edadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_edadMouseClicked
        txt_edad.requestFocus();
    }//GEN-LAST:event_lbl_edadMouseClicked

    private void lbl_telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_telefonoMouseClicked
        txt_telefono.requestFocus();
    }//GEN-LAST:event_lbl_telefonoMouseClicked

    private void lbl_direccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_direccionMouseClicked
        txt_direccion.requestFocus();
    }//GEN-LAST:event_lbl_direccionMouseClicked

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        if (teclaEnter(evt)) {
            txt_nombre.requestFocus();
        }
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        if (teclaEnter(evt)) {
            txt_apellido.requestFocus();
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_edadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyPressed
        if (teclaEnter(evt)) {
            txt_telefono.requestFocus();
        }
    }//GEN-LAST:event_txt_edadKeyPressed

    private void txt_telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyPressed
        if (teclaEnter(evt)) {
            txt_direccion.requestFocus();
        }
    }//GEN-LAST:event_txt_telefonoKeyPressed

    private void txt_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyPressed
        if (teclaEnter(evt)) {
            txt_edad.requestFocus();
        }
    }//GEN-LAST:event_txt_apellidoKeyPressed

    private void txt_direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyPressed
        if (teclaEnter(evt)) {
            txt_codigo.requestFocus();
        }
    }//GEN-LAST:event_txt_direccionKeyPressed

    private void txt_buscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarClienteMouseClicked

        txt_buscarCliente.requestFocus();
        txt_buscarCliente.selectAll();
    }//GEN-LAST:event_txt_buscarClienteMouseClicked

    private void txt_buscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarClienteFocusLost
        if (txt_buscarCliente.getText().equals("")) {

            txt_buscarCliente.setText("Buscar cliente por código de registro");
            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_edad.setText("");
            txt_telefono.setText("");
            txt_direccion.setText("");

            //Permitir modificar el campo código
            txt_codigo.setEditable(true);
        }
    }//GEN-LAST:event_txt_buscarClienteFocusLost

    private void btn_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarClienteActionPerformed

        if (txt_buscarCliente.getText().equals("Buscar cliente por código de registro")) {
            JOptionPane.showMessageDialog(null, "Es necesario el código de cliente que se desea buscar.");
        } else {
            //Informacion de prueba : BORRAR         
            txt_codigo.setText("1");
            txt_nombre.setText("Andres");
            txt_apellido.setText("Serna");
            txt_edad.setText("24");
            txt_telefono.setText("321-888-6044");
            txt_direccion.setText("Diagonal 58 # 84 52 - Niquia");

            //Evitar poder Actualizar el código
            txt_codigo.setEditable(false);

        }
    }//GEN-LAST:event_btn_buscarClienteActionPerformed

    private void txt_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarClienteActionPerformed

    private void btn_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarClienteActionPerformed
        
        if( txt_codigo.getText().equals("") || txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_edad.getText().equals("") ||
            txt_telefono.getText().equals("") || txt_direccion.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos.");
        }
    }//GEN-LAST:event_btn_registrarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarCliente;
    private javax.swing.JButton btn_buscarCliente;
    private javax.swing.JButton btn_eliminarCliente;
    private javax.swing.JButton btn_registrarCliente;
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
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscarCliente;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}

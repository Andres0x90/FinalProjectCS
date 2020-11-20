package interfaz;

// Redimensionar imagenes
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmArticulos extends javax.swing.JInternalFrame {

    public frmArticulos() {
        initComponents();

        //Iniciar los valores del tipo de articulo
        for (int i = 0; i < 3; i++) {
            list_tipo.addItem(TipoArticulo[i]);
        }

        list_genero.setEnabled(false);
    }

    //Arrays para Tipo de articulo
    String TipoArticulo[] = {"", "Pelicula", "Videojuego"};
    String generoPeliculas[] = {"Género pelicula 1", "Género pelicula 2", "Género pelicula 3"};
    String generoVideoJuegos[] = {"Género videojuego 1", "Género videojuego 2", "Género videojuego 3"};

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
        lbl_titulo = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        lbl_tipo = new javax.swing.JLabel();
        lbl_precioVenta = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_buscarCliente = new javax.swing.JTextField();
        btn_buscarArticulo = new javax.swing.JButton();
        btn_registrarArticulo = new javax.swing.JButton();
        btn_actualizarArticulo = new javax.swing.JButton();
        btn_eliminarArticulo = new javax.swing.JButton();
        lbl_genero = new javax.swing.JLabel();
        list_tipo = new javax.swing.JComboBox<>();
        list_genero = new javax.swing.JComboBox<>();
        txt_precioVenta = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
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
        setTitle("Gestión de articulos");
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

        txt_codigo.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
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

        lbl_titulo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_titulo.setText("Titulo:");
        lbl_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_tituloMouseClicked(evt);
            }
        });

        txt_titulo.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tituloKeyPressed(evt);
            }
        });

        lbl_tipo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_tipo.setText("Tipo:");
        lbl_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_tipoMouseClicked(evt);
            }
        });

        lbl_precioVenta.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_precioVenta.setText("Precio de venta:");
        lbl_precioVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_precioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_precioVentaMouseClicked(evt);
            }
        });

        lbl_cantidad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_cantidad.setText("Cantidad:");
        lbl_cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cantidadMouseClicked(evt);
            }
        });

        txt_buscarCliente.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_buscarCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_buscarCliente.setText("Buscar articulo por código de registro");
        txt_buscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_buscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        btn_buscarArticulo.setBackground(new java.awt.Color(74, 79, 231));
        btn_buscarArticulo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_buscarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarArticulo.setText("Buscar articulo");
        btn_buscarArticulo.setBorder(null);
        btn_buscarArticulo.setBorderPainted(false);
        btn_buscarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarArticuloActionPerformed(evt);
            }
        });

        btn_registrarArticulo.setBackground(new java.awt.Color(74, 79, 231));
        btn_registrarArticulo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_registrarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarArticulo.setText("Registrar articulo");
        btn_registrarArticulo.setBorder(null);
        btn_registrarArticulo.setBorderPainted(false);
        btn_registrarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarArticuloActionPerformed(evt);
            }
        });

        btn_actualizarArticulo.setBackground(new java.awt.Color(74, 79, 231));
        btn_actualizarArticulo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_actualizarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizarArticulo.setText("Actualizar");
        btn_actualizarArticulo.setToolTipText("");
        btn_actualizarArticulo.setBorder(null);
        btn_actualizarArticulo.setBorderPainted(false);
        btn_actualizarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_eliminarArticulo.setBackground(new java.awt.Color(74, 79, 231));
        btn_eliminarArticulo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btn_eliminarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarArticulo.setText("Eliminar");
        btn_eliminarArticulo.setToolTipText("");
        btn_eliminarArticulo.setBorder(null);
        btn_eliminarArticulo.setBorderPainted(false);
        btn_eliminarArticulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_genero.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbl_genero.setText("Género:");
        lbl_genero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_generoMouseClicked(evt);
            }
        });

        list_tipo.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        list_tipo.setBorder(null);
        list_tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        list_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_tipoActionPerformed(evt);
            }
        });

        list_genero.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        list_genero.setBorder(null);
        list_genero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_precioVenta.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_precioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precioVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_precioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precioVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioVentaKeyTyped(evt);
            }
        });

        txt_cantidad.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_precioVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_titulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(list_tipo, 0, 180, Short.MAX_VALUE)
                                    .addComponent(txt_precioVenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_cantidad)
                                    .addComponent(list_genero, 0, 218, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_actualizarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_eliminarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_registrarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        cont_titulo.setBackground(new java.awt.Color(46, 53, 137));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Days One", 0, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIONAR ARTICULOS");

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
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );
        cont_logoLayout.setVerticalGroup(
            cont_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Permite registrar, buscar, actuailizar y eliminar los articulos del negocio.");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        setBounds(200, 20, 756, 826);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_codigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_codigoMouseClicked
        txt_codigo.requestFocus();
    }//GEN-LAST:event_lbl_codigoMouseClicked

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped

        inputNumeros(evt);

    }//GEN-LAST:event_txt_codigoKeyTyped

    private void lbl_tituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tituloMouseClicked
        txt_titulo.requestFocus();
    }//GEN-LAST:event_lbl_tituloMouseClicked

    private void lbl_tipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tipoMouseClicked

    }//GEN-LAST:event_lbl_tipoMouseClicked

    private void lbl_precioVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_precioVentaMouseClicked
        txt_precioVenta.requestFocus();
    }//GEN-LAST:event_lbl_precioVentaMouseClicked

    private void lbl_cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cantidadMouseClicked
        txt_cantidad.requestFocus();
    }//GEN-LAST:event_lbl_cantidadMouseClicked

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        if (teclaEnter(evt)) {
            txt_titulo.requestFocus();
        }
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void txt_tituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tituloKeyPressed
        if (teclaEnter(evt)) {
            txt_precioVenta.requestFocus();
        }
    }//GEN-LAST:event_txt_tituloKeyPressed

    private void txt_buscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarClienteMouseClicked

        txt_buscarCliente.requestFocus();
        txt_buscarCliente.selectAll();
    }//GEN-LAST:event_txt_buscarClienteMouseClicked

    private void txt_buscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_buscarClienteFocusLost
        if (txt_buscarCliente.getText().equals("")) {

            txt_buscarCliente.setText("Buscar cliente por código de registro");
            txt_codigo.setText("");
            txt_titulo.setText("");

            //Permitir modificar el campo código
            txt_codigo.setEditable(true);
        }
    }//GEN-LAST:event_txt_buscarClienteFocusLost

    private void btn_buscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarArticuloActionPerformed

        if (txt_buscarCliente.getText().equals("Buscar articulo por código de registro")) {
            JOptionPane.showMessageDialog(this, "Es necesario el código de cliente que se desea buscar.");
        } else {
            //Informacion de prueba : BORRAR         
            txt_codigo.setText("1");
            txt_titulo.setText("Andres");

            //Evitar poder Actualizar el código
            txt_codigo.setEditable(false);

        }
    }//GEN-LAST:event_btn_buscarArticuloActionPerformed

    private void txt_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarClienteActionPerformed

    private void btn_registrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarArticuloActionPerformed


    }//GEN-LAST:event_btn_registrarArticuloActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        txt_codigo.requestFocus();

    }//GEN-LAST:event_formInternalFrameActivated

    private void lbl_generoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_generoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_generoMouseClicked

    private void txt_precioVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioVentaKeyPressed
        if (teclaEnter(evt)) {
            txt_cantidad.requestFocus();
        }
    }//GEN-LAST:event_txt_precioVentaKeyPressed

    private void txt_cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadKeyPressed

    private void list_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_tipoActionPerformed
        
        list_genero.removeAllItems();
        
        if (list_tipo.getSelectedIndex() == 1) {

            for (int i = 0; i < 3; i++) {
                list_genero.addItem(generoPeliculas[i]);
            }
            list_genero.setEnabled(true);
            //JOptionPane.showMessageDialog(null, "Seleccionado: " + list_tipo.getSelectedIndex());
        } else if(list_tipo.getSelectedIndex() == 2) {
            for (int i = 0; i < 3; i++) {
                list_genero.addItem(generoVideoJuegos[i]);
            }
            list_genero.setEnabled(true);
            //JOptionPane.showMessageDialog(null, "Seleccionado: " + list_tipo.getSelectedIndex());
            list_genero.setEnabled(true);
        } else{
            list_genero.setEnabled(false);
        }

    }//GEN-LAST:event_list_tipoActionPerformed

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        inputNumeros(evt);
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void txt_precioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioVentaKeyTyped
        inputNumeros(evt);
    }//GEN-LAST:event_txt_precioVentaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarArticulo;
    private javax.swing.JButton btn_buscarArticulo;
    private javax.swing.JButton btn_eliminarArticulo;
    private javax.swing.JButton btn_registrarArticulo;
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
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_precioVenta;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JComboBox<String> list_genero;
    private javax.swing.JComboBox<String> list_tipo;
    private javax.swing.JTextField txt_buscarCliente;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_precioVenta;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}

package cifrado_cesar_grupo_3;

import javax.swing.JOptionPane;

/**
 *
 * Grupo 3 Ciberseguridad Mabel Vargas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grupo 3 Ciberseguridad");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 255));
        setForeground(new java.awt.Color(255, 0, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cifrado_cesar_grupo_3/icono2.png")));
        jLabel5.setMaximumSize(new java.awt.Dimension(593, 512));
        jLabel5.setPreferredSize(new java.awt.Dimension(593, 512));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("CIFRADO CESAR");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24));
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("PROGRAMA CRIPTOGRAFÍA");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12));
        jButton1.setText("Cifrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12));
        jButton2.setText("Descifrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Texto");

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Clave");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14));
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12));
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(335, 335, 335)
                                                                .addComponent(jLabel3))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(103, 103, 103)
                                                                .addComponent(jLabel6))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jLabel7)))))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(41, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addGap(29, 29, 29))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel6.getAccessibleContext().setAccessibleName("Titulo");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_START);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnñopqrstuvwxyz";
        CifradoCesar cifrado = new CifradoCesar(mayus, minus);
        jTextArea1.setText("");
        jLabel4.setText("");

        if (jTextField1.getText() != null && !jTextField1.getText().equals("") && jTextField2.getText() != null && !jTextField2.getText().equals("")) {

            jTextArea1.setText(cifrado.cifrado(jTextField1.getText(), Integer.parseInt(jTextField2.getText())));
        } else {
            if (jTextField1.getText() == null || jTextField1.getText().equals("")) {
                jLabel4.setText("Ingrese el texto.");
            }
            if (jTextField2.getText() == null || jTextField2.getText().equals("")) {
                jLabel4.setText("Ingrese la clave.");
            }
        }

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnñopqrstuvwxyz";
        CifradoCesar cifrado = new CifradoCesar(mayus, minus);
        jTextArea1.setText("");
        jLabel4.setText("");

        if (jTextField1.getText() != null && !jTextField1.getText().equals("") && jTextField2.getText() != null && !jTextField2.getText().equals("")) {

            jTextArea1.setText(cifrado.descifrado(jTextField1.getText(), Integer.parseInt(jTextField2.getText())));
        } else {
            if (jTextField1.getText() == null || jTextField1.getText().equals("")) {
                jLabel4.setText("Ingrese el texto.");
            } else {

            }

            if (jTextField2.getText() == null || jTextField2.getText().equals("")) {
                jLabel4.setText("Ingrese la clave.");
            }
        }

    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "El texto no es válido.");
        }
    }

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un número.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

}

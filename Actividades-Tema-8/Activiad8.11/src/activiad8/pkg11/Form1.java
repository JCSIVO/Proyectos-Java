/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activiad8.pkg11;

import java.awt.Font;

/**
 *
 * @author joseconejerosivo
 */
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
        PanelNuevo.setVisible(false);
        String texto="";
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tamaño = new javax.swing.JDialog();
        lbltamaño = new javax.swing.JLabel();
        cmbtamaño = new javax.swing.JComboBox<>();
        btnaceptartamaño = new javax.swing.JButton();
        Estilos = new javax.swing.JDialog();
        lblestilo = new javax.swing.JLabel();
        negrita = new javax.swing.JCheckBox();
        cursiva = new javax.swing.JCheckBox();
        Subrayado = new javax.swing.JCheckBox();
        btnAceptarestilo = new javax.swing.JButton();
        Tipo_de_letra = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAceptar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelNuevo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        Cortar = new javax.swing.JMenuItem();
        Copiar = new javax.swing.JMenuItem();
        Pegar = new javax.swing.JMenuItem();
        Selecionar_todo = new javax.swing.JMenuItem();
        Fuente = new javax.swing.JMenu();
        Tipo_letra = new javax.swing.JMenuItem();
        Tamano_Letra = new javax.swing.JMenuItem();
        Estilo = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        Tamaño.setTitle("Tamaño");

        lbltamaño.setText("Tamaño");

        cmbtamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "14", "16", "18" }));

        btnaceptartamaño.setText("Aceptar");
        btnaceptartamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptartamañoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TamañoLayout = new javax.swing.GroupLayout(Tamaño.getContentPane());
        Tamaño.getContentPane().setLayout(TamañoLayout);
        TamañoLayout.setHorizontalGroup(
            TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TamañoLayout.createSequentialGroup()
                .addGroup(TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TamañoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lbltamaño))
                    .addGroup(TamañoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnaceptartamaño)
                            .addComponent(cmbtamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        TamañoLayout.setVerticalGroup(
            TamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TamañoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbltamaño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbtamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnaceptartamaño)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        Estilos.setTitle("Estilos");

        lblestilo.setText("Estilo");

        negrita.setText("Negrita");

        cursiva.setText("Curisva");

        Subrayado.setText("Subrayado");

        btnAceptarestilo.setText("Aceptar");

        javax.swing.GroupLayout EstilosLayout = new javax.swing.GroupLayout(Estilos.getContentPane());
        Estilos.getContentPane().setLayout(EstilosLayout);
        EstilosLayout.setHorizontalGroup(
            EstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstilosLayout.createSequentialGroup()
                .addGroup(EstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstilosLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblestilo))
                    .addGroup(EstilosLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(EstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cursiva)
                            .addComponent(negrita)
                            .addComponent(Subrayado)
                            .addComponent(btnAceptarestilo))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        EstilosLayout.setVerticalGroup(
            EstilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstilosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblestilo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(negrita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subrayado)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarestilo)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jLabel1.setText("Tipo De letra");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Arial", "Timen New Roman", "Courier New", "Comic Sans", "Verdana" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Tipo_de_letraLayout = new javax.swing.GroupLayout(Tipo_de_letra.getContentPane());
        Tipo_de_letra.getContentPane().setLayout(Tipo_de_letraLayout);
        Tipo_de_letraLayout.setHorizontalGroup(
            Tipo_de_letraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tipo_de_letraLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(Tipo_de_letraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Tipo_de_letraLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(Tipo_de_letraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        Tipo_de_letraLayout.setVerticalGroup(
            Tipo_de_letraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tipo_de_letraLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnGuardar);

        btnCortar.setText("Cortar");
        btnCortar.setFocusable(false);
        btnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCortar);

        btnCopiar.setText("Copiar");
        btnCopiar.setFocusable(false);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopiar);

        btnPegar.setText("Pegar");
        btnPegar.setFocusable(false);
        btnPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPegar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout PanelNuevoLayout = new javax.swing.GroupLayout(PanelNuevo);
        PanelNuevo.setLayout(PanelNuevoLayout);
        PanelNuevoLayout.setHorizontalGroup(
            PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );
        PanelNuevoLayout.setVerticalGroup(
            PanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNuevoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        Archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Archivo.add(Nuevo);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivo.add(Salir);

        jMenuBar1.add(Archivo);

        Editar.setText("Editar");

        Cortar.setText("Cortar");
        Cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CortarActionPerformed(evt);
            }
        });
        Editar.add(Cortar);

        Copiar.setText("Copiar");
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        Editar.add(Copiar);

        Pegar.setText("Pegar");
        Pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PegarActionPerformed(evt);
            }
        });
        Editar.add(Pegar);

        Selecionar_todo.setText("Seleccionar Todo");
        Selecionar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selecionar_todoActionPerformed(evt);
            }
        });
        Editar.add(Selecionar_todo);

        jMenuBar1.add(Editar);

        Fuente.setText("Fuente");

        Tipo_letra.setText("Tipo de Letra");
        Tipo_letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_letraActionPerformed(evt);
            }
        });
        Fuente.add(Tipo_letra);

        Tamano_Letra.setText("Tamaño Letra");
        Tamano_Letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tamano_LetraActionPerformed(evt);
            }
        });
        Fuente.add(Tamano_Letra);

        Estilo.setText("Estilo");
        Estilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstiloActionPerformed(evt);
            }
        });
        Fuente.add(Estilo);

        jMenuBar1.add(Fuente);

        Ayuda.setText("Ayuda");
        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        // TODO add your handling code here:
        String texto;
        texto=jTextArea1.getSelectedText();
    }//GEN-LAST:event_CopiarActionPerformed

    private void PegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegarActionPerformed
        // TODO add your handling code here:
        jTextArea1.replaceSelection(texto);
    }//GEN-LAST:event_PegarActionPerformed

    private void Tipo_letraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_letraActionPerformed
        // TODO add your handling code here:
        Tipo_de_letra.setSize(200, 200);
        Tipo_de_letra.setVisible(true);
    }//GEN-LAST:event_Tipo_letraActionPerformed

    private void EstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstiloActionPerformed
        // TODO add your handling code here:
        Estilos.setSize(150, 200);
        Estilos.setVisible(true);
    }//GEN-LAST:event_EstiloActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
PanelNuevo.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void CortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CortarActionPerformed
String texto;
texto=jTextArea1.getSelectedText(); 
jTextArea1.replaceSelection("");
// /TODO add your handling code here:
    }//GEN-LAST:event_CortarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        // TODO add your handling code here:
        String texto;
texto=jTextArea1.getSelectedText(); 
jTextArea1.replaceSelection("");
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        // TODO add your handling code here:
        String texto;
         texto=jTextArea1.getSelectedText();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        // TODO add your handling code here:
        jTextArea1.replaceSelection(texto);
    }//GEN-LAST:event_btnPegarActionPerformed

    private void Selecionar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selecionar_todoActionPerformed
        // TODO add your handling code here:
        jTextArea1.selectAll();
    }//GEN-LAST:event_Selecionar_todoActionPerformed

    private void Tamano_LetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tamano_LetraActionPerformed
        // TODO add your handling code here:
        Tamaño.setSize(100,150);
        Tamaño.setVisible(true);
    }//GEN-LAST:event_Tamano_LetraActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int Tamano_letra =jTextArea1.getFont().getSize();
        int Estilo=jTextArea1.getFont().getStyle();
        String letra="";
        String letra =jList1.getSelectedValue().toString();
        jTextArea1.setFont(new Font (Tipo_de_letra, Estilos,Tamaño));
        DialogoTipo_de_letra.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnaceptartamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptartamañoActionPerformed
        // TODO add your handling code here:
        int Tamano_Letra=Integer.parseInt(cmbtamaño.getSelectedItem().toString());
        int Estilo=jTextArea1.getFont().getStyle();
        String letra=jTextArea1.getFont().getFontName();
        jTextArea1.setFont(new Font(Tipo_de_letra,Estilos,Tamaño));
        DialogoTamano_Letra.dispose();
    }//GEN-LAST:event_btnaceptartamañoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem Copiar;
    private javax.swing.JMenuItem Cortar;
    private javax.swing.JMenu Editar;
    private javax.swing.JMenuItem Estilo;
    private javax.swing.JDialog Estilos;
    private javax.swing.JMenu Fuente;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JPanel PanelNuevo;
    private javax.swing.JMenuItem Pegar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Selecionar_todo;
    private javax.swing.JCheckBox Subrayado;
    private javax.swing.JMenuItem Tamano_Letra;
    private javax.swing.JDialog Tamaño;
    private javax.swing.JDialog Tipo_de_letra;
    private javax.swing.JMenuItem Tipo_letra;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarestilo;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPegar;
    private javax.swing.JButton btnaceptartamaño;
    private javax.swing.JComboBox<String> cmbtamaño;
    private javax.swing.JCheckBox cursiva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblestilo;
    private javax.swing.JLabel lbltamaño;
    private javax.swing.JCheckBox negrita;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Cerraduras;
import controlador.Controlador;
import controlador.Validaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Romario Fabian Lopez Santos Rene Ivan 6A Automatas I
 */
public class Principal extends javax.swing.JFrame {

    Controlador c = new Controlador();
    Validaciones v = new Validaciones();
    Cerraduras ce = new Cerraduras();
    String cadena = "";
    char[] a = c.cadenaBinario.toCharArray();

    /**
     * Creates new form Principla
     */
    public Principal() {
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

        btnUno = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCadenas = new javax.swing.JTextArea();
        txtCadena = new javax.swing.JTextField();
        btnGenerarCadena = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConcat = new javax.swing.JTextArea();
        btnConcatenar = new javax.swing.JButton();
        btnKleene = new javax.swing.JButton();
        btnPositiva = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCerraduras = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUno.setText("Uno");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnCero.setText("Cero");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        txtAreaCadenas.setColumns(20);
        txtAreaCadenas.setRows(5);
        jScrollPane1.setViewportView(txtAreaCadenas);

        btnGenerarCadena.setText("Generar Cadena");
        btnGenerarCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCadenaActionPerformed(evt);
            }
        });

        jButton1.setText("Longitud");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtConcat.setColumns(20);
        txtConcat.setRows(5);
        jScrollPane2.setViewportView(txtConcat);

        btnConcatenar.setText("Concatenar");
        btnConcatenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcatenarActionPerformed(evt);
            }
        });

        btnKleene.setText("Kleene");
        btnKleene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKleeneActionPerformed(evt);
            }
        });

        btnPositiva.setText("Positiva");
        btnPositiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPositivaActionPerformed(evt);
            }
        });

        txtCerraduras.setColumns(20);
        txtCerraduras.setRows(5);
        jScrollPane3.setViewportView(txtCerraduras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnConcatenar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKleene)
                                    .addComponent(btnUno)
                                    .addComponent(btnCero)
                                    .addComponent(jButton1)
                                    .addComponent(btnPositiva))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGenerarCadena)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarCadena))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUno)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConcatenar)
                        .addGap(27, 27, 27)
                        .addComponent(btnKleene)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPositiva))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        cadena += "1";
        txtCadena.setText(cadena);
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnGenerarCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCadenaActionPerformed
        if (txtCadena.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No puede estar vacio");
        } else {
            if (!c.verificarCadena(cadena)) {
                c.setCadenaNueva(cadena);
                c.cadenas.add(cadena);
                txtAreaCadenas.setText(c.getCadenaNueva());
                cadena = "";
                txtCadena.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Esta cadena ya esta guardada");
                txtCadena.setText("");
                cadena = "";
            }

        }
    }//GEN-LAST:event_btnGenerarCadenaActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        cadena += "0";
        txtCadena.setText(cadena);
    }//GEN-LAST:event_btnCeroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Que cadena quiere conocer"));
        if (numero1 <= c.cadenas.size()) {
            c.numeroLinea();
            JOptionPane.showMessageDialog(rootPane, "El tamaño de la cadena   " + numero1 + "   Es igual a  " + c.longitudCadena(numero1));
        }else{
            JOptionPane.showMessageDialog(rootPane, "La posicion : "+numero1 +" no existe");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConcatenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcatenarActionPerformed
        c.cadenaConcatenada = "";
        int numeroCadenas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cadenas a concatenar"));
        c.numeroDeCadenas(numeroCadenas);
        txtConcat.setText(c.getCadenaExtra());
    }//GEN-LAST:event_btnConcatenarActionPerformed

    private void btnKleeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKleeneActionPerformed
      int k = Integer.parseInt(JOptionPane.showInputDialog("¿A que potencia deseas elevar el alfabeto?"));
        txtCerraduras.setText(ce.kleene(k, a));
    }//GEN-LAST:event_btnKleeneActionPerformed

    private void btnPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPositivaActionPerformed
        int k = Integer.parseInt(JOptionPane.showInputDialog("¿A que potencia deseas elevar el alfabeto?"));
        txtCerraduras.setText(ce.positiva(k, a));
    }//GEN-LAST:event_btnPositivaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnConcatenar;
    private javax.swing.JButton btnGenerarCadena;
    private javax.swing.JButton btnKleene;
    private javax.swing.JButton btnPositiva;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAreaCadenas;
    private javax.swing.JTextField txtCadena;
    private javax.swing.JTextArea txtCerraduras;
    private javax.swing.JTextArea txtConcat;
    // End of variables declaration//GEN-END:variables
}

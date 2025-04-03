/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio_31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ventanaprincipal extends javax.swing.JFrame {

    BotonContador btnBotonA;
    BotonContador btnBotonB;
    BotonContador btnBotonC;
    public ventanaprincipal() {
        initComponents();
        CreacionVentana();
    }
    
    public  void CreacionVentana(){
        this.setTitle("Ejercicio de Herencia");
        this.setSize(250,300);
        
        btnBotonA = new BotonContador();
        btnBotonA.setText("Boton A");
        btnBotonA.setBounds(10,10,100,30);
        this.getContentPane().add(btnBotonA);
        
        btnBotonB = new BotonContador();
        btnBotonB.setText("Boton B");
        btnBotonB.setBounds(130,10,100,30);
        this.getContentPane().add(btnBotonB);
        
        btnBotonC = new BotonContador();
        btnBotonC.setText("Boton C");
        btnBotonC.setBounds(260,10,100,30);
        this.getContentPane().add(btnBotonC);
        
        
        btnBotonA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                PulsacionBotonA(evt);
            }
            });
        btnBotonB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                PulsacionBotonB(evt);
            }
            });
        btnBotonC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                PulsacionBotonC(evt);
            }
            });

    }
    
    public void PulsacionBotonA(ActionEvent evt){
        btnBotonA.incrementa();
    }
    public void PulsacionBotonB(ActionEvent evt){
        btnBotonB.incrementa();
    }
    public void PulsacionBotonC(ActionEvent evt){
        btnBotonC.incrementaC();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerPulsaciones = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        JtextfieldXD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerPulsaciones.setText("Ver Pulsaciones");
        btnVerPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPulsacionesActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerPulsaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(JtextfieldXD))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar)
                    .addComponent(btnReiniciar))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(355, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(JtextfieldXD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPulsaciones)
                    .addComponent(btnReiniciar))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPulsacionesActionPerformed
       String info;
       
       info = "El boton A se ha pulsado "+btnBotonA.getpulsaciones()+"\n";
       info = info + "El boton B se ha pulsado "+btnBotonB.getpulsaciones()+"\n";
       info = info + "El boton C se ha pulsado "+btnBotonC.getpulsaciones()+"\n";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnVerPulsacionesActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        btnBotonA.reiniciar();
        btnBotonB.reiniciar();
        btnBotonC.reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
         int valor = Integer.parseInt(JtextfieldXD.getText());
                btnBotonA.setpulsaciones(valor);
                btnBotonB.setpulsaciones(valor);
                btnBotonC.setpulsaciones(valor);
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextfieldXD;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPulsaciones;
    // End of variables declaration//GEN-END:variables
}

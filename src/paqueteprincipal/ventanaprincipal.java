/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paqueteprincipal;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ventanaprincipal extends javax.swing.JFrame {

   
    public ventanaprincipal() {
        initComponents();
        ConfiguracionVentana();
    }
    
    public void ConfiguracionVentana(){
        this.setSize(800,600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        panelInterno = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        barraMenus = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenu();
        menuArchivoCerrar = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInterno.setBackground(new java.awt.Color(0, 0, 204));
        panelInterno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        barraMenus.setText("Archivo");

        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        barraMenus.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        barraMenus.add(menuArchivoCerrar);

        menuArchivoSalir.setText("Salir");
        barraMenus.add(menuArchivoSalir);

        jMenuBar1.add(barraMenus);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
        
        
        JFileChooser abrir = new JFileChooser();
        int boton = abrir.showOpenDialog(null);
        if(boton==JFileChooser.APPROVE_OPTION){
            ventanainterna vi = new ventanainterna();
            vi.setResizable(true);
            vi.setMaximizable(true);
            vi.setIconifiable(true);
            vi.setClosable(true);
            
            panelInterno.add(vi);
            
            String camino = abrir.getSelectedFile().toString();
            vi.setImagen(camino);
            vi.setTitle(camino);
            vi.setVisible(true);
        }
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

    
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
    private javax.swing.JMenu barraMenus;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private javax.swing.JMenu menuArchivoAbrir;
    private javax.swing.JMenu menuArchivoCerrar;
    private javax.swing.JMenu menuArchivoSalir;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JDesktopPane panelInterno;
    // End of variables declaration//GEN-END:variables
}

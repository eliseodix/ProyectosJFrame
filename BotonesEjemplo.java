/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_27_Botones_ejemplo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesEjemplo extends JFrame {
    private JButton btnAceptar;
    private JButton btnCancelar;

    public BotonesEjemplo() {
        this.setTitle("Ejemplo de Botones");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        btnAceptar.setBackground(Color.GREEN);
        btnCancelar.setBackground(Color.RED);
        btnAceptar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has presionado Aceptar");
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has presionado Cancelar");
            }
        });

        // Agregar botones a la ventana
        this.add(btnAceptar);
        this.add(btnCancelar);
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        BotonesEjemplo ventana = new BotonesEjemplo();
        ventana.setVisible(true);
    }
}


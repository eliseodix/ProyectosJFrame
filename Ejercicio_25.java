/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_25_vectores;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio_25 extends JFrame {
    JCheckBox vcuadros[];
    JButton btnAceptar;
    
    public Ejercicio_25() {
        CreacionVentana();
    }

    public void CreacionVentana() {
        this.setTitle("Ejemplo de vector de componentes");
        this.setSize(300, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null); // Deshabilitar el Layout Manager

        vcuadros = new JCheckBox[10];
        for (int i = 0; i < vcuadros.length; i++) {
            vcuadros[i] = new JCheckBox("Opción " + i);
            vcuadros[i].setBounds(10, 10 + 30 * i, 100, 20);
            this.add(vcuadros[i]);
        }

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(10, 360, 100, 20);
        this.add(btnAceptar);

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int cont = 0;
                for (JCheckBox vcuadro : vcuadros) {
                    if (vcuadro.isSelected()) {
                        cont++;
                    }
                }
                JOptionPane.showMessageDialog(null, "Hay " + cont + " cuadros seleccionados");
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio_25();
    }
}


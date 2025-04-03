/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_31;

import javax.swing.JButton;

/**
 *
 * @author usuario
 */
public class BotonContador extends JButton{
    int pulsaciones;
    
    public BotonContador(){
        pulsaciones=0;
    }
    
    
    public void setpulsaciones(int p){
        pulsaciones =p;
    }
    public int getpulsaciones(){
        return pulsaciones;
    }
    public void incrementa(){
        pulsaciones++;
    }
    public void decrementa(){
        pulsaciones--;
    }
    public void reiniciar(){
        pulsaciones=0;
    }
    public void aumenta(int c){
        pulsaciones = pulsaciones+c;
    }
    public void disminuye(int c){
        pulsaciones = pulsaciones-c;
    }
    public void incrementaC(){
        pulsaciones+=2;
    }
}

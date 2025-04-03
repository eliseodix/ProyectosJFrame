/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_28_Clases_propias;

/**
 *
 * @author usuario
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        
        Rectangulo suelo = new Rectangulo();

        suelo.setBase(30);
        suelo.setAltura(50);

        double area = suelo.getArea();
        double peri = suelo.getPerimetro();

        System.out.println("Base: " + suelo.getBase());
        System.out.println("Altura: " + suelo.getAltura());
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + peri);
    }
}


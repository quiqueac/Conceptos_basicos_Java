/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author usuario
 */
public class Circulo {
    public final int Constante;
    private double radio;

    public Circulo() {
        Constante = 9;
        radio = 0;
    }

    public Circulo(double radio) {
        Constante = 10;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     *
     * @return area del circulo.
     */
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}

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
public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
    }

    public Cilindro(double altura, double radio) {
        super(radio);
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return 2 * super.area() * altura;
    }
    
    public double volumen() {
        return Math.PI * Math.pow(area(), 2) * altura;
    }
    
}

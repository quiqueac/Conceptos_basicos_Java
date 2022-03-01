/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentacion;

/**
 *
 * @author usuario
 */
public class Documentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double multiplicacion;
        multiplicacion = Documentacion.multiplicacion(5.6, 4.5);
        System.out.println("Resultado: " + multiplicacion);
        Documentacion objeto;
        objeto = new Documentacion();
        System.out.println(objeto);
    }
    
    /**
     * 
     * @param x primer número
     * @param y segundo número
     * @return resultado
     */
    public static double multiplicacion(double x, double y) {
        return x * y;
    }
    
}

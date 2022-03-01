/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;


/**
 *
 * @author usuario
 */
public class OperacionComplejo {
    
    /**
     * 
     * @param misComplejos los números complejos que ingresó el usuario.
     * @param cantidad la cantidad de números complejos que serán sumados.
     * @return el resultado de la suma de complejos en forma de un objeto de tipo Complejo.
     */
    public static Complejo suma(Complejo [] misComplejos, int cantidad) {
        Complejo miComplejo;
        int parteReal;
        int parteImaginaria;
        
        miComplejo = new Complejo();
        parteReal = 0;
        parteImaginaria = 0;
        
        for(int indice = 0; indice < cantidad; indice++) {
            parteReal += misComplejos[indice].getParteReal();
            parteImaginaria += misComplejos[indice].getParteImaginaria();
        }
        
        miComplejo.setParteReal(parteReal);
        miComplejo.setParteImaginaria(parteImaginaria);
        
        return miComplejo;
    }
    
    /**
     * 
     * @param misComplejos los números complejos que ingresó el usuario.
     * @param cantidad la cantidad de números complejos que serán restados.
     * @return el resultado de la resta de complejos en forma de un objeto de tipo Complejo.
     */
    public static Complejo resta(Complejo [] misComplejos, int cantidad) {
        Complejo miComplejo;
        int parteReal;
        int parteImaginaria;
        
        miComplejo = new Complejo();
        parteReal = misComplejos[0].getParteReal();
        parteImaginaria = misComplejos[0].getParteImaginaria();
        
        for(int indice = 1; indice < cantidad; indice++) {
            parteReal -= misComplejos[indice].getParteReal();
            parteImaginaria -= misComplejos[indice].getParteImaginaria();
        }
        
        miComplejo.setParteReal(parteReal);
        miComplejo.setParteImaginaria(parteImaginaria);
        
        return miComplejo;
    }
    
    /**
     * 
     * @param misComplejos los números complejos que ingresó el usuario.
     * @param cantidad la cantidad de números complejos que serán multiplicados.
     * @return el resultado de la multiplicación de complejos en forma de un objeto de tipo Complejo.
     */
    public static Complejo multiplicacion(Complejo [] misComplejos, int cantidad) {
        Complejo miComplejo;
        int parteReal;
        int parteImaginaria;
        int parteImaginariaCuadrado;
        
        miComplejo = new Complejo();
        parteReal = 1;
        parteImaginariaCuadrado = 1;
        
        for(int indice = 0; indice < cantidad; indice++) {
            parteReal *= misComplejos[indice].getParteReal();
            parteImaginariaCuadrado *= misComplejos[indice].getParteImaginaria();
        }
        
        parteImaginariaCuadrado = parteImaginariaCuadrado * -1;
        parteImaginaria = misComplejos[0].getParteImaginaria() * misComplejos[1].getParteReal() + misComplejos[1].getParteImaginaria() * misComplejos[0].getParteReal();
        parteReal += parteImaginariaCuadrado;
        
        miComplejo.setParteReal(parteReal);
        miComplejo.setParteImaginaria(parteImaginaria);
        
        return miComplejo;
    }
    
    /**
     * 
     * @param misComplejos los números complejos que ingresó el usuario.
     * @param cantidad la cantidad de números complejos que serán divididos.
     * @return el resultado de la división de complejos en forma de un arreglo de objetos de tipo Complejo.
     * @throws CloneNotSupportedException 
     */
    public static Complejo [] division(Complejo [] misComplejos, int cantidad) throws CloneNotSupportedException {
        Complejo [] complejosResultado;
        Complejo [] complejosNumerador;
        Complejo [] complejosDenominador;
        
        complejosResultado = new Complejo[2];
        complejosNumerador = new Complejo[2];
        complejosDenominador = new Complejo[2];
        
        complejosNumerador[0] = (Complejo) misComplejos[0].clone();
        complejosNumerador[1] = (Complejo) misComplejos[1].clone();
        
        complejosNumerador[1].setParteImaginaria(complejosNumerador[1].getParteImaginaria() * -1);
        
        System.out.println("\n" + complejosNumerador[0]);
        System.out.println(complejosNumerador[1]);
        
        complejosDenominador[0] = (Complejo) misComplejos[1].clone();
        complejosDenominador[1] = complejosNumerador[1];
        
        System.out.println(complejosDenominador[0]);
        System.out.println(complejosDenominador[1]);
        
        complejosResultado[0] = OperacionComplejo.multiplicacion(complejosNumerador, cantidad);
        complejosResultado[1] = OperacionComplejo.multiplicacion(complejosDenominador, cantidad);
        
        return complejosResultado;
    }
    
}

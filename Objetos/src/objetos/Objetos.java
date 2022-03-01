/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Objetos {
    private static Scanner leer;
    private static final int CANTIDAD_NUMEROS_COMPLEJOS = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejo [] misComplejos;
        Complejo [] misComplejosDivisionResultado;
        Complejo miComplejoResultado;
        int opcion;
        
        misComplejos = new Complejo[CANTIDAD_NUMEROS_COMPLEJOS];
        misComplejosDivisionResultado = null;
        
        for(int indice = 0; indice < CANTIDAD_NUMEROS_COMPLEJOS; indice++) {
            misComplejos[indice] = new Complejo();
        }
        
        leer = new Scanner(System.in);
        
        do {
            System.out.println("Menu de operaciones a números complejos.\n");
            System.out.println("1)Suma.");
            System.out.println("2)Resta.");
            System.out.println("3)Multiplicación");
            System.out.println("4)División.");
            System.out.println("5)Salir.\n");
            System.out.print("Ingresa la operación que deseas realizar: ");

            opcion = leer.nextInt();

            switch(opcion) {
                case 1:
                    misComplejos = Objetos.ingresaDatosNumerosComplejos();
                    miComplejoResultado = OperacionComplejo.suma(misComplejos, CANTIDAD_NUMEROS_COMPLEJOS);
                    System.out.println("\nSuma: " + miComplejoResultado + "\n");
                    break;
                case 2:
                    misComplejos = Objetos.ingresaDatosNumerosComplejos();
                    miComplejoResultado = OperacionComplejo.resta(misComplejos, CANTIDAD_NUMEROS_COMPLEJOS);
                    System.out.println("\nResta: " + miComplejoResultado + "\n");
                    break;
                case 3:
                    misComplejos = Objetos.ingresaDatosNumerosComplejos();
                    miComplejoResultado = OperacionComplejo.multiplicacion(misComplejos, CANTIDAD_NUMEROS_COMPLEJOS);
                    System.out.println("\nMultiplicación" + miComplejoResultado + "\n");
                    break;
                case 4:
                    misComplejos = Objetos.ingresaDatosNumerosComplejos();
                    {
                        try {
                            misComplejosDivisionResultado = OperacionComplejo.division(misComplejos, CANTIDAD_NUMEROS_COMPLEJOS);
                        } catch (CloneNotSupportedException ex) {
                            Logger.getLogger(Objetos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    System.out.println("\nNumerador: " + misComplejosDivisionResultado[0]);
                    System.out.println("Denominador: la parte real es: " + misComplejosDivisionResultado[1].getParteReal() + ". La parte imaginaria es: " + misComplejosDivisionResultado[1].getParteReal() + ".\n");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        
        } while(opcion != 5);
        
    }
    
    /**
     * 
     * @return el complejo que ingresó el usuario.
     */
    public static Complejo [] ingresaDatosNumerosComplejos() {
        Complejo [] misComplejos;
        int parteReal;
        int parteImaginaria;
        
        misComplejos = new Complejo[CANTIDAD_NUMEROS_COMPLEJOS];
        
        for(int indice = 0; indice < CANTIDAD_NUMEROS_COMPLEJOS; indice++) {
            misComplejos[indice] = new Complejo();
            
            System.out.print("\nIngresa la parte real del número complejo " + (indice + 1) + ": ");
            parteReal = leer.nextInt();
            System.out.print("Ingresa la parte imaginaria del número complejo " + (indice + 1) + ": ");
            parteImaginaria = leer.nextInt();
            
            misComplejos[indice].setParteReal(parteReal);
            misComplejos[indice].setParteImaginaria(parteImaginaria);
        }
        
        return misComplejos;
    }
    
}

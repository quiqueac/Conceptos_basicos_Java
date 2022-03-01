/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author usuario
 */
public class Arreglos {
    
    public static int y = 0;
    public int x = 0;
    
    public void metodo() {
        x++;
        y++;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creación de referencias.
        int [] arreglo;
        int [][] arreglos;
        int [] referencia;
        float [][] arreglosF;
        char [] caracteres;
        
        // Creación del objeto en sí. Debe ser en 2 líneas.
        arreglo = new int[10];
        
        // Crea un arreglo de arreglos.
        arreglos = new int[6][];
        
        arreglos[0] = new int[5];
        arreglos[1] = new int[3];
        arreglos[2] = new int[1];
        arreglos[3] = new int[2];
        arreglos[4] = new int[6];
        arreglos[5] = new int[7];
        
        arreglosF = new float[10][2];
        caracteres = new char[5];
        
        System.out.println("Arreglo: " + arreglo.length);
        System.out.println("Arreglos: " + arreglos.length);
        
        // Referencia que apunta al objeto.
        referencia = arreglo;
        
        // Funciona exactamente igual.
        System.out.println("Referencia al Arreglo: " + referencia.length);
        
        /*
            Las variables estáticas solo pueden ser usadas anteponiendo el nombre de la clase.
            Para usarlas no se requiere instanciar un objeto que cuente con esa variable.
            Tienen la ventaja de que si se modifica el valor para un objeto, todos los demás tendrán e
        */
        
        Arreglos [] a;
    
        a = new Arreglos[3];
        
        a[0] = new Arreglos();
        a[1] = new Arreglos();
        a[2] = new Arreglos();
        
        a[0].metodo();
        
        System.out.println("y: " + a[0].x);
        System.out.println("x: " + Arreglos.y);
        
        a[1].metodo();
        
        System.out.println("y: " + a[1].x);
        System.out.println("x: " + Arreglos.y);
        
        a[2].metodo();
        
        System.out.println("y: " + a[2].x);
        System.out.println("x: " + Arreglos.y);
    }
    
}

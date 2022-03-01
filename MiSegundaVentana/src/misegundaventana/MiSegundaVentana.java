/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misegundaventana;

import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class MiSegundaVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiVentana miVentana;
        
        miVentana = new MiVentana();
        
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

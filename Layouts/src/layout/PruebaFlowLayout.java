/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
;

/**
 *
 * @author usuario
 */
public class PruebaFlowLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame v = new JFrame();

        // Se pone el FlowLayout en la ventana
        v.getContentPane().setLayout(new FlowLayout());

        // Se instancian los componentes
        JButton boton = new JButton("boton");
        JTextField textField = new JTextField(10);
        JCheckBox checkBox = new JCheckBox("check box");
        JLabel etiqueta = new JLabel("Etiqueta");

        // Se añaden los componentes a la ventana
        v.getContentPane().add(boton);
        v.getContentPane().add(textField);
        v.getContentPane().add(checkBox);
        v.getContentPane().add(etiqueta);

        // Se muestra la ventana
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // pack() hace que la ventana coja el tamaño necesario para mostrar
        // los componentes que hay en ella.
        v.pack();
        v.setVisible(true);
    }
    
}

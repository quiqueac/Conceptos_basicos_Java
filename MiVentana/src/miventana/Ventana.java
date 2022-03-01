/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miventana;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public final class Ventana extends JFrame {

    public Ventana() throws HeadlessException {
        configura();
    }
    
    protected void configura() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocation(500, 500);
        this.getContentPane().setBackground(Color.CYAN);
    }
    
}

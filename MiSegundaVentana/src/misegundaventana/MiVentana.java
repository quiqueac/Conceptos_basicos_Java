/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misegundaventana;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class MiVentana extends JFrame implements ActionListener {
    
    private final JButton miBoton;
    private JButton otroBoton;
    private JButton botonEnviar;
    private JLabel labelGradosCentigrados;
    private JLabel labelGradosFahrenheit;
    private JTextField textFieldGradosCentigrados;
    private JTextField textFieldGradosFahrenheit;

    /**
     *
     * @throws HeadlessException
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public MiVentana() throws HeadlessException {
        miBoton = new JButton("Mi botón");
        miBoton.setBounds(0, 0, 100, 25);
        miBoton.addActionListener(this);
        componentesDeLaVentana();
        configuracionDeLaVentana();
    }
    
    private void configuracionDeLaVentana() {
        setBounds(500, 300, 300, 300);
        getContentPane().setBackground(Color.CYAN);
        setTitle("Mi segunda ventana");
        setLayout(null);
        
        add(miBoton);
        add(otroBoton);
        /*
            add(labelGradosCentigrados);
            add(textFieldGradosCentigrados);
            add(labelGradosFahrenheit);
            add(textFieldGradosFahrenheit);
            add(botonEnviar);
        */
    }
    
    private void componentesDeLaVentana() {
        otroBoton = new JButton("Mi otro botón");
        otroBoton.setBounds(0, 50, 150, 25);
        otroBoton.addActionListener(this);
        
        botonEnviar = new JButton("Convertir");
        botonEnviar.setBounds(90, 225, 100, 25);
        
        labelGradosCentigrados = new JLabel();
        labelGradosCentigrados.setText("Grados centigrados: ");
        labelGradosCentigrados.setBounds(5, 5, 125, 15);
        
        textFieldGradosCentigrados = new JTextField();
        textFieldGradosCentigrados.setBounds(5, 25, 125, 20);
        
        labelGradosFahrenheit = new JLabel();
        labelGradosFahrenheit.setText("Grados fahrenheit: ");
        labelGradosFahrenheit.setBounds(5, 60, 125, 15);
        
        textFieldGradosFahrenheit = new JTextField();
        textFieldGradosFahrenheit.setBounds(5, 85, 125, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadenaBoton;
        
        if(e.getSource() == miBoton) {
            cadenaBoton = "Mi botón";
        }
        else {
            cadenaBoton = "Mi otro botón";
        }
        
        JOptionPane.showMessageDialog(this, "Hola soy el botón: " + cadenaBoton);
    }
    
}

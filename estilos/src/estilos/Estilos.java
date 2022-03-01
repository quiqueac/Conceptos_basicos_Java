/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estilos;

import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author co2
 */
public class Estilos extends JFrame implements ActionListener
{
    private final JLabel ejemplo = new JLabel("Ejemplo de Estilos");
    private final JLabel nombre = new JLabel("Nombre:");
    private final JLabel clase = new JLabel("Clase:");
    private final JButton miBotonEjemplo = new JButton("Presioname");
    private final JComboBox cmbEstilos = new JComboBox();
    private LookAndFeelInfo [] estilos; 
    
    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public Estilos() 
    {
        super("Estilos");
        estilos = UIManager.getInstalledLookAndFeels();
        for (LookAndFeelInfo estilo : estilos )
            cmbEstilos.addItem(estilo.getName());
        
        
        try
        {
            UIManager.setLookAndFeel(estilos[0].getClassName());
            this.repaint();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            JOptionPane.showMessageDialog(this, "No se puede asignar estilo " + estilos[0].getName(),"Error",ERROR);
        }
        
        GroupLayout componentes = new GroupLayout(this.getContentPane());
        componentes.setAutoCreateContainerGaps(true);
        componentes.setAutoCreateGaps(true);
        
        componentes.setHorizontalGroup
        (
                componentes.createParallelGroup()
                .addComponent(ejemplo)
                .addComponent(cmbEstilos,150,220,250)
                .addComponent(nombre)
                .addComponent(clase)
                .addComponent(miBotonEjemplo,150,220,250)
        );
        componentes.setVerticalGroup(
                componentes.createSequentialGroup()
                .addComponent(ejemplo)
                .addComponent(cmbEstilos)
                .addComponent(nombre)
                .addComponent(clase)
                .addComponent(miBotonEjemplo)
        );
        
        setLayout(componentes);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.pack();
        
      
        miBotonEjemplo.addActionListener(this);
        cmbEstilos.addActionListener(this);
        
        cmbEstilos.setName("hola");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            new Estilos().setVisible(true);
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource()==miBotonEjemplo)
        {
            JOptionPane.showMessageDialog(this, "Eh sido Presionado","Mensaje Ventana",JOptionPane.QUESTION_MESSAGE);
        }
        else if (e.getSource() == cmbEstilos)
        {
            try
            {
                UIManager.setLookAndFeel(estilos[cmbEstilos.getSelectedIndex()].getClassName());
                this.repaint();
            }
            catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
            {
                JOptionPane.showMessageDialog(this, "No se puede asignar estilo " + estilos[0].getName(),"Error",ERROR);
            }
        }
    }
}

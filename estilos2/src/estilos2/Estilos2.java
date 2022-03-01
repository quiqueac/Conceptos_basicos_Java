/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estilos2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author co2
 */

public class Estilos2 extends JFrame {
    /* componentes */
    private final JMenuBar barraMenu = new JMenuBar();
    private final JMenu mnuEstilos = new JMenu("Estilos");
    private final JMenu mnuHelp = new JMenu("Help");
    
    private final JMenuItem [] jmiElemento;
    private final JMenuItem jmiHelp;
    private final JRadioButton rdMasculino, rdFemenino;
    private final JCheckBox [] chkListaGusto;
    private final JCheckBox [] chkListaGenero; 
   
    private final JButton aceptar, cancelar, salir;
    private final JComboBox combo;    
    
    /* Formulario */
    
    private final JLabel lblNombre,lblApellidoPaterno,lblApellidoMaterno, lblRegistro;
    private final JTextField txtNombre,txtApellidoPaterno,txtApellidoMaterno, txtRegistro;
    
    /* tablas */
    private final JTable miTabla;
    private final DefaultTableModel dato;
           
    /* tabs */
    private final JTabbedPane tabs;
        
    /* propiedades */
    private final LookAndFeelInfo [] estilos;
    
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Estilos2()
    {
        /*Ventana*/
        super("Ventana estilos y componentes ejemplo");        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,250);
        
        /* obtencion de estilos */
        
        estilos = UIManager.getInstalledLookAndFeels();
        
        
        /* Menu */
        barraMenu.add(mnuEstilos);
        barraMenu.add(mnuHelp);
                   
        jmiElemento = new JMenuItem[estilos.length];
        int contador = 0;
        for (LookAndFeelInfo i: estilos)
        {
            jmiElemento[contador] = new JMenuItem(i.getName());
            mnuEstilos.add(jmiElemento[contador]);
        }
        
        jmiHelp = new JMenuItem("Acerca de...");
        mnuHelp.add(jmiHelp);
        this.setJMenuBar(barraMenu);
        
        /* radio */
        rdFemenino = new JRadioButton("Femenino");
        rdMasculino = new JRadioButton("Masculino");
        ButtonGroup rdGroup = new ButtonGroup();
        rdGroup.add(rdFemenino);
        rdGroup.add(rdMasculino);
        
        /* Lista de check box */
        String [] gustos = {
                            "gusto 1","gusto 2","gusto 3","gusto 4","gusto 5"
                            ,"gusto 6","gusto 7","gusto 8","gusto 9","gusto 10"
                            ,"gusto 11","gusto 12","gusto 13","gusto 14","gusto 15"
                            ,"gusto 16","gusto 17","gusto 18","gusto 19","gusto 20"
                           };
        
        chkListaGusto = new JCheckBox[20];
        for (int i = 0; i < 20 ; i ++)
            chkListaGusto[i] = new JCheckBox(gustos[i]);
        
       chkListaGenero = new JCheckBox[15];
       for (int i = 0; i < 9 ; i ++)
            chkListaGenero[i] = new JCheckBox("genero " +i);
                
        
        
        /* Formulario */ 
        lblNombre = new JLabel("Nombre");
        lblApellidoPaterno = new JLabel ("Apellido Paterno");
        lblApellidoMaterno = new JLabel ("Apellido Materno");
        lblRegistro = new JLabel ("Registro");
        
        txtNombre = new JTextField();
        txtApellidoPaterno = new JTextField();
        txtApellidoMaterno = new JTextField();
        txtRegistro = new JTextField();
        
        /* boton aceptar */
        aceptar = new JButton ("Aceptar");
        cancelar = new JButton("Cancelar");
        salir = new JButton("Salir");
        
        /* Tablas */
        String [] nombres = {"registro","nombre", "apellido paterno", "apellido materno"};      
        dato = new DefaultTableModel(nombres,8);
        miTabla = new JTable(dato);
        
        JScrollPane mC = new JScrollPane(miTabla);
             
        /* Tabs  */
        tabs = new JTabbedPane();
        // <editor-fold desc="codigo de configuracion del panel de opciones - GroupLayout">
        JPanel panelTabla = new JPanel();
        GroupLayout pt = new GroupLayout(panelTabla);
        pt.setAutoCreateContainerGaps(true);
        pt.setAutoCreateGaps(true);
        panelTabla.setLayout(pt);
        pt.setHorizontalGroup
            (
                    pt.createParallelGroup()
                        .addComponent(mC)
                        .addGroup
                            (
                                    pt.createSequentialGroup()
                                        .addComponent(aceptar)
                                        .addComponent(cancelar)
                                        .addComponent(salir)
                            )
                        
            );
        
        pt.setVerticalGroup
            (
                   pt.createSequentialGroup()
                        .addComponent(mC,150,150,150)
                        .addGroup
                        (
                                pt.createParallelGroup()
                                    .addComponent(aceptar)
                                    .addComponent(cancelar)
                                    .addComponent(salir)
                        )
            );
        
        // </editor-fold>
        tabs.addTab("Inicio", panelTabla);
         
        /* ordenacion de componentes */ 

        /* panel sexo */
        JPanel miGenero = new JPanel();
        //<editor-fold desc="codigo del panel de genero - FlowLayout">
        miGenero.setBorder(new TitledBorder("Genero"));
        miGenero.setLayout(new FlowLayout());
        miGenero.add(rdFemenino);
        miGenero.add(rdMasculino);
        //</editor-fold>
        
        /* panel gustos */
        JPanel panelGustos = new JPanel();
        //<editor-fold desc="configuracion panel de gustos - GridLayout">
        panelGustos.setBorder(new TitledBorder("Gustos"));
        panelGustos.setLayout(new GridLayout(5,4));
        for (int i = 0; i < 20 ; i ++)
            panelGustos.add(chkListaGusto[i]);
        //</editor-fold>
                      
        /* panel genero */        
        JPanel panelGeneros = new JPanel();
        //<editor-fold desc="configuracion panel de gustos - GridLayout">
        panelGeneros.setBorder(new TitledBorder("Generos de algo"));
        panelGeneros.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9 ; i ++)
            panelGeneros.add(chkListaGenero[i]);
              
        //</editor-fold>
        
        /*Panel Seleccion de Genero/Gusto*/
        JPanel panelSelectivo = new JPanel(new CardLayout() 
        );
        //<editor-fold desc="Configuración de panel selectivo  Genero/Gusto">
                       
        panelSelectivo.add(panelGustos,"Gustos");
        panelSelectivo.add(panelGeneros,"Generos");
                
        JPanel seleccionPanel = new JPanel();
                
        combo = new JComboBox(new String[] {"Gustos","Generos"});
        seleccionPanel.add(combo,BorderLayout.PAGE_START);
        seleccionPanel.add(panelSelectivo,BorderLayout.CENTER);
        
        seleccionPanel.setBorder(new LineBorder(Color.BLUE));
        
        combo.addItemListener((ItemEvent e) -> {
            String seleccion =e.getItem().toString();
            CardLayout layout = (CardLayout) (panelSelectivo.getLayout());
            layout.show(panelSelectivo,seleccion );
        });
      
        //</editor-fold>
        /* panel formularios */
        JPanel panelFormulario = new JPanel();
        
        //<editor-fold desc="configuracion del panel Formulario - GruopLayout">
        panelFormulario.setBorder
                (
                    BorderFactory.createTitledBorder
                        (
                            new DashedBorder(),
                            "Formulario",
                            TitledBorder.CENTER,
                            TitledBorder.DEFAULT_POSITION
                        )
                );        
        
       GroupLayout orden = new GroupLayout(panelFormulario);
       orden.setAutoCreateContainerGaps(true);
       orden.setAutoCreateGaps(true);
       orden.setVerticalGroup
            (
               orden.createSequentialGroup()
                    
                    .addGroup
                        (
                                orden.createParallelGroup()
                                    .addComponent(lblRegistro)
                                    .addComponent(txtRegistro,25,25,25)
                        )
                    
                    .addGroup
                        (
                                orden.createParallelGroup()
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre,25,25,25)
                        )
                    .addGroup
                        (
                                orden.createParallelGroup()
                                    .addComponent(lblApellidoPaterno)
                                    .addComponent(txtApellidoPaterno,25,25,25)
                        )
                    .addGroup
                        (
                                orden.createParallelGroup()
                                    .addComponent(lblApellidoMaterno)
                                    .addComponent(txtApellidoMaterno,25,25,25)
                        )
                    .addComponent(miGenero,50,50,50)
                    .addComponent(seleccionPanel)
            );
       
       orden.setHorizontalGroup
            (
                    orden.createParallelGroup()
                    .addGroup
                        (
                                orden.createSequentialGroup()
                                    .addGroup
                                        (
                                                orden.createParallelGroup()
                                                    .addComponent(lblRegistro)
                                                    .addComponent(lblNombre)
                                                    .addComponent(lblApellidoPaterno)
                                                    .addComponent(lblApellidoMaterno)                                                
                                        )
                                    .addGroup
                                        (
                                                orden.createParallelGroup()
                                                    .addComponent(txtRegistro)
                                                    .addComponent(txtNombre)
                                                    .addComponent(txtApellidoPaterno)
                                                    .addComponent(txtApellidoMaterno)                                                
                                        )
                        )
                    .addComponent(miGenero,300,300,300)
                    .addComponent(seleccionPanel)
            );
       //</editor-fold>
       
       panelFormulario.setLayout(orden);
       
       this.setSize(500, 500);

       //<editor-fold desc="configuración de panel final - GroupLayout">
       GroupLayout glP = new GroupLayout(this.getContentPane());
       
       glP.setHorizontalGroup
            (
                    glP.createSequentialGroup()
                        .addComponent(panelFormulario)
                        .addComponent(tabs)
            );
       glP.setVerticalGroup
            (
                    glP.createParallelGroup()
                        .addComponent(panelFormulario)
                        .addComponent(tabs)
            );
       this.setLayout(glP);
       //</editor-fold>
       this.pack();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Estilos2().setVisible(true);
    }
    
}


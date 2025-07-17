package screens;

import java.sql.Connection;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
    private Connection conn;
    public JDesktopPane desktop;  // Escritorio dentro del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenu jMenuBachilleratos;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;
    private JMenuItem jMenuItemInsertarBachilleratos;
    private JMenuItem jMenuItemVerBachilleratos;
   

    public VentanaPrincipal(String title, Connection conn){
        this.conn = conn;
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        // DesktopPane - escritorio
        desktop = new JDesktopPane();
        this.add(desktop);
        this.setContentPane(desktop); 
        // Barra de Menu
        jMenuBar = new JMenuBar();
        // this.add(jMenuBar);
        // Menu Alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        // Elemento de menu: Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar...");
        // Elemento de menu: Ver alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos...");

        // Menú Carreras
        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        // Elemento de menu: Ver Carreras
        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las carreras...");
        // Elemento de menu: Insertar carrera
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar...");

        //Menu bachilleratos
        jMenuBachilleratos = new JMenu();
        jMenuBachilleratos.setText("Bachilleratos");

        jMenuItemVerBachilleratos = new JMenuItem();
        jMenuItemVerBachilleratos.setText("Ver todos los bachilleratos...");

        jMenuItemInsertarBachilleratos = new JMenuItem();
        jMenuItemInsertarBachilleratos.setText("Insertar..."); 


        //Agregar el listenr de eventos para ejecutar la accion de insertar carrera 
        jMenuItemInsertarCarreras.addActionListener(e -> insertarCarreras()); 
        jMenuItemInsertarBachilleratos.addActionListener(e -> insertarBachilleratos()); 


        // Agregar menuItem a menu 
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);

        jMenuCarreras.add(jMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(jMenuCarreras);

        jMenuBachilleratos.add(jMenuItemVerBachilleratos);
        jMenuBachilleratos.add(jMenuItemInsertarBachilleratos);
        jMenuBar.add(jMenuBachilleratos);

        this.setJMenuBar(jMenuBar);
        pack();
    }

    private void insertarCarreras(){
        //1. Crear un objeto tipo JInternatFrame 
        JInternalFrameInsertarCarrera insertarCarrera = new JInternalFrameInsertarCarrera(this.conn);
        //2. Agrega el ineternal Frame al escritorio(deskop)
        this.desktop.add(insertarCarrera);
        //3. Hacer visible el internal frame
        insertarCarrera.setVisible(true);
    }

    private void insertarBachilleratos(){
        JInternalFrameInsertarBachillerato insertarBachilleratos = new JInternalFrameInsertarBachillerato();
        this.desktop.add(insertarBachilleratos);
        insertarBachilleratos.setVisible(true);
    }

    
}

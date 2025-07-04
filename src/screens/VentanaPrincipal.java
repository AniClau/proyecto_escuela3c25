package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
    public JDesktopPane desktop; //Escritorio dentro del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;



    public VentanaPrincipal (String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         initComponets();
    }

    private void initComponets(){
        //Desktop - escritorio
        desktop = new JDesktopPane();
        this.add(desktop);
        //Barra menu
        jMenuBar = new JMenuBar();
        this.add(jMenuBar);
        //Menu alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        // Elemento de menu: Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar...");
        // Elemento de menu: Ver Alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos...");
        // Menu carrera 
        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        // Elemento de menu: Ver Alumnos
        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las carreras...");
        // Elemento de menu: Insertar Carrera
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar...");




        // A gregar menuItem a Menú
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);

        jMenuCarreras.add(jMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(jMenuCarreras);

        this.setJMenuBar(jMenuBar);
        pack();
    }
}

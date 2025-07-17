package models;

public class Carrera {
    private int idCarrera;
    private String nombre;
    private double monto;


    public Carrera(int idCarrera, String nombre, double monto) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
        this.monto = monto;
    }
    public int getIdCarrera() {
        return idCarrera;
    }
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    
}

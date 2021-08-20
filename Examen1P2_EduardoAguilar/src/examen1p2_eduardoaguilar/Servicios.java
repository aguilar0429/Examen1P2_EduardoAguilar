package examen1p2_eduardoaguilar;

import java.util.ArrayList;


public class Servicios {
    
    private String nombre;
    private int precio;
    private String calificacion;
    private String lanzamiento;
    private String empresa;
    private ArrayList<Series> series = new ArrayList();
    private ArrayList<Miniseries> mini= new ArrayList();
    private ArrayList<Peliculas> pelis= new ArrayList();
    
    public Servicios() {
    }

    public Servicios(String nombre, int precio, String calificacion, String lanzamiento, String empresa) {
        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
        this.lanzamiento = lanzamiento;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }

    public ArrayList<Miniseries> getMini() {
        return mini;
    }

    public void setMini(ArrayList<Miniseries> mini) {
        this.mini = mini;
    }

    public ArrayList<Peliculas> getPelis() {
        return pelis;
    }

    public void setPelis(ArrayList<Peliculas> pelis) {
        this.pelis = pelis;
    }
    
    
    
}

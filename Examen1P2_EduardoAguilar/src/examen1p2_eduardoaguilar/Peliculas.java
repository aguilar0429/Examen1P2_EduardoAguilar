package examen1p2_eduardoaguilar;


public class Peliculas {
     
    private String nombre;
    private int duracion;
    private int cine;
    private int streaming;
    private String plot;

    public Peliculas(String nombre, int duracion, int cine, int streaming, String plot) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cine = cine;
        this.streaming = streaming;
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", duracion=" + duracion + ", cine=" + cine + ", streaming=" + streaming + ", plot=" + plot + '}';
    }
    
    
}

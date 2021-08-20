package examen1p2_eduardoaguilar;


public class Miniseries {
    private String nombre;
    private String genero;
    private int temporadas;
    private int duracion;
    private String descripcion;

    public Miniseries(String nombre, String genero, int temporadas, int duracion, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.temporadas = temporadas;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Miniseries{" + "nombre=" + nombre + ", genero=" + genero + ", temporadas=" + temporadas + ", duracion=" + duracion + ", descripcion=" + descripcion + '}';
    }
    
    
}

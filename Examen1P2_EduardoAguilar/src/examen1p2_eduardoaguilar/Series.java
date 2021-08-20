/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_eduardoaguilar;

public class Series {
    private String nombre;
    private int temporadas;
    private String clasificacion;
    private int anio;
    private int actores;

    public Series(String nombre, int temporadas, String clasificacion, int anio, int actores) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.clasificacion = clasificacion;
        this.anio = anio;
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Series{" + "nombre=" + nombre + ", temporadas=" + temporadas + ", clasificacion=" + clasificacion + ", anio=" + anio + ", actores=" + actores + '}';
    }
    
}

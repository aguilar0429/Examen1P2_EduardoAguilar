package examen1p2_eduardoaguilar;

import java.util.ArrayList;


public class Users {
     
    private ArrayList<Users> usuarios = new ArrayList();
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String plan;
    private ArrayList<Servicios> Servicios;
    
    public Users() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public ArrayList<Servicios> getServicios() {
        return Servicios;
    }

    public void setServicios(ArrayList<Servicios> Servicios) {
        this.Servicios = Servicios;
    }

    public Users(String nombre, String apellido, String correo, int telefono, String plan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Users{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + ", plan=" + plan + ", Servicios=" + Servicios + '}';
    }

    public ArrayList<Users> getUsuarios() {
        return usuarios;
    }
    
    
}

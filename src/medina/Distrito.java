/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medina;

/**
 *
 * @author Campe
 */
public class Distrito {
    private int id;
    private String Nombre;
    private double Latitud;
    private double Longitud;
    private int Listado;

    public Distrito(int id, String Nombre, double Latitud, double Longitud, int Listado) {
        this.id = id;
        this.Nombre = Nombre;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.Listado = Listado;
    }

    public Distrito() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public int getListado() {
        return Listado;
    }

    public void setListado(int Listado) {
        this.Listado = Listado;
    }

    @Override
    public String toString() {
        return "Distrito{" + "id=" + id + ", Nombre=" + Nombre + ", Latitud=" + Latitud + ", Longitud=" + Longitud + ", Listado=" + Listado + '}';
    }
    
}

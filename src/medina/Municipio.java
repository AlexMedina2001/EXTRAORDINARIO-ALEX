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
public class Municipio {
    private int id;
   private String Nombre;
   private double latitud;
   private double longitud;
   private int Listado;
   
    public Municipio() {
    }

    public Municipio(int id, String Nombre, double latitud, double longitud, int Listado) {
        this.id = id;
        this.Nombre = Nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.Listado = Listado;
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
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getListado() {
        return Listado;
    }

    public void setListado(int Listado) {
        this.Listado = Listado;
        
    }   

    @Override
    public String toString() {
        return "Municipio{" + "id=" + id + ", Nombre=" + Nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", Listado=" + Listado + '}';
    }
}

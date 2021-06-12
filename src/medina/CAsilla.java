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
public class CAsilla {
    private int id;
    private String Nombre;
    private double Latitud;
    private double Longitud;
    private int Listado;
    private int municipio;
    private int distrito;
    private int seccion;

    public CAsilla(int id, String Nombre, double Latitud, double Longitud, int Listado, int municipio, int distrito, int seccion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
        this.Listado = Listado;
        this.municipio = municipio;
        this.distrito = distrito;
        this.seccion = seccion;
    }

    public CAsilla() {
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

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "CAsilla{" + "id=" + id + ", Nombre=" + Nombre + ", Latitud=" + Latitud + ", Longitud=" + Longitud + ", Listado=" + Listado + ", municipio=" + municipio + ", distrito=" + distrito + ", seccion=" + seccion + '}';
    }
    
}

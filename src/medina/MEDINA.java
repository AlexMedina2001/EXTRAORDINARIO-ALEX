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
public class MEDINA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---- MUNICIPIO-----");
        Municipio campeche = new Municipio();
        campeche.setId(2);
        campeche.setLatitud(19.844501);
        campeche.setListado(7000);
        campeche.setLongitud(90.5350973);
        campeche.setNombre("CAMPECHE");

        System.out.println(campeche.toString());

        System.out.println("----DISTRITO----");

        Distrito Federal = new Distrito();
        Federal.setId(3);
        Federal.setLatitud(19.8445901);
        Federal.setListado(7000);
        Federal.setNombre("DISTRITO 01");
        Federal.setLongitud(90.5350973);
        System.out.println(Federal.toString());

        System.out.println("-----SECCION-----");
        seccion uno = new seccion();
        uno.setDistrito(2);
        uno.setId(1);
        uno.setLatitud(19.8445901);
        uno.setLongitud(90.5350973);
        uno.setListado(2000);
        System.out.println(uno.toString());

        System.out.println("----CASIILLA----");
        CAsilla dos = new CAsilla();
        dos.setDistrito(3);
        dos.setId(1);
        dos.setLatitud(19.8445901);
        dos.setListado(700);
        dos.setLongitud(90.53507973);
        dos.setMunicipio(3);
        dos.setNombre("ESCUELA JUSTO SIERRA");
        dos.setSeccion(1);
        System.out.println(dos.toString());

    }

}

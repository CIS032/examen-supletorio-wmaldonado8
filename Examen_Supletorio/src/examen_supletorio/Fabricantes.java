/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_supletorio;

/**
 *
 * @author PCD
 */
public class Fabricantes {
    private String clave_fabricante;
    private String nombre;
    
    public Fabricantes(String clave_fabricante, String nombre) {
        this.clave_fabricante = clave_fabricante;
        this.nombre = nombre;
    }

    public String getClave_fabricante() {
        return clave_fabricante;
    }

    public void setClave_fabricante(String clave_fabricante) {
        this.clave_fabricante = clave_fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    
}

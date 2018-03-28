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
public class Articulos {

    public Articulos() {
    }
    private String clave_articulo;
    private String nombre;
    private int precio;
    private String clave_fabricante;
    
    public Articulos(String clave_articulo, String nombre, int precio, String clave_fabricante) {
        this.clave_articulo = clave_articulo;
        this.nombre = nombre;
        this.precio = precio;
        this.clave_fabricante = clave_fabricante;
    }



    public String getClave_articulo() {
        return clave_articulo;
    }

    public void setClave_articulo(String clave_articulo) {
        this.clave_articulo = clave_articulo;
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

    public String getClave_fabricante() {
        return clave_fabricante;
    }

    public void setClave_fabricante(String clave_fabricante) {
        this.clave_fabricante = clave_fabricante;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_supletorio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author PCD
 */
public class Cargar {
    static ArrayList<Articulos> lista_articulos = new ArrayList<Articulos>();
    static ArrayList<Fabricantes> lista_fabricantes = new ArrayList<Fabricantes>();

    public static void agregar(Articulos arti,Fabricantes fabri) {
        lista_articulos.add(arti);
        lista_fabricantes.add(fabri);
    }

    public static void grabar() {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("C:\\Users\\PCD\\Documents\\NetBeansProjects\\ExamenCapa\\Banco.txt", true);
            pw = new PrintWriter(fw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Articulos arti : lista_articulos) {
            String linea = "";
            if (arti instanceof Articulos) {
//                linea="Circulo"+";"+((Circulo) figura).getPunto().toString();
            }
        for (Fabricantes fabri : lista_fabricantes) {
            String linea1 = "";
            if (fabri instanceof Fabricantes) {
//                linea="Circulo"+";"+((Circulo) figura).getPunto().toString();
            }
            pw.println(linea);
        }
        pw.close();
        }
    }
}

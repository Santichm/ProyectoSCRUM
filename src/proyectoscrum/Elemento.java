/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

/**
 *
 * @author Santi
 */
public class Elemento {
    
    private String nombre, tipo;
    private int ficheros, datos;
    private String complejidad;
    
    public Elemento(String nombre, String tipo, int ficheros, int datos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ficheros = ficheros;
        this.datos = datos;
        this.complejidad = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFicheros() {
        return ficheros;
    }

    public int getDatos() {
        return datos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFicheros(int ficheros) {
        this.ficheros = ficheros;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }
    
    public void calcularComplejidad(){
        
    }
}

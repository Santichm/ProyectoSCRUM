/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Santi
 */
public class Proyecto implements Serializable{
    
    private String nombre;
    private ArrayList<Elemento> elementos;
    
    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<Elemento>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void anadirElemento(Elemento e) {
        this.elementos.add(e);
    }
    
    public void eliminarElemento(int pos) {
        this.elementos.remove(pos);
    }
    
    
}

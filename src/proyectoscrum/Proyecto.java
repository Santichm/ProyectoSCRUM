/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

import java.util.ArrayList;

/**
 *
 * @author Santi
 */
public class Proyecto {
    
    private String nombre;
    private ArrayList<Elemento> elementos;
    
    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<Elemento>();
    }

    public String getNombre() {
        return nombre;
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

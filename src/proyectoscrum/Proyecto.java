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
    private int[] caracteristicas;
    private int pfnaEE, pfnaSE, pfnaFLI, pfnaFLE, pfnaCE, sva;
    private double fa, pfa;
    
    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<Elemento>();
        this.pfnaEE = 0;
        this.pfnaSE = 0;
        this.pfnaFLI = 0;
        this.pfnaFLE = 0;
        this.pfnaCE = 0;
        this.sva = 0;
        this.fa = 0.65 + (0.01*this.sva);
        this.pfa = (this.pfnaCE + this.pfnaEE + this.pfnaFLE + this.pfnaFLI + this.pfnaSE)*this.fa;
        
        this.caracteristicas = new int[14];
        for(int i=0;i<14;i++){
            this.caracteristicas[i] = 0;
        }
    }

    public void setSva(int sva) {
        this.sva = sva;
    }

    public int getSva() {
        return sva;
    }

    public int[] getCaracteristicas() {
        return caracteristicas;
    }

    public int getPfnaEE() {
        return pfnaEE;
    }

    public int getPfnaSE() {
        return pfnaSE;
    }

    public int getPfnaFLI() {
        return pfnaFLI;
    }

    public int getPfnaFLE() {
        return pfnaFLE;
    }

    public int getPfnaCE() {
        return pfnaCE;
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
    
    public void anadirCaracteristica(int pos, int valor) {
        this.caracteristicas[pos] = valor;
    }
    
    public void calcularPFNA() {
        this.pfnaEE = 0;
        this.pfnaSE = 0;
        this.pfnaFLI = 0;
        this.pfnaFLE = 0;
        this.pfnaCE = 0;
        
        for(Elemento e : this.elementos) {
            switch(e.getTipo()){
                case "EE" : 
                    if(e.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        this.pfnaEE += 3;
                    } else if(e.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        this.pfnaEE += 4;
                    } else {
                        this.pfnaEE += 6;
                    }
                    break;
                    
                case "CE" : 
                    if(e.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        this.pfnaCE += 3;
                    } else if(e.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        this.pfnaCE += 4;
                    } else {
                        this.pfnaCE += 6;
                    }
                    break;
                
                case "SE" : 
                    if(e.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        this.pfnaSE += 4;
                    } else if(e.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        this.pfnaSE += 5;
                    } else {
                        this.pfnaSE += 7;
                    }
                    break;
                    
                case "FLI" : 
                    if(e.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        this.pfnaFLI += 7;
                    } else if(e.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        this.pfnaFLI += 10;
                    } else {
                        this.pfnaFLI += 15;
                    }
                    break;
                    
                case "FLE" : 
                    if(e.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        this.pfnaFLE += 5;
                    } else if(e.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        this.pfnaFLE += 7;
                    } else {
                        this.pfnaFLE += 10;
                    }
                    break; 
            }
        }
    }
    
    public void calcularPFA() {
        this.fa = 0.65 + (0.01*this.sva);
        this.pfa = (this.pfnaCE + this.pfnaEE + this.pfnaFLE + this.pfnaFLI + this.pfnaSE)*this.fa;
    }

    public double getFa() {
        return fa;
    }

    public double getPfa() {
        return pfa;
    }
    
}

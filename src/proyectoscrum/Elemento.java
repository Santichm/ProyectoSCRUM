/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

import java.io.Serializable;

/**
 *
 * @author Santi
 */
public class Elemento implements Serializable{
    
    private String nombre, tipo;
    private int ficheros, datos;
    private Object ficherosS, datosS;
    private String complejidad, c1, c2;
    
    public Elemento(String nombre, String tipo, int ficheros, int datos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ficheros = ficheros;
        this.datos = datos;
        this.ficherosS = "-";
        this.datosS = "-";
        this.c1 = "-";
        this.c2 = "-";
        this.complejidad = "";
    }
    
    public Elemento(String nombre, String tipo, int ficheros, int datos, int ficherosS, int datosS) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ficheros = ficheros;
        this.datos = datos;
        this.ficherosS = ficherosS;
        this.datosS = datosS;
        this.c1 = "-";
        this.c2 = "-";
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
    
    public String calcularComplejidad(){
    
        if(this.tipo.equalsIgnoreCase("FLI") || this.tipo.equalsIgnoreCase("FLE")){
            if(this.ficheros == 1) {
                if(this.datos >= 1 && this.datos <= 50) {
                    this.complejidad = "SIMPLE";
                } else {
                    this.complejidad = "MEDIA";
                }
            } else if(this.ficheros >= 2 && this.ficheros <= 5){
                if(this.datos >= 1 && this.datos <= 19) {
                    this.complejidad = "SIMPLE";
                } else if(this.datos >= 20 && this.datos <= 50) {
                    this.complejidad = "MEDIA";
                } else {
                    this.complejidad = "COMPLEJA";
                }
            } else {
                if(this.datos >= 1 && this.datos <= 19) {
                    this.complejidad = "MEDIA";
                } else {
                    this.complejidad = "COMPLEJA";
                }
            } 
        } else if(this.tipo.equalsIgnoreCase("EE")){
            if(this.ficheros == 1 || this.ficheros == 0) {
                if(this.datos >= 1 && this.datos <= 15) {
                    this.complejidad = "SIMPLE";
                } else {
                    this.complejidad = "MEDIA";
                }
            } else if(this.ficheros == 2){
                if(this.datos >= 1 && this.datos <= 4) {
                    this.complejidad = "SIMPLE";
                } else if(this.datos >= 5 && this.datos <= 15) {
                    this.complejidad = "MEDIA";
                } else {
                    this.complejidad = "COMPLEJA";
                }
            } else {
                if(this.datos >= 1 && this.datos <= 4) {
                    this.complejidad = "MEDIA";
                } else {
                    this.complejidad = "COMPLEJA";
                }
            }
        } else if(this.tipo.equalsIgnoreCase("SE")){
            if(this.ficheros == 1 || this.ficheros == 0) {
                if(this.datos >= 1 && this.datos <= 19) {
                    this.complejidad = "SIMPLE";
                } else {
                    this.complejidad = "MEDIA";
                }
            } else if(this.ficheros == 2 || this.ficheros == 3){
                if(this.datos >= 1 && this.datos <= 5) {
                    this.complejidad = "SIMPLE";
                } else if(this.datos >= 6 && this.datos <= 19) {
                    this.complejidad = "MEDIA";
                } else {
                    this.complejidad = "COMPLEJA";
                }
            } else {
                if(this.datos >= 1 && this.datos <= 5) {
                    this.complejidad = "MEDIA";
                } else {
                    this.complejidad = "COMPLEJA";
                }
            }
        } else {
            if(this.ficheros == 1 || this.ficheros == 0) {
                if(this.datos >= 1 && this.datos <= 15) {
                    c1 = "SIMPLE";
                } else {
                    c1 = "MEDIA";
                }
            } else if(this.ficheros == 2){
                if(this.datos >= 1 && this.datos <= 4) {
                    c1 = "SIMPLE";
                } else if(this.datos >= 5 && this.datos <= 15) {
                    c1 = "MEDIA";
                } else {
                    c1 = "COMPLEJA";
                }
            } else {
                if(this.datos >= 1 && this.datos <= 4) {
                    c1 = "MEDIA";
                } else {
                    c1 = "COMPLEJA";
                }
            }
            
            if((int)this.ficherosS == 1 || (int)this.ficherosS == 0) {
                if((int)this.datosS >= 1 && (int)this.datosS <= 19) {
                    c2 = "SIMPLE";
                } else {
                    c2 = "MEDIA";
                }
            } else if((int)this.ficherosS == 2 || (int)this.ficherosS == 3){
                if((int)this.datosS >= 1 && (int)this.datosS <= 5) {
                    c2 = "SIMPLE";
                } else if((int)this.datosS >= 6 && (int)this.datosS <= 19) {
                    c2 = "MEDIA";
                } else {
                    c2 = "COMPLEJA";
                }
            } else {
                if((int)this.datosS >= 1 && (int)this.datosS <= 5) {
                    c2 = "MEDIA";
                } else {
                    c2 = "COMPLEJA";
                }
            }
            
            if(c1.equalsIgnoreCase("COMPLEJA") || c2.equalsIgnoreCase("COMPLEJA")) {
                this.complejidad = "COMPLEJA";
            } else if(c1.equalsIgnoreCase("MEDIA") || c2.equalsIgnoreCase("MEDIA")) {
                this.complejidad = "MEDIA";
            } else {
                this.complejidad = "SIMPLE";
            }
        }
        
        return this.complejidad;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public void setFicherosS(int ficherosS) {
        this.ficherosS = ficherosS;
    }

    public void setDatosS(int datosS) {
        this.datosS = datosS;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public Object getFicherosS() {
        return ficherosS;
    }

    public Object getDatosS() {
        return datosS;
    }

    public String getComplejidad() {
        return complejidad;
    }
}

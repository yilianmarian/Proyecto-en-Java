/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author yuxnel
 */
public class Registro implements Serializable{
    
    protected String id;
    protected String dato;
    private String nombre;
    private String descripcion;

    public Registro(String id, String dato) {
        this.id = id;
        this.dato = dato;
    }

    public Registro(String id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
        @Override
    public String toString(){
            return "{ "+" id: "+id+" nombre: "+nombre+" descripcion: "+descripcion+" }";

}
}

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
public class Articulos implements Serializable{
    
    private String id;
    private String nombre;
    private String descripcion;
    private String cantidad;
    private String valorUnitario;
    private String valorTotal;

    public Articulos(String id, String nombre, String descripcion, String cantidad, String valorUnitario, String valorTotal) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
            
    @Override
    public String toString(){
            return "{ "+" id: "+id+" nombre: "+nombre+" descripcion: "+descripcion+" cantidad: "+cantidad+" valor unitario: "+valorUnitario+" valor total: "+valorTotal+" }";

}
    
}

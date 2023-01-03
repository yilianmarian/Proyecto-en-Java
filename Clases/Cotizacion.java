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
public class Cotizacion extends Registro implements Serializable{
    
    private String producto;
    private String comprador;

    public Cotizacion(String producto, String comprador, String id, String dato) {
        super(id, dato);
        this.producto = producto;
        this.comprador = comprador;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    
    @Override
    public String toString(){
        return "{ "+" ID: "+id+" dato: "+dato+" producto: "+producto+" comprador: "+comprador+" }";
    }
    
}

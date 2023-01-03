
package Modelo;

import java.io.Serializable;


public class Rebaja extends Registro implements Serializable{

    private String producto;
    private String vendedor;

    public Rebaja(String producto, String vendedor, String id, String dato) {
        super(id, dato);
        this.producto = producto;
        this.vendedor = vendedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString(){
        return "{ "+" id: "+id+" dato: "+dato+" producto: "+producto+" vendedor: "+vendedor+" }";

    }
    

    
}

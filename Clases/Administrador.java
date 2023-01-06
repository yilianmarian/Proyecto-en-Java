
package Modelo;

import java.io.Serializable;

public class Administrador implements Serializable{
    
    private String nombre;
    private String CI;

    public Administrador(String nombre, String CI) {
        this.nombre = nombre;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }
    
    @Override
    public String toString(){
        return "{ "+" nombre: "+nombre+" CI: "+CI+" }";
    }
}

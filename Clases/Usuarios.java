
package Modelo;
    
import java.io.Serializable;

    public class Usuarios implements Serializable{
    
        protected String nombreu;
        protected String contraseña;

    public Usuarios(String nombreu, String contraseña) {
        this.nombreu = nombreu;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombreu;
    }

    public void setNombre(String nombreu) {
        this.nombreu = nombreu;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
        
        @Override
    public String toString(){
        return "{ "+" nombre de usuario: "+nombreu+" contraseña: "+contraseña+" }";
    }
}

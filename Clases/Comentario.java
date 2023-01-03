
package Modelo;

import java.io.Serializable;

public class Comentario extends Registro implements Serializable{
    
    private String remitente;
    private String texto;
    private String direccion;

    public Comentario(String remitente, String texto, String direccion, String id, String dato) {
        super(id, dato);
        this.remitente = remitente;
        this.texto = texto;
        this.direccion = direccion;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = id;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "{ "+" ID: "+id+" remitente: "+remitente+" texto: "+texto+" dato: "+dato+" direccion: "+direccion+" }";
    }
}

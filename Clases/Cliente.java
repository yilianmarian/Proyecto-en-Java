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
public class Cliente extends Usuarios implements Serializable{

    public Cliente(String nombreu, String contraseña) {
        super(nombreu, contraseña);
    }
    
    @Override
    public String toString(){
            return "{ "+" Nombre: "+nombreu+" Contraseña: "+contraseña+" }";

}
}

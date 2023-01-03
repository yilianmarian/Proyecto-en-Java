package Controlador;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Articulos;
import Modelo.Registro;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TrabajoArchivos {
    
    public static ArrayList<Cliente> readFileTextCliente() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("cliente.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Cliente> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Cliente nuevo = (Cliente)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextCliente(ArrayList<Cliente>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("cliente.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
        public static ArrayList<Empleado> readFileTextEmpleado() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("empleado.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Empleado> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Empleado nuevo = (Empleado)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextEmpleado(ArrayList<Empleado>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("empleado.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
        public static ArrayList<Articulos> readFileTextArticulos() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("articulos.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Articulos> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Articulos nuevo = (Articulos)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextArticulos(ArrayList<Articulos>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("articulos.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
        
        
        
        
        public static ArrayList<Registro> readFileTextRegistro() throws FileNotFoundException, IOException, ClassNotFoundException{
            
            File baseDatos = new File("registro.txt");
            
            FileInputStream entradaDatos = new FileInputStream(baseDatos);
            
            ObjectInputStream entradaObjetos = new ObjectInputStream(entradaDatos);
            
            ArrayList<Registro> participantes = new ArrayList<>();
            
            int cantidadParticipantes = entradaObjetos.readInt();
            
            for(int i=0; i<cantidadParticipantes;i++){
                
                Registro nuevo = (Registro)entradaObjetos.readObject();
                participantes.add(nuevo);
                
            }
            
            return participantes;
        }
        
        public static void writeFileTextRegistro(ArrayList<Registro>participantes) throws FileNotFoundException, IOException{
            
            File baseDatos = new File("registro.txt");

            FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
            
            try (ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos)) {
                int cantidad = participantes.size();
                
                salidaObjetos.writeInt(cantidad);
                
                for(int i=0;i<cantidad;i++){
                    
                    salidaObjetos.writeObject(participantes.get(i));
                    
                }
                
                salidaObjetos.flush();
            }
            
        }
    
}

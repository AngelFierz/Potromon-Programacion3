/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromonpro.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.potromonpro.persistencia.Conexion;

/**
 * Clase de los atributos y métodos de la entidad entrenador
 * @author dzlan
 */
public class Entrenador {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apodo
     */
    public String getApodo() {
        return apodo;
    }

    /**
     * @param apodo the apodo to set
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    private int id;
    private String nombre;
    private String apodo;
    private String imagen;  

    /**
     * Obtiene todos los entrenadores de la base de datos
     * @return una lista de entrenador
     */
    public static List<Entrenador> getAll(){
        List<Entrenador> entrenadores = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, nombre, apodo, imagen FROM entrenador");
            while(rs.next()){
                Entrenador r = new Entrenador();
                r.setId(rs.getInt(1));
                r.setNombre(rs.getString(2));
                r.setApodo(rs.getString(3));
                r.setImagen(rs.getString(4)); 
                entrenadores.add(r);
            }
        } catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return entrenadores;
    }   
    
    
    /**
     * Busca un entrenador por su id
     * @param id Valor del id del entrenador
     * @return Un entrenador de la base de datos 
     */
        public static Entrenador getById(int id){
        Entrenador r = new Entrenador();
        
        try{
            
            Connection conexion = Conexion.obtener();
            String query = "SELECT id, nombre, apodo, imagen FROM entrenador WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1,id);
            
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                r.setId(rs.getInt(1));
                r.setNombre(rs.getString(2));
                r.setApodo(rs.getString(3));
                r.setImagen(rs.getString(4));
            }
        } catch (Exception ex) {
                System.err.println("Ocurrió un error: " + ex.getMessage());  
                    }
        return r;
        
    }
    
    
        /**
         * Guarda un registro de entrenador en la base de datos
         * @param nombre Valor del nombre del entrenador
         * @param apodo Valor del apodo del entrenador
         * @param imagen Valor de la imagen del entrenador
         * @return true si se guardó exitosamente, de lo contrario false.
         */
    public static boolean save(String nombre, String apodo, String imagen){
        boolean resultado = false;
        try{
            Connection conexion = Conexion.obtener();
            String consulta = "INSERT INTO entrenador (nombre, apodo,imagen) VALUES (?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, apodo);
            statement.setString(3, imagen);
            
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        }catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }
    
    /**
     * Metodo para editar la información de un entrenador
     * @param nombre valor del nombre de un entrenador
     * @param apodo valor del apodo de un entrenador
     * @param imagen valor de la imagen de un entrenador
     * @param id valor del id del entrenador
     * @return true si la edición se realizó exitosamente y false si no se realizó
     */
        public static boolean edit(String nombre, String apodo, String imagen, int id){
        boolean resultado = false;
        try{
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE entrenador SET nombre = ?, apodo = ?, imagen = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, apodo);
            statement.setString(3, imagen);
            statement.setInt(4, id);
            
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        }catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }  
    
    /**
     * Metodo para eliminar un entrenador
     * @param id Valor del id de entrenador
     * @return true si el responsable se eliminó exitosamente y false si no.
     */
        public static boolean delete(int id){
        boolean resultado = false;
        try{
            Connection conexion = Conexion.obtener();
            String consulta = "DELETE FROM entrenador WHERE id=?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);
            
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
        }catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }         
         
    @Override
    public String toString() {
        return nombre; 
    }
    
    }



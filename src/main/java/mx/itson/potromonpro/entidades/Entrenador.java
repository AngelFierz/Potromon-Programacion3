/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromonpro.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mx.itson.potromonpro.persistencia.Conexion;

/**
 *
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

    
        public static Entrenador getById(int id){
        Entrenador r = new Entrenador();
        
        try{
            
            Connection conexion = Conexion.obtener();
            String query = "SELECT id, nombre, apodo FROM entrenador WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1,id);
            
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                r.setId(rs.getInt(1));
                r.setNombre(rs.getString(2));
                r.setApodo(rs.getString(3));
            }
        } catch (Exception ex) {
                System.err.println("Ocurrió un error: " + ex.getMessage());  
                    }
        return r;
        
    }
    
    
    
    
    
    
    }



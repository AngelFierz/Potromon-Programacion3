/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromonpro.entidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.potromonpro.persistencia.Conexion;

/**
 *
 * @author dzlan
 */
public class Potromon {

    /**
     * @return the entrenador_id
     */
    public int getEntrenador_id() {
        return entrenador_id;
    }

    /**
     * @param entrenador_id the entrenador_id to set
     */
    public void setEntrenador_id(int entrenador_id) {
        this.entrenador_id = entrenador_id;
    }

    
    //Falta imagen y entrenador id, no sé qpd todavía 
    private int id;
    private String nombre;
    private String descripcion;
    private String lista_habiliades; 
    private int entrenador_id;
    private int puntaje; 
    
    
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the lista_habiliades
     */
    public String getLista_habiliades() {
        return lista_habiliades;
    }

    /**
     * @param lista_habiliades the lista_habiliades to set
     */
    public void setLista_habiliades(String lista_habiliades) {
        this.lista_habiliades = lista_habiliades;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
        public static List<Potromon> getAll(){
        List<Potromon> potromones = new ArrayList<>();
        
        try{
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, nombre, entrenador_id, puntaje FROM potromon");
            while(rs.next()){
                Potromon r = new Potromon();
                r.setId(rs.getInt(1));
                r.setNombre(rs.getString(2));
                r.setEntrenador_id(rs.getInt(3));
                r.setPuntaje(rs.getInt(4)); 
                potromones.add(r);
            }
        } catch (Exception ex) {
                System.err.println("Ocurrió un error: " + ex.getMessage());  
                    }
    return potromones;  

}
}
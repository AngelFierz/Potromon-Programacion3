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
 * @author Akane
 */
public class Potromon {

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
     * @return the listahabilidades
     */
    public String getListahabilidades() {
        return listahabilidades;
    }

    /**
     * @param listahabilidades the listahabilidades to set
     */
    public void setListahabilidades(String listahabilidades) {
        this.listahabilidades = listahabilidades;
    }

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
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

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    
    private int id;
    private String nombre;
    private String descripcion;
    private String listahabilidades; 
    private Entrenador entrenador;
    private int puntaje;
    private String image;
    
    
    public static List<Potromon> getAll(){
        List<Potromon> potromones = new ArrayList<>();

        try{

            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, nombre, descripcion, lista_habilidades, imagen, entrenador_id, puntaje FROM potromon");
            while(rs.next()){
                Potromon p = new Potromon();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));                                            
                p.setListahabilidades(rs.getString(4));
                p.setImage(rs.getString(5));
                
                Entrenador e = Entrenador.getById(rs.getInt(6));
                p.setEntrenador(e);            
                
                p.setPuntaje(rs.getInt(7)); 
                potromones.add(p);
            }
        } catch (Exception ex) {
                System.err.println("Ocurrió un error: " + ex.getMessage());
                    }
    return potromones;
}
}

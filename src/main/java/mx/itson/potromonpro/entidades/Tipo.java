/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromonpro.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.potromonpro.persistencia.Conexion;

/**
 * Clase de los atributos y métodos de la entidad tipo
 * @author Akane
 */
public class Tipo {

    private int id;
    private String nombre;
    private String imagen;

   
    public Tipo() {}

    
    public Tipo(int id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    

    /**
     * Obtiene todos los tipos disponibles en la base de datos.
     * @return una lista de objetos Tipo.
     */
    public static List<Tipo> getAll() {
        List<Tipo> tipos = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT id, nombre, imagen FROM tipos");

            while (rs.next()) {
                Tipo t = new Tipo();
                t.setId(rs.getInt("id"));
                t.setNombre(rs.getString("nombre"));
                t.setImagen(rs.getString("imagen"));
                tipos.add(t);
            }

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error al obtener todos los tipos: " + ex.getMessage());
        }
        return tipos;
    }

    /**
     * Busca un tipo por su ID.
     * @param id ID del tipo a buscar.
     * @return un objeto Tipo, o null si no se encuentra.
     */
    public static Tipo getById(int id) {
        Tipo tipo = null;
        try {
            Connection conexion = Conexion.obtener();
            String query = "SELECT id, nombre, imagen FROM tipos WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                tipo = new Tipo();
                tipo.setId(rs.getInt("id"));
                tipo.setNombre(rs.getString("nombre"));
                tipo.setImagen(rs.getString("imagen"));
            }

            conexion.close();
        } catch (Exception ex) {
            System.err.println("Error al buscar el tipo por ID: " + ex.getMessage());
        }
        return tipo;
    }
    
    /**
     * Agrega una relacion potromon-tipo.
     * @param potromonId
     * @param tipoId
     * @return Retorna un valor booleano.
     */
    
     public boolean agregarTipo(int potromonId, int tipoId) {
    String query = "INSERT INTO potromon_tipos (potromon_id, tipo_id) VALUES (?, ?)";
    try (Connection conn = Conexion.obtener(); 
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, potromonId);
        stmt.setInt(2, tipoId);
        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
     /**
      * Elimina un potromon tipo registro en base al ID del potromon y del tipo.
      * @param potromonId
      * @param tipoId
      * @return retorna un valor booleano.
      */
   
   public boolean eliminarTipo(int potromonId, int tipoId) {
    String query = "DELETE FROM potromon_tipos WHERE potromon_id = ? AND tipo_id = ?";
    try (Connection conn = Conexion.obtener(); 
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, potromonId);
        stmt.setInt(2, tipoId);
        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

   /**
    * Obtiene un tipo por su ID
    * @param id
    * @return Retorna una lista que se conforma de los elementos en la tabla tipo.
    */
 
   
   public static List<Tipo> obtenerTipos(int id) {
    List<Tipo> tipos = new ArrayList<>();
    try {
        Connection conexion = Conexion.obtener();
        String query = "SELECT t.id, t.nombre, t.imagen FROM tipos t " +
                       "INNER JOIN potromon_tipos pt ON t.id = pt.tipo_id " +
                       "WHERE pt.potromon_id = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            Tipo tipo = new Tipo();
            tipo.setId(rs.getInt("id"));
            tipo.setNombre(rs.getString("nombre"));
            tipo.setImagen(rs.getString("imagen"));
            tipos.add(tipo);
        }

        conexion.close();
    } catch (Exception ex) {
        System.err.println("Error al buscar los tipos por ID: " + ex.getMessage());
    }
    return tipos;
}

}

   

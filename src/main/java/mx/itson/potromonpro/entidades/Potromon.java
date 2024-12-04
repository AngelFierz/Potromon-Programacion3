
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
        return listaHabilidades;
    }

    /**
     * @param listahabilidades the listahabilidades to set
     */
    public void setListaHabilidades(String listahabilidades) {
        this.listaHabilidades = listahabilidades;
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
    public String getImagen() {
        return imagen;
    }

    /**
     * @param image the image to set
     */
    public void setImagen(String image) {
        this.imagen = image;
    }

    
       private int id;
    private String nombre;
    private String descripcion;
    private String listaHabilidades; 
    private Entrenador entrenador;
    private int puntaje;
    private String imagen;
    
    
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
                p.setListaHabilidades(rs.getString(4));
                p.setImagen(rs.getString(5));
                
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
    
    public static boolean save(String nombre, String descripcion, String listaHabilidades, String rutaImagen, int entrenador, int puntaje) {
    boolean resultado = false;
    try {
        Connection conexion = Conexion.obtener();
        String consulta = "INSERT INTO potromon (nombre, descripcion, lista_habilidades, imagen, entrenador_id, puntaje) VALUES(?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        statement.setString(1, nombre);
        statement.setString(2, descripcion);
        statement.setString(3, listaHabilidades);
        statement.setString(4, rutaImagen);
        statement.setInt(5, entrenador);
        statement.setInt(6, puntaje);
        statement.execute();
        resultado = statement.getUpdateCount() == 1;
        conexion.close();
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return resultado;
}

    
    
    /**
     * Sirve para obtener y añadir el ID de un elemento a la tabla
     * @param id
     * @return 
     */
   public static Potromon getById(int id) {
    Potromon p = null;
    try {
        Connection conexion = Conexion.obtener();
        String query = "SELECT id, nombre, descripcion, lista_habilidades, imagen, entrenador_id, puntaje FROM potromon WHERE id = ?";
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            p = new Potromon();
            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setDescripcion(rs.getString(3));
            p.setListaHabilidades(rs.getString(4));
            p.setImagen(rs.getString(5)); // Ruta de la imagen
            Entrenador e = Entrenador.getById(rs.getInt(6));
            p.setEntrenador(e);
            p.setPuntaje(rs.getInt(7));
        }
        conexion.close();
    } catch (Exception ex) {
        System.err.println("Ocurrió un error: " + ex.getMessage());
    }
    return p;
}

    public static boolean actualizarPuntaje(int potromonId, int nuevoPuntaje) {
    boolean resultado = false;
    try {
        Connection conexion = Conexion.obtener();
        String consulta = "UPDATE potromon SET puntaje = ? WHERE id = ?";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        statement.setInt(1, nuevoPuntaje);
        statement.setInt(2, potromonId); 
        statement.execute();
        resultado = statement.getUpdateCount() == 1;
        conexion.close();
    } catch (Exception ex) {
        System.err.println("Ocurrió un error al actualizar el puntaje: " + ex.getMessage());
    }
    return resultado;
}

        
    
        public static boolean edit(String nombre, String descripcion, String listaHabilidades, String imagen, int entrenador, int puntaje){
        boolean resultado = false;
        try{
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE potromon SET nombre = ?, descripcion = ?, lista_habilidades = ?, imagen = ?, entrenador_id = ?, puntaje = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, descripcion);
            statement.setString(3, listaHabilidades);
            statement.setString(4, imagen);
            statement.setInt(5, entrenador);
            statement.setInt(6, puntaje);
            
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
        }catch(Exception ex){
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
        return resultado;
    }
        
       public static boolean delete(int id){
        boolean resultado = false;
        try{
            Connection conexion = Conexion.obtener();
            String consulta = "DELETE FROM potromon WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, id);
            
            statement.execute();
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
        }catch(Exception ex){
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
        return resultado;
    }
       
       // AQUI INICIAN LOS METODOS DE LA TABLA TIPO_POTROMON
       
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

   public List<Tipo> obtenerTipos(int potromonId) {
    String query = "SELECT t.id, t.nombre, t.imagen FROM tipos t " +
                   "INNER JOIN potromon_tipos pt ON t.id = pt.tipo_id " +
                   "WHERE pt.potromon_id = ?";
    List<Tipo> tipos = new ArrayList<>();
    try (Connection conn = Conexion.obtener(); 
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, potromonId);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Tipo tipo = new Tipo(rs.getInt("id"), rs.getString("nombre"), rs.getString("imagen"));
            tipos.add(tipo);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return tipos;
}


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.potromonpro.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author dzlan
 */
public class Conexion {
    
    
       public static Connection obtener(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection("jdbc:mysql:/potromon?user=root&password=admin&useUnicode=true&characterEncoding=utf8");
        } catch (Exception ex){
            System.err.println("Ocurrió un error" + ex.getMessage()); 
        }
        
        return conexion;
    }
    
}    
    


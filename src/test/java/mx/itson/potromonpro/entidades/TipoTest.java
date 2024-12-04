/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.potromonpro.entidades;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 Clase de pruebas unitarias de la entidad Tipo
 * @author Evelyn Guzman
 */
public class TipoTest {
    
    public TipoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     /**
     * Test of getId method, of class Tipo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Tipo instance = new Tipo();
         instance.setId(4);
        int expResult = 4;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Tipo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 4;
        Tipo instance = new Tipo();
        instance.setId(id);
        
    }

    /**
     * Test of getNombre method, of class Tipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Tipo instance = new Tipo();
        instance.setNombre("Fantasia");
        String expResult = "Fantasia";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Tipo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Fantasia";
        Tipo instance = new Tipo();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getImagen method, of class Tipo.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Tipo instance = new Tipo();
         instance.setImagen("fantasia.png");
        String expResult = "fantasia.png";
        String result = instance.getImagen();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setImagen method, of class Tipo.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "fantasia.png";
        Tipo instance = new Tipo();
        instance.setImagen(imagen);
        
    }

    /**
     * Test of getAll method, of class Tipo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Tipo> result = Tipo.getAll();
        assertNotNull(result);  
        assertTrue(result.size() > 0);
    }

    /**
     * Test of getById method, of class Tipo.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Tipo result = Tipo.getById(1); 
        assertNotNull(result); 
        assertEquals(1, result.getId());
    }

    /**
     * Test of agregarTipo method, of class Tipo.
     */
    @Test
    public void testAgregarTipo() {
        System.out.println("agregarTipo");
        int potromonId = 22;
        int tipoId = 20;
        Tipo instance = new Tipo();
        boolean expResult = true;
        boolean result = instance.agregarTipo(potromonId, tipoId);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of eliminarTipo method, of class Tipo.
     */
    @Test
    public void testEliminarTipo() {
        System.out.println("eliminarTipo");
        int potromonId = 30;
        int tipoId = 25;
        Tipo instance = new Tipo();
        boolean expResult = false;
        boolean result = instance.eliminarTipo(potromonId, tipoId);
        assertEquals(expResult, result);
        
    }
    
}

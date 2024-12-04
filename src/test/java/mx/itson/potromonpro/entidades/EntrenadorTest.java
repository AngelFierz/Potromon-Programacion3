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
 * Clase de pruebas unitarias de la entidad entrenador
 * @author Evelyn Guzman
 */
public class EntrenadorTest {
    
    public EntrenadorTest() {
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
     * Test of getId method, of class Entrenador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Entrenador instance = new Entrenador();
        instance.setId(5);
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Entrenador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 5;
        Entrenador instance = new Entrenador();
        instance.setId(id);
    }

    /**
     * Test of getNombre method, of class Entrenador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Entrenador instance = new Entrenador();
        instance.setNombre("Ceseña");
        String expResult = "Ceseña";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Entrenador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Ceseña";
        Entrenador instance = new Entrenador();
        instance.setNombre(nombre);
    }

    /**
     * Test of getApodo method, of class Entrenador.
     */
    @Test
    public void testGetApodo() {
        System.out.println("getApodo");
        Entrenador instance = new Entrenador();
        instance.setApodo("Google Master");
        String expResult = "Google Master";
        String result = instance.getApodo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApodo method, of class Entrenador.
     */
    @Test
    public void testSetApodo() {
        System.out.println("setApodo");
        String apodo = "Google Master";
        Entrenador instance = new Entrenador();
        instance.setApodo(apodo);
    }

    /**
     * Test of getImagen method, of class Entrenador.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Entrenador instance = new Entrenador();
        instance.setImagen("Bims.png");
        String expResult = "Bims.png";
        String result = instance.getImagen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImagen method, of class Entrenador.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "Bims.png";
        Entrenador instance = new Entrenador();
        instance.setImagen(imagen);
    }

    /**
     * Test of getAll method, of class Entrenador.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
       List<Entrenador> result = Entrenador.getAll();
       assertNotNull(result);  
       assertTrue(result.size() > 0);
    }

    /**
     * Test of getById method, of class Entrenador.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Entrenador result = Entrenador.getById(1); // Usar un ID válido
        assertNotNull(result); // Verifica que el entrenador no sea nulo
        assertEquals(1, result.getId());
    }

    /**
     * Test of save method, of class Entrenador.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String nombre = "Pepito";
        String apodo = "Peps";
        String imagen = "Pepito.png";
        boolean expResult = true;
        boolean result = Entrenador.save(nombre, apodo, imagen);
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class Entrenador.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        String nombre = "Pablito";
        String apodo = "Lito";
        String imagen = "Pablito.png";
        int id = 9;
        boolean expResult = true;
        boolean result = Entrenador.edit(nombre, apodo, imagen, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class Entrenador.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 9;
        boolean expResult = true;
        boolean result = Entrenador.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Entrenador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Entrenador instance = new Entrenador();
        instance.setNombre("Ceseña");
        String expResult = "Ceseña";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}

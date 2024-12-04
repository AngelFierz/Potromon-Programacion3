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
 * Clase de pruebas unitarias de la entidad potromon
 * @author Evelyn Guzman
 */
public class PotromonTest {
    
    public PotromonTest() {
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
     * Test of getId method, of class Potromon.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Potromon instance = new Potromon();
        instance.setId(3);
        int expResult = 3;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Potromon.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 3;
        Potromon instance = new Potromon();
        instance.setId(id);
        
    }

    /**
     * Test of getNombre method, of class Potromon.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Potromon instance = new Potromon();
        instance.setNombre("Potro");
        String expResult = "Potro";
        String result = instance.getNombre();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNombre method, of class Potromon.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Potro";
        Potromon instance = new Potromon();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getDescripcion method, of class Potromon.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Potromon instance = new Potromon();
        instance.setDescripcion("Super rapisisisimo");
        String expResult = "Super rapisisisimo";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescripcion method, of class Potromon.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "Super rapisisisimo";
        Potromon instance = new Potromon();
        instance.setDescripcion(descripcion);
        
    }

    /**
     * Test of getListahabilidades method, of class Potromon.
     */
    @Test
    public void testGetListahabilidades() {
        System.out.println("getListahabilidades");
        Potromon instance = new Potromon();
        instance.setListaHabilidades("Comelon: Come de todo");
        String expResult = "Comelon: Come de todo";
        String result = instance.getListahabilidades();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setListaHabilidades method, of class Potromon.
     */
    @Test
    public void testSetListaHabilidades() {
        System.out.println("setListaHabilidades");
        String listahabilidades = "Comelon: Come de todo";
        Potromon instance = new Potromon();
        instance.setListaHabilidades(listahabilidades);
        
    }

    /**
     * Test of getEntrenador method, of class Potromon.
     */
    @Test
    public void testGetEntrenador() {
        System.out.println("getEntrenador");
        Potromon instance = new Potromon();
    // Crear un entrenador y asignarlo al Potromon
        Entrenador entrenador = new Entrenador();
        entrenador.setNombre("Juan");
        instance.setEntrenador(entrenador);
        Entrenador expResult = entrenador;  // El resultado esperado debe ser el entrenador asignado
        Entrenador result = instance.getEntrenador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEntrenador method, of class Potromon.
     */
    @Test
    public void testSetEntrenador() {
        System.out.println("setEntrenador");
        Entrenador entrenador = new Entrenador();
        Potromon instance = new Potromon();
        instance.setEntrenador(entrenador);
       
    }

    /**
     * Test of getPuntaje method, of class Potromon.
     */
    @Test
    public void testGetPuntaje() {
        System.out.println("getPuntaje");
        Potromon instance = new Potromon();
        instance.setPuntaje(90);
        int expResult = 90;
        int result = instance.getPuntaje();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPuntaje method, of class Potromon.
     */
    @Test
    public void testSetPuntaje() {
        System.out.println("setPuntaje");
        int puntaje = 90;
        Potromon instance = new Potromon();
        instance.setPuntaje(puntaje);
        
    }

    /**
     * Test of getImagen method, of class Potromon.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Potromon instance = new Potromon();
         instance.setImagen("potro.png");
        String expResult = "potro.png";
        String result = instance.getImagen();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setImagen method, of class Potromon.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String image = "potro.png";
        Potromon instance = new Potromon();
        instance.setImagen(image);
        
    }

    /**
     * Test of getAll method, of class Potromon.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Potromon> result = Potromon.getAll();
        assertNotNull(result);  
        assertTrue(result.size() > 0);
       
    }

    /**
     * Test of save method, of class Potromon.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String nombre = "Potro";
        String descripcion = "Super rapisisisimo";
        String listaHabilidades = "Comelon: Come de todo";
        String rutaImagen = "potro.png";
        int entrenador = 1;
        int puntaje = 38;
        boolean expResult = true;
        boolean result = Potromon.save(nombre, descripcion, listaHabilidades, rutaImagen, entrenador, puntaje);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getById method, of class Potromon.
     */
    @Test
    public void testGetById() {
       System.out.println("getById");
       Potromon result = Potromon.getById(1); 
       assertNotNull(result); 
       assertEquals(1, result.getId());
    }

    /**
     * Test of actualizarPuntaje method, of class Potromon.
     */
    @Test
    public void testActualizarPuntaje() {
        System.out.println("actualizarPuntaje");
        int potromonId = 9;
        int nuevoPuntaje = 67;
        boolean expResult = true;
        boolean result = Potromon.actualizarPuntaje(potromonId, nuevoPuntaje);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class Potromon.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        String nombre = "Potro";
        String descripcion = "Super rapisisisimo";
        String listaHabilidades = "Insomnio:Siempre tiene sueño";
        String imagen = "pro.png";
        int entrenador = 1;
        int puntaje = 90;
        int potromonId = 9;
        boolean expResult = true;
        boolean result = Potromon.edit(nombre, descripcion, listaHabilidades, imagen, entrenador, puntaje, potromonId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class Potromon.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 9;
        boolean expResult = true;
        boolean result = Potromon.delete(id);
        assertEquals(expResult, result);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mx.itson.potromonpro.grafico;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JComponent;

public class Fuente {

    // Método para cargar la fuente con un tamaño específico
    public static Font cargarFuente(float tamanio) {
        try {
            // Cargar el archivo de la fuente desde el classpath
            InputStream fontStream = Fuente.class.getResourceAsStream("/Otros/Pokemon Classic.ttf");
            if (fontStream == null) {
                throw new IOException("No se encontró el archivo de la fuente.");
            }

            // Crear la fuente y derivar el tamaño
            Font fuentePokemon = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            return fuentePokemon.deriveFont(tamanio); // Cambiar el tamaño aquí

        } catch (FontFormatException | IOException e) {
            System.err.println("Error al cargar la fuente: " + e.getMessage());
            return new Font("SansSerif", Font.PLAIN, (int) tamanio); // Fuente por defecto si falla
        }
    }

    // Método para aplicar la fuente a múltiples componentes
    public static void aplicarFuente(JComponent[] componentes, float tamanio) {
        Font fuente = cargarFuente(tamanio);
        for (JComponent componente : componentes) {
            componente.setFont(fuente);
        }
    }
}




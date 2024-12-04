/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.itson.potromonpro.ui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import mx.itson.potromonpro.entidades.Potromon;
import mx.itson.potromonpro.entidades.Tipo;
import mx.itson.potromonpro.grafico.BackgroundPanel;
import mx.itson.potromonpro.grafico.Fuente;

/**
 *
 * @author dzlan
 */
public class PotromonConsulta extends javax.swing.JDialog {

    int id;
    
    /**
     * Creates new form PotromonConsulta
     */
    public PotromonConsulta(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
            
        ImageIcon icon = new ImageIcon("src/main/resources/Otros/Background.jpg");
        BackgroundPanel bgPanel = new BackgroundPanel(icon.getImage());
        setContentPane(bgPanel); 
        
        initComponents();
        
        this.id = id;
        if(id != 0) {    
            Potromon p = Potromon.getById(id);
            List<Tipo> tipos = Tipo.obtenerTipos(id);
            lblNombre.setText(p.getNombre());
            lblEntrenador.setText(p.getEntrenador().getNombre());
            lblPuntaje.setText(String.valueOf(p.getPuntaje()));
            txtHabilidades.setText(p.getDescripcion());
            txtDescripcion.setText(p.getListahabilidades()); 
            
            ImageIcon potromonImagen = new ImageIcon(p.getImagen());
            Image imgPotromon = potromonImagen.getImage();  
            Image resizedImg = imgPotromon.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
            potromonImagen = new ImageIcon(resizedImg);
            lblImagen.setIcon(potromonImagen);  
            
            Tipo tipo1 = tipos.get(0); // El segundo tipo (índice 1)
            ImageIcon tipo1Icon = new ImageIcon(tipo1.getImagen());
            Image imgTipo1 = tipo1Icon.getImage();
            
            if (tipos.size() > 0) {
            int nuevoAncho1 = lblTipo1.getWidth() / 2; // Ajusta el tamaño
            int nuevoAlto1 = lblTipo1.getHeight() / 2;
            Image resizedImgTipo1 = imgTipo1.getScaledInstance(nuevoAncho1, nuevoAlto1, Image.SCALE_SMOOTH);
            tipo1Icon = new ImageIcon(resizedImgTipo1);
            lblTipo1.setIcon(tipo1Icon);}

            if (tipos.size() > 1) { // Verifica que al menos haya dos tipos
            Tipo tipo2 = tipos.get(1); // El segundo tipo (índice 1)
            ImageIcon tipo2Icon = new ImageIcon(tipo2.getImagen());
            Image imgTipo2 = tipo2Icon.getImage();

            int nuevoAncho2 = lblTipo2.getWidth() / 2; // Ajusta el tamaño
            int nuevoAlto2 = lblTipo2.getHeight() / 2;
            Image resizedImgTipo2 = imgTipo2.getScaledInstance(nuevoAncho2, nuevoAlto2, Image.SCALE_SMOOTH);
            tipo2Icon = new ImageIcon(resizedImgTipo2);
            lblTipo2.setIcon(tipo2Icon);}
            
            txtHabilidades.setLineWrap(true);  // Activa el ajuste de línea
            txtHabilidades.setWrapStyleWord(true);  // Ajusta las palabras completas, no las separa
            txtHabilidades.setEditable(false);  // Si no deseas que se pueda editar
            txtHabilidades.setPreferredSize(new java.awt.Dimension(250, 100));  // Ajusta el tamaño del área de texto (250px de ancho, 100px de alto)

            txtDescripcion.setLineWrap(true);  // Activa el ajuste de línea
            txtDescripcion.setWrapStyleWord(true);  // Ajusta las palabras completas, no las separa
            txtDescripcion.setEditable(false);  // Si no deseas que se pueda editar
            txtDescripcion.setPreferredSize(new java.awt.Dimension(250, 100));
       
            JLabel[] labelsNombre = {lblNombre, lbl1};
            Fuente.aplicarFuente(labelsNombre, 13f);  // Aplica la fuente a los JLabel con tamaño 18
    
            JLabel[] labelsEntPts = {lblEntrenador, lblPuntaje};
            Fuente.aplicarFuente(labelsEntPts, 10f);  // Aplica la fuente a los JLabel con tamaño 18

            JComponent[] textoHabilidades = {txtHabilidades, txtDescripcion};
            Fuente.aplicarFuente(textoHabilidades, 8f); 

            JComponent[] textoDescripcion = {txtDescripcion};
            Fuente.aplicarFuente(textoDescripcion, 9f);

            JLabel[] labels2 = {lbl2, lbl3};
            Fuente.aplicarFuente(labels2, 10f);
       }
        
       
    
       
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblEntrenador = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHabilidades = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblTipo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNombre.setText("jLabel1");

        lblEntrenador.setText("jLabel2");

        lblPuntaje.setText("jLabel3");

        txtHabilidades.setColumns(20);
        txtHabilidades.setRows(5);
        jScrollPane1.setViewportView(txtHabilidades);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblImagen.setText("jLabel1");

        lbl1.setText("Nombre:");

        lbl2.setText("Entrenador:");

        lbl3.setText("Puntaje:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPuntaje))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTipo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPuntaje)
                            .addComponent(lbl3)
                            .addComponent(lblEntrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(lblTipo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(54, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PotromonConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PotromonConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PotromonConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PotromonConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PotromonConsulta dialog = new PotromonConsulta(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblEntrenador;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblTipo2;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtHabilidades;
    // End of variables declaration//GEN-END:variables
}

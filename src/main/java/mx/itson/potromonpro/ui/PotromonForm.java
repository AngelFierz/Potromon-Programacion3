/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mx.itson.potromonpro.ui;

import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mx.itson.potromonpro.entidades.Entrenador;
import mx.itson.potromonpro.entidades.Potromon;
import mx.itson.potromonpro.entidades.Tipo;

/**
 *
 * @author dzlan
 */
public class PotromonForm extends javax.swing.JDialog {
private File archivoImagen; 
    private String rutaRelativa;
    int id;
    /**
     * Creates new form PotromonForm
     */
    public PotromonForm(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        
        this.id = id;
        if(id != 0) {
            Potromon p = Potromon.getById(id);
            txtNombre.setText(p.getNombre());
            txtDescripcion.setText(p.getDescripcion());
            txtHabilidades.setText(p.getListahabilidades());
            txtPuntaje.setText(String.valueOf(p.getPuntaje()));
            
        }
        
       Thread thread = new Thread(() -> {
           cargarEntrenadores();
           cargarTipos();
        });
       thread.start();
        
    }
    private void cargarEntrenadores() {
    
    List<Entrenador> entrenadores = Entrenador.getAll();
    
   
    cmbEntrenador.removeAllItems();
    
    
    for (Entrenador entrenador : entrenadores) {
        cmbEntrenador.addItem(entrenador);  
    }
    }
    
    private void cargarTipos() {
    
    List<Tipo> tipos = Tipo.getAll();
    
   
    cmbEntrenador.removeAllItems();
    
    
    for (Tipo tipo : tipos) {
        cmbTipo.addItem(tipo);  
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        VF = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHabilidades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JTextField();
        lblVistaPrevia = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        cmbEntrenador = new javax.swing.JComboBox<>();
        btnSeleccionarImagen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Agregar o editar Potromon");

        jLabel3.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        VF.setText("Descripción");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel4.setText("Habilidades");

        jLabel5.setText("Entrenador");

        jLabel6.setText("Puntaje");

        txtPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntajeActionPerformed(evt);
            }
        });

        lblVistaPrevia.setText("   ");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSeleccionarImagen.setText("Seleccionar Imagen");
        btnSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImagenActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(cmbEntrenador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHabilidades, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPuntaje, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VF)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(btnSeleccionarImagen)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(142, 142, 142)
                                .addComponent(lblVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VF)
                    .addComponent(btnSeleccionarImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHabilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
                                     
    
    String nombre = txtNombre.getText(); 
    String descripcion = txtDescripcion.getText(); 
    String listaHabilidades = txtHabilidades.getText(); 
    String imagen = rutaRelativa; 
    Entrenador entrenadorSeleccionado = (Entrenador) cmbEntrenador.getSelectedItem(); 
    int entrenador = entrenadorSeleccionado.getId(); 
    int puntaje = Integer.parseInt(txtPuntaje.getText()); 

  
    boolean resultado = this.id == 0 ?
         Potromon.save(nombre, descripcion, listaHabilidades, imagen, entrenador, puntaje):
         Potromon.edit(nombre, descripcion, listaHabilidades, imagen, entrenador, puntaje, id);

   
    if (resultado) {
        JOptionPane.showMessageDialog(this, "El registro se guardó correctamente", "Registro guardado", JOptionPane.INFORMATION_MESSAGE);
        dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "Hubo un error al intentar guardar el registro", "Error al guardar", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntajeActionPerformed

    }//GEN-LAST:event_txtPuntajeActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImagenActionPerformed
        
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Seleccionar Imagen");

    
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "png", "jpg", "jpeg", "gif");
    fileChooser.setFileFilter(filter);

   
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        
        File file = fileChooser.getSelectedFile();

       
        String nombreImagen = file.getName();

        
        rutaRelativa = "src/main/resources/Potromones/" + nombreImagen;

       
        ImageIcon icon = new ImageIcon(file.getAbsolutePath());
        Image imagenEscalada = icon.getImage().getScaledInstance(lblVistaPrevia.getWidth(), lblVistaPrevia.getHeight(), Image.SCALE_SMOOTH);
        lblVistaPrevia.setIcon(new ImageIcon(imagenEscalada));


    }
    }//GEN-LAST:event_btnSeleccionarImagenActionPerformed

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
            java.util.logging.Logger.getLogger(PotromonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PotromonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PotromonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PotromonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PotromonForm dialog = new PotromonForm(new javax.swing.JFrame(), true, 0);
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
    private javax.swing.JLabel VF;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSeleccionarImagen;
    private javax.swing.JComboBox<Entrenador> cmbEntrenador;
    private javax.swing.JComboBox<Tipo> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblVistaPrevia;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtHabilidades;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuntaje;
    // End of variables declaration//GEN-END:variables
}

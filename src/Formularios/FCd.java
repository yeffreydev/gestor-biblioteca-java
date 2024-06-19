package Formularios;

import Clases.CD;
import gestorbiblioteca.BDCds;
import java.time.LocalDate;
import javax.swing.SwingUtilities;
import views.VCds;

public class FCd extends javax.swing.JPanel {
private int idEditar = -1;
    /**
     * Creates new form FCD
     */
    public FCd() {
        initComponents();
    }
    public void setTitulo(String titulo) {
        jLabel1.setText(titulo);
    }
     public void setIdEditar(int id) {
        this.idEditar = id;
        try {
            BDCds bdCds = new BDCds();
            CD cd = bdCds.getCDById(id);
            TxtTitulo.setText(cd.getTitulo());
            TxtAutor.setText(cd.getAutor());
            TxtGenero.setText(cd.getGenero());
           
            TxtDuracion.setText(cd.getDuracion());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     private void limpiarCampos() {
      TxtTitulo.setText("");
            TxtAutor.setText("");
            TxtGenero.setText("");
            TxtDuracion.setText("");
}
private void irACds() {
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        // Crear una instancia del JPanel que deseas mostrar
        VCds vCds = new VCds();
        inicio.MostrarJPanel(vCds);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtGenero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo CD");

        jLabel2.setText("Autor");

        TxtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGeneroActionPerformed(evt);
            }
        });

        jLabel3.setText("Titulo");

        jLabel4.setText("Duración");

        jLabel5.setText("Genero");

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(TxtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(TxtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(TxtDuracion))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TxtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtGeneroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String titulo= TxtTitulo.getText(); 
        String Autor = TxtAutor.getText();
        String Genero= TxtGenero.getText();
        String Duracion= TxtDuracion.getText();
        
         if (titulo.isEmpty()|| Autor.isEmpty() || Genero.isEmpty() || Duracion.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);     
        }
      CD c1= new CD(Duracion, titulo, Autor, LocalDate.EPOCH, true, Genero);
       try {
            BDCds bdCDs = new BDCds();
            if (this.idEditar!=-1) {
                c1.setId(this.idEditar);
                bdCDs.modificar(c1);
                limpiarCampos();
                irACds();
                return;
            }
            bdCDs.registrar(c1);
            limpiarCampos();
            irACds();
        } catch (Exception e) {
            String errorMsg = this.idEditar !=-1 ? "Modificar": "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el cd. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAutor;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtGenero;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

package Formularios;

import Clases.Libro;
import gestorbiblioteca.BDLibros;
import java.time.LocalDate;
import javax.swing.SwingUtilities;
import views.VLibros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author yeffr
 */
public class FLibro extends javax.swing.JPanel {
private int idEditar=-1;
    /**
     * Creates new form FLibro
     */
    public FLibro() {
        initComponents();
    }
    public void setTitulo(String titulo) {
        jLabel1.setText(titulo);
    }
     public void setIdEditar(int id) {
        this.idEditar = id;
        try {
            BDLibros bdLibros = new BDLibros();
            Libro libro = bdLibros.getLibroById(id);
            txtTitulo.setText(libro.getTitulo());
            TxtAutor.setText(libro.getAutor());
            TxtGenero.setText(libro.getGenero());
            TxtISBN.setText(libro.getIsbn());
            TxtNPaginas.setText(Integer.toString(libro.getPaginas()));
        } catch (Exception e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtGenero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtNPaginas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtISBN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo Libro");

        jLabel2.setText("Autor");

        TxtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGeneroActionPerformed(evt);
            }
        });

        jLabel3.setText("Titulo");

        jLabel4.setText("ISBN");

        jLabel5.setText("Genero");

        TxtNPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNPaginasActionPerformed(evt);
            }
        });

        jLabel6.setText("Paginas");

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(TxtNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TxtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
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

    private void TxtNPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNPaginasActionPerformed
private void limpiarCampos() {
      txtTitulo.setText("");
            TxtAutor.setText("");
            TxtGenero.setText("");
            TxtNPaginas.setText("");
}
private void irALibros() {
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        // Crear una instancia del JPanel que deseas mostrar
        VLibros vLibros = new VLibros();
        inicio.MostrarJPanel(vLibros);
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      String Titulo=txtTitulo.getText();
      String Autor =TxtAutor.getText();
      String Genero =TxtGenero.getText();
      int nPaginas= Integer.parseInt(TxtNPaginas.getText());
      String ISBN=TxtISBN.getText();
      
        if (Titulo.isEmpty()|| Autor.isEmpty() || Genero.isEmpty() || TxtNPaginas.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);     
        }
      Libro l1= new Libro(nPaginas, ISBN, Titulo, Autor, LocalDate.EPOCH, true, Genero);
       try {
            BDLibros bdLibros = new BDLibros();
            if (this.idEditar!=-1) {
                l1.setId(this.idEditar);
                bdLibros.modificar(l1);
                limpiarCampos();
                irALibros();
                return;
            }
            bdLibros.registrar(l1);
            limpiarCampos();
            irALibros();
        } catch (Exception e) {
            String errorMsg = this.idEditar !=-1 ? "Modificar": "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el libro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAutor;
    private javax.swing.JTextField TxtGenero;
    private javax.swing.JTextField TxtISBN;
    private javax.swing.JTextField TxtNPaginas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void TxtNPaginas(int paginas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

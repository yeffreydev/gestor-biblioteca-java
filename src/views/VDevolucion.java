/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Clases.Empleado;
import Clases.Usuario;
import Formularios.Inicio;
import gestorbiblioteca.BD;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.SwingUtilities;

/**
 *
 * @author yeffr
 */
public class VDevolucion extends javax.swing.JPanel {

    /**
     * Creates new form prestamo
     */
    public VDevolucion() {
        initComponents();
        Icon i = lblImage.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(300, 300, 300);
        lblImage.setIcon(new ImageIcon(image));
    }

    private void irReporte() {
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        // Crear una instancia del JPanel que deseas mostrar
        VReporte vReporte = new VReporte();
        inicio.MostrarJPanel(vReporte);
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Realizar Devolución.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("DNI Usuario.");

        jTextField1.setBackground(new java.awt.Color(235, 240, 240));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("DNI Registrador.");

        jTextField2.setBackground(new java.awt.Color(235, 240, 240));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("ID Item");

        jTextField3.setBackground(new java.awt.Color(235, 240, 240));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Devolver");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bibliotecario.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "CD" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String dniUsuario = jTextField1.getText();
        String dniRegistrador = jTextField2.getText();
        String idItem = jTextField3.getText();
        String tipoItem = (String) jComboBox1.getSelectedItem();

        //logica  para crear
        try {
            BD bd = new BD();
            Usuario usr = null;
            Empleado registrador = null;

            bd.Conectar();
            Connection conn = bd.getConexion();
            PreparedStatement st = conn.prepareStatement("select * from usuarios where dni =?");
            st.setString(1, dniUsuario);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usr = new Usuario();
                usr.setId(rs.getInt("id"));
            }

            if (usr == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "el Usuario no Existe \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
//empleado
            st = conn.prepareStatement("select * from empleados where dni =?");
            st.setString(1, dniRegistrador);
            rs = st.executeQuery();

            while (rs.next()) {
                registrador = new Empleado();
                registrador.setId(rs.getInt("id"));
            }
            if (registrador == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "el Registrador no Existe \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            //item;
            String query = "select * from libros where id = ?";
            if ("cd".equals(tipoItem.toLowerCase())) {
                query = "select * from cds where id = ?";
            }

            st = conn.prepareStatement(query);
            st.setInt(1, Integer.parseInt(idItem));
            rs = st.executeQuery();

            boolean itemIdFound = false;
            boolean itemDisponible = true;
            while (rs.next()) {
                itemIdFound = true;
                itemDisponible = rs.getBoolean("disponibilidad");
            }
            if (itemIdFound == false) {
                javax.swing.JOptionPane.showMessageDialog(this, "el Item no Existe \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            //validar si el item id esta en prestamos, sino informar que ya esta prestado.
            if (itemDisponible) {
                javax.swing.JOptionPane.showMessageDialog(this, "El Item no esta prestado \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            //prestamo
            query = "INSERT INTO devoluciones(fecha) VALUES(?);";

            st = conn.prepareStatement(query);
            st.setDate(1, Date.valueOf(LocalDate.now()));

            st.executeUpdate();

            //actualizar el id a la prestamos
            ResultSet generatedKeys = null;
            // Recupera los IDs generados
            generatedKeys = st.getGeneratedKeys();

            if (generatedKeys.next()) {
                // Obtiene el ID generado
                int idGenerado = generatedKeys.getInt(1);
                //actualizar el id en prestamos.

                // Utiliza el ID como sea necesario
                //actualizar la disponiblidad
                actualizarDisponibilidad(conn, ("libro".equals(tipoItem.toLowerCase())) ? "update libros set disponibilidad =1 where id = ?" : "update cds set disponibilidad = 1 where id =?", Integer.parseInt(idItem));

                System.out.println("ID generado: " + idGenerado);
            } else {
                System.out.println("No se generó ningún ID.");
            }

            st.close();
            irReporte();
            //logica para guardar
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void actualizarDisponibilidad(Connection conn, String query, int id) {

        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, id);
            st.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}

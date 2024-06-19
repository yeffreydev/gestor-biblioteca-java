/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorbiblioteca;

import Clases.CD;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author yeffr
 */
public class BDCds extends BD {

    public void registrar(CD cd) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "INSERT INTO cds(titulo,autor,fecha_publicacion, disponibilidad,genero, duracion) VALUES(?,?,?,?,?,?);");
            st.setString(1, cd.getTitulo());
            st.setString(2, cd.getAutor());
            st.setDate(3, Date.valueOf(cd.getFechaPublicacion()));
            st.setBoolean(4, cd.getDisponibilidad());
            st.setString(5, cd.getGenero());
            st.setString(6, cd.getDuracion());
            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public void modificar(CD cd) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "UPDATE cds SET titulo = ?, autor = ?, fecha_publicacion = ?, genero = ?, duracion = ? WHERE id = ?");
            st.setString(1, cd.getTitulo());
            st.setString(2, cd.getAutor());
            st.setDate(3, Date.valueOf(cd.getFechaPublicacion()));
            st.setString(4, cd.getGenero());
            st.setString(5, cd.getDuracion());
            st.setInt(6, cd.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    public void eliminar(int cdId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM cds WHERE id = ?;");
            st.setInt(1, cdId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public ArrayList<CD> listar(String titulo) throws Exception {
        ArrayList<CD> lista = null;
        String Query = titulo.isEmpty() ? "SELECT * FROM cds;"
                : "SELECT * FROM cds WHERE titulo LIKE '%" + titulo + "%';";

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                CD cd;
                cd = new CD();
                cd.setId(rs.getInt("id"));
                cd.setTitulo(rs.getString("titulo"));
                cd.setAutor(rs.getString("autor"));
                cd.setFechaPublicacion(rs.getDate("fecha_publicacion").toLocalDate());
                cd.setDisponibilidad(rs.getBoolean("disponibilidad"));
                cd.setGenero(rs.getString("genero"));
                cd.setDuracion(rs.getString("duracion"));   
                lista.add(cd);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public CD getCDById(int cdId) throws Exception {
        CD cd = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cds WHERE id = ? LIMIT 1;");
            st.setInt(1, cdId);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cd = new CD();
                cd.setId(rs.getInt("id"));
                 cd.setTitulo(rs.getString("titulo"));
                cd.setAutor(rs.getString("autor"));
                cd.setFechaPublicacion(rs.getDate("fecha_publicacion").toLocalDate());
                cd.setDisponibilidad(rs.getBoolean("disponibilidad"));
                cd.setGenero(rs.getString("genero"));
                cd.setDuracion(rs.getString("duracion"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return cd;
    }

}

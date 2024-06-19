/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorbiblioteca;

import Clases.Libro;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

/**
 *
 * @author yeffr
 */
public class BDLibros extends BD {

    public void registrar(Libro libro) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "INSERT INTO libros(titulo,autor,fecha_publicacion, disponibilidad,genero, isbn,paginas) VALUES(?,?,?,?,?,?,?);");
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getAutor());
            st.setDate(3, Date.valueOf(libro.getFechaPublicacion()));
            st.setBoolean(4, libro.getDisponibilidad());
            st.setString(5, libro.getGenero());
            st.setString(6, libro.getIsbn());
            st.setInt(7, libro.getPaginas());
            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public void modificar(Libro libro) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                    "UPDATE libros SET titulo = ?, autor = ?, fecha_publicacion = ?, genero = ?, isbn = ?, paginas = ? WHERE id = ?");
            st.setString(1, libro.getTitulo());
            st.setString(2, libro.getAutor());
            st.setDate(3, Date.valueOf(libro.getFechaPublicacion()));
            st.setString(4, libro.getGenero());
            st.setString(5, libro.getIsbn());
            st.setInt(6, libro.getPaginas());
            st.setInt(7, libro.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    public void eliminar(int libroId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM libros WHERE id = ?;");
            st.setInt(1, libroId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public ArrayList<Libro> listar(String titulo) throws Exception {
        ArrayList<Libro> lista = null;
        String Query = titulo.isEmpty() ? "SELECT * FROM libros;"
                : "SELECT * FROM libros WHERE titulo LIKE '%" + titulo + "%';";

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Libro libro;
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setFechaPublicacion(rs.getDate("fecha_publicacion").toLocalDate());
                libro.setDisponibilidad(rs.getBoolean("disponibilidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setPaginas(rs.getInt("paginas"));
                lista.add(libro);
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

    public Libro getLibroById(int libroId) throws Exception {
        Libro libro = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM libros WHERE id = ? LIMIT 1;");
            st.setInt(1, libroId);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                libro = new Libro();
                libro.setId(rs.getInt("id"));
                 libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setFechaPublicacion(rs.getDate("fecha_publicacion").toLocalDate());
                libro.setDisponibilidad(rs.getBoolean("disponibilidad"));
                libro.setGenero(rs.getString("genero"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setPaginas(rs.getInt("paginas"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return libro;
    }

}

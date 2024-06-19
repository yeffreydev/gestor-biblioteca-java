/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorbiblioteca;

import Clases.Usuario;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yeffr
 */
public class BDUsuarios extends BD {

    public void registrar(Usuario usuario) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(dni,nombre,apellidos, direccion,telefono, email) VALUES(?,?,?,?,?,?);");
            st.setString(1, usuario.getDni());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellidos());
            st.setString(4, usuario.getDireccion());
            st.setString(5, usuario.getTelefono());
            st.setString(6, usuario.getEmail());
            st.executeUpdate();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public void modificar(Usuario user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE usuarios SET dni = ?, nombre = ?, apellidos = ?, direccion = ?, telefono = ?, email = ? WHERE id = ?");
            st.setString(1, user.getDni());
            st.setString(2, user.getNombre());
            st.setString(3, user.getApellidos());
            st.setString(4, user.getDireccion());
            st.setString(5, user.getTelefono());
            st.setString(6, user.getEmail());
            st.setInt(7, user.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    public void eliminar(int userId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM usuarios WHERE id = ?;");
            st.setInt(1, userId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public ArrayList<Usuario> listar(String name) throws Exception {
        ArrayList<Usuario> lista = null;
        String Query = name.isEmpty() ? "SELECT * FROM usuarios;" : "SELECT * FROM usuarios WHERE nombre LIKE '%" + name + "%';";

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(Query);
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Usuario usuario;
                usuario = new Usuario(rs.getInt("id"), rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("email"));
                lista.add(usuario);
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

    public Usuario getUserById(int userId) throws Exception {
        Usuario user = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios WHERE id = ? LIMIT 1;");
            st.setInt(1, userId);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setDni(rs.getString("dni"));
                user.setNombre(rs.getString("nombre"));
                user.setApellidos(rs.getString("apellidos"));
                user.setDireccion(rs.getString("direccion"));
                user.setTelefono(rs.getString("telefono"));
                user.setEmail(rs.getString("email"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return user;
    }

}

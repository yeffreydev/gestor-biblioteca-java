/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorbiblioteca;

import Clases.Empleado;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yeffr
 */
public class BDEmpleados extends BD {

    public void registrar(Empleado empleado) throws Exception {
        try {
            this.Conectar();
            try (PreparedStatement st = this.conexion.prepareStatement("INSERT INTO empleados(dni, nombre, apellidos, direccion, telefono, cargo, salario, idJefe) VALUES(?,?,?,?,?,?,?,?);")) {
                st.setString(1, empleado.getDni());
                st.setString(2, empleado.getNombre());
                st.setString(3, empleado.getApellidos());
                st.setString(4, empleado.getDireccion());
                st.setString(5, empleado.getTelefono());
                st.setString(6, empleado.getCargo());
                st.setFloat(7, empleado.getSalario());
                st.setObject(8, (empleado.getJefe() != null) ? empleado.getJefe().getId() : null);
                st.executeUpdate();
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public void modificar(Empleado empleado) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE empleados SET dni = ?, nombre = ?, apellidos = ?, direccion = ?, telefono = ?, cargo=?, salario=?, idJefe=? WHERE id = ?");
            st.setString(1, empleado.getDni());
            st.setString(2, empleado.getNombre());
            st.setString(3, empleado.getApellidos());
            st.setString(4, empleado.getDireccion());
            st.setString(5, empleado.getTelefono());
            st.setString(6, empleado.getCargo());
            st.setFloat(7, empleado.getSalario());
            st.setObject(8, (empleado.getJefe() != null) ? empleado.getJefe().getId() : null);
            st.setInt(9, empleado.getId());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    public void eliminar(int empleadoId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM empleados WHERE id = ?;");
            st.setInt(1, empleadoId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    public ArrayList<Empleado> listar(String name) throws Exception {
        ArrayList<Empleado> lista = null;
        String query = name.isEmpty() ? "SELECT * FROM empleados;" : "SELECT * FROM empleados WHERE nombre LIKE '%" + name + "%';";

        try {
            this.Conectar();
            try (PreparedStatement st = this.conexion.prepareStatement(query); ResultSet rs = st.executeQuery()) {

                lista = new ArrayList<>();
                while (rs.next()) {
                    Empleado empleado = new Empleado();
                    empleado.setId(rs.getInt("id"));
                    empleado.setDni(rs.getString("dni"));
                    empleado.setNombre(rs.getString("nombre"));
                    empleado.setApellidos(rs.getString("apellidos"));
                    empleado.setDireccion(rs.getString("direccion"));
                    empleado.setTelefono(rs.getString("telefono"));
                    empleado.setCargo(rs.getString("cargo"));
                    empleado.setSalario(rs.getFloat("salario"));

                    int idJefe = rs.getInt("idJefe");

                    PreparedStatement st1 = this.conexion.prepareStatement("SELECT * FROM empleados WHERE id = ? LIMIT 1;");
                    st1.setInt(1, idJefe);
                    ResultSet rs1 = st1.executeQuery();

                    Empleado jefeEmpleado = null;
                    while (rs1.next()) {
                        jefeEmpleado = new Empleado();
                        jefeEmpleado.setNombre(rs1.getString("nombre"));
                    }

                    if (jefeEmpleado == null) {
                        jefeEmpleado = new Empleado();
                        jefeEmpleado.setNombre("null");
                    }

                    empleado.setJefe(jefeEmpleado);
                    lista.add(empleado);
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    public Empleado getEmpleadoById(int empleadoId) throws Exception {
        Empleado empleado = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM empleados WHERE id = ? LIMIT 1;");
            st.setInt(1, empleadoId);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                empleado = new Empleado();
                empleado.setId(rs.getInt("id"));
                empleado.setDni(rs.getString("dni"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellidos(rs.getString("apellidos"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setSalario(rs.getFloat("salario"));
                Empleado jefe = new Empleado();
                jefe.setId(rs.getInt("idJefe"));
                empleado.setJefe(jefe);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return empleado;
    }

}

package Clases;

public class Empleado extends Persona {
    private String cargo;
    private float salario;
    private Empleado jefe;
public Empleado() {
}
    public Empleado(String dni, String nombres, String apellidos, String direccion, String telefono, String cargo, float salario) {
        super(dni, nombres, apellidos, direccion, telefono);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Empleado(String dni, String nombres, String apellidos, String direccion, String telefono, String cargo, float salario, Empleado jefe) {
        super(dni, nombres, apellidos, direccion, telefono);
        this.cargo = cargo;
        this.salario = salario;
        this.jefe = jefe;
    }

    public Empleado(String cargo, float salario, Empleado jefe, int id, String dni, String nombres, String apellidos, String direccion, String telefono) {
        super(id, dni, nombres, apellidos, direccion, telefono);
        this.cargo = cargo;
        this.salario = salario;
        this.jefe = jefe;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

}

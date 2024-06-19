package Clases;



public  class Usuario extends Persona {
    
    private String email;

    

    public Usuario(String dni, String nombre, String apellidos, String direccion, String telefono, String email) {
        super(dni, nombre, apellidos, direccion, telefono);
        this.email = email;
    }

    public Usuario(int id, String dni,String nombre,String apellidos,String direccion,String telefono,String email) {
        super(id, dni, nombre, apellidos, direccion, telefono);
        this.email = email;
    }

    public Usuario() {
      }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}

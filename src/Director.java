public class Director extends Usuario{
    private Integer telefono;
    private String dni;

    public Director(Integer telefono, String dni) {
        this.telefono = telefono;
        this.dni = dni;
    }

    public Director(String correo, String clave, String nombre, String apellido, String direccion, Integer edad, Integer telefono, String dni) {
        super(correo, clave, nombre, apellido, direccion, edad);
        this.telefono = telefono;
        this.dni = dni;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //METODOS
    public void registrarUsuario(){

    }

    public void eliminarUsuario(){

    }
}

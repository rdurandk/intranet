public class Administrador extends Usuario{
    private String telefono;
    private String dni;

    public Administrador(String telefono, String dni) {
        this.telefono = telefono;
        this.dni = dni;
    }

    public Administrador(String correo, String clave, String nombre, String apellido, String direccion, Integer edad, String telefono, String dni) {
        super(correo, clave, nombre, apellido, direccion, edad);
        this.telefono = telefono;
        this.dni = dni;
    }

    public void registrarUsuario(){

    }
    public void eliminarUsuario(){

    }
    public void modificarPerfilUsuario(){

    }
}

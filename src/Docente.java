public class Docente extends Usuario{
    private Integer telefono;
    private String dni;
    private Integer aniosImpartidos;

    public Docente(Integer telefono, String dni, Integer aniosImpartidos) {
        this.telefono = telefono;
        this.dni = dni;
        this.aniosImpartidos = aniosImpartidos;
    }

    public Docente(String correo, String clave, String nombre, String apellido, String direccion, Integer edad, Integer telefono, String dni, Integer aniosImpartidos) {
        super(correo, clave, nombre, apellido, direccion, edad);
        this.telefono = telefono;
        this.dni = dni;
        this.aniosImpartidos = aniosImpartidos;
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

    public Integer getAniosImpartidos() {
        return aniosImpartidos;
    }

    public void setAniosImpartidos(Integer aniosImpartidos) {
        this.aniosImpartidos = aniosImpartidos;
    }

    //METODOS
    public void registrarEstudiantePorApellido(){

    }
    public void registrarMateria(){

    }
    public void ingresarNota(){

    }
    public void eliminarPorApellido(){

    }
    public void eliminarMateria(){

    }
    public void registrarAsistenciaPorApellido(){

    }


}

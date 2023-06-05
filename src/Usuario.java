/**
 *  Clase padre Usuario donde tendra subclases para identificar el tipo de Usuario(Ejem:Adminstrador, Estudiante, etc)
 * @author grupo5
 * @version 1.0  03/06/2023
 */
public class Usuario implements Credenciales{

    protected String correo;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected Integer edad;
    protected Integer id ;
    protected static int autoId;

    public Usuario(){
        this.id = ++autoId;
    }

    /**
     * Sobrecarga del constructor Usuario con los siguientes parametros
     * @param correo -> nos permitira validar el login
     * @param clave -> nos permitira validar el login
     * @param nombre -> registrar  un nombre al usuario
     * @param apellido -> registrar  un apellido al usuario
     * @param direccion -> registrar una direccion al usuario
     * @param edad -> registrar una edad al usuario
     */
    public Usuario(String correo, String clave, String nombre, String apellido, String direccion, Integer edad) {
        this();
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public static int getAutoId() {
        return autoId;
    }

    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo de tipo String para nuestra variable correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    /**
     *
     * @param clave de tipo String para nuestra variable clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre de tipo String para nuestra variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido de tipo String para nuestra variable apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion de tipo String para nuestra variable direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    /**
     *
     * @param edad de tipo String para nuestra variable edad
     */

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * metodo que validaremos el inicio de sesion(login) con ayuda de nuestras variables correo y clave
     */
    @Override
    public void iniciarSesion() {

    }
}

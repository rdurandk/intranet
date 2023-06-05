import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Usuario{
    private List<String> asignatura;

    public Estudiante() {
        this.asignatura = new ArrayList<>();
    }

    public Estudiante(String correo, String clave, String nombre, String apellido, String direccion, Integer edad) {
        super(correo, clave, nombre, apellido, direccion, edad);
    }



    public void addAsignatura(Asignaturas curso) {
        this.asignatura.add(String.valueOf(curso));
    }

    public void verMateria(){

    }
    public void realizarMetacognicacion(){

    }
    public void verTareaProgramada(){

    }
    public void visualizarHorarios(){

    }
    public void addAsignatura(){

    }
    public List<String> getAsignatura() {
        return asignatura;
    }

}

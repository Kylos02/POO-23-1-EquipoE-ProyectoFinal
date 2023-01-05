package POOproyect;
/**
 *
 * @author kylos
 */
public class Course {
    public int clave;
    public int nota;
    private String nombre;
    
    public Course() {
    }

    public Course(int clave, int calif, String nombre) {
        this.clave = clave; 
        this.nota = calif;
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "-Clave:" + clave +
                "  -Calificacion:" + nota + 
                "\t-Materia: " + nombre+"\n";
    }
    
}

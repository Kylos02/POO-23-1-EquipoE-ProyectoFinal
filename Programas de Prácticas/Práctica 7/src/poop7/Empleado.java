package poop7;

public class Empleado extends Object{
    private String nombre;
    private int numEmpleado, sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que modifica el valor del nombre
     * @param nombre El nombre de un empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Regresa el numero del empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * Metodo que modifica el numero del empleado
     * @param numEmpleado Numero del empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return regresa el numero del empleado
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Metodo que modifica el sueldo del empleado
     * @param porcentaje Aumento del sueldo
     */
    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(this.sueldo * porcentaje/100);
    }
    
    @Override
    public String toString() {
        return "Empleado{" +  "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}

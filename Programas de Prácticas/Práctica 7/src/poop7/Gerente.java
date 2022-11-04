package poop7;

public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Metodo que modifica el presupuesto que da el gerente
     * @param presupuesto Presupuesto que da el gerente
     */
    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0){
            presupuesto = 0;
        }
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @return Regresa el presupuesto dado por el gerente
     */
    @Override
    public String toString() {
        return "Gerente{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }

    
    
    
}

package poop7;

public class POOP7 {

    public static void main(String[] args) {
        
        Gerente ger = new Gerente();
        ger.setNombre("Pedro Escaliente");
        ger.setNumEmpleado(12345);
        System.out.println("Nombre: " + ger.getNombre());
        System.out.println("Num. Empleado: " + ger.getNumEmpleado());
        System.out.println("Sueldo: " + ger.getSueldo());
        ger.setSueldo(10);
        System.out.println("Sueldo: " + ger.getSueldo());
        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: " + ger.getPresupuesto());
        System.out.println(ger);
    }
    
}

package poop71;

public class Acuatico extends Animal{
    private int numAletas;
    
    public Acuatico(){
    }

    public Acuatico(int numAletas) {
        this.numAletas = numAletas;
    }

    public Acuatico(int numAletas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAletas = numAletas;
    }
    /**
     * 
     * @return Regresa el numero de aletas del animal acuatico
     */
    public int getNumAletas() {
        return numAletas;
    }
    /**
     * Metodo que modifica el numero de aletas del animal acuatico
     * @param numAletas Numero de aletas del animal acuatico
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    @Override
    public String toString() {
        return "Acuatico{" + "numAletas=" + numAletas + '}';
    }
    
    
}

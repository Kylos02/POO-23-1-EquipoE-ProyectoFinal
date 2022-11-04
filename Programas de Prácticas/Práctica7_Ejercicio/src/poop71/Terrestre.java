
package poop71;

public class Terrestre extends Animal {
    private int numPatas;
    
    public Terrestre(){
    }
    public Terrestre(int numPatas, String nombre, String origen, String color){
        super(nombre,origen,color);
        this.numPatas=numPatas;
    }
    /**
     * 
     * @return Regresa el numero de patas del animal terrestre
     */
    public int getNumPatas() {
        return numPatas;
    }
    /**
     * Metodo que modifica el numero de patas del animal terrestre
     * @param numPatas Numero de patas del animal terrestrepatas
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Terrestre{" + "numPatas=" + numPatas + '}';
    }
    
    
}

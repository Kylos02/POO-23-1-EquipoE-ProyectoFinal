package poop71;

public class Aereo extends Animal{
    private int numAlas;
    
    public Aereo(){
    }

    public Aereo(int numAlas) {
        this.numAlas = numAlas;
    }

    public Aereo(int numAlas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAlas = numAlas;
    }
    /**
     * 
     * @return Regresa el numero de alas del animal aereo
     */
    public int getNumAlas() {
        return numAlas;
    }
    /**
     * Metodo que modifica el numero de alas del animal aereo
     * @param numAlas Numero de alas del animal aereo
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    @Override
    public String toString() {
        return "Aereo{" + "numAlas=" + numAlas + '}';
    }
    
    
}

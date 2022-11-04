package poop71;

public class Ballena extends Acuatico {
    private int largo;
    
    public Ballena(){
    }

    public Ballena(int largo, int numAletas, String nombre, String origen, String color ){
        super(numAletas, nombre, origen, color);
        this.largo = largo;
    }
    /**
     * 
     * @return Regresa el largo de la ballena
     */
    public int getLargo() {
        return largo;
    }
    /**
     * Metodo que modifica el largo de la ballena
     * @param largo Largo de la ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}';
    }
    }
    

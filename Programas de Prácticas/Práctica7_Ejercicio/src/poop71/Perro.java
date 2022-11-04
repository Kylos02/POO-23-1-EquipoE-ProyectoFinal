package poop71;

public class Perro extends Terrestre {
    private int numManchas;
    
    public Perro(){
    }
    public Perro(int numManchas, int numPatas, String nombre, String origen, String color){
        super(numPatas,nombre,origen,color);
        this.numManchas=numManchas;
    }
    /**
     * 
     * @return Regresa el numero de manchas del perro
     */
    public int getNumManchas() {
        return numManchas;
    }
    /**
     * Metodo que modifica el numero de manchas del perro
     * @param numManchas Numero de manchas del perro
     */
    public void setNumManchas(int numManchas) {
        this.numManchas = numManchas;
    }

    @Override
    public String toString() {
        return "Perro{" + "numManchas=" + numManchas + '}';
    }
    
}

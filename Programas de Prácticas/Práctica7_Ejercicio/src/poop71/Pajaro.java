package poop71;

public class Pajaro extends Aereo {
    private String tipoPico;
    
    public Pajaro(){
    }
    
    public Pajaro(String tipoPico, int numAlas, String nombre, String origen, String color){
        super(numAlas,nombre,origen, color);
        this.tipoPico=tipoPico;
    }
    /**
     * 
     * @return Regresa el tipo de pico del pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Metodo que modifica el tipo de pico del pajaro
     * @param tipoPico Tipo de pico del pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
        
}

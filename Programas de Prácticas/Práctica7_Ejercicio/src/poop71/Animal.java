package poop71;

public class Animal {
    private String nombre, origen, color;
    
    public Animal(){
    }

    public Animal(String nombre, String origen, String color) {
        this.nombre = nombre;
        this.origen = origen;
        this.color = color;
    }
    /**
     * 
     * @return Regresa el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que modifica el nombre del animal
     * @param nombre Nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Regresa el origen del animal
     */
    public String getOrigen() {
        return origen;
    }
    /**
     * Metodo que modifica el origen del animal
     * @param origen Origen del animal
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    /**
     * 
     * @return Regresa el color del animal
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo que modifica el color del animal
     * @param color Color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", origen=" + origen + ", color=" + color + '}';
    }
    
    
}

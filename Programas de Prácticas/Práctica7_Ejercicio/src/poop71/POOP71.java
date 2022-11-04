package poop71;

public class POOP71 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Actividades Práctica 07\n");
        
        Ballena bal = new Ballena();
        bal.setNombre("Palermo");
        bal.setOrigen("Rio");
        bal.setColor("Blanco");
        bal.setNumAletas(2);
        bal.setLargo(3);
        
        System.out.println("Ballena");
        System.out.println("Nombre: "+bal.getNombre()+"\nOrigen: "+bal.getOrigen()+
                "\nColor: "+bal.getColor()+"\nNumAletas: "+bal.getNumAletas()+"\nLargo: "+bal.getLargo());
        
        Perro per = new Perro();
        per.setNombre("Soponcio");
        per.setOrigen("Calle");
        per.setColor("Arcoiris");
        per.setNumPatas(4);
        per.setNumManchas(2);
        
        System.out.println("\nPerro");
        System.out.println("Nombre: "+per.getNombre()+"\nOrigen: "+per.getOrigen()+
                "\nColor: "+per.getColor()+"\nNumPatas: "+per.getNumPatas()+"\nNum Manchas: "+per.getNumManchas());
        
        Pajaro par = new Pajaro();
        par.setNombre("Rio");
        par.setOrigen("Aviario");
        par.setColor("Balenciaga");
        par.setNumAlas(2);
        par.setTipoPico("Puntiagudo");
        
        System.out.println("\nPajaro");
        System.out.println("Nombre: "+par.getNombre()+"\nOrigen: "+par.getOrigen()+
                "\nColor: "+par.getColor()+"\nNumAlas: "+par.getNumAlas()+"\nPico: "+par.getTipoPico());
    }
    
}

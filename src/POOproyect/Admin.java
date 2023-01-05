package POOproyect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Admin {

    public static void main(String[] args)  {

        int aleatorio1, aleatorio2, aleatorio3, aleatorio4;
        int edadAleatoria;
        
        String [] nombre ={ "Jose", "Andres", "Luis", "Javier", "Oscar", "Paulina", "Rosa", "Sebastian", "Arturo", "Zoe",
                "Pablo", "Ivan", "Tania", "Paola", "Ingrid", "Ezra", "Mauricio", "Saul", "Rafael", "Angeles", 
                "Ernesto", "Raul", "Thiago", "Alvaro", "Julio", "Carlos", "Adan", "Victor", "Francisco", "Izan", 
                "María", "Daniel", "Manuel", "Mateo", "Rodrigo", "Sergio", "Nicolas", "Miguel", "Samuel", "Noe",
                "Rio", "Vanessa", "Omar", "Esmeralda", "Rubi", "Zafiro", "Marco", "Maribel", "Ilse", "Carmen"};
        
        String [] apellidoPat ={"Silverio", "Garcia", "Hernandez", "Martí=inez", "Lopez", "Gonzales", "Perez", "Rodriguez", "Sanchez"
                , "Ruiz", "Esquivel", "Cruz", "Vega", "Gomez", "Spencer", "Ackerman", "Barquín", "Chaves", "Lizarraga", "Japon"
                , "De la Merced", "Ocampo", "Fernandez", "Pilar", "Zidan", "Gongora", "Forero", "Nunes", "Valdez", "Belmont", "Nava", "Urena"
                , "Ko", "Acuayte", "Muñoz", "Petit", "Puerta", "Marquez", "Cortinez", "Henao", "Estrada", "Toro", "Urena"
                , "Duque", "Lozano", "Jaramillo", "Perfecto", "Vera", "Guerra", "Pino"};
        
        String [] apellidoMat ={"Orihuela", "Llanos", "Perez", "Lopez", "Codoño", "Gallon", "Saenz", "Arroyave", "Montoya"
                , "Arango", "Beltran", "Ramirez", "Alfa", "Trasmiera", "Maldonado", "Tesafaye", "Pastor", "Caballero", "Calvo", "Crespo"
                , "Esteban", "Moreno", "Prieto", "Ibañez", "Perrer", "Alvarez", "Marin", "Molina", "Herrero", "Pascual", "Gallego", "Rubio"
                , "Suarez", "Garrido", "Navarro", "Chaparro", "Blanco", "Serrano", "Iglesias", "Sanz", "Alonso", "Martin", "Funes"
                , "Melgar", "Lujan", "Cedeño", "Dios", "Sorda", "Vital", "Garza"};

        
        ArrayList<Alumn> alumnos = new ArrayList<>();
        String[] dir = leerDirecciones();
        
        for (int i = 0; i < 500; i++) {
            edadAleatoria = (int)(Math.random()*(10)+18);
            aleatorio1 = (int) (Math.random() * 25);
            aleatorio2 = (int) (Math.random() * 25);
            aleatorio3 = (int) (Math.random() * 25);
            aleatorio4 = (int) (Math.random() * 25);
            
            Alumn alu = new Alumn();
            alu.setName(nombre[aleatorio1]);
            alu.setLname1(apellidoPat[aleatorio3]);
            alu.setLname2(apellidoMat[aleatorio4]);
            alu.setAddress(dir[i]);
            alu.setAge(edadAleatoria);
            alu.calcularNumInscri();
            alu.setAccountId((int)(Math.random()*41285389 + 2));  
            
            alumnos.add(i,alu); 
        }
        
        Turno(alumnos);

        System.out.println("\n" + "       -------> BUEN DIA Y BIENVENIDO AL SISTEMA DE ADMINISTRACION ESCOLAR <-------    " + "\n");
        int op;
        do{
            System.out.println("       PARA PODER ACCEDER AL SISTEMA, POR FAVOR, INTRODUZCA ALGUNA DE LAS OPCIONES SIGUIENTES" + "\n");
            System.out.println("       ESTUDIANTE ---------> 1");
            System.out.println("       ADMINISTRADOR ------> 2");
            System.out.println("       CERRAR -------------> 3");
            
            Scanner t = new Scanner(System.in);

            System.out.println("\n" + "OPCION: ");
            op = t.nextInt();
        
        
            switch (op) {
                case 1:             
                    CRUD a = new CRUD();
                    a.menuAlumn(alumnos);
                    break;
                case 2:  
                    CRUD c = new CRUD();
                    c.menu(alumnos);
                    break;
                default:
                    System.out.println("YA SERA PARA LA PROXIMA, NOS VEMOS :D");
                    break;
            }
        }while(op>0 && op<3);
    }
    
    private static String[] leerDirecciones(){
        String[] direcciones = new String[505];
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("direcciones.txt");
            if(archivo.ready()){
               lector = new BufferedReader(archivo); 
               String cadena;
               
               int i = 0;
               while(((cadena = lector.readLine()) != null ) && (i < 505)){ //Modificar el tamaño cuando haya mas direcciones
                   direcciones[i] = cadena;
                   i++;   
               }
            }else{
                System.out.println("El archino no se puede leer");
            }
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return direcciones;

    }
    
    private static void Turno(ArrayList<Alumn> alumno){
        float[] arrTurno = new float[alumno.size()];
        for (int i = 0; i < alumno.size(); i++) {
            arrTurno[i] = alumno.get(i).getNumInscrip();
        }
        int n = arrTurno.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arrTurno[j] > arrTurno[j + 1]) {
                    int temp = (int) arrTurno[j];
                    arrTurno[j] = arrTurno[j + 1];
                    arrTurno[j + 1] = temp;
                }
        
        for (int i = 0; i < n; i++) {
            alumno.get(i).setTurno((int) arrTurno[i]+1);
        }
    }
    
 }


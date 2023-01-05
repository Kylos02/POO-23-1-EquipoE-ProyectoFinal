package POOproyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kylos
 */
public class CRUD {
    
    public void menu(ArrayList<Alumn> alumnos){
        int op;
        do{
            System.out.println("       COMO ADMINISTRADOR, TIENES ACCESO A LAS SIGUIENTES OPCIONES");
            System.out.println("       AGREGAR NUEVO ESTUDIANTE -------> 1");
            System.out.println("       MOSTRAR ALUMNO REGISTRADO ------> 2");
            System.out.println("       ACTUALIZAR DATOS DE ESTUDIANTE -> 3");
            System.out.println("       ELIMINAR ESTUDIANTE ------------> 4");
            System.out.println("       GENERAR CSV --------------------> 5");
            System.out.println("       MOSTRAR ALUMNOS REGISTRADOS ----> 6");
            System.out.println("       SALIR --------------------------> 7");

            Scanner t = new Scanner(System.in);
            
            System.out.println("OPCION: ");
            op = t.nextInt();

            switch(op){
                case 1: 
                    insertAlumn(alumnos);
                    break; 
                case 2:
                    int pos = searchAlumn(alumnos);
                    if(pos != -1)
                        impAlumn(alumnos.get(pos));
                    else
                        System.out.println("       <-> EL NUMERO DE CUENTA INTRODUCIDO NO EXISTE <->");
                    break;
                case 3:
                    modAlumn(alumnos);
                    break;
                case 4:
                    deleteAlumn(alumnos);
                    break;
                case 5:
                    createCsv(alumnos);
                    break;
                case 6:
                    impAlumns(alumnos);
                    break;
                default:
                    System.out.println("       GRACIAS POR SU TRABAJO, NOS VEMOS ACMIN :DD");
                    break;
            }
        }while(op>0 && op<7);
    }
    
    public void insertAlumn(ArrayList<Alumn> alumnos) {
                
        int edadAleatoria;
        String dir,nombre,ap1,ap2;
        Scanner s = new Scanner(System.in);
        
        edadAleatoria = (int)(Math.random()*(10)+18);
        
        Alumn nuevoAlu = new Alumn();
        int nuevoNumCuenta = (alumnos.get(alumnos.size()-1).getAccountId())+1;
              
        System.out.println("       INGRESE EL NOMBRE DEL ALUMNO: ");
        nombre = s.nextLine();
        System.out.println("       INGRESE EL APELLIDO PATERNO DEL ALUMNO: ");
        ap1 = s.nextLine();
        System.out.println("       INGRESE EL APELLIDO MATERNO DEL ALUMNO: ");
        ap2 = s.nextLine();
        System.out.println("       INGRESE LA DIRECCION DEL ALUMNO: ");
        dir = s.nextLine();
        nuevoAlu.setName(nombre);
        nuevoAlu.setLname1(ap1);
        nuevoAlu.setLname2(ap2);
        nuevoAlu.setAddress(dir);
        nuevoAlu.setAge(edadAleatoria);
        nuevoAlu.calcularNumInscri();
        nuevoAlu.setAccountId(nuevoNumCuenta); 
        
        alumnos.add(nuevoAlu); 
        System.out.println("<----------------------------------------------------------------------------------------------------------->");
        System.out.println("    ALUMNO CREADO SATISFACTORIAMENTE:");
        impAlumn(nuevoAlu);
        
    }
    
    public void impAlumn(Alumn alu){
        
        System.out.println("<----------------------------------------------------------------------------------------------------------->");
        System.out.println("       NO. DE CUENTA: " + alu.getAccountId());
        alu.fullName();
        System.out.println("       EDAD: " + alu.getAge());
        System.out.println("       DIRECCION: " + alu.getAddress());
        System.out.println("       SEMESTRE: " + alu.getSemester());
        System.out.println("       MATERIAS ORDINARIAS: "+alu.getnAIO());
        System.out.println("       PROMEDIO: " + alu.getGrade());
        System.out.println("       NO. DE INSCRIPCION: " + alu.getNumInscrip() );
        System.out.println("       TURNO" + alu.getTurno());
        System.out.println("<----------------------------------------------------------------------------------------------------------->");
        System.out.println(alu.getListCourse());
    }

    public void impAlumns(ArrayList<Alumn> alumnos){
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("<----------------------------------------------------------------------------------------------------------->");
            System.out.println("       NO. DE CUENTA: " + alumnos.get(i).getAccountId());
            alumnos.get(i).fullName();
            System.out.println("       EDAD: " + alumnos.get(i).getAge());
            System.out.println("       DIRECCION: " + alumnos.get(i).getAddress());
            System.out.println("       SEMESTRE: " + alumnos.get(i).getSemester());
            System.out.println("       PROMEDIO: " + alumnos.get(i).getGrade());
            System.out.println("       CREDITOS: " +alumnos.get(i).getCurrentId()+ " / " +alumnos.get(i).getInitialId());
            System.out.println("       NO. DE INSCRIPCION: " + alumnos.get(i).getNumInscrip() );
            System.out.println("       TURNO:" + alumnos.get(i).getTurno());
            System.out.println("<----------------------------------------------------------------------------------------------------------->");
        }
    }
    
    public void modAlumn(ArrayList<Alumn> alumnos) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        int numListaMod;
        System.out.println("    INGRESE EL NUMERO DE CUENTA DEL ALUMNO A MODIFICAR:");
        numListaMod = s.nextInt();
        int pos = posicion(alumnos, numListaMod);
        if(pos != -1){
            String nombre;
            String ap1;
            String ap2;
            String dir;
            System.out.println("       INGRESE EL NOMBRE DEL ALUMNO");
            nombre = s1.nextLine();
            System.out.println("       INGRESE EL APELLIDO PATERNO DEL ALUMNO:");
            ap1 = s3.nextLine();
            System.out.println("       INGRESE EL APELLIDO MATERNO DEL ALUMNO: ");
            ap2 = s4.nextLine();
            System.out.println("       INGRESE LA DIRECCION DEL ALUMNO");
            dir = s5.nextLine();

            int edad = alumnos.get(pos).getAge();
            int semestre = alumnos.get(pos).getSemester();
            float promedio = alumnos.get(pos).getGrade();
            int credIngreso = alumnos.get(pos).getInitialId();
            int credActual = alumnos.get(pos).getCurrentId();
            int numAsigInscriOrdi = alumnos.get(pos).getnAIO();
            float numInscrip = alumnos.get(pos).getNumInscrip();
            float escolaridad = alumnos.get(pos).getEscolaridad();
            float velocidad = alumnos.get(pos).getVelocidad();
            int numCuenta = alumnos.get(pos).getAccountId();
            int numAsigApOrdi = alumnos.get(pos).getnAAO();
            int tur = alumnos.get(pos).getTurno();
            
            Alumn nuevoAlu = new Alumn(nombre,ap1,ap2,edad,numCuenta,quitarComasDir(dir),promedio,credIngreso,
                                    credActual,numAsigInscriOrdi,numInscrip,numAsigApOrdi,semestre,
                                    escolaridad,velocidad);
            nuevoAlu.listCs();
            alumnos.set(pos, nuevoAlu);
            impAlumn(nuevoAlu); 
        }
        else
            System.out.println("       --> EL NUMERO DE CUENTA INTRODUCIDO NO EXISTE <--");
    }

    public void deleteAlumn(ArrayList<Alumn> alumnos) {
        Scanner s = new Scanner(System.in);
        int numCuentaElim;
        System.out.println("       INGRESE EL NUMERO DE CUENTA DEL ALUMNO QUE SE VA A ELIMINAR: ");
        numCuentaElim = s.nextInt();
        int pos = posicion(alumnos, numCuentaElim);
        if(pos != -1){
            System.out.println("       BORRADO EXITOSAMENTE:");
            impAlumn(alumnos.remove(pos));
        }
        else
            System.out.println("       --> EL NUMERO DE CUENTA INTRODUCIDO NO EXISTE <--");
    }

    public void createCsv(ArrayList<Alumn> alumnos) {
        //  ========= FileWriter ========
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        try {
            FileWriter fw;
            fw = new FileWriter("listaAlumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            salida.println("No.Cuenta,Apellido P,Apellido M,Primer Nombre,Edad,Direccion,Promedio,Semestre,Creditos,"
                    + "Asignaturas inscritas en Ordi,Asignaturas aprobadas en Ordi,No. Inscripción,Velocidad,Escolaridad,Turno");
            for(int i=0;i<alumnos.size();i++){
                salida.println(""+alumnos.get(i).getAccountId()+","+alumnos.get(i).getLname1()+","+alumnos.get(i).getLname2()+
                        ","+alumnos.get(i).getName()+","+alumnos.get(i).getAge()+
                        ","+quitarComasDir(alumnos.get(i).getAddress())+","+frmt.format(alumnos.get(i).getGrade())+","+alumnos.get(i).getSemester()+
                        ","+alumnos.get(i).getCurrentId()+" de "+alumnos.get(i).getInitialId()+","+alumnos.get(i).getnAIO()+
                        ","+alumnos.get(i).getnAAO()+","+alumnos.get(i).getNumInscrip()+","+alumnos.get(i).getVelocidad()+
                        ","+alumnos.get(i).getEscolaridad() + ","+alumnos.get(i).getTurno());
            }
                        
            salida.close();
            System.out.println("<--------------> EL CSV HA SIDO GENERADO EXITOSAMENTE <-------------->");
        } catch (IOException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String quitarComasDir(String dir){
        
        String direccion = "";
        ArrayList<String> Datos = new ArrayList<>();

        StringTokenizer tokenizador = new StringTokenizer(dir,",");
        while(tokenizador.hasMoreTokens()){
            String token = tokenizador.nextToken();
            Datos.add(token);
        }
        for (int i = 0; i < Datos.size(); i++) {
            direccion += Datos.get(i);
        }
        
        return direccion;
    }
    
    public int posicion(ArrayList<Alumn> alumno, int numCuentaBuscar){
        int posicion = -1;
        for (int i = 0; i < alumno.size(); i++) {
            if (alumno.get(i).getAccountId() == numCuentaBuscar) {
                posicion = i;
            }
        }
        return posicion;
    }
    
    public int searchAlumn(ArrayList<Alumn> alumno){
        Scanner s = new Scanner(System.in);   
        int pos;
        int numCuentaBuscar;
        System.out.println("Ingresa numero de cuenta: ");
        numCuentaBuscar = s.nextInt();
        pos = posicion(alumno, numCuentaBuscar);
        
        return pos;
    }
    
    public void menuAlumn(ArrayList<Alumn> alumnos){
        int op;
        do{
            System.out.println("       COMO ALUMNO, PUEDES ESCOGER LAS SIGUIENTES OPCIONES:");
            System.out.println("       TIRA DE MATERIAS --------> 1");
            System.out.println("       HISTORIAL ACADEMICO -----> 2");
            System.out.println("       GENERAR CSV -------------> 3");
            System.out.println("       CAMBIAR DE OPCION -------> 4");

            Scanner t = new Scanner(System.in);


            System.out.println("OPCION:");
            op = t.nextInt();
       
            switch(op){
                case 1: 
                    tiraMateriaSemestral(alumnos);
                    break; 
                case 2:
                    verHistorialAcadem(alumnos);
                    break;
                case 3: 
                    createCsv(alumnos);
                    break;

                default:
                    System.out.println("       ADIOS, MUCHO EXITO <3");
                    break;
            } 
        }while(op>0 && op<4);
    }
    
    public void tiraMateriaSemestral(ArrayList<Alumn> alumnos){
        int pos = searchAlumn(alumnos);
        if(pos != -1){            
            System.out.println("-------------------------------------------------------------------------------");
            alumnos.get(pos).fullName();
            System.out.println("       CREDITOS: "+alumnos.get(pos).getCurrentId()+"/"+alumnos.get(pos).getInitialId());
            System.out.println("       SEMESTRE: "+alumnos.get(pos).getSemester());
            System.out.println("       MATERIAS INSCRITAS: "+alumnos.get(pos).getnAIO());
            System.out.println("       PROMEDIO: "+alumnos.get(pos).getGrade());
            alumnos.get(pos).impListC();
        }
        else
            System.out.println("       <-> NUMERO DE CUENTA INEXISTENTE <->");        
    }
    
    private void verHistorialAcadem(ArrayList<Alumn> alumnos){
        int pos = searchAlumn(alumnos);
        if(pos != -1)
           alumnos.get(pos).historialAcadem();
        else
            System.out.println("       <-> NUMERO DE CUENTA INEXISTENTE <->"); 
        
        
    }
    
}

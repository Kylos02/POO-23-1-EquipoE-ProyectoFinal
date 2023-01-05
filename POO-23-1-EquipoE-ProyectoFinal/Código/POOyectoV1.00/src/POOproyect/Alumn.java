package POOproyect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Alumn {
    private String name;
    private String lname1;   
    private String lname2;    
    private int age;           
    private int accountId;
    private String address;   
    private ArrayList<Course> listCourse = new ArrayList<Course>(); 
    private float grade;     
    private int initialId; 
    private int currentId;
    private int nAIO;
    private float numInscrip; 
    private int nAAO; 
    private int semester; 
    private float escolaridad=0; 
    private float velocidad=0;
    private int turno; 

    public Alumn() {
    }

    public Alumn(String name, String lname1, String lname2, int age,int accountId, String address,float grade, int initialId, int currentId, int nAIO, float numInscrip, int nAAO, int semester, float escolaridad, float velocidad, int turno) {
        this.name = name;
        this.lname1 = lname1;
        this.lname2 = lname2;
        this.age = age;
        this.accountId = accountId;
        this.address = address;
        this.grade = grade;
        this.initialId = initialId;
        this.currentId = currentId;
        this.nAIO = nAIO;
        this.numInscrip = numInscrip;
        this.nAAO = nAAO;
        this.semester = semester;
        this.escolaridad = escolaridad;
        this.velocidad = velocidad;
        this.turno = turno; 
    }

    Alumn(String nombre, String ap1, String ap2, int edad, int numCuenta, String quitarComasDir, float promedio, int credIngreso, int credActual, int numAsigInscriOrdi, float numInscrip, int numAsigApOrdi, int semestre, float escolaridad, float velocidad) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getName() {
        return name;
    }

    public String getLname1() {
        return lname1;
    }

    public String getLname2() {
        return lname2;
    }

    public int getAge() {
        return age;
    }

    public int getAccountId() {
        return accountId;
    }
    
    public String getAddress() {
        return address;
    }

    public float getGrade() {
        return grade;
    }

    public int getInitialId() {
        return initialId;
    }

    public int getCurrentId() {
        return currentId;
    }

    public int getnAIO() {
        return nAIO;
    }

    public float getNumInscrip() {
        return numInscrip;
    }

    public int getnAAO() {
        return nAAO;
    }

    public int getSemester() {
        return semester;
    }

    public float getEscolaridad() {
        return escolaridad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setLname1(String lname1) {
        this.lname1 = lname1;
    }

    public void setLname2(String lname2) {
        this.lname2 = lname2;
    }

    public void setAge(int age) {        
        this.age = age;
        setnAIO(age);        
        calcularSemestre(age);       
        listCs();                     
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void setInitialId(int initialId) {
        this.initialId = initialId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public void setnAIO(int edad) {          
        if(edad == 18){
            this.nAIO = 5;
        }
        if(edad == 19){
            int numMaterias = (int)(Math.floor(Math.random()*(10-5+1)+5));
            nAIO = numMaterias;
        }
        if(edad == 20){
            int numMaterias= (int) (Math.floor(Math.random()*(15-10+1)+10));
            nAIO = numMaterias;
        }
        if(edad == 21){
            int numMaterias= (int) (Math.floor(Math.random()*(20-15+1)+15));
            nAIO = numMaterias;
        }
        if(edad == 22){
            int numMaterias= (int) (Math.floor(Math.random()*(25-20+1)+20));
            nAIO = numMaterias;
        }
        if(edad == 23){
            int numMaterias= (int) (Math.floor(Math.random()*(30-25+1)+25));
            nAIO = numMaterias;
        }
        if(edad == 24){
            int numMaterias= (int) (Math.floor(Math.random()*(35-30+1)+30));
            nAIO = numMaterias;
        }
        if(edad == 25){
            int numMaterias= (int) (Math.floor(Math.random()*(40-35+1)+35));
            nAIO = numMaterias;
        }
        if(edad == 26){
            int numMaterias= (int) (Math.floor(Math.random()*(45-40+1)+40));
            nAIO = numMaterias;
        }
        if(edad == 27){
            int numMaterias= (int) (Math.floor(Math.random()*(50-45+1)+45));
            nAIO = numMaterias;
        }
    }
    
    public void setnAAO(int nAAO) {
        this.nAAO = nAAO;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setEscolaridad() { 
        escolaridad =((float)(nAAO)/(float)(nAIO));
        setVelocidad();  
    }

    public void setVelocidad() {
        velocidad = ((float)(currentId)/(float)(initialId));
        calcularNumInscri();
    }
    
    public void calcularNumInscri(){
        numInscrip = (float)((grade)*(escolaridad)*(velocidad));
    }
    
    public void listCs(){ 
        
        int i=0;
        int suma = 0;
        int cred = 0;
       
        try {
            FileReader fr;
            fr = new FileReader("ListaMaterias.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            
            while(linea != null  && i < (nAIO)){
                
                linea = br.readLine();
                Course materia = new Course(); //Creamos una clase Asignatura para poder guardarla
                
                int calificacion = (int) Math.floor(Math.random()*(10-5+1)+5);
                materia.setClave(101+i);
                materia.setNota(calificacion);
                suma += materia.getNota();
                
                if(materia.getNota() != 5)
                    cred += 1;
                
                materia.setNombre(linea);
                this.listCourse.add(materia);  
                
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Alumn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Alumn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        currentId = 2*cred;
        grade = (float)suma / (float)nAIO;
        nAAO = cred;
        
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        setEscolaridad();
    }
    
    public void calcularSemestre(int edad){       
        if(edad == 18){
            semester = 1;
            initialId = 2*5;
        }
        if(edad == 19){
            semester = 2;
            initialId = 2*10;
        }    
        if(edad == 20){
            semester = 3;
            initialId = 2*15;
        }
        if(edad == 21){
            semester = 4;
            initialId = 2*20;
        }
        if(edad == 22){
            semester = 5;
            initialId = 2*25;
        }
        if(edad == 23){
            semester = 6;
            initialId = 2*30;
        }
        if(edad == 24){
            semester = 7;
            initialId = 2*35;
        }
        if(edad == 25){
            semester = 8;
            initialId = 2*40;
        }
        if(edad == 26){
            semester = 9;
            initialId = 2*45;
        }
        if(edad == 27){
            semester = 10;
            initialId = 2*50;
        }
    }
    
    public void fullName(){
        System.out.println("    Nombre del alumno: " +lname1+ " " +lname2+ 
                            " " + name);
    }
    
    public ArrayList<Course> getListCourse() {
        return listCourse;
    }
    
    
    
    public void historialAcadem(){
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        System.out.println("<----------------------------------------------------------------------------->");
        fullName();
        System.out.println("    Semestre: "+getSemester());
        System.out.println("    Promedio: "+frmt.format(grade));
        System.out.println("    No. materias inscritas en Ordinario: "+getnAIO());
        System.out.println("    No. materias Aprobadas Ordinario: "+getnAAO());
        System.out.println("    Creditos: " +getCurrentId()+ " / " +getInitialId());
        System.out.println("    No. Inscripcion: "+ getNumInscrip());
        System.out.println("    Turno " + getTurno());
        System.out.println("<----------------------------------------------------------------------------->");

        for (int i = 0; i < listCourse.size(); i++) {
            System.out.print(listCourse.get(i));
        }
    }
    
        public void impListC(){
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        System.out.println("<----------------------------------------------------------------------------->");
        for (int i = (semester-1)*5; i < listCourse.size(); i++) {
            System.out.println(listCourse.get(i));
        }
        System.out.println("<----------------------------------------------------------------------------->");
        
    }
    
    @Override
    public String toString(){
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        return "-Nombre: " + name + " " + 
                " " + lname1 + " "+lname2 +
                "\n-num Cuenta: " + accountId +
                "\n-Edad: " + age + 
                "\n-Direccion: " + address + 
                "\n-Promedio: " + frmt.format(grade) + 
                "\n-Creditos de ingreso: " + initialId + 
                "\n-Creditos actuales: " + currentId + 
                "\n-numAsigInscriOrdi: " + nAIO + 
                "\n-numInscrip: " + numInscrip + 
                "\n-numAsigApOrdi: " + nAAO + 
                "\n-Semestre ideal: " + semester + 
                "\n-Escolaridad: " + escolaridad + 
                "\n-Velocidad: " + velocidad ;
    }
     
}
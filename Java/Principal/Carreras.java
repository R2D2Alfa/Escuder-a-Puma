import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;

public class Carreras {
    //Atributos
    String nombre_carrera;
    CalendarioCarreras fecha_carrera;
    Pistas pista;
    LinkedList<Escuderias> escuderias;

    //Consturctor
    public Carreras(String nombre_carrera, CalendarioCarreras fecha_carrera, Pistas pista, LinkedList<Escuderias> escuderias){
        this.nombre_carrera = nombre_carrera;
        this.fecha_carrera = fecha_carrera;
        this.pista = pista;
        this.escuderias = escuderias;
    }

    //Getters
    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public CalendarioCarreras getFecha_carrera() {
        return fecha_carrera;
    }

    public Pistas getPista() {
        return pista;
    }

    public LinkedList<Escuderias> getEscuderias() {
        return escuderias;
    }

    //Setters
    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public void setFecha_carrera(CalendarioCarreras fecha_carrera) {
        this.fecha_carrera = fecha_carrera;
    }

    public void setPista(Pistas pista) {
        this.pista = pista;
    }

    public void setEscuderias(LinkedList<Escuderias> escuderias) {
        this.escuderias = escuderias;
    }

    //Metodos adicionales
    public static Carreras crearCarrera(LinkedList<Escuderias> escuderias){
        Scanner sc = new Scanner(System.in);
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        escuderias_f1 = Iniciar.iniciarEscuderias();
        HashMap<Integer, Carreras> carreras_f1 = new HashMap<Integer, Carreras>();
        carreras_f1 = Iniciar.iniciarCampeonato(escuderias_f1);

        System.out.println("\n\t[ Creacion de la carrera ]");

        System.out.print("\nIngrese el nombre de la carrera: ");
        String nombre_carrera = sc.nextLine();

        CalendarioCarreras fecha_carrera = CalendarioCarreras.crearCalendarioCarrera(carreras_f1);

        Pistas pista = Pistas.crearPista();

        Carreras carrera = new Carreras(nombre_carrera, fecha_carrera, pista, escuderias);

        return carrera;
    }

    public static void verCarreras(HashMap<Integer, Carreras> carreras){
        
        System.out.println("\n-----------------------------------------------------------"); 

        for(int i=1; i<carreras.size(); i++){
            System.out.println("\n\t[ Carrera "+(i+1)+": "+carreras.get(i).getNombre_carrera()+" ]");

            carreras.get(i).fecha_carrera.verfechacarrera();

            System.out.println();

            carreras.get(i).pista.verPista();

            System.out.println("\n-----------------------------------------------------------"); 
        }
    }

    public static void verCarrera(Carreras carrera){
        System.out.println("\n\t[ Carrera "+carrera.getNombre_carrera()+"]");
    }
}
    
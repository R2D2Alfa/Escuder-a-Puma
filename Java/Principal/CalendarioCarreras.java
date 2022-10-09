//Ajuste para mejorar la forma de manejar las fechas
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedList;

public class CalendarioCarreras {
    //Atributos
    LocalDate fechainicio;
    LocalDate fechafinal;

    //Constructor
    public CalendarioCarreras(String fechainicio, String fechafinal){
        //Se convierte las fechas ingresadas
        LocalDate fechainicio_convert = LocalDate.parse(fechainicio);
        LocalDate fechafinal_convert = LocalDate.parse(fechafinal);

        //Se asignan las fechas convertidas en conjunto a la carrera
        this.fechainicio = fechainicio_convert;
        this.fechafinal = fechafinal_convert;
    }

    //Getters
    public LocalDate getFechainicio(){
        return fechainicio;
    }

    public LocalDate getFechafinal() {
        return fechafinal;
    }

    //Setters
    public void setFechainicio(String fechainicio) {
        LocalDate fechainicio_convert = LocalDate.parse(fechainicio);
        this.fechainicio = fechainicio_convert;
    }

    public void setFechafinal(String fechafinal) {
        LocalDate fechafinal_convert = LocalDate.parse(fechafinal);
        this.fechafinal = fechafinal_convert;
    }

    //Metodos adicionales
    public static CalendarioCarreras crearCalendarioCarrera (HashMap<Integer, Carreras> carreras_f1){
        int i;
        Scanner sc = new Scanner(System.in);
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        escuderias_f1 = Iniciar.iniciarEscuderias();
        carreras_f1 = Iniciar.iniciarCampeonato(escuderias_f1);

        System.out.println("\n\t( crea un nuevo calendario para la carrera )");

        System.out.print("\nIngrese fecha de inicio de la forma (aaaa-mm-dd): ");
        String inicio = sc.nextLine();

        System.out.print("\nIngrese fecha de fin de la forma (aaaa-mm-dd): ");
        String fin = sc.nextLine();

        CalendarioCarreras carrera_calendario = new CalendarioCarreras(inicio, fin);

        for(i=1; i<=carreras_f1.size(); i++){
            while(carreras_f1.get(i).fecha_carrera.equals(carrera_calendario)){
                System.out.println("Esa fecha ya la tiene otra carrera, ingrese una fecha valida");
                crearCalendarioCarrera(carreras_f1);
            } 
        }
        return carrera_calendario;
        
    }

    public void verfechacarrera(){
        System.out.println("\n( Fecha de la carrera )");

        System.out.println("\nInicio de la carrera: "+this.getFechainicio());

        System.out.println("\nFin de la carrera: "+this.getFechafinal());
    }
}

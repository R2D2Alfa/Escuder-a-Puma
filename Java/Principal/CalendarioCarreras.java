//Ajuste para mejorar la forma de manejar las fechas
import java.time.LocalDate;
import java.util.Scanner;

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
    public static CalendarioCarreras crearCalendarioCarrera(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t( crea un nuevo calendario para la carrera )");

        System.out.print("\nIngrese fecha de inicio de la forma (aaaa-mm-dd): ");
        String inicio = sc.nextLine();

        System.out.print("\nIngrese fecha de fin de la forma (aaaa-mm-dd): ");
        String fin = sc.nextLine();

        CalendarioCarreras carrera_calendario = new CalendarioCarreras(inicio, fin);

        return carrera_calendario;
    }

    public void verfechacarrera(){
        System.out.println("\n( Fecha de la carrera )");

        System.out.println("\nInicio de la carrera: "+this.getFechainicio());

        System.out.println("\nFin de la carrera: "+this.getFechafinal());
    }
}

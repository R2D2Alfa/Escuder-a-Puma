import java.util.Scanner;
import java.util.LinkedList;


public class Escuderias {
    //Atributos
    String nombre_escuderia;
    LinkedList<Corredores> corredores = new LinkedList<>();


    //Constructor
    public Escuderias(String nombre_escuderia, LinkedList<Corredores> corredores){
        this.nombre_escuderia = nombre_escuderia;
        this.corredores = corredores;
    }


    //Getters
    public String getNombre_escuderia() {
        return nombre_escuderia;
    }


    public LinkedList<Corredores> getCorredores() {
        return corredores;
    }


    //Setters
    public void setNombre_escuderia(String nombre_escuderia) {
        this.nombre_escuderia = nombre_escuderia;
    }


    public void setCorredores(LinkedList<Corredores> corredores) {
        this.corredores = corredores;
    }


    //Metodos adicionales
    public static Escuderias crearEscuderia(){
        System.out.println("\n\t[ Creacion de la escuderia ]");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresar el nombre de la escuderia: ");
        String nombre_escuderia = sc.nextLine();

        LinkedList<Corredores> corredores = new LinkedList<>();

        for(int i=0; i<2; i++){
            Corredores corredor = Corredores.crearCorredor();
            corredores.add(corredor);
        }

        Escuderias escuderia = new Escuderias(nombre_escuderia, corredores);

        return escuderia;
    }
}

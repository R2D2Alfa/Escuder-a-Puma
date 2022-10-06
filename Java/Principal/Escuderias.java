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
    public static Escuderias crearCorredoresEscuderia(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresar el nombre de la escuderia: ");
        String nombre_escuderia = sc.nextLine();

        LinkedList<Corredores> corredores = new LinkedList<>();

        for(int i=0; i<2; i++){  //2 Corredores en la creación de la escuderia
            System.out.println("\n\t( Creacion del corredor "+(i+1)+" )");
            Corredores corredor = Corredores.crearCorredor();
            corredores.add(corredor);
        }

        Escuderias escuderia = new Escuderias(nombre_escuderia, corredores);

        return escuderia;
    }

    public static void verCorredoresEscuderias(LinkedList<Escuderias> escuderias){
        for(int i=0; i<escuderias.size(); i++){
            System.out.println("\t[ Escuderia - "+(escuderias.get(i).getNombre_escuderia())+" ]\n");
            
            System.out.println("( Corredores )");

            for(int j=0; j<escuderias.get(i).corredores.size(); j++){
                Corredores.verInfoCorredor(escuderias.get(i).corredores.get(j));      
            }

            System.out.println("\n-----------------------------------------------------------");  
        }
    }

    public static void verEscuderias(LinkedList<Escuderias> escuderias){
        for(int i=0; i<escuderias.size(); i++){
            System.out.println("\nEscuderia "+(i+1)+": "+escuderias.get(i).getNombre_escuderia());
        }
    }
}

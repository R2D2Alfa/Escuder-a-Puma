import java.util.Scanner;


public class Corredores {
    //Atributos
    String nacionalidad;
    String nombre;
    String apellido;
    int numero;
    int peso;
    float estatura;


    //Constructor
    public Corredores(String nacionalidad, String nombre, String apellido, int numero, int peso, float estatura){
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.peso = peso;
        this.estatura = estatura;
    }


    //Getters
    public String getNacionalidad() {
        return nacionalidad;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public int getNumero() {
        return numero;
    }


    public int getPeso() {
        return peso;
    }


    public float getEstatura() {
        return estatura;
    }


    //Setters
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void setPeso(int peso) {
        this.peso = peso;
    }


    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }


    //Metodos adicionales
    public static Corredores crearCorredor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t[ Creacion del corredor ]");

        System.out.print("\nIngrese la nacionalidad del corredor: ");
        String nacionalidad = sc.nextLine();

        System.out.print("\nIngrese el nombre del corredor: ");
        String nombre = sc.nextLine();

        System.out.print("\nIngrese el apellido del corredor: ");
        String apellido = sc.nextLine();

        System.out.print("\nIngrese el numero del corredor: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("\nIngrese el peso del corredor: ");
        int peso = Integer.parseInt(sc.nextLine());

        System.out.print("\nIngrese la estatura del corredor: ");
        float estatura = Float.parseFloat(sc.nextLine());

        Corredores corredor = new Corredores(nacionalidad, nombre, apellido, numero, peso, estatura);

        return corredor;
    }
}

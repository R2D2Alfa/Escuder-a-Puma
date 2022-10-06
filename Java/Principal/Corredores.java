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

        System.out.print("\nIngrese la nacionalidad: ");
        String nacionalidad = sc.nextLine();

        System.out.print("\nIngrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("\nIngrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.print("\nIngrese el numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("\nIngrese el peso (kg): ");
        int peso = Integer.parseInt(sc.nextLine());

        System.out.print("\nIngrese la estatura (m): ");
        float estatura = Float.parseFloat(sc.nextLine());

        Corredores corredor = new Corredores(nacionalidad, nombre, apellido, numero, peso, estatura);

        return corredor;
    }

    public static void verInfoCorredor(Corredores corredor){
        System.out.println("\n"+corredor.getNumero()+" - "+corredor.getNombre()+" "+corredor.getApellido());
        System.out.println("Nacionalidad: "+corredor.getNacionalidad());
        System.out.println("Peso: "+corredor.getPeso()+" kg");
        System.out.println("Estatura: "+corredor.getEstatura()+" m");  
    }
}

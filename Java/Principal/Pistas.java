import java.util.Scanner;

public class Pistas {
    //Atributos
    String pais;
    String ciudad;
    float longitud;

    //Constructor
    public Pistas(String pais, String ciudad ,float longitud){
        this.pais = pais;
        this.ciudad = ciudad;
        this.longitud = longitud;
    }

    //Getters
    public String getPais(){
        return pais;
    }

    public String getCiudad(){
        return ciudad;
    }

    public float getLongitud(){
        return longitud;
    }

    //Setters
    public void setPais(String pais){
        this.pais = pais;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public void setLongitud(float longitud){
        this.longitud = longitud;
    }

    //Metodos adicionales
    public static Pistas crearPista(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t( Creacion de la pista )");

        System.out.print("\nIngrese el pais de la pista: ");
        String pais = sc.nextLine();

        System.out.print("\nIngrese la ciudad de la pista: ");
        String ciudad = sc.nextLine();

        System.out.print("\nIngrese la longitud que tendra la pista (en km): ");
        float longitud = Float.parseFloat(sc.nextLine());

        Pistas pista = new Pistas(pais, ciudad, longitud);

        return pista;
    }

    public void verPista(){
        System.out.println("\n( Info. Pista )");

        System.out.println("\nPais: "+this.getPais());

        System.out.println("\nCiudad: "+this.getCiudad());

        System.out.println("\nLongitud: "+this.getLongitud()+" km");
    }
}

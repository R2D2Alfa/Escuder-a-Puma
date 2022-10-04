import java.io.BufferedReader;
import java.io.FileReader;


public class LecturaArchivo {
    //Atributos
    public BufferedReader lector;  //Lee el archivo
    public String linea;  //Se recibe la linea de cada fila
    public String partes[] = null;  //Se almacena cada linea

    
    //Metodos adicionales
    public void leerArchiv(String nombreArchivo){
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo));

            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e){
            System.out.println();
        }
    }


    public void imprimirLinea(){
        for(int i=0; i<partes.length; i++){
            System.out.println(partes[i]+" | ");
        }
    }
}

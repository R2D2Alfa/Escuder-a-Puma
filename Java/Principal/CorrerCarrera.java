import java.util.*;

public class CorrerCarrera{
    //Atributos
    LinkedList<Posiciones> posiciones;
    HashMap<Integer, Carreras> carreras_f1;

    //Constructor
    public CorrerCarrera(LinkedList<Posiciones> posiciones, HashMap<Integer, Carreras> carreras_f1){
        this.posiciones = posiciones;
        this.carreras_f1 = carreras_f1;
    }

    //Getters
    LinkedList<Posiciones> getPosiciones(){
        return posiciones;
    }

    public HashMap<Integer, Carreras> getCarreras(){
        return carreras_f1;
    }

    //Setters
    public void setposiciones(LinkedList<Posiciones> posiciones){
        this.posiciones = posiciones;
    }

    public void setCarreras(HashMap<Integer, Carreras> carreras_f1){
        this.carreras_f1 = carreras_f1;
    }
}

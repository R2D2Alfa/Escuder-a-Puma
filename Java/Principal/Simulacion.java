
import java.util.*;

import javax.naming.ldap.SortKey;

import java.lang.Math;


public class Simulacion {

    public static TreeMap<Integer, Corredores> posiciones(){
        int i, j;
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        HashMap<Integer, Carreras> posicion = new HashMap<Integer, Carreras>();
        //Se inician las pistas, escuderias y carreras establecidas
        escuderias_f1 = Iniciar.iniciarEscuderias();
        LinkedList<Corredores> corredores = new LinkedList<Corredores>();
        for(i=0; i<escuderias_f1.size();i++){
            for(j=0; j<2; j++){
                corredores.add(escuderias_f1.get(i).corredores.get(j));
            }
        }
        TreeMap<Integer, Corredores> campeonato = new TreeMap<Integer, Corredores>();

        for(i=0; i<corredores.size(); i++){
            Integer random = (int)Math.floor(Math.random()*100);
            campeonato.put(random, corredores.get(i));
        }
        

        return campeonato;
    }


}


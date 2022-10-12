import java.util.*;
import javax.naming.ldap.SortKey;
import java.lang.Math;

public class Simulacion {
    //Metodo para la simulacion de las posiciones
    public static LinkedList<Posiciones> posiciones(LinkedList<Escuderias> escuderias_f1, HashMap<Integer, Carreras> carreras_f1){
        int i, j;

        HashMap<Integer, Corredores> posicion = new HashMap<Integer, Corredores>();

        LinkedList<Posiciones> posiciones = new LinkedList<Posiciones>();

        //Se inician las pistas, escuderias y carreras establecidas
        LinkedList<Corredores> corredores = new LinkedList<Corredores>();

        for(i=0; i<escuderias_f1.size();i++){
            for(j=0; j<2; j++){
                corredores.add(escuderias_f1.get(i).corredores.get(j));
            }
        }

        TreeMap<Integer, Corredores> campeonato = new TreeMap<Integer, Corredores>();

        for(i=0; i<corredores.size(); i++){
            Integer random = (int)Math.floor(Math.random()*100000);
            campeonato.put(random, corredores.get(i));
        }

        Integer[] array = new Integer[campeonato.size()];
        
        Set<Integer> keys = campeonato.keySet();
        array = keys.toArray(array);
        
        Integer a;

        for(a = 0; a<campeonato.size(); a++){
            posicion.put(a+1, campeonato.get(array[a]));
        }

        for(i = 1; i<=posicion.size(); i++){
            if(i == 1){
                Posiciones lugar1 = new Posiciones(i, posicion.get(i), 25);
                posiciones.add(lugar1);
            }
            else if(i==2){
                Posiciones lugar2 = new Posiciones(i, posicion.get(i), 18);
                posiciones.add(lugar2);
                
            }
            else if(i==3){
                Posiciones lugar3 = new Posiciones(i, posicion.get(i), 15);
                posiciones.add(lugar3);
                
            }
            else if(i==4){
                Posiciones lugar4 = new Posiciones(i, posicion.get(i), 12);
                posiciones.add(lugar4);
                
            }
            else if(i==5){
                Posiciones lugar5 = new Posiciones(i, posicion.get(i), 10);
                posiciones.add(lugar5);
                
            }
            else if(i==6){
                Posiciones lugar6 = new Posiciones(i, posicion.get(i), 8);
                posiciones.add(lugar6);
                
            }
            else if(i==7){
                Posiciones lugar7 = new Posiciones(i, posicion.get(i), 6);
                posiciones.add(lugar7);
                
            }
            else if(i==8){
                Posiciones lugar8 = new Posiciones(i, posicion.get(i), 4);
                posiciones.add(lugar8);
                
            }
            else if(i==9){
                Posiciones lugar9 = new Posiciones(i, posicion.get(i), 2);
                posiciones.add(lugar9);
                
            }
            else if(i==10){
                Posiciones lugar10 = new Posiciones(i, posicion.get(i), 1);
                posiciones.add(lugar10);
                
            }
            else{
                Posiciones lugar = new Posiciones(i, posicion.get(i), 0);
                posiciones.add(lugar);
            }
            
        }
        return posiciones;
    }

    public static LinkedList<Posiciones> posicionesFinales(LinkedList<Escuderias> escuderias_f1, HashMap<Integer, Carreras> carreras_f1, LinkedList<CorrerCarrera> campeonato){
        int i, j, k, a;
        LinkedList<Posiciones> posicionesFinales = new LinkedList<Posiciones>(); 
        HashMap<Integer, Corredores> posicion = new HashMap<Integer, Corredores>();
        LinkedList<Corredores> corredores = new LinkedList<Corredores>();
        LinkedList<Posiciones> posicionesFinalesOrdenados = new LinkedList<Posiciones>(); 

        for(i=0; i<escuderias_f1.size();i++){
            for(j=0; j<2; j++){
                corredores.add(escuderias_f1.get(i).corredores.get(j));
            }
        }

        for(i=0; i<corredores.size(); i++){
            Posiciones lugar = new Posiciones(i+1, corredores.get(i), 0);
            posicionesFinales.add(lugar);
        }
        
        for(i=0; i<carreras_f1.size(); i++){
            for(j=0; j<corredores.size(); j++){
                for(k = 0; k<corredores.size(); k++){
                    if(posicionesFinales.get(k).corredores.getApellido().equals(campeonato.get(i).posiciones.get(j).corredores.getApellido())){
                        posicionesFinales.get(k).setPuntos(campeonato.get(i).posiciones.get(j).puntos);
                    }
                }
                
            }
        }

        TreeMap<Integer, Corredores> ordenarPosiciones = new TreeMap<Integer, Corredores>();

        for(i=0; i<posicionesFinales.size(); i++){
            ordenarPosiciones.put(posicionesFinales.get(i).puntos, posicionesFinales.get(i).corredores);
        }

        Integer[] array = new Integer[ordenarPosiciones.size()];
        
        Set<Integer> keys = ordenarPosiciones.keySet();
        array = keys.toArray(array);
        

        for(a = 0; a<ordenarPosiciones.size(); a++){
            posicion.put(array[a], ordenarPosiciones.get(array[a]));
        }

        for(i=0; i<posicion.size(); i++){
            Posiciones lugar1 = new Posiciones(i+1, posicion.get(array[i]), array[i]);
            posicionesFinalesOrdenados.add(lugar1);
        }

        return posicionesFinalesOrdenados;
    }
}

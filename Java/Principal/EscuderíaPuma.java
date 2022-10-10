import java.security.Key;
import java.util.*;

import javax.security.auth.login.CredentialException;

public class EscuderíaPuma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false, salircamp = false, salirinfo = false;
    
        //Para las pistas, corredores, escuderias, carreras y campeonato de la F1
        
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        HashMap<Integer, Carreras> carreras_f1 = new HashMap<Integer, Carreras>();
        LinkedList<Posiciones> posicion = new LinkedList<Posiciones>();
        LinkedList<CorrerCarrera> campeonato = new LinkedList<CorrerCarrera>();
        //Se inician las pistas, escuderias y carreras establecidas
        escuderias_f1 = Iniciar.iniciarEscuderias();
        carreras_f1 = Iniciar.iniciarCampeonato(escuderias_f1);
        //campeonato_f1 = Iniciar.iniciarCampeonato(escuderias_f1); PENDIENTE
    
        //Inicio del menu para el simulador
        System.out.println("\t          ################# #####");
        System.out.println("\t       ################### #####");
        System.out.println("\t      #####               #####");
        System.out.println("\t     #####   ########### #####");
        System.out.println("\t    ##### ############# #####");
        System.out.println("\t   ##### #####         #####");
        System.out.println("\t  ##### #####         #####");
        System.out.println("\t ##### #####         #####");
        System.out.println("   Bienvenido al simulador de campeonatos de F1");
        System.out.println("¿Estas cansado de que siempre gane Versttapen o Hamilton?");
        System.out.println("No te preocupes, aquí hasta tu abuela puede ganar (probablemente)");
        
        //Menu principal
        while(!salir){
            System.out.println("\n\t[ Menu del simulador ]");
            System.out.println("(1) - Crear un campeonato");
            System.out.println("(2) - Iniciar una carrera");
            System.out.println("(3) - Consultar carreras anteriores");
            System.out.println("(4) - Finalizar campeonato");
            System.out.println("(5) - Ver info. General (Corredores, Escuderias, Carreras y Campeonatos)");
            System.out.println("(6) - Salir");
            System.out.print("\nSeleecione una opcion: ");
            int principal = sc.nextInt();
            
            switch (principal){
                case 1:
                    //Menu secundario
                    while(!salircamp){
                        System.out.println("\n\t[ Crear un campeonato nuevo ]");
                        System.out.println("(1) - Iniciar campeonato");
                        System.out.println("(2) - Crear corredores con escuderia");
                        System.out.println("(3) - Crear corredores en escudería existente");
                        System.out.println("(4) - Crear una carrera");
                        System.out.println("(5) - Modificar calendario de una carrera");
                        System.out.println("(6) - Salir");
                        System.out.print("\nSeleecione una opcion: ");
                        int menu_principal = sc.nextInt();
                        
                        switch (menu_principal){
                            case 1:
                                int i, x=0, j;
                                System.out.println("Aqui se hará el campeonato");
                                for(i=0; i<carreras_f1.size(); i++){
                                    while(x==0){
                                        System.out.println(" \n");
                                        System.out.println(" \n");
                                        posicion = Simulacion.posiciones(escuderias_f1, carreras_f1);
                                        CorrerCarrera carreras = new CorrerCarrera(posicion, carreras_f1);
                                        campeonato.add(carreras);
                                        System.out.println(campeonato.get(i).carreras_f1.get(i+1).getNombre_carrera());
                                        System.out.println("Fecha de inicio: " + campeonato.get(i).carreras_f1.get(i+1).getFecha_carrera().fechainicio 
                                                        +"  Fecha de cierre: " + campeonato.get(i).carreras_f1.get(i+1).getFecha_carrera().fechafinal);
                                        for(j=0; j<campeonato.get(i).posiciones.size(); j++){
                                            System.out.println(campeonato.get(i).posiciones.get(j).posicion + "  "
                                            +campeonato.get(i).posiciones.get(j).corredores.getApellido()+ " " + 
                                            campeonato.get(i).posiciones.get(j).corredores.getNombre() + " Nacionalidad: " 
                                            + campeonato.get(i).posiciones.get(j).corredores.getNacionalidad() + " Puntos: " 
                                            + campeonato.get(i).posiciones.get(j).puntos);
                                        }
                                        System.out.println(" \n");
                                        System.out.println("Si desea avanzar a la siguiente carrera ingrese un numero diferente a 0");
                                        x = sc.nextInt();
                                    }
                                    x=0;
                                }
                                
                            break;
                            case 2:
                                //Crear corredores con escuderia 
                                Escuderias nueva_escuderia = Escuderias.crearCorredoresEscuderia();
                                escuderias_f1.add(nueva_escuderia);  
                            break;
                            case 3:
                                System.out.println("Ingrese en que escudería desea crear el corredor");
                                Escuderias.verCorredoresEscuderias(escuderias_f1);
                                int nuevoCorredor = sc.nextInt();
                                Escuderias.crearCorredoresEscuderia();
                            break;
                            case 4:
                                //Crear carrera
                                int longitud;
                                Carreras carrera_nueva = Carreras.crearCarrera(escuderias_f1);
                                longitud = carreras_f1.size();
                                carreras_f1.put(longitud+1, carrera_nueva);
                            break;
                            case 5:
                                //Calendario de las carreras
                                Carreras.verCarreras(carreras_f1); 
                                
                                System.out.print("\nSeleecione una carrera para modificar su fecha: ");
                                int selec_carrera_fecha = sc.nextInt()-1;

                                System.out.println("\n-----------------------------------------------------------");

                                CalendarioCarreras nueva_fecha = CalendarioCarreras.crearCalendarioCarrera(carreras_f1);
                                carreras_f1.get(selec_carrera_fecha).setFecha_carrera(nueva_fecha);
                            break;
                            case 6:
                                //Salir
                                salircamp = true;
                            break;
                            default:    
                                System.out.println("Opción no valida, ingrese un numero del 1 al 6");
                            break;
                        }
                    }
                break;
                
                case 2:
                    //Iniciar una carrera 
                    System.out.println("\n\t[ Escuderias que participan ]");
                    
                    Escuderias.verEscuderias(escuderias_f1);
                    
                    Carreras.verCarreras(carreras_f1);
                    
                    System.out.print("\nSeleecione una carrera para iniciar: ");
                    int selec_carrera = sc.nextInt()-1;
                    
                    System.out.println("\n-----------------------------------------------------------"); 
                    
                    System.out.println("\nHa iniciado la carrera '"+carreras_f1.get(selec_carrera).getNombre_carrera()+"' buena suerte a todos :)");
                    
                    //PENDIENTE
                break;

                case 3:
                    //Consultar carreras anteriores 
                    //PENDIENTE
                break;

                case 4:
                    //Finalizar campeonato
                break;
                
                case 5:
                    //Menu secundario
                    while(!salirinfo){
                        System.out.println("\n\t[ Ver info. General ]");
                        System.out.println("(1) - Info. Corredores y escuderias designadas");
                        System.out.println("(2) - Resultados de las carreras");
                        System.out.println("(3) - Posiciones del campeonato");
                        System.out.println("(4) - Salir");
                        System.out.print("\nSeleecione una opcion: ");
                        int informacion = sc.nextInt();
                        
                        
                        switch (informacion){
                            case 1:
                                //Info. Corredores y escuderias designadas 
                                Escuderias.verCorredoresEscuderias(escuderias_f1);
                            break;

                            case 2:
                                //Resultados de las carreras
                            break;

                            case 3:
                                //Posiciones del campeonato
                            break;

                            case 4:
                                //Salir
                                salirinfo = true;
                            break;
                        }
                    }
                break;

                case 6:
                    //Salir
                    System.out.println("\n\tHasta luego :)");
                    salir = true;
                break;            
            }
        }
    }
}

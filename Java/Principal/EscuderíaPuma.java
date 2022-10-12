import java.util.*;

public class EscuderíaPuma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false, salircamp = false, salirinfo = false;
    
        //Para las pistas, corredores, escuderias, carreras y campeonato de la F1
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        HashMap<Integer, Carreras> carreras_f1 = new HashMap<Integer, Carreras>();
        LinkedList<Posiciones> posicion = new LinkedList<Posiciones>();
        LinkedList<Posiciones> posicionesFinales =new LinkedList<Posiciones>();
        LinkedList<CorrerCarrera> campeonato = new LinkedList<CorrerCarrera>();
        
        //Se inician las pistas, escuderias y carreras establecidas
        escuderias_f1 = Iniciar.iniciarEscuderias();
        carreras_f1 = Iniciar.iniciarCampeonato(escuderias_f1);
    
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
            System.out.println("(2) - Consultar carreras anteriores");
            System.out.println("(3) - Ver info. General (Corredores, Escuderias, Carreras y Campeonatos)");
            System.out.println("(4) - Salir");
            System.out.print("\nSeleecione una opcion: ");
            int principal = sc.nextInt();
            
            switch (principal){
                case 1:
                while(!salircamp){
                        //Menu secundario 
                        System.out.println("\n\t[ Crear un campeonato nuevo ]");
                        System.out.println("(1) - Iniciar campeonato");
                        System.out.println("(2) - Crear corredores con escuderia");
                        System.out.println("(3) - Crear corredor en escudería existente");
                        System.out.println("(4) - Crear una carrera");
                        System.out.println("(5) - Modificar calendario de una carrera");
                        System.out.println("(6) - Salir");
                        System.out.print("\nSeleecione una opcion: ");
                        int menu_principal = sc.nextInt();
                        
                        switch (menu_principal){
                            case 1:
                                //Iniciar campeonato
                                int i, j, avanzar_carrera=0;
                                System.out.println("\n\t[ Escuderias que participan en el campeonato ]");
                    
                                Escuderias.verEscuderias(escuderias_f1);

                                System.out.println("\n-----------------------------------------------------------");

                                System.out.println("\nHa iniciado el campeonato F1, buena suerte a todos :)");

                                for(i=0; i<carreras_f1.size(); i++){
                                    
                                    while(avanzar_carrera==0){
                                        System.out.println("\n-----------------------------------------------------------");
                            
                                        posicion = Simulacion.posiciones(escuderias_f1, carreras_f1);
                                        CorrerCarrera carreras = new CorrerCarrera(posicion, carreras_f1); 
                                        campeonato.add(carreras);

                                        System.out.println("\t[ Carrera No. "+(i+1)+" - "+campeonato.get(i).carreras_f1.get(i+1).getNombre_carrera()+" ]\n");
                                        System.out.println("Fecha de inicio: " + campeonato.get(i).carreras_f1.get(i+1).getFecha_carrera().fechainicio 
                                                        +"  Fecha de cierre: " + campeonato.get(i).carreras_f1.get(i+1).getFecha_carrera().fechafinal+"\n");
                                        System.out.println("Resultados de la carrera: \n");
                                        
                                        for(j=0; j<campeonato.get(i).posiciones.size(); j++){
                                            System.out.println(campeonato.get(i).posiciones.get(j).posicion + "  "
                                            +campeonato.get(i).posiciones.get(j).corredores.getApellido()+ " " + 
                                            campeonato.get(i).posiciones.get(j).corredores.getNombre() + " Nacionalidad: " 
                                            + campeonato.get(i).posiciones.get(j).corredores.getNacionalidad() + " Puntos: " 
                                            + campeonato.get(i).posiciones.get(j).puntos);
                                        }

                                        System.out.print("\nIngrese 1 para avanzar a la siguiente carrera: ");
                                        avanzar_carrera = sc.nextInt();
                                    }
                                    avanzar_carrera=0;
                                }
                                posicionesFinales = Simulacion.posicionesFinales(escuderias_f1, carreras_f1, campeonato);
                                System.out.println("El ganador es el que tiene mas puntos");
                                for(j=0; j<posicionesFinales.size(); j++){
                                    System.out.println(posicionesFinales.get(j).getPosicion() + " " +
                                    posicionesFinales.get(j).corredores.getNombre()+ " "+ 
                                    posicionesFinales.get(j).corredores.getApellido()+ " "+ 
                                    posicionesFinales.get(j).getPuntos());
                                }
                            break;

                            case 2:
                                //Crear corredores con escuderia 
                                Escuderias nueva_escuderia = Escuderias.crearCorredoresEscuderia();
                                escuderias_f1.add(nueva_escuderia);  
                            break;

                            case 3:
                                //Crear corredor en escudería existente 
                                Escuderias.verCorredoresEscuderias(escuderias_f1);
                                
                                System.out.print("\nIngrese en que escudería desea crear el corredor: ");
                                int corredornuevo_selec = sc.nextInt()-1;

                                Corredores corredor_nuevo = Corredores.crearCorredor();
                                escuderias_f1.get(corredornuevo_selec).corredores.add(corredor_nuevo);

                                System.out.print("\nSe ha ingresado el nuevo corredor en "+escuderias_f1.get(corredornuevo_selec).getNombre_escuderia()+"\n");
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
                    if(campeonato.size() == 0){
                        System.out.println("No se tiene registro de un campeonato, por favor inicia uno");
                        break;
                    }
                    else{
                            //Consultar carreras anteriores 
                        Carreras.verCarreras(carreras_f1);
                        System.out.print("\nIngrese la carrera por consultar: ");
                        int carrera_consulta = sc.nextInt()-1;

                        System.out.println("\nHa seleccionado la carrera '"+carreras_f1.get(carrera_consulta).getNombre_carrera()+"'");

                        System.out.println("\nResultados de la carrera: \n");

                        for(int i=0; i<campeonato.get(carrera_consulta).posiciones.size(); i++){
                            System.out.println(campeonato.get(carrera_consulta).posiciones.get(i).posicion + "  "
                            +campeonato.get(carrera_consulta).posiciones.get(i).corredores.getApellido()+ " " + 
                            campeonato.get(carrera_consulta).posiciones.get(i).corredores.getNombre() + " Nacionalidad: " 
                            + campeonato.get(carrera_consulta).posiciones.get(i).corredores.getNacionalidad() + " Puntos: " 
                            + campeonato.get(carrera_consulta).posiciones.get(i).puntos);
                        }
                    }
                    

                break;
                
                case 3:
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
                            if(campeonato.size() == 0){
                                System.out.println("No se tiene registro de un campeonato, por favor inicia uno");
                                break;
                            }
                            else{

                                //Resultados de las carreras
                                System.out.println("\nResultados de las carreras: \n");
                                
                                int i, j;
                                
                                for(i=0; i<carreras_f1.size(); i++){
                                    System.out.println("\n-----------------------------------------------------------");
                            
                                    System.out.println("\t[ Carrera No. "+(i+1)+" - "+campeonato.get(i).carreras_f1.get(i+1).getNombre_carrera()+" ]\n");
                                    System.out.println("Fecha de inicio: " + campeonato.get(i).carreras_f1.get(i+1).getFecha_carrera().fechainicio 
                                                    +"  Fecha de cierre: " + campeonato.get(i).carreras_f1.get(i+1).getFecha_carrera().fechafinal+"\n");
                                    System.out.println("Resultados de la carrera: \n");
                                        
                                    for(j=0; j<campeonato.get(i).posiciones.size(); j++){
                                        System.out.println(campeonato.get(i).posiciones.get(j).posicion + "  "
                                        +campeonato.get(i).posiciones.get(j).corredores.getApellido()+ " " + 
                                        campeonato.get(i).posiciones.get(j).corredores.getNombre() + " Nacionalidad: " 
                                        + campeonato.get(i).posiciones.get(j).corredores.getNacionalidad() + " Puntos: " 
                                        + campeonato.get(i).posiciones.get(j).puntos);
                                    }
                                }
                            }
                            break;

                            case 3:
                            if(campeonato.size() == 0){
                                System.out.println("No se tiene registro de un campeonato, por favor inicia uno");
                                break;
                            }
                            else{
                                int j;
                                posicionesFinales = Simulacion.posicionesFinales(escuderias_f1, carreras_f1, campeonato);
                                System.out.println("El ganador es el que tiene mas puntos");
                                for(j=0; j<posicionesFinales.size(); j++){
                                    System.out.println(posicionesFinales.get(j).getPosicion() + " " +
                                    posicionesFinales.get(j).corredores.getNombre()+ " "+ 
                                    posicionesFinales.get(j).corredores.getApellido()+ " "+ 
                                    posicionesFinales.get(j).getPuntos());
                                }
                            break;
                            }

                            case 4:
                                //Salir
                                salirinfo = true;
                            break;
                        }
                    }
                break;

                case 4:
                    //Salir
                    System.out.println("\n\tHasta luego :)");
                    salir = true;
                break;            
            }
        }
    }
}

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class EscuderíaPuma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false, salircamp = false, salirinfo = false;
    
        //Para las pistas, corredores, escuderias, carreras y campeonato de la F1
        LinkedList<Pistas> pistas_f1 = new LinkedList<>();
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        LinkedList<Carreras> carreras_f1 = new LinkedList<>();
        
        //Se inician las pistas, escuderias y carreras establecidas
        pistas_f1 = Iniciar.iniciarPistas();
        escuderias_f1 = Iniciar.iniciarEscuderias();
        carreras_f1 = Iniciar.iniciarCarreras(escuderias_f1);
        //campeonato_f1 = Iniciar.iniciarCampeonato(escuderias_f1); PENDIENTE
    
        //Inicio del menu para el simulador
        System.out.println("\t         ################# #####");
        System.out.println("\t      ################### #####");
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
                        System.out.println("(1) - Crear corredores con escuderia");
                        System.out.println("(2) - Crear una carrera");
                        System.out.println("(3) - Modificar calendario de una carrera");
                        System.out.println("(4) - Salir");
                        System.out.print("\nSeleecione una opcion: ");
                        int campeonato = sc.nextInt();
                        
                        switch (campeonato){
                            case 1:
                                //Crear corredores con escuderia 
                                Escuderias nueva_escuderia = Escuderias.crearCorredoresEscuderia();
                                escuderias_f1.add(nueva_escuderia);  
                            break;

                            case 2:
                                //Crear pistas
                                Carreras carrera_nueva = Carreras.crearCarrera(escuderias_f1);
                                carreras_f1.add(carrera_nueva);
                            break;

                            case 3:
                                //Calendario de las carreras
                                Carreras.verCarreras(carreras_f1); 
                                
                                System.out.print("\nSeleecione una carrera para modificar su fecha: ");
                                int selec_carrera_fecha = sc.nextInt()-1;

                                System.out.println("\n-----------------------------------------------------------");

                                CalendarioCarreras nueva_fecha = CalendarioCarreras.crearCalendarioCarrera();
                                carreras_f1.get(selec_carrera_fecha).setFecha_carrera(nueva_fecha);
                            break;

                            case 4:
                                //Salir
                                salircamp = true;
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

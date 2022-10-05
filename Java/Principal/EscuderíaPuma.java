import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;


public class EscuderíaPuma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false, salircamp = false, salirinfo = false;
        int principal, campeonato, informacion, corredor_escuderia, selec_escuderia; 


        //Para las pistas, corredores, escuderias, carreras y campeonato de la F1
        LinkedList<Pistas> pistas_f1 = new LinkedList<>();
        LinkedList<Corredores> corredores_f1 = new LinkedList<>();
        LinkedList<Escuderias> escuderias_f1 = new LinkedList<>();
        Map<Integer, Carreras> campeonato_f1 = new HashMap<Integer, Carreras>();


        //Se inician las pistas, escuderias y carreras
        pistas_f1 = Iniciar.iniciarPistas();
        escuderias_f1 = Iniciar.iniciarEscuderias();
        campeonato_f1 = Iniciar.iniciarCampeonato(escuderias_f1);
    

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
            System.out.println("(1) - Crear un campeonato nuevo");
            System.out.println("(2) - Finalizar campeonato");
            System.out.println("(3) - Ver info. General (Corredores, Escuderias, Carreras y Campeonatos)");
            System.out.println("(4) - Salir");
            System.out.print("\nSeleecione una opcion: ");
            principal = Integer.parseInt(sc.nextLine());
            
            
            switch (principal){
                case 1:
                    //Menu secundario
                    while(!salircamp){
                        System.out.println("\n\t[ Crear un campeonato nuevo ]");
                        System.out.println("(1) - Crear corredores con escuderia");
                        System.out.println("(2) - Crear pista");
                        System.out.println("(3) - Crear calendario de las carreras");
                        System.out.println("(4) - Salir");
                        System.out.print("\nSeleecione una opcion: ");
                        campeonato = Integer.parseInt(sc.nextLine());
                        
                        
                        switch (campeonato){
                            case 1:
                                System.out.println("\n\t[ Crear corredores con escuderia ]");
                                Escuderias nueva_escuderia = Escuderias.crearEscuderia();
                                escuderias_f1.add(nueva_escuderia);  
                            break;


                            case 2:
                                System.out.println("\n\t[ Crear pistas ]");
                                Pistas nueva_pista = Pistas.crearPista();
                                pistas_f1.add(nueva_pista);
                            break;


                            case 3:
                                System.out.println("\n\t[ Calendario de las carreras ]");
                            break;


                            case 4:
                                salircamp = true;
                            break;
                        }
                    }
                break;
                

                case 2:
                    System.out.println("\n\t[ Finalizar campeonato ]");
                    
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
                        informacion = Integer.parseInt(sc.nextLine());
                        
                        
                        switch (informacion){
                            case 1:
                                System.out.println("\n\t[ Info. Corredores y escuderias designadas ]\n");
                                Escuderias.verCorredoresEscuderias(escuderias_f1);
                            break;


                            case 2:
                                System.out.println("\n\t[ Resultados de las carreras ]");
                            break;


                            case 3:
                                System.out.println("\n\t[ Posiciones del campeonato ]");
                            break;


                            case 4:
                                salirinfo = true;
                            break;
                        }
                    }
                break;


                case 4:
                    System.out.println("\n\tHasta luego :)");
                    salir = true;
                break;            
            
            }
        }
    }
}

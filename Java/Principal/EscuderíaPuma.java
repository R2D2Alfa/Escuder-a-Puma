import java.util.ArrayList;
import java.util.Scanner;


public class EscuderíaPuma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false, salircamp = false;


        int principal, campeonato; 
        ArrayList<Pistas> pistas = new ArrayList<>();
        ArrayList<Corredores> corredores = new ArrayList<>();


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
        
        
        while(!salir){
            System.out.println("\n\t[ Menu del simulador ]");
            System.out.println("(1) - Crear un campeonato nuevo");
            System.out.println("(2) - Ver pilotos actuales y campeonatos anteriores");
            System.out.println("(3) - Salir");
            System.out.print("\nSeleecione una opcion: ");
            principal = sc.nextInt();
            
            
            switch (principal){
                case 1:
                    while(!salircamp){
                        System.out.println("\n\t[ Crear un campeonato nuevo ]");
                        System.out.println("(1) - Empezar campeonato");
                        System.out.println("(2) - Crear corredores");
                        System.out.println("(3) - Crear pistas");
                        System.out.println("(4) - Salir");
                        System.out.print("\nSeleecione una opcion: ");
                        campeonato = sc.nextInt();
                        
                        
                        switch (campeonato){
                            case 1:
                                System.out.println("\n\t[ Empezar campeonato ]");
                                
                            break;


                            case 2:
                                System.out.println("\n\t[ Crear corredores ]");
                                Corredores corredor = Corredores.crearCorredor();
                                corredores.add(corredor);
                            break;


                            case 3:
                                System.out.println("\n\t[ Crear pistas ]");
                                Pistas nueva_pista = Pistas.crearPista();
                                pistas.add(nueva_pista);
                            break;


                            case 4:
                                salircamp = true;
                            break;
                        }
                    }
                break;


                case 2:
                    System.out.println("\n\t[ Ver pilotos actuales y campeonatos anteriores ]");
                break;


                case 3:
                    System.out.println("\n\tHasta luego :)");
                    salir = true;
                break;
            }
        }
    }
}

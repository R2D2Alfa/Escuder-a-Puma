
import java.util.Scanner;

public class EscuderíaPuma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean salir = false, salircamp = false;
        int principal, campeonato; 
        System.out.println("         ################# #####");
        System.out.println("      ################### #####");
        System.out.println("     #####               #####");
        System.out.println("    #####   ########### #####");
        System.out.println("   ##### ############# #####");
        System.out.println("  ##### #####         #####");
        System.out.println(" ##### #####         #####");
        System.out.println("##### #####         #####");
        System.out.println("Bienvenido al simulador de campeonatos de F1");
        System.out.println("¿Estas cansado de que siempre gane Versttapen o Hamilton?");
        System.out.println("No te preocupes, aquí hasta tu abuela puede ganar (probablemente)");
        while(!salir){
            System.out.println("Seleccione una opción");
            System.out.println("1.- Crear un campeonato nuevo");
            System.out.println("2.- Ver pilotos actuales y campeonatos anteriores");
            System.out.println("3.- Salir");
            principal = sc.nextInt();
            switch (principal){
                case 1:
                    while(!salircamp){
                        System.out.println("Seleccione una opción");
                        System.out.println("1.- Empezar campeonato");
                        System.out.println("2.- Crear corredores");
                        System.out.println("3.- Crear pistas");
                        System.out.println("4.- Salir");
                        campeonato = sc.nextInt();
                        switch (campeonato){
                            case 1:
                                
                            break;
                            case 2:

                            break;
                            case 3:

                            break;
                            case 4:

                            break;
                        }
                    }
                break;
                case 2:
                    System.out.println("4.- Salir");
                break;
                case 3:
                    salir = true;
                break;
            }
        }
            


    }

}

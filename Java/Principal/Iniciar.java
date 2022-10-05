import java.util.ArrayList;
import java.util.LinkedList;


public class Iniciar {


    public static void iniciarPistas(){
        ArrayList<Pistas> pistas = new ArrayList<>();
        //Creación de pistas
        
        //1. Bahrein
            Pistas Bahrein = new Pistas("Bahrein", "Sakhir", 5412f);
            pistas.add(Bahrein);


        //2. Arabia Saudita
            Pistas Arabia = new Pistas("Arabia Saudita", "Yeda", 6175f);
            pistas.add(Arabia);


        //3. Australia
            Pistas Australia = new Pistas("Australia", "Melbourne", 5303f);
            pistas.add(Australia);


        //4. Italia
            Pistas Emilia = new Pistas("Italia", "Imola", 4908f);
            pistas.add(Emilia);


        //5. Estados Unidos
            Pistas Miami = new Pistas("Estados Unidos", "Miami", 5410f);
            pistas.add(Miami);


        //6. España
            Pistas España = new Pistas("España", "Barcelona", 5655f);
            pistas.add(España);


        //7. Mónaco
            Pistas Monaco = new Pistas("Monaco", "Monaco", 4655f);
            pistas.add(Monaco);


        //8. Azerbaiyán
            Pistas Azerbaiyan = new Pistas("Azerbaiyan", "Baku", 6003f);
            pistas.add(Azerbaiyan);


        //9. Canada
            Pistas Canada = new Pistas("Canada", "Montreal", 4361f);
            pistas.add(Canada);


        //10. Gran Bretaña
            Pistas Gb = new Pistas("Gran Bretaña", "Silverstone", 5891f);
            pistas.add(Gb);


        //11. Austria
            Pistas Austria = new Pistas("Austria", "Knittelfeld", 4326f);
            pistas.add(Austria);


        //12. Francia
            Pistas Francia = new Pistas("Francia", "Le Castellet", 5842f);
            pistas.add(Francia);


        //13. Hungria
            Pistas Hungria = new Pistas("Hungria", "Budapest", 4381f);
            pistas.add(Hungria);


        //14. Bélgica
            Pistas Belgica = new Pistas("Belgica", "Spa-Francorchamps", 7000.4f);
            pistas.add(Belgica);


        //15. Paises Bajos
            Pistas Holanda = new Pistas("Paises Bajos", "Zandvoort", 4259f);
            pistas.add(Holanda);


        //16. Italia
            Pistas Italia = new Pistas("Italia", "Monza", 5793f);
            pistas.add(Italia);


        //17. Singapur
            Pistas Singapur = new Pistas("Singapur", "ingapur", 5073f);
            pistas.add(Singapur);


        //18. Japon
            Pistas Japon = new Pistas("Japon", "Suzaka", 5807f);
            pistas.add(Japon);


        //19. Estados Unidos
            Pistas Eu = new Pistas("Estados Unidos", "Austin", 5513f);
            pistas.add(Eu);


        //20. Mexico
            Pistas Mexico = new Pistas("Mexico", "Ciudad de Mexico", 4421f);
            pistas.add(Mexico);


        //21. Brasil
            Pistas Brasil = new Pistas("Brasil", "Sao Paulo", 4309f);
            pistas.add(Brasil);


        //22. Abu Dhabi
            Pistas Ea = new Pistas("Emiratos Arabes Unidos", "Abu Dhabi", 5524f);
            pistas.add(Ea);
    }


    public static void iniciarEscuderias(){

        //Creación de corredores por escuderias
        
        //Escuderia Williams
        LinkedList<Corredores> corredores_williams = new LinkedList<Corredores>();
        
        Corredores williams_1 = new Corredores("Paises Bajos", "Nyck", "Vries", 45, 75, 1.74f);
        Corredores williams_2 = new Corredores("Tailandia", "Alexander", "Albon", 23, 74, 1.86f);   

        Escuderias escuderia_williams = new Escuderias("Williams", corredores_williams);


        //Escuderia Mercedes
        LinkedList<Corredores> corredores_mercedes = new LinkedList<Corredores>();

        Corredores mercedes_1 = new Corredores("Gran Bretaña", "Lewis","Hamilton", 44, 68, 1.74f);
        Corredores mercedes_2 = new Corredores("Gran Bretaña", "George","Rusell", 63, 70, 1.85f);

        Escuderias escuderia_mercedes = new Escuderias("Mercedes", corredores_mercedes);


        //Escuderia Red Bull
        LinkedList<Corredores> corredores_redbull = new LinkedList<Corredores>();

        Corredores redbull_1 = new Corredores("Paises Bajos", "Max", "Verstappen", 1, 67, 1.80f);
        Corredores redbull_2 = new Corredores("Mexico", "Sergio", "Pérez", 11, 64, 1.73f);

        Escuderias escuderia_redbull = new Escuderias("Redbull", corredores_redbull);


        //Escuderia Ferrari
        LinkedList<Corredores> corredores_ferrari = new LinkedList<Corredores>();

        Corredores ferrari_1 = new Corredores("Monaco", "Charles", "Leclerc", 16, 65, 1.80f);
        Corredores ferrari_2 = new Corredores("España", "Carlos","Sainz", 55, 66, 1.77f);

        Escuderias escuderia_ferrari = new Escuderias("Ferrari", corredores_ferrari);


        //Escuderia McLaren
        LinkedList<Corredores> corredores_mclaren = new LinkedList<Corredores>();

        Corredores mclaren_1 = new Corredores("Gran Bretaña", "Lando", "Norris", 4, 68, 1.70f);
        Corredores mclaren_2 = new Corredores("Australia", "Daniel", "Ricciardo", 3, 71, 1.80f);

        Escuderias escuderia_mclaren = new Escuderias("Mclaren", corredores_mclaren);


        //Escuderia Alpine
        LinkedList<Corredores> corredores_alpine = new LinkedList<Corredores>();

        Corredores alpine_1 = new Corredores("Francia", "Esteban", "Ocon", 31, 66, 1.86f);
        Corredores alpine_2 = new Corredores("España", "Fernando", "Alonso", 14, 68, 1.71f);

        Escuderias escuderia_alpine = new Escuderias("Alpine", corredores_alpine);


        //Escuderia Alpha Tauri
        LinkedList<Corredores> corredores_alphatauri = new LinkedList<Corredores>();

        Corredores alphatauri_1 = new Corredores("Francia", "Pierre", "Gasly", 10, 70, 1.77f);
        Corredores alphatauri_2 = new Corredores("Japon", "Yuki", "Tsunoda", 22, 54, 1.59f);

        Escuderias escuderia_alphatauri = new Escuderias("AlphaTauri", corredores_alphatauri);


        //Escuderia Aston Martin
        LinkedList<Corredores> corredores_astonmartin = new LinkedList<Corredores>();
        
        Corredores astonmartin_1 = new Corredores("Canada", "Lance", "Stroll", 18, 70, 1.82f);
        Corredores astonmartin_2 = new Corredores("Alemania", "Sebastian", "Vettel", 5, 64, 1.74f);

        Escuderias escuderia_astonmartin = new Escuderias("Aston Martin", corredores_astonmartin);


        //Escuderia Alfa Romeo
        LinkedList<Corredores> corredores_alfaromeo = new LinkedList<Corredores>();

        Corredores alfaromeo_1 = new Corredores("Finlandia", "Valtteri", "Bottas", 77, 70, 1.73f);
        Corredores alfaromeo_2 = new Corredores("China", "Guanyu", "Zhou", 24, 63, 1.75f);

        Escuderias escuderia_alfaromeo = new Escuderias("Alfa Romeo", corredores_alfaromeo);


        //Escuderia Haas
        LinkedList<Corredores> corredores_haas = new LinkedList<Corredores>();

        Corredores haas_1 = new Corredores("Alemania", "Mick", "Schumacher", 47, 67, 1.76f);
        Corredores haas_2 = new Corredores("Dinamarca", "Kevin", "Magnussen", 20, 68, 1.74f);

        Escuderias escuderia_haas = new Escuderias("Haas", corredores_haas);
        
    }
}

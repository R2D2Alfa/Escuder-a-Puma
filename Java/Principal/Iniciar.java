import java.util.ArrayList;
import java.util.HashSet;

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

    public static void iniciarCorredores(){

        //Creación de corredores por escuderias
        
        //Escuderia Williams
        HashSet<Corredores> escuderia_williams = new HashSet<Corredores>();
        
        Corredores williams_1 = new Corredores("Paises Bajos", "Nyck", "Vries", 45, 75, 1.74f);
        Corredores williams_2 = new Corredores("Tailandia", "Alexander", "Albon", 23, 74, 1.86f);
        
        escuderia_williams.add(williams_1);
        escuderia_williams.add(williams_2);


        //Escuderia Mercedes
        HashSet<Corredores> escuderia_mercedes = new HashSet<Corredores>();

        Corredores mercedes_1 = new Corredores("Gran Bretaña", "Lewis","Hamilton", 44, 68, 1.74f);
        Corredores mercedes_2 = new Corredores("Gran Bretaña", "George","Rusell", 63, 70, 1.85f);

        escuderia_mercedes.add(mercedes_1);
        escuderia_mercedes.add(mercedes_2);


        //Escuderia Red Bull
        HashSet<Corredores> escuderia_redbull = new HashSet<Corredores>();

        Corredores redbull_1 = new Corredores("Paises Bajos", "Max", "Verstappen", 1, 67, 1.80f);
        Corredores redbull_2 = new Corredores("Mexico", "Sergio", "Pérez", 11, 64, 1.73f);

        escuderia_redbull.add(redbull_1);
        escuderia_redbull.add(redbull_2);


        //Escuderia Ferrari
        HashSet<Corredores> escuderia_ferrari = new HashSet<Corredores>();

        Corredores ferrari_1 = new Corredores("Monaco", "Charles", "Leclerc", 16, 65, 1.80f);
        Corredores ferrari_2 = new Corredores("España", "Carlos","Sainz", 55, 66, 1.77f);

        escuderia_ferrari.add(ferrari_1);
        escuderia_ferrari.add(ferrari_2);


        //Escuderia McLaren
        HashSet<Corredores> escuderia_mclaren = new HashSet<Corredores>();

        Corredores mclaren_1 = new Corredores("Gran Bretaña", "Lando", "Norris", 4, 68, 1.70f);
        Corredores mclaren_2 = new Corredores("Australia", "Daniel", "Ricciardo", 3, 71, 1.80f);

        escuderia_mclaren.add(mclaren_1);
        escuderia_mclaren.add(mclaren_2);


        //Escuderia Alpine
        HashSet<Corredores> escuderia_alpine = new HashSet<Corredores>();

        Corredores alpine_1 = new Corredores("Francia", "Esteban", "Ocon", 31, 66, 1.86f);
        Corredores alpine_2 = new Corredores("España", "Fernando", "Alonso", 14, 68, 1.71f);

        escuderia_alpine.add(alpine_1);
        escuderia_alpine.add(alpine_2);


        //Escuderia Alpha Tauri
        HashSet<Corredores> escuderia_alphatauri = new HashSet<Corredores>();

        Corredores alphatauri_1 = new Corredores("Francia", "Pierre", "Gasly", 10, 70, 1.77f);
        Corredores alphatauri_2 = new Corredores("Japon", "Yuki", "Tsunoda", 22, 54, 1.59f);

        escuderia_alphatauri.add(alphatauri_1);
        escuderia_alphatauri.add(alphatauri_2);


        //Escuderia Aston Martin
        HashSet<Corredores> escuderia_astonmartin = new HashSet<Corredores>();
        
        Corredores astonmartin_1 = new Corredores("Canada", "Lance", "Stroll", 18, 70, 1.82f);
        Corredores astonmartin_2 = new Corredores("Alemania", "Sebastian", "Vettel", 5, 64, 1.74f);

        escuderia_astonmartin.add(astonmartin_1);
        escuderia_astonmartin.add(astonmartin_2);


        //Escuderia Alfa Romeo
        HashSet<Corredores> escuderia_alfaromeo = new HashSet<Corredores>();

        Corredores alfaromeo_1 = new Corredores("Finlandia", "Valtteri", "Bottas", 77, 70, 1.73f);
        Corredores alfaromeo_2 = new Corredores("China", "Guanyu", "Zhou", 24, 63, 1.75f);

        escuderia_alfaromeo.add(alfaromeo_1);
        escuderia_alfaromeo.add(alfaromeo_2);


        //Escuderia Haas
        HashSet<Corredores> escuderia_haas = new HashSet<Corredores>();

        Corredores haas_1 = new Corredores("Alemania", "Mick", "Schumacher", 47, 67, 1.76f);
        Corredores haas_2 = new Corredores("Dinamarca", "Kevin", "Magnussen", 20, 68, 1.74f);

        escuderia_haas.add(haas_1);
        escuderia_haas.add(haas_2);
    }
}

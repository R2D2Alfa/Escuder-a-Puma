import java.util.*;


public class Iniciar {
    //Para iniciar las pistas preestablecidas
    public static LinkedList<Pistas> iniciarPistas(){
        LinkedList<Pistas> pistas = new LinkedList<>();
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

        return pistas;
    }


    //Para iniciar las escuderias preestablecidas
    public static LinkedList<Escuderias> iniciarEscuderias(){
        //Lista que contendra a las escuderias con sus corredores
        LinkedList<Escuderias> escuderiasf1 = new LinkedList<Escuderias>();

        //Creación de corredores por escuderias
        //Escuderia Williams
        LinkedList<Corredores> corredores_williams = new LinkedList<Corredores>();
        
        Corredores williams_1 = new Corredores("Paises Bajos", "Nyck", "Vries", 45, 75, 1.74f);
        Corredores williams_2 = new Corredores("Tailandia", "Alexander", "Albon", 23, 74, 1.86f);

        corredores_williams.add(williams_1);
        corredores_williams.add(williams_2);
        
        Escuderias escuderia_williams = new Escuderias("Williams", corredores_williams);
        
        escuderiasf1.add(escuderia_williams);


        //Escuderia Mercedes
        LinkedList<Corredores> corredores_mercedes = new LinkedList<Corredores>();

        Corredores mercedes_1 = new Corredores("Gran Bretaña", "Lewis","Hamilton", 44, 68, 1.74f);
        Corredores mercedes_2 = new Corredores("Gran Bretaña", "George","Rusell", 63, 70, 1.85f);

        corredores_mercedes.add(mercedes_1);
        corredores_mercedes.add(mercedes_2);

        Escuderias escuderia_mercedes = new Escuderias("Mercedes", corredores_mercedes);

        escuderiasf1.add(escuderia_mercedes);


        //Escuderia Red Bull
        LinkedList<Corredores> corredores_redbull = new LinkedList<Corredores>();

        Corredores redbull_1 = new Corredores("Paises Bajos", "Max", "Verstappen", 1, 67, 1.80f);
        Corredores redbull_2 = new Corredores("Mexico", "Sergio", "Pérez", 11, 64, 1.73f);

        corredores_redbull.add(redbull_1);
        corredores_redbull.add(redbull_2);

        Escuderias escuderia_redbull = new Escuderias("Redbull", corredores_redbull);

        escuderiasf1.add(escuderia_redbull);


        //Escuderia Ferrari
        LinkedList<Corredores> corredores_ferrari = new LinkedList<Corredores>();

        Corredores ferrari_1 = new Corredores("Monaco", "Charles", "Leclerc", 16, 65, 1.80f);
        Corredores ferrari_2 = new Corredores("España", "Carlos","Sainz", 55, 66, 1.77f);

        corredores_ferrari.add(ferrari_1);
        corredores_ferrari.add(ferrari_2);

        Escuderias escuderia_ferrari = new Escuderias("Ferrari", corredores_ferrari);

        escuderiasf1.add(escuderia_ferrari);


        //Escuderia McLaren
        LinkedList<Corredores> corredores_mclaren = new LinkedList<Corredores>();

        Corredores mclaren_1 = new Corredores("Gran Bretaña", "Lando", "Norris", 4, 68, 1.70f);
        Corredores mclaren_2 = new Corredores("Australia", "Daniel", "Ricciardo", 3, 71, 1.80f);

        corredores_mclaren.add(mclaren_1);
        corredores_mclaren.add(mclaren_2);

        Escuderias escuderia_mclaren = new Escuderias("Mclaren", corredores_mclaren);

        escuderiasf1.add(escuderia_mclaren);


        //Escuderia Alpine
        LinkedList<Corredores> corredores_alpine = new LinkedList<Corredores>();

        Corredores alpine_1 = new Corredores("Francia", "Esteban", "Ocon", 31, 66, 1.86f);
        Corredores alpine_2 = new Corredores("España", "Fernando", "Alonso", 14, 68, 1.71f);

        corredores_alpine.add(alpine_1);
        corredores_alpine.add(alpine_2);

        Escuderias escuderia_alpine = new Escuderias("Alpine", corredores_alpine);

        escuderiasf1.add(escuderia_alpine);


        //Escuderia Alpha Tauri
        LinkedList<Corredores> corredores_alphatauri = new LinkedList<Corredores>();

        Corredores alphatauri_1 = new Corredores("Francia", "Pierre", "Gasly", 10, 70, 1.77f);
        Corredores alphatauri_2 = new Corredores("Japon", "Yuki", "Tsunoda", 22, 54, 1.59f);

        corredores_alphatauri.add(alphatauri_1);
        corredores_alphatauri.add(alphatauri_2);

        Escuderias escuderia_alphatauri = new Escuderias("AlphaTauri", corredores_alphatauri);

        escuderiasf1.add(escuderia_alphatauri);


        //Escuderia Aston Martin
        LinkedList<Corredores> corredores_astonmartin = new LinkedList<Corredores>();
        
        Corredores astonmartin_1 = new Corredores("Canada", "Lance", "Stroll", 18, 70, 1.82f);
        Corredores astonmartin_2 = new Corredores("Alemania", "Sebastian", "Vettel", 5, 64, 1.74f);

        corredores_astonmartin.add(astonmartin_1);
        corredores_astonmartin.add(astonmartin_2);

        Escuderias escuderia_astonmartin = new Escuderias("Aston Martin", corredores_astonmartin);

        escuderiasf1.add(escuderia_astonmartin);


        //Escuderia Alfa Romeo
        LinkedList<Corredores> corredores_alfaromeo = new LinkedList<Corredores>();

        Corredores alfaromeo_1 = new Corredores("Finlandia", "Valtteri", "Bottas", 77, 70, 1.73f);
        Corredores alfaromeo_2 = new Corredores("China", "Guanyu", "Zhou", 24, 63, 1.75f);

        corredores_alfaromeo.add(alfaromeo_1);
        corredores_alfaromeo.add(alfaromeo_2);

        Escuderias escuderia_alfaromeo = new Escuderias("Alfa Romeo", corredores_alfaromeo);

        escuderiasf1.add(escuderia_alfaromeo);


        //Escuderia Haas
        LinkedList<Corredores> corredores_haas = new LinkedList<Corredores>();

        Corredores haas_1 = new Corredores("Alemania", "Mick", "Schumacher", 47, 67, 1.76f);
        Corredores haas_2 = new Corredores("Dinamarca", "Kevin", "Magnussen", 20, 68, 1.74f);

        corredores_haas.add(haas_1);
        corredores_haas.add(haas_2);

        Escuderias escuderia_haas = new Escuderias("Haas", corredores_haas);

        escuderiasf1.add(escuderia_haas);

        return escuderiasf1;
    }


    //Para inciar un campeonato preestablecido
    public static HashMap<Integer, Carreras> iniciarCampeonato(LinkedList<Escuderias> escuderias){
        //Mapa donde se contendra cada una de las carreras para el campeonato
        HashMap<Integer, Carreras> campeonato = new HashMap<Integer, Carreras>();
        

        //1.- Bahrein
        Pistas Bahrein = new Pistas("Bahrein", "Sakhir", 5412f);
        CalendarioCarreras fecha_Bahrain = new CalendarioCarreras("2022-03-18", "2022-03-20");
        Carreras bahrain_GP = new Carreras("Gulf Air Bahrein GP", fecha_Bahrain, Bahrein, escuderias);
        campeonato.put(1, bahrain_GP);


        //2.- Arabian
        Pistas Arabia = new Pistas("Arabia Saudita", "Yeda", 6175f);
        CalendarioCarreras fecha_ArabiaSaudi = new CalendarioCarreras("2022-03-25", "2022-03-27");
        Carreras arabiaSaudi_GP = new Carreras("STC Saudi Arabian GP", fecha_ArabiaSaudi, Arabia, escuderias);
        campeonato.put(2, arabiaSaudi_GP);


        //3.- Australia
        Pistas Australia = new Pistas("Australia", "Melbourne", 5303f);
        CalendarioCarreras fecha_Australia = new CalendarioCarreras("2022-04-08", "2022-04-10");
        Carreras australia_GP = new Carreras("Heineken Australian GP", fecha_Australia, Australia, escuderias);
        campeonato.put(3, australia_GP);


        //4.- Italia (Imola)
        Pistas Emilia = new Pistas("Italia", "Imola", 4908f);
        CalendarioCarreras fecha_Emilia = new CalendarioCarreras("2022-04-22", "2022-04-24");
        Carreras emilia_GP = new Carreras("Rolex Emilia Romagna GP", fecha_Emilia, Emilia, escuderias);
        campeonato.put(4, emilia_GP);


        //5 .- Estados Unidos (Miami)
        Pistas Miami = new Pistas("Estados Unidos", "Miami", 5410f);
        CalendarioCarreras fecha_Miami = new CalendarioCarreras("2022-05-06", "2022-05-06");
        Carreras miami_GP = new Carreras("Crypto.com Miami GP", fecha_Miami, Miami, escuderias);
        campeonato.put(5, miami_GP);


        //6.- España
        Pistas España = new Pistas("España", "Barcelona", 5655f);
        CalendarioCarreras fecha_España = new CalendarioCarreras("2022-05-20", "2022-05-22");
        Carreras españa_GP = new Carreras("Pirelli Spanish GP", fecha_España, España, escuderias);
        campeonato.put(6, españa_GP);


        //7.- Monaco
        Pistas Monaco = new Pistas("Monaco", "Monaco", 4655f);
        CalendarioCarreras fecha_Monaco = new CalendarioCarreras("2022-05-27", "2022-05-29");
        Carreras monaco_GP = new Carreras("GP de Monaco", fecha_Monaco, Monaco, escuderias);
        campeonato.put(7, monaco_GP);


        //8.- Azerbaiyán
        Pistas Azerbaiyan = new Pistas("Azerbaiyan", "Baku", 6003f);
        CalendarioCarreras fecha_Azerbaiyan = new CalendarioCarreras("2022-06-10", "2022-06-12");
        Carreras azerbaiyan_GP = new Carreras("GP de Azerbaiyan", fecha_Azerbaiyan, Azerbaiyan, escuderias);
        campeonato.put(8, azerbaiyan_GP);


        //9.- Canada
        Pistas Canada = new Pistas("Canada", "Montreal", 4361f);
        CalendarioCarreras fecha_Canada = new CalendarioCarreras("2022-06-17", "2022-06-19");
        Carreras canada_GP = new Carreras("AWS Canada GP", fecha_Canada, Canada, escuderias);
        campeonato.put(9, canada_GP);


        //10.- Gran Bretaña
        Pistas Gb = new Pistas("Gran Bretaña", "Silverstone", 5891f);
        CalendarioCarreras fecha_Inglaterra = new CalendarioCarreras("2022-07-10", "2022-07-12");
        Carreras inglaterra_GP = new Carreras("Lenovo British GP", fecha_Inglaterra, Gb, escuderias);
        campeonato.put(10, inglaterra_GP);


        //11.- Austria
        Pistas Austria = new Pistas("Austria", "Knittelfeld", 4326f);
        CalendarioCarreras fecha_Austria = new CalendarioCarreras("2022-07-22", "2022-07-24");
        Carreras austria_GP = new Carreras("Austrian GP", fecha_Austria, Austria, escuderias);
        campeonato.put(11, austria_GP);


        //12.- Francia
        Pistas Francia = new Pistas("Francia", "Le Castellet", 5842f);
        CalendarioCarreras fecha_Hungria = new CalendarioCarreras("2022-07-29", "2022-07-31");
        Carreras hungria_GP = new Carreras("Aramco Hungarian GP", fecha_Hungria, Francia, escuderias);
        campeonato.put(12, hungria_GP);


        //13.- Hungria
        Pistas Hungria = new Pistas("Hungria", "Budapest", 4381f);
        CalendarioCarreras fecha_Belgica = new CalendarioCarreras("2022-08-26", "2022-08-28");
        Carreras belgica_GP = new Carreras("Rolex Belgian GP", fecha_Belgica, Hungria, escuderias);
        campeonato.put(13, belgica_GP);


        //14.- Bélgica
        Pistas Belgica = new Pistas("Belgica", "Spa-Francorchamps", 7000.4f);
        CalendarioCarreras fecha_Holanda = new CalendarioCarreras("2022-09-02", "2022-09-04");
        Carreras holanda_GP = new Carreras("Heineken Dutch GP", fecha_Holanda, Belgica, escuderias);
        campeonato.put(14, holanda_GP);


        //15.- Paises Bajos
        Pistas Holanda = new Pistas("Paises Bajos", "Zandvoort", 4259f);
        CalendarioCarreras fecha_Italia = new CalendarioCarreras("2022-09-09", "2022-09-11");
        Carreras italia_GP = new Carreras("Pirelli Italian GP", fecha_Italia, Holanda, escuderias);
        campeonato.put(15, italia_GP);


        //16.- Italia (Monza)
        Pistas Italia = new Pistas("Italia", "Monza", 5793f);
        CalendarioCarreras fecha_Rusia = new CalendarioCarreras("2022-09-23", "2022-09-25");
        Carreras rusia_GP = new Carreras("VTB Russian GP", fecha_Rusia, Italia, escuderias);
        campeonato.put(16, rusia_GP);


        //17.- Singapur
        Pistas Singapur = new Pistas("Singapur", "ingapur", 5073f);
        CalendarioCarreras fecha_Singapur = new CalendarioCarreras("2022-09-30", "2022-10-02");
        Carreras singapur_GP = new Carreras("Singapore Air Singapore GP", fecha_Singapur, Singapur, escuderias);
        campeonato.put(17, singapur_GP);


        //18.- Japon
        Pistas Japon = new Pistas("Japon", "Suzaka", 5807f);
        CalendarioCarreras fecha_Japon = new CalendarioCarreras("2022-10-07", "2022-10-09");
        Carreras japon_GP = new Carreras("Heineken Dutch GP", fecha_Japon, Japon, escuderias);
        campeonato.put(18, japon_GP);


        //19.- Estados Unidos (Austin)
        Pistas Eu = new Pistas("Estados Unidos", "Austin", 5513f);
        CalendarioCarreras fecha_EU = new CalendarioCarreras("2022-10-21", "2022-10-23");
        Carreras eu_GP = new Carreras("Aramco United States GP", fecha_EU, Eu, escuderias);
        campeonato.put(19, eu_GP);


        //20.- Mexico
        Pistas Mexico = new Pistas("Mexico", "Ciudad de Mexico", 4421f);
        CalendarioCarreras fecha_Mexico = new CalendarioCarreras("2022-10-28", "2022-10-30");
        Carreras mexico_GP = new Carreras("Mexico GP", fecha_Mexico, Mexico, escuderias);
        campeonato.put(20, mexico_GP);


        //21.- Brasil
        Pistas Brasil = new Pistas("Brasil", "Sao Paulo", 4309f);
        CalendarioCarreras fecha_Brasil = new CalendarioCarreras("2022-11-11", "2022-11-13");
        Carreras brasil_GP = new Carreras("Heineken Brazil GP", fecha_Brasil, Brasil, escuderias);
        campeonato.put(21, brasil_GP);


        //22.- Emiratos Arabes Unidos
        Pistas Ea = new Pistas("Emiratos Arabes Unidos", "Abu Dhabi", 5524f);
        CalendarioCarreras fecha_AbuDhabi = new CalendarioCarreras("2022-11-18", "2022-11-20");
        Carreras abuDhabi_GP = new Carreras("Heineken Dutch GP", fecha_AbuDhabi, Ea, escuderias);
        campeonato.put(22, abuDhabi_GP);


        return campeonato;
    }
}

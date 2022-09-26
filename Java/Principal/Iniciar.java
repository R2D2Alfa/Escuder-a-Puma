import java.util.ArrayList;

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
}

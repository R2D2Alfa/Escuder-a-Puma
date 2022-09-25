import java.util.ArrayList;

public class Pistas {
    String pais;
    float longitud;

    public pista(String pais, float longitud){
        this.pais = pais;
        this.longitud = longitud;
    }
    
    public Belgica(String pais, float longitud){
        this.pais = "Bélgica";
        this.longitud = 7000.4f;
        Pistas nuevaPista = new pista(pais, longitud);
        pistas.add(nuevaPista);
    }
    
    ArrayList<Pistas> pistas = new ArrayList<>();
    
}


public class Pistas {
    String pais;
    String ciudad;
    float longitud;

    public Pistas(String pais, String ciudad ,float longitud){
        this.pais = pais;
        this.ciudad = ciudad;
        this.longitud = longitud;
    }

    public String getPais(){
        return pais;
    }
    
    public String getCiudad(){
        return ciudad;
    }

    public float getLongitud(){
        return longitud;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public void setLongitud(float longitud){
        this.longitud = longitud;
    }

}

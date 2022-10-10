

public class Posiciones {
    Integer posicion;
    Corredores corredores;
    Integer puntos;

    public Posiciones(Integer posicion, Corredores corredores, Integer puntos){
        this.posicion = posicion;
        this.corredores = corredores;
        this.puntos = puntos;
    }

    public Integer getPosicion(){
        return posicion;
    }

    public Corredores getCorredores(){
        return corredores;
    }

    public Integer getPuntos(){
        return puntos;
    }

    public void setPosicion(Integer posicion){
        this.posicion = posicion;
    }

    public void setCorredores(Corredores corredores){
        this.corredores = corredores;
    }

    public void setPuntos(Integer puntos){
        this.puntos = puntos;
    }
}

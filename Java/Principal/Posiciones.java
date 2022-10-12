public class Posiciones {
    //Atributos
    Integer posicion=0;
    Corredores corredores;
    Integer puntos=0;

    //Constructor
    public Posiciones(Integer posicion, Corredores corredores, Integer puntos){
        this.posicion = posicion;
        this.corredores = corredores;
        this.puntos += puntos;
    }  

    //Getters
    public Integer getPosicion(){
        return posicion;
    }

    public Corredores getCorredores(){
        return corredores;
    }

    public Integer getPuntos(){
        return puntos;
    }

    //Setters
    public void setPosicion(Integer posicion){
        this.posicion = posicion;
    }

    public void setCorredores(Corredores corredores){
        this.corredores = corredores;
    }

    public void setPuntos(Integer puntos){
        this.puntos += puntos;
    }
}

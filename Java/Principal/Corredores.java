public class Corredores {
    //Atributos
    String nacionalidad;
    String nombre;
    String apellido;
    int edad;
    int peso;
    float estatura;


    //Constructor
    public Corredores(String nacionalidad, String nombre, String apellido, int edad, int peso, float estatura){
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }


    //Getters
    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }


    //Setters
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}

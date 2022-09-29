public class CalendarioCarreras {
    Fecha FechaInicio = new Fecha();
    Fecha FechaFinal = new Fecha();
    String Carrera;

    public CalendarioCarreras(Fecha FechaInicio, Fecha FechaFinal, String Carrera){
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.Carrera = Carrera;
    }

    public Fecha getFechaInicio(){
        return FechaInicio;
    }

    public Fecha getFechaFinal(){
        return FechaFinal;
    }

    public String getCarrera(){
        return Carrera;
    }

    public void setFechaInicio(Fecha FechaInicio){
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFinal(Fecha FechaFinal){
        this.FechaFinal = FechaFinal;
    }

    public void setCarrera(String Carrera){
        this.Carrera = Carrera;
    }

    public static void main(String[] args){ // Propuesta de uso.
        Fecha Fecha1 = new Fecha(12, 12, 2022);
        Fecha Fecha2 = new Fecha(24, 12, 2022);
        CalendarioCarreras Carrera1 = new CalendarioCarreras(Fecha1, Fecha2, "NOMBRE CARERRA");

        System.out.println("La Carrera " + Carrera1.getCarrera());
        System.out.println("Se disputara en las fechas: " + Carrera1.getFechaFinal() + " y " + Carrera1.getFechaInicio());

    }
}

import java.util.*;
import java.time.*;

public class CalendarioCarreras {
    String FechaInicio;
    String FechaFinal;
    String Carrera;

    public CalendarioCarreras(String FechaInicio, String FechaFinal, String Carrera){
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.Carrera = Carrera;
    }

    public String getFechaInicio(){
        return FechaInicio;
    }

    public String getFechaFinal(){
        return FechaFinal;
    }

    public String getCarrera(){
        return Carrera;
    }

    public void setFechaInicio(String FechaInicio){
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFinal(String FechaFinal){
        this.FechaFinal = FechaFinal;
    }

    public void setCarrera(String Carrera){
        this.Carrera = Carrera;
    }
}

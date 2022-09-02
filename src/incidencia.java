import java.util.Date;

public class incidencia {
    Date fecha;
    Double costo;
    String descripcion;
    String tipo;
    public Incidencia(){

    }

    public incidencia(Date fecha, Double costo, String descripcion, String tipo) {
        this.fecha = fecha;
        this.costo = costo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
}

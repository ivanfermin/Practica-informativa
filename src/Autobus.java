import java.util.List;

public class Autobus {
    String place;
    Integer numero;
    Modelo modelo;
    List<linea>linea;
    public Autobus(){

    }

    public Autobus(String place, Integer numero, Modelo modelo, List<linea> linea) {
        this.place = place;
        this.numero = numero;
        this.modelo = modelo;
        this.linea = linea;
    }
}

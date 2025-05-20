import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class IntercambioMoneda {
    private String monedaUno;
    private String monedaDos;
    private double intercambioMonedaNew;
    double intercambioMonedaOld;
    int opcion;

    public String setOpcionIntercambio(int opcionIntercambio, double intercambioMoneda) {
        this.opcion = opcionIntercambio;
        this.intercambioMonedaOld = intercambioMoneda;
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        if (opcion == 1) {
            this.monedaUno = "USD";
            this.monedaDos = "ARS";
        } else if (opcion == 2) {
            this.monedaUno = "ARS";
            this.monedaDos = "USD";
        }else if (opcion == 3) {
            this.monedaUno = "USD";
            this.monedaDos = "BRL";
        }else if (opcion == 4) {
            this.monedaUno = "BRL";
            this.monedaDos = "USD";
        }else if (opcion == 5) {
            this.monedaUno = "USD";
            this.monedaDos = "COP";
        }
        else if (opcion == 6) {
            this.monedaUno = "COP";
            this.monedaDos = "USD";
        }
        Moneda moneda = consultaMoneda.buscaMoneda(monedaUno, monedaDos, intercambioMonedaOld);
        this.intercambioMonedaNew = moneda.conversion_result();
        return "El valor "+intercambioMonedaOld+
                "["+monedaUno+"]"+ " corresponde al valor final de => "+
                intercambioMonedaNew+" ["+monedaDos+"]";
    }

}

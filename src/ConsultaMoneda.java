import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaMoneda {
    public Moneda buscaMoneda(String primerMoneda, String segundaMoneda, double monto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8bdc2ddce72365d91ec53d5c/pair/"+primerMoneda+"/"+segundaMoneda+"/"+monto);

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda");
        }
    }
}

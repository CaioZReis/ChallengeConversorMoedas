import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaExchangeApi {

    public static String ConexaoAPI(String chave, String moedaBase, String moedaAlvo ) {

        try {
            String endereco = "https://v6.exchangerate-api.com/v6/" + chave + "/pair/" + moedaBase + "/" + moedaAlvo;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();
        }catch (Exception e){
            System.out.println("Resposta não obtida: " + e);
            return null;
        }
    }

}
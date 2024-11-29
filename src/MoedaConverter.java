import com.google.gson.Gson;

public class MoedaConverter {

    public static void Conversor(String moedaBase, String moedaAlvo, double valor) {
        String jsonMoeda = ConsultaExchangeApi.ConexaoAPI("34c3601e66c0718d0258cc1c", moedaBase, moedaAlvo);

        Gson gson = new Gson();
        Moeda moeda = gson.fromJson(jsonMoeda, Moeda.class);
        System.out.println("Você requisitou:\n" + moeda);
        System.out.printf("\nValor Convertido: %.2f\n\n", valor * moeda.getTaxaConversao());
    }
}
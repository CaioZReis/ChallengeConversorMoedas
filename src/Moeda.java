import com.google.gson.annotations.SerializedName;

public class Moeda {
    @SerializedName("base_code")
    private String moedaBase;
    @SerializedName("target_code")
    private String moedaAlvo;
    @SerializedName("conversion_rate")
    private double taxaConversao;

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }

    public void setMoedaAlvo(String moedaAlvo) {
        this.moedaAlvo = moedaAlvo;
    }

    public void setTaxaConversao(double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaAlvo() {
        return moedaAlvo;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    @Override
    public String toString() {
      return "Moeda Base: " + moedaBase + "\nMoeda Alvo: " + moedaAlvo + "\nTaxa de Conversão: " + taxaConversao;
    }
}

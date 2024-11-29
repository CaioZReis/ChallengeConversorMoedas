import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int menuAtual = 1;
        while (menuAtual != 0) {
            switch (menuAtual) {
                case 1:
                    MenuConversoes();
                    String opcao = leitura.nextLine();
                    if (opcao.equals("0")){
                        System.out.println("Obrigado por usar o aplicativo");
                        return;
                    } else if (!IsInt(opcao)) {
                        System.out.println("=====Só aceita números inteiros=====\n====Tente Novamente====");
                        break;
                    } else if (Integer.parseInt(opcao)>6) {
                        System.out.println("=====Opção inválida=====\n====Tente Novamente====");
                        break;
                    }
                    System.out.println("Quanto você quer converter:");
                    double valor = leitura.nextDouble();
                    if (opcao.equals("1")) {
                        MoedaConverter.Conversor("BRL", "USD", valor);
                    } else if (opcao.equals("2")) {
                        MoedaConverter.Conversor("USD", "BRL", valor);
                    } else if (opcao.equals("3")) {
                        MoedaConverter.Conversor("JPY", "BRL", valor);
                    } else if (opcao.equals("4")) {
                        MoedaConverter.Conversor("EUR", "USD", valor);
                    } else if (opcao.equals("5")) {
                        MoedaConverter.Conversor("EUR", "BRL", valor);
                    } else if (opcao.equals("6")) {
                        MoedaConverter.Conversor("HKD", "ARS", valor);
                    }
                    System.out.println("Pressione ENTER para continuar");
                    leitura.nextLine();
                    leitura.nextLine();
                    break;
                default:
                    System.out.println("=====Opção inválida=====\n====Tente Novamente====");
                    break;
                }
        }
        leitura.close();
    }

    private static void MenuConversoes(){
        System.out.println("""
                Menu Conversor:
                1 - Converter De BRL para USD
                2 - Converter de USD para BRL
                3 - Converter de JPY para BRL
                4 - Converter de EUR para USD
                5 - Converter de EUR para BRL
                6 - Converter de HKD para ARS
                0 - Sair
                Qual opção deseja?""");

    }

    private static boolean IsInt(String opcao) {
        try {
            Integer.parseInt(opcao);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SA3AbnerRibeiro {
    public static void calTroco(Double valorTroco){
        List<Integer> notas = new ArrayList<>();
        notas.add(100);
        notas.add(50);
        notas.add(20);
        notas.add(10);
        notas.add(5);
        notas.add(2);
        
        List<Double> moedas = new ArrayList<>();
        moedas.add(1.0);
        moedas.add(0.50);
        moedas.add(0.25);
        moedas.add(0.10);
        moedas.add(0.05);

        int quantNotas = 0;
        int quantMoedas = 0;

            /* CALCULANDO QUANTIDADE DE NOTAS */
            System.out.println("\n __________________________________\n |                                |\n |             TROCO              |\n | TOTAL: R$ " + new DecimalFormat(".#2").format(valorTroco) + "\n |                                |");
            for (int nota : notas){
                if (valorTroco >= nota) {
                    quantNotas = (int) (valorTroco / nota); /* ARMAZENA A QUANTIDADE DE NOTAS */
                    System.out.println(" | " + quantNotas + " Notas de " + nota + " reais");
                    valorTroco -= quantNotas * nota; /* ATUALIZA O valorTroco COM O NOVO UM VALOR */
                }
            }

            /* CALCULANDO QUANTIDADE DE MOEDAS */
            for (double moeda : moedas){
                if (valorTroco >= moeda) {
                    quantMoedas = (int) (valorTroco / moeda); /* ARMAZENA A QUANTIDADE DE MOEDAS */
                    System.out.println(" | " + quantMoedas + " Moedas de " + moeda);
                    valorTroco -= quantMoedas * moeda; /* ATUALIZA O valorTroco COM O NOVO UM VALOR */
                }
            }
            System.out.println(" |________________________________|\n");
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            double valorCompra = 0;
            double valorPag = 0;
            double valorTroco = 0;
                System.out.println(" __________________________________\n |                                |\n |    DIGITE O VALOR DA COMPRA    |\n |________________________________|\n");
                valorCompra = ler.nextDouble();
                    
                    /* VERICFICA SE O PAGAMENTO É MENOR QUE O VALOR DA COMPRA */
                    do {
                        System.out.println(" __________________________________\n |                                |\n |  DIGITE O VALOR DO PAGAMENTO   |\n |        OU '0' PARA SAIR        |\n |________________________________|");
                        valorPag = ler.nextDouble();
                        if (valorPag == 0) {
                            break;
                        }
                        if (valorPag < valorCompra) {
                            System.out.println(" _______________________________________________________\n |                                                     |\n |               PAGAMENTO INSUFICIENTE!               |\n | O VALOR DO PAGAMENTO DEVE SER MAIOR QUE O DA COMPRA |\n |_____________________________________________________|");
                        }                                                                                                                                            
                    } while (valorPag < valorCompra);
                    
                    /* ARMAZENA O TROCO */
                        valorTroco = (valorPag - valorCompra);

                    /* CHAMA O MÉTODO calTroco, PARA CALCULA O TROCO */
                    if (valorPag != 0) {
                        calTroco(valorTroco);
                    }
        ler.close();
    }
}
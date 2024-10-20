/*Crie um programa que funcione como um conversor de moedas. O programa deve permitir que o usuário converte as moedas (por exemplo, Dólar, Euro, Libra) e 
converter um valor fornecido em Reais (BRL) para as moedas. Utilize uma estrutura switch-case para selecionar a moeda e aplicar a taxa de conversão correspondente.
Requisitos:
Taxas de conversão fictícias:
Dólar: 1 BRL = 0.20 USD
Euro: 1 BRL = 0.18 EUR
Libra: 1 BRL = 0.16 GBP
*/
package PALista1;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int moeda = 0;
            double money = 0;

                System.out.println("Digite o valor que deseja converter: ");
                money = scanner.nextDouble();

                System.out.println("SELECIONE A MOEDA QUE DESEJA CONVERTER E INSIRA O DIGITO CORESPONDETE: \n1 <- USD - DOLÁR\n2 <- EUR - EURO\n3 <- GBP - LIBRA");
                moeda = scanner.nextInt();

            switch (moeda) {
                case 1:
                    money = money * 0.20;
                    System.out.println("VALOR CONVERTIDO: $ " + money);    
                        break;
                case 2:
                    money = money * 0.18;
                    System.out.println("VALOR CONVERTIDO: & " + money);
                        break;
                case 3:
                    money = money * 0.16;
                    System.out.println("VALOR CONVERTIDO: L " + money);    
                        break;
                default:
                    System.out.println("Moeda Inexistente!");
                        break;
            }
        scanner.close();
    }
}

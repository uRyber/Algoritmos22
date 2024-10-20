package LPSEM12;
import java.util.Scanner;

public class AtvdPrtc_ERSM1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double compra = 0;
        int opcao;
        boolean cond = false;

        System.out.println("Digite o valor da compra: ");
        compra = ler.nextDouble();

        while (cond == false) {
            System.out.println("DIGITE O CÓDIGO CORRESPONDENTE \n1 - Cliente Comum | 2 - Funcionário | 3 - VIP");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O valor da compra é: R$ " + compra + "\nValor do desconto: R$ " + 0.00 + "\nValor Total da compra com desconto aplicado: R$" + compra);
                    cond = true;
                    break;
                case 2:
                     System.out.println("O valor da compra é: R$ " + compra + "\nValor do desconto: R$ " + compra * 0.10 + "\nValor Total da compra com desconto aplicado: R$" + compra * 0.9);
                    cond = true;
                    break;
                case 3:
                    System.out.println("O valor da compra é: R$ " + compra + "\nValor do desconto: R$ " + compra * 0.05 + "\nValor Total da compra com desconto aplicado: R$" + compra * 0.95);
                    cond = true;
                    break;
                default:
                    System.out.println("Opção incorreta! Tente novamente.\n");
            }
        }
        ler.close();
    }
}

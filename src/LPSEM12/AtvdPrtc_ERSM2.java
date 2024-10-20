package LPSEM12;
import java.util.Scanner;

public class AtvdPrtc_ERSM2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double numero = 1;
        double numero_Total = 0;
        double media = 0;
        int qtd = 0;

        while (numero != 0) {
        System.out.println("Digite um número maior que zero, ou zero para mostrar os seguintes dados\nQuantos números foram digitados\nA média destes");
        numero = ler.nextDouble();
            if (numero != 0) {
                numero_Total = numero_Total + numero;
                qtd ++;
                media = numero_Total / qtd;
            }
        }
        System.out.println("Quantidade de registros: " + qtd + "\nMédia total: " + media);

        ler.close();
    }
}

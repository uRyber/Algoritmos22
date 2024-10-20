package LPSEM12;
import java.util.Scanner;

public class AtividadePratica2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            double valor, valor_Total;

            System.out.println("Qual é o valor de fábrica do carro? ");
            valor = ler.nextDouble();

            valor_Total = (valor + (valor * 0.28) + (valor * 0.45));

            System.out.println("O valor final desse carro para ser vendido ao consumidor será de: R$ " + valor_Total);
        
        ler.close();
    }

}

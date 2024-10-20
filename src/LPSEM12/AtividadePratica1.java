package LPSEM12;
import java.util.Scanner;

public class AtividadePratica1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            //DECLARAÇÃO DAS VARIÁVEIS
            double horas, valor, total ;    

            //INÍCIO ALGORITMO
            System.out.println("Quanto vale a sua hora trabalhada? ");
            valor = ler.nextDouble();  
            System.out.println("Quantas horas você trabalhou por mês? ");
            horas = ler.nextDouble();

            total = valor * horas ;

            System.out.printf("O seu salário mensal é de: R$ " + total);
        
        ler.close();
    }
}

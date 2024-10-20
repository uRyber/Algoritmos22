package LPSEM13;
import java.util.Scanner;

public class AtividadePratica4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int[] num1 = new int[5];
            int[] num2 = new int[5];
            int[] numSoma = new int[5];
            int i = 0;

            //ENTRADA DE DADOS VETOR 1
            for (i = 0; i <= 4; i++) {
                System.out.println("Digite o " + (i + 1) + "° número do 1° vetor: ");
                num1[i] = ler.nextInt();
                ler.close();
            }

            //ENTRADA DE DADOS VETOR 2
            for (i = 0; i <= 4; i++) {
                System.out.println("Digite o " + (i + 1) + "° número do 2° vetor: ");
                num2[i] = ler.nextInt();
                ler.close();
            }


            //EXIBINDO VETOR 1
            System.out.println("Primeiro vetor: ");
            for (i = 0; i<= 4; i++) {
                System.out.println(num1[i]);
            }

            //EXIBINDO VETOR 2
            System.out.println("Segundo vetor: ");
            for (i = 0; i <= 4; i++) {
                System.out.println(num2[i]);
            }

            //PREENCHENDO VETOR 3 E EXIBINDO
            System.out.println("Soma dos vetores 1 e 2: ");
            for (i = 0; i <= 4; i++) {
                numSoma[i] = num1[i] + num2[i];
                System.out.println(numSoma[i]);
            }
    }
}
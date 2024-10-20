/*Crie um programa que exiba os primeiros N termos da sequência de Fibonacci, onde N é um valor fornecido pelo usuário. A sequência de Fibonacci começa com 0 e 1, 
e cada termo subsequente é a soma dos dois anteriores.
 */
package PALista2;
import java.util.Scanner;

public class L2Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int n = 0;
            int n2 = 1;
            int n3 = 0;
            int n4 = 0;
                System.out.println("Digite um número que irei mostrar a sequência de Fibonacci até esse número: ");
                n = ler.nextInt();

                while (n2 <= n) {
                    n4 = n2 + n3;
                    n3 = n2;
                    n2 = n4;
                    System.out.println(" " + n4);
                }
        ler.close();
    }
}

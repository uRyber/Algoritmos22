/*Escreva um programa que receba dois números inteiros do usuário e exiba todos os números primos entre esses dois números (inclusive). 
Utilize um loop para verificar cada número dentro do intervalo e determine se ele é primo. */
package PALista2;
import java.util.Scanner;
public class L2Exercicio4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite o primeiro número: ");
            int inicio = scanner.nextInt();
    
            System.out.print("Digite o segundo número: ");
            int fim = scanner.nextInt();
    
            System.out.println("Números primos entre " + inicio + " e " + fim + ":");
            for (int i = Math.min(inicio, fim); i <= Math.max(inicio, fim); i++) {
                if (i <= 1) {
                    continue;
                }
                    boolean ehPrimo = true;
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if (i % j == 0) {
                                ehPrimo = false;
                                break;
                            }
                        }
                            if (ehPrimo) {
                                System.out.println(i);
                            }
                if (i == Math.max(inicio, fim)) {
                    scanner.close();    

                }
            }
        }
}

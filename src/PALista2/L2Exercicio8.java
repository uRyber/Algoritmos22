/*Desenvolva um jogo onde o programa escolhe um número aleatório entre 1 e 100, e o usuário tem que adivinhar o número. A cada tentativa, 
o programa deve informar se o número é maior ou menor do que a tentativa. O jogo continua até que o usuário adivinhe o número correto. */
package PALista2;
import java.util.Random;
import java.util.Scanner;

public class L2Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
            int tentativa = 0;
            int tent = 0;
            int number = 1 + random.nextInt(100);
                System.out.println("Tente advinhar o número de 1 a 100 ");
                tentativa = ler.nextInt();
                tent++;
                    while (tentativa != number) {
                        if (tentativa < number) {
                            System.out.println("Número errado!\nTente advinhar o número de 1 a 100: ");
                            System.out.println("O número é maior");
                            tentativa = ler.nextInt();
                        } else if (tentativa > number) {
                            System.out.println("Número errado!\nTente advinhar o número de 1 a 100: ");
                            System.out.println("O número é menor");
                            tentativa = ler.nextInt();
                        } 
                        tent++;
                    }
                    System.out.println("Certa Resposta! O número era: " + number + " mesmo.\nNúmero de tentativas: " + tent);
        ler.close();
    }    
}

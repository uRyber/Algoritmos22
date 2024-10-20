/*Desenvolva um programa que peça ao usuário para inserir 10 números inteiros. O programa deve contar quantos desses números são pares e quantos são ímpares, 
exibindo os resultados ao final.*/
package PALista2;
import java.util.Scanner;
public class L2Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int idc = 0;
            int n = 0;
            int par = 0;
            int impar = 0;

                System.out.println("Digite 10 número e conterei quantos são pares e quantos são ímpares:\n");

                    for (idc = 1; idc <= 10; idc++) {
                        
                            System.out.println("Digite o " + idc + "° número: ");
                            n = scanner.nextInt();

                                if (n % 2 == 0) {
                                    par = par + 1;
                                } else {
                                    impar = impar + 1;
                                }

                        if (idc == 10) {
                            scanner.close();    
                        }
                    }
            System.out.println("\nQuantidade de números Pares: " + par + "\nQuantidade de núemros Ímpares: " + impar);
        scanner.close();
    }
}
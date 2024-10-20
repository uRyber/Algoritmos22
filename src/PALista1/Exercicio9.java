/*Crie um programa que classifique uma pessoa em diferentes faixas etárias com base na idade fornecida pelo usuário. As faixas etárias podem ser: criança (0-12 anos),
adolescente (13-17 anos), adulto (18-64 anos), idoso (65 anos ou mais).*/
package PALista1;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int idade = 0;
            
            System.out.println("Digite a idade da pessoa:");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida!");
            } else if (idade > 0 && idade <= 12) {
                System.out.println("Criança");
            } else if (idade >= 13 && idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade >= 18 && idade <= 64) {
                System.out.println("Adulto");
            } else if (idade >= 65) {
                System.out.println("Idoso");
            }
        scanner.close();
    } 
}

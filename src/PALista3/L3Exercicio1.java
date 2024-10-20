/*Crie um método chamado calcularMedia que receba uma lista de inteiros e retorne a média dos valores. 
Em seguida, crie um programa que solicite ao usuário que insira 5 números, armazene-os em uma lista, e exiba a média calculada usando o método calcularMedia. */
package PALista3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class L3Exercicio1 {
    public static double calcularMedia(List<Integer> numeros){
        int soma = 0;
            for (int numero : numeros){
                soma += numero;
            }
        return (double) soma / numeros.size();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite 5 números para calcular a média dos mesmos: ");
                    numeros.add(ler.nextInt());
                }
                System.out.println("A média dos números é: " + calcularMedia(numeros));
        ler.close();
    }
}
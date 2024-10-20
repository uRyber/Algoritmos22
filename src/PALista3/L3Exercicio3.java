/*Crie um método chamado filtrarPares que receba uma lista de inteiros e retorne uma nova lista contendo apenas os números pares. 
Em seguida, crie um programa que solicite ao usuário que insira 10 números e exiba os números pares filtrados.*/
package PALista3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class L3Exercicio3 {
    public static List<Integer> filtrarPares(List<Integer> num) {
        List<Integer> numbers = new ArrayList<>();
            for (Integer numero : num) {
                if(numero % 2 == 0){
                    numbers.add(numero);
                }
            }
    return numbers;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            List<Integer> numeros = new ArrayList<>();
                System.out.println("DIGITE 10 NÚMEROS E IREI FILTAR APENAS OS PARES\n");
                    for (int i = 0; i < 10 ;i++){
                        System.out.println("Digite o " + (i + 1) + "° número: ");
                        numeros.add(ler.nextInt());
                    }
                        System.out.println("Os números pares são: " + filtrarPares(numeros));
        ler.close();
    }
}

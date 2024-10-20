/*Crie um método chamado contarCaracteres que receba uma String e retorne um HashMap<Character, Integer> que contenha a contagem de cada caractere na string. 
Em seguida, crie um programa que solicite uma palavra ao usuário e exiba a contagem de cada caractere. */
package PALista3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L3Exercicio2 {
    public static HashMap<Character, Integer>contarCaracteres(String str) {
        HashMap<Character, Integer> contagem = new HashMap<>();
            for (char c: str.toCharArray()) {
                contagem.put(c, contagem.getOrDefault(c, 0) + 1);
            }
        return contagem;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            String word = "";    
                System.out.println("Digite uma palavra para ser contada a quantidade de caracteres: ");
                word = ler.nextLine();
                
                Map<Character, Integer> resultado = contarCaracteres(word);

                    System.out.println("Contagem de caracteres:");
                    for (Map.Entry<Character, Integer> entry : resultado.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
        ler.close();
    }
}

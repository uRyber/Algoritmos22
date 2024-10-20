/*Crie um programa para gerenciar uma agenda de contatos. O programa deve permitir adicionar, remover e buscar contatos. Cada contato deve ter um nome e um número de telefone. 
Use um HashMap<String, String> para armazenar os contatos, onde a chave é o nome e o valor é o número de telefone. */
package PALista3;
import java.util.HashMap;
import java.util.Scanner;

public class L3Exercicio4 {
    public static HashMap<String,String> adicionar(Scanner ler, HashMap<String, String> contatos){
        System.out.println("\nDIGITE O NOME DO CONTATO: ");
        String nome = ler.nextLine();
        System.out.println("\nDIGITE O NÚMERO DE TELEFONE DO CONTATO: ");
        String numero = ler.nextLine();
            contatos.put(nome, numero);
    return contatos;
    }
    public static HashMap<String, String> remover(Scanner ler, HashMap<String, String> contatos) {
        System.out.print("\nDIGITE O NOME DO CONTATO A SER REMOVIDO: ");
        String nome = ler.nextLine();
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
        return contatos;
    }
    public static void buscar(Scanner ler, HashMap<String,String> contatos){
        System.out.println("\nDIGITE O NOME PARA BUSCAR: ");
        String nome = ler.nextLine();
        if (contatos.containsKey(nome)) {
            System.out.println("\nNOME DO CONTATO: " + nome + "\nNÚMERO DO CONTATO: " + contatos.get(nome));
        } else {
            System.out.println("\nCONTATO NÃO ENCONTRADO!");
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);   
        HashMap<String,String> contatos = new HashMap<>(); 
            int options = 0; 
                while (true) { 
                    System.out.println(" __________________________________\n |             AGENDA             |\n |________________________________|\n |                                |\n | 0 - SAIR                       |\n | 1 - ADICIONAR                  |\n | 2 - REMOVER                    |\n | 3 - BUSCAR                     |\n |________________________________|");      
                    options = ler.nextInt();
                    if (options == 0) {
                        System.out.println("\nSaindo da agenda...");
                            break;
                    }
                    switch (options) {
                        case 1:
                            adicionar(ler, contatos);
                                break;
                        case 2:
                            remover(ler, contatos);
                                break;
                        case 3:
                            buscar(ler, contatos);
                                break;
                        default:
                            System.out.println("\nOPÇÃO INVÁLIDA!");
                                break;
                    }
                }
        ler.close();
    }
}

package LPSEM12;
import java.util.Scanner;

public class MeuPrimeiroCodigo {
 public static void main(String[] args) {
    Scanner ler  = new Scanner(System.in);

    //DECLARAR DE VARIÁVEIS
    char sexo;//ARMAZENA APENAS UM ÚNICO CARACTER
    String nome;//ARMAZENA UMA CADEIA DE CHAR
    int idade;
    double nota;

    System.out.println("Digite o nome: ");
    nome = ler.nextLine();
    System.out.println("Digite a idade: ");
    idade = ler.nextInt();
    System.out.println("Digite a nota: ");
    nota = ler.nextDouble();
    sexo = 'M';
    
    //EXIBIR MENSAGEM NA TELA
    System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos." + "\nNota: " + nota + "\nSexo: " + sexo);
    
    ler.close();
 }
}

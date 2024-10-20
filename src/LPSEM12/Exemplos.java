package LPSEM12;
import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        //IMPORTAÇÃO DA BIBLIOTECA SCANNER
        Scanner ler = new Scanner(System.in);
        
        //VARIÁVEIS
        String nome;
        int idade, contador, opcao;
        double media;
        
        //SOLICITAÇÃO DE INFORMAÇÃO AO USUÁRIO
        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Digite a idade do aluno: ");
        idade = ler.nextInt();
        System.out.println("Digite a média do aluno: ");
        media = ler.nextDouble();

        ler.close();

        //FUNÇÃO SE SENÃO - IF ELSE
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
        if (media >= 7) {
           System.out.println("APROVADO");
        } else if (media >= 5){
            System.out.println("EM EXAME");
        } else {
            System.out.println("REPROVADO");
        }

        //LAÇOS DE REPETIÇÃO - PARA - FOR
        for (contador = 1; contador <= 10; contador++) {
           System.out.println(contador);
        }
        
        //LAÇOS DE REPETIÇÃO - ENQUANTO - WHILE
        contador = 1;
        while (contador <= 10) {
           System.out.println(contador);
           contador++;
        }

        //LAÇOS DE REPETIÇÃO - REPITA - DO WHILE
        contador = 1;
        do {
           System.out.println(contador);
           contador++;
        } while (contador <= 10);

        //ESTRUTURA DE SELEÇÃO MÚLTIPLA - ESCOLHA CASO - SWITCH CASE
        opcao = 5;

        switch (opcao){
            case 1:
                System.out.println("Você escolheu a opção 1");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            default:
                System.out.println("Você escolheu uma opção inválida");
        }
            
    }
}
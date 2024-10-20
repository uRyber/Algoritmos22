package LPSEM12;
import java.util.Scanner;

public class AtividadePratica4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            String nome;
            double nota1, nota2, nota3;


            System.out.println("Digite seu nome: ");
            nome = ler.nextLine();

            System.out.println("Digite a primeira nota: ");
            nota1 = ler.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = ler.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = ler.nextDouble();

            if (((nota1 + nota2 + nota3) / 3) >= 7) {
                System.out.println("APROVADO! \n ALUNO: " + nome);
            } else if (((nota1 + nota2 + nota3) / 3) >= 5) {
                System.out.println("EXAME! \n ALUNO: " + nome);
            } else {
                System.out.println("REPROVADO! \n ALUNO: " + nome);
            }
        ler.close();
    }
}

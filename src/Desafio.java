import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
     
    ArrayList<Integer> matricula = new ArrayList<>();
    ArrayList<String> nome = new ArrayList<>();
    ArrayList<Double> notas1 = new ArrayList<>();
    ArrayList<Double> notas2 = new ArrayList<>();
    ArrayList<Double> media = new ArrayList<>();
    ArrayList<Double> faltas = new ArrayList<>();
    ArrayList<String> status = new ArrayList<>();
    int i = 0;
    
    public void cadastroAluno() throws Exception { 
        Scanner ler = new Scanner(System.in);
            System.out.println("Digite a Matrícula do Aluno: ");
            matricula.add(ler.nextInt());
            System.out.println("Digite o nome do Aluno: ");
            nome.add(ler.nextLine());
        ler.close();
                for (i = 1; i < 4; i++) {
                    System.out.println("Digite a: " + i + "° nota do Aluno do PRIMEIRO SEMESTRE: ");
                    notas1.add(ler.nextDouble());
                }
                for (i = 1; i < 4; i++) {
                    System.out.println("Digite a: " + i + "° nota do Aluno do SEGUNDO SEMESTRE: ");
                    notas2.add(ler.nextDouble());
                }  
            System.out.println("Digite o total de faltas do Aluno: ");
            faltas.add(ler.nextDouble() * 10 );
    }

    public static void relatorio () {

    }

    public static void avaliacao () {

    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int opcao = 0;    
            while (opcao != 3) {
                System.out.println("ESCOLHA UMA OPÇÃO \n1 - Cadastrar Aluno \n2 - Relatório\n3- Sair");
                opcao = ler.nextInt();
                switch (opcao) {
                    case 1:
                        ;    
                        break;
                    case 2:
                        relatorio();
                        break;
                    default:
                        break;
                }
            }
        ler.close();
    }
}

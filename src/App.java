package Jogadores;
import cadastroJogadores.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Atacante atacante1 = new Atacante();
        System.out.print("Digite o nome do Atacante: ");
        atacante1.setNome(scanner.nextLine());

        System.out.print("Digite a idade do Atacante: ");
        atacante1.setIdade(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Digite a posição do Atacante: ");
        atacante1.setPosicao(scanner.nextLine());
        scanner.nextLine();

        System.out.print("Digite o número de gols do Atacante: ");
        atacante1.setNumeroGols(scanner.nextInt());
        scanner.nextLine();


        Defensor defensor1 = new Defensor();
        System.out.print("\nDigite o nome do Defensor: ");
        defensor1.setNome(scanner.nextLine());

        System.out.print("Digite a idade do Defensor: ");
        defensor1.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite a posição do Defensor: ");
        defensor1.setPosicao(scanner.nextLine());

        System.out.print("Digite o número de cartões do Defensor: ");
        defensor1.setNumeroCartoes(scanner.nextInt());
        scanner.nextLine();


        MeioCampo meioCampo1 = new MeioCampo();
        System.out.print("\nDigite o nome do MeioCampo: ");
        meioCampo1.setNome(scanner.nextLine());

        System.out.print("Digite a idade do MeioCampo: ");
        meioCampo1.setIdade(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Digite a posição do MeioCampo: ");
        meioCampo1.setPosicao(scanner.nextLine());

        System.out.print("Digite o número de assistências do MeioCampo: ");
        meioCampo1.setNumeroAssistencias(scanner.nextInt());
        scanner.nextLine();


        System.out.println("\nInformações dos Jogadores:");
        atacante1.informacoes();
        defensor1.informacoes();
        meioCampo1.informacoes();

        scanner.close();
    }
}

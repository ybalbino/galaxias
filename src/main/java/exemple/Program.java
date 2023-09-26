package exemple;

import exemple.conection.ProgramRebeldes;
import exemple.model.Rebelde;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);

    public static int exibirMenu() {
        int opcao = 0;
        try {
            System.out.println(" 1 - Inserir novo Rebelde");
            System.out.println(" 2 - Consultar todos os Rebeldes");
            System.out.println(" 3 - Atualizar galaxia dos Rebeldes");
            System.out.println(" 4 - Deletar Rebelde");
            System.out.println(" 5 - Buscar rebelde por nome");
            System.out.println(" 6 - Reportar Traira");
            System.out.println(" 7 - Relario");
            System.out.println(" 8 - Sair");
            System.out.println();
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor invalido! Digite um número inteiro positivo");
            sc.nextLine();
        }
        return opcao;
    }

    public static void main(String[] args) {
        ProgramRebeldes programRebeldes = new ProgramRebeldes();

        Rebelde rebelde = new Rebelde();
        String nome;
        int idade;
        String genero;
        String galaxia;
        boolean continuar = true;

        while (continuar) {
            int opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    System.out.println("Inserir novo Rebelde");
                    System.out.println("Qual o nome do Rebelde: ");
                    nome = sc.next();
                    System.out.println("Qual idade do Rebelde:");
                    idade = sc.nextInt();
                    System.out.println("Qual genero do Rebelde: ");
                    genero = sc.next();
                    System.out.println("Qual a galaxia do Rebelde: ");
                    galaxia = sc.next();
                    programRebeldes.inserirRebelde(new Rebelde(nome, idade, genero, galaxia));
                    break;
                case 2:
                    System.out.println("Consultar todos os Rebeldes");
                    programRebeldes.consultarTabela();
                    break;
                case 3:
                    System.out.println("Atualizar a galaxia do Rebelde");
                    System.out.println("Qual o nome do Rebelde?");
                    nome = sc.next();
                    System.out.println("Qual a nova base do Rebelde?");
                    galaxia = sc.next();
                    programRebeldes.alterarLocalizacaoRebelde(nome, galaxia);
                    break;
                case 4:
                    System.out.println("Deletar Rebelde");
                    System.out.println("Qual o id do Rebelde?");
                    int id = sc.nextInt();
                    programRebeldes.deletarRebelde(id);
                    break;

                case 5:
                    System.out.println("Buscar Rebelde por nome");
                    System.out.println("Qual o nome do Rebelde que deseja buscar?");
                    nome = sc.next();
                    programRebeldes.buscarRebeldePorNome(nome);
                    break;

                case 6:
                    System.out.println("Reportar traira");
                    System.out.println("Qual o nome do Rebelde que deseja reportar?");
                    nome = sc.next();
                    programRebeldes.reportarRebelde(nome);
                    break;

                case 7:
                    System.out.println("Gerar Relatório");
                    programRebeldes.gerarRelatorio();
                    break;

                case 8:
                    System.out.println("Saindo");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("opção invalida!!!!");
            }
        }
    }
}


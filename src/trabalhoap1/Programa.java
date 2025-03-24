package trabalhoap1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadastroDeContas cadastroDeContas = null;
        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Cadastrar Contas");
            System.out.println("2 - Consultar Contas Cadastradas");
            System.out.println("3 - Excluir Conta");
            System.out.println("4 - Mostrar Quantidade de Contas Cadastradas");
            System.out.println("5 - Buscar Conta Pelo Número");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Cadastrar Contas
                    if (cadastroDeContas == null) {
                        int capacidade;
                        do {
                            System.out.print("Quantas contas o cadastro poderá armazenar? (mínimo 5): ");
                            capacidade = sc.nextInt();
                            if (capacidade < 5) {
                                System.out.println("Erro: A capacidade deve ser pelo menos 5. Tente novamente.");
                            }
                        } while (capacidade < 5);

                        cadastroDeContas = new CadastroDeContas(capacidade);
                    }

                    int capacidadeRestante;
                    do {
                        int contasCadastradas = cadastroDeContas.qtdCadastradas();
                        capacidadeRestante = cadastroDeContas.getCapacidade() - contasCadastradas;

                        if (capacidadeRestante == 0) {
                            System.out.println("Todas as contas já foram cadastradas!");
                            break;
                        }

                        System.out.println("\nCapacidade restante: " + capacidadeRestante);
                        System.out.print("Digite o número da conta: ");
                        int numeroConta = sc.nextInt();
                        System.out.print("Digite o saldo da conta: ");
                        double saldoConta = sc.nextDouble();

                        Conta conta = new Conta(numeroConta, saldoConta);
                        if (cadastroDeContas.cadastrarConta(conta)) {
                            System.out.println("Conta cadastrada com sucesso!");
                        } else {
                            System.out.println("Falha ao cadastrar. Limite de capacidade atingido!");
                        }
                    } while (capacidadeRestante > 0);
                    break;

                case 2: // Consultar Contas Cadastradas
                    if (cadastroDeContas == null || cadastroDeContas.qtdCadastradas() == 0) {
                        System.out.println("Nenhuma conta cadastrada no momento.");
                    } else {
                        System.out.println("Contas cadastradas:");
                        cadastroDeContas.exibirContas();
                    }
                    break;

                case 3: // Excluir Conta
                    if (cadastroDeContas == null || cadastroDeContas.qtdCadastradas() == 0) {
                        System.out.println("Nenhuma conta cadastrada para exclusão.");
                    } else {
                        System.out.print("Digite o número da conta a ser excluída: ");
                        int numeroExcluir = sc.nextInt();
                        if (cadastroDeContas.excluirConta(numeroExcluir)) {
                            System.out.println("Conta excluída com sucesso!");
                        } else {
                            System.out.println("Conta não encontrada.");
                        }
                    }
                    break;

                case 4: // Mostrar Quantidade de Contas Cadastradas
                    if (cadastroDeContas == null) {
                        System.out.println("Nenhuma conta cadastrada no momento.");
                    } else {
                        System.out.println("Quantidade de contas cadastradas: " + cadastroDeContas.qtdCadastradas());
                    }
                    break;
                case 5: // Buscar conta pelo número
                    if (cadastroDeContas.getContas().size() > 0) {
                        int numeroConta = sc.nextInt();
                        cadastroDeContas.buscarConta(numeroConta);
                    } else System.out.println("Nenhuma conta cadastrada no momento.");
                    break;
                case 0: // Sair
                    System.out.println("Encerrando o programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
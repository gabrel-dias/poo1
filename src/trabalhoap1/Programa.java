package trabalhoap1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas contas serão criadas? ");
        int quantidadeContas = sc.nextInt();

        Conta conta;
        CadastroDeContas cadastroDeContas = new CadastroDeContas(quantidadeContas);
        for (int i = 0; i < quantidadeContas; i++) {
            System.out.print("Digite o número da conta: ");
            int numeroConta = sc.nextInt();
            System.out.print("Digite o saldo da conta: ");
            double saldoConta = sc.nextDouble();
            conta = new Conta(numeroConta, saldoConta);
            System.out.println(cadastroDeContas.cadastrarConta(conta));

        }
        cadastroDeContas.exibirContas();
    }
}

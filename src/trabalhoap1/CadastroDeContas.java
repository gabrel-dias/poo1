package trabalhoap1;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeContas {
    private List<Conta> contas;
    private int capacidade;

    // Construtor padrão com capacidade para armazenar 10 contas
    public CadastroDeContas() {
        this.contas = new ArrayList<>();
        this.capacidade = 10;
    }

    // Construtor que garante capacidade mínima de 5
    public CadastroDeContas(int capacidade) {
        while (capacidade < 5) {
            System.out.println("\nErro: Capacidade não pode ser menor que 5.");
            System.out.print("Digite novamente a capacidade: ");
            capacidade = new java.util.Scanner(System.in).nextInt(); // Repergunta ao usuário
        }
        this.capacidade = capacidade;
        this.contas = new ArrayList<>();
    }

    // Getter para obter a lista de contas
    public List<Conta> getContas() {
        return contas;
    }

    // Setter para modificar a lista de contas (se necessário)
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Getter para capacidade
    public int getCapacidade() {
        return capacidade;
    }

    // Setter para modificar a capacidade (se necessário)
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // Método para cadastrar uma conta
    public boolean cadastrarConta(Conta conta) {
        if (contas.size() < capacidade) {
            contas.add(conta);
            return true;
        } else {
            return false;
        }
    }

    // Método para exibir todas as contas cadastradas
    public void exibirContas() {
        for (Conta conta : contas) {
            System.out.println("Número da Conta: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }

    // Método para excluir uma conta pelo número
    public boolean excluirConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                contas.remove(conta);
                return true; // Conta removida com sucesso
            }
        }
        return false; // Conta não encontrada
    }

    // Método para retornar a quantidade de contas cadastradas
    public int qtdCadastradas() {
        return contas.size(); // Retorna o número de contas cadastradas na lista
    }

    public void buscarConta(int numeroConta) {
        Conta contaEncontrada = null;
        for (Conta conta : getContas()) {
            if (conta.getNumero() == numeroConta) {
                contaEncontrada = conta;
                break;
            }
        }

        if (contaEncontrada != null) {
            System.out.println("Conta encontrada: ");
            System.out.println("Número da Conta: " + contaEncontrada.getNumero() + ", Saldo: " + contaEncontrada.getSaldo());
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
}
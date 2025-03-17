package trabalhoap1;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeContas {
    private List<Conta> contas;
    private int capacidade;

    // construtor padrão com capacidade para armazenar 10 contas
    public CadastroDeContas() {
        this.contas = new ArrayList<>();
        this.capacidade = 10;
    }

    // construtor recebendo como parâmetro a capacidade de contas, não permitindo uma capacidade menor que 5
    public CadastroDeContas(int capacidade) {
        if (capacidade < 5) {
            throw new IllegalArgumentException("\nCapacidade não pode ser menor que 5.");
        }
        this.capacidade = capacidade;
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean cadastrarConta(Conta conta) {
        if (contas.size() < capacidade) {
            contas.add(conta);
            return true;
        } else
            return false;
    }

    public void exibirContas() {
        for (Conta conta: contas){
            System.out.println("Número da Conta: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }
}

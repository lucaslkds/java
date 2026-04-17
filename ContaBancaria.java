import java.util.ArrayList;
import java.util.List;

class ContaBancaria {
    protected double saldo;
    protected List<String> extrato;  

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        this.extrato = new ArrayList<>();
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito: " + valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add("Saque: " + valor);
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para exibir o extrato da conta
    public void exibirExtrato() {
        System.out.println("Extrato da conta:");
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
    }
}


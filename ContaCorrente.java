class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void cobrarTaxa() {
        saldo -= 10;
        extrato.add("Cobrança de taxa: 10");
        System.out.println("Taxa de conta corrente cobrada. Novo saldo: " + saldo);
    }
}


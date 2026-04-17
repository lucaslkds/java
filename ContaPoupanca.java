class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void adicionarJuros() {
        saldo *= 1.05;
        extrato.add("Juros adicionados: 5%");
        System.out.println("Juros de 5% adicionados. Novo saldo: " + saldo);
    }
}

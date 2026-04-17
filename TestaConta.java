public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        contaCorrente.exibirSaldo();
        contaCorrente.cobrarTaxa();
        contaCorrente.depositar(500);  
        contaCorrente.sacar(200); 
        contaCorrente.exibirExtrato();  
        System.out.println();
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
        contaPoupanca.exibirSaldo();
        contaPoupanca.adicionarJuros();
        contaPoupanca.depositar(300); 
        contaPoupanca.sacar(100); 
        contaPoupanca.exibirExtrato(); 
    }
}

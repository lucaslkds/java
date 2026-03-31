package exe1;
import java.util.ArrayList;

public class ListaDeChamadas {
    private ArrayList<Cliente> clientes;

    public ListaDeChamadas() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(String nome, String telefone) {
        Cliente novoCliente = new Cliente(nome, telefone);
        clientes.add(novoCliente);
        System.out.println("Cliente adicionado com sucesso.");
    }

    public void listarTodos() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("\n--- LISTA COMPLETA DE CLIENTES ---");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarPendentes() {
        boolean encontrou = false;

        System.out.println("\n--- CLIENTES PENDENTES ---");
        for (Cliente cliente : clientes) {
            if (!cliente.isContatado()) {
                System.out.println(cliente);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Todos os clientes já foram contatados.");
        }
    }

    public void marcarComoContatado(String telefone) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefone().equals(telefone)) {
                cliente.setContatado(true);
                System.out.println("Cliente " + cliente.getNome() + " marcado como contatado.");
                return;
            }
        }

        System.out.println("Cliente com esse telefone não foi encontrado.");
    }

    public void relatorioFinal() {
        int contatados = 0;
        int pendentes = 0;

        for (Cliente cliente : clientes) {
            if (cliente.isContatado()) {
                contatados++;
            } else {
                pendentes++;
            }
        }

        System.out.println("\n--- RELATÓRIO FINAL DO DIA ---");
        System.out.println("Total de clientes: " + clientes.size());
        System.out.println("Contatados: " + contatados);
        System.out.println("Pendentes: " + pendentes);
    }
}
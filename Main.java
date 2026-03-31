package exe1;
public class Main {
    public static void main(String[] args) {
        ListaDeChamadas lista = new ListaDeChamadas();

        // Adicionando clientes
        lista.adicionarCliente("Carlos Silva", "99999-1111");
        lista.adicionarCliente("Ana Souza", "98888-2222");
        lista.adicionarCliente("Bruno Lima", "97777-3333");
        lista.adicionarCliente("Mariana Costa", "96666-4444");

        // Listando todos
        lista.listarTodos();

        // Marcando alguns como contatados
        lista.marcarComoContatado("98888-2222");
        lista.marcarComoContatado("96666-4444");

        // Listando apenas pendentes
        lista.listarPendentes();

        // Relatório final
        lista.relatorioFinal();
    }
}
package exe1;
public class Cliente {
    private String nome;
    private String telefone;
    private boolean contatado;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.contatado = false;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isContatado() {
        return contatado;
    }

    public void setContatado(boolean contatado) {
        this.contatado = contatado;
    }

    @Override
    public String toString() {
    String status = contatado ? "Contatado" : "Pendente";
    return "Nome: " + nome + " | Telefone: " + telefone + " | Status: " + status;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<IProduto> itens;
    private String andamento;

    public Pedido(int numero, String nomeCliente, String emailCliente, String telefoneCliente, String andamento) {
        this.numero = numero;
        this.cliente = new Cliente(nomeCliente, emailCliente, telefoneCliente);
        this.itens = new ArrayList<>();
        this.andamento = andamento;
    }

    public void adicionaItem(IProduto produto) {
        itens.add(produto);
    }

    public void removerItem(IProduto produto) {
        itens.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (IProduto item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void imprimirPedido() {
        System.out.println("Pedido Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome() + "\nEmail: " + cliente.getEmail() + "\nTelefone: " + cliente.getTelefone());
        System.out.println("Andamento: " + andamento);
        System.out.println("Itens do Pedido:");
        for (IProduto item : itens) {
            System.out.println(" - " + item.getDescricao() + ": R$" + item.getPreco());
        }
        System.out.println("Total do pedido: R$" + calcularTotal());
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<IProduto> getItens() {
        return itens;
    }

    public String getAndamento() {
        return andamento;
    }
}

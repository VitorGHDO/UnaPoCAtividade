package pedidoCliente;  
import cliente.Cliente;

public class PedidoCliente {
    private int id;   
    private Cliente cliente;
    private String descricao;
    private double preco;

    public PedidoCliente(int id, Cliente cliente, String descricao, double preco) {
        this.id = id;
        this.cliente = cliente;
        this.descricao = descricao;
        this.preco = preco;
    }

    public PedidoCliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", cliente=" + cliente.toString() + ", descricao=" + descricao + ", preco=R$" + String.format("%.2f", preco) + "]";
    }
}

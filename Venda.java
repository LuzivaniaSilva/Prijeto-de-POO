import java.util.Date;
import java.util.List;

public class Venda {
    private Date data;
    private List<Produto> produtosVendidos;
    private Vendedor vendedor;
    private Cliente cliente;
    private double valorTotal;

    // Construtor da classe Venda
    public Venda(Date data, List<Produto> produtosVendidos, Vendedor vendedor, Cliente cliente, double valorTotal) throws ValorVendaInvalidoException {
        if (valorTotal <= 0) {
            throw new ValorVendaInvalidoException("O valor total da venda deve ser maior que zero.");
        }
        this.data = data;
        this.produtosVendidos = produtosVendidos;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(List<Produto> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Método para exibir informações da venda
    public void exibirInfo() {
        System.out.println("Data: " + data);
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("Produtos Vendidos:");
        for (Produto p : produtosVendidos) {
            p.exibirInfo();
        }
    }
}

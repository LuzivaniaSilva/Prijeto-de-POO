import java.util.ArrayList;
import java.util.List;

public class SistemaControle {
    private List<Usuario> usuarios;
    private List<Produto> produtos;
    private List<Venda> vendas;

    // Construtor da classe SistemaControle
    public SistemaControle() {
        usuarios = new ArrayList<>();
        produtos = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    // Métodos para adicionar usuários, produtos e vendas
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    // Métodos para buscar produtos e usuários
    public Produto buscarProdutoPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    // Métodos para gerar relatórios
    public void gerarRelatorioVendas() {
        System.out.println("\n----- Relatório de Vendas -----");
        for (Venda v : vendas) {
            v.exibirInfo();
        }
    }

    public void gerarRelatorioEstoque() {
        System.out.println("\n----- Relatório de Estoque -----");
        for (Produto p : produtos) {
            p.exibirInfo();
        }
    }
}

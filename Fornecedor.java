public class Fornecedor extends Usuario {
    // Construtor da classe Fornecedor
    public Fornecedor(String nome, String email) {
        super(nome, email);
    }

    // Implementação do método abstrato exibirInfo
    @Override
    public void exibirInfo() {
        System.out.println("Fornecedor: " + getNome());
        System.out.println("Email: " + getEmail());
    }
}

public class Vendedor extends Usuario {
    // Construtor da classe Vendedor
    public Vendedor(String nome, String email) {
        super(nome, email);
    }

    // Implementação do método abstrato exibirInfo
    @Override
    public void exibirInfo() {
        System.out.println("Vendedor: " + getNome());
        System.out.println("Email: " + getEmail());
    }
}

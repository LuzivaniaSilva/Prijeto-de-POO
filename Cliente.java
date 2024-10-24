public class Cliente extends Usuario {
    // Construtor da classe Cliente
    public Cliente(String nome, String email) {
        super(nome, email);
    }

    // Implementação do método abstrato exibirInfo
    @Override
    public void exibirInfo() {
        System.out.println("Cliente: " + getNome());
        System.out.println("Email: " + getEmail());
    }
}

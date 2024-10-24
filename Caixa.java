public class Caixa extends Usuario {
    // Construtor da classe Caixa
    public Caixa(String nome, String email) {
        super(nome, email);
    }

    // Implementação do método abstrato exibirInfo
    @Override
    public void exibirInfo() {
        System.out.println("Caixa: " + getNome());
        System.out.println("Email: " + getEmail());
    }
}

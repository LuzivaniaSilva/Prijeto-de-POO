public class Gerente extends Usuario {
    // Construtor da classe Gerente
    public Gerente(String nome, String email) {
        super(nome, email);
    }

    // Implementação do método abstrato exibirInfo
    @Override
    public void exibirInfo() {
        System.out.println("Gerente: " + getNome());
        System.out.println("Email: " + getEmail());
    }
}

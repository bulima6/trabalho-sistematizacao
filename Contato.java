public class Contato {
    private String nome;
    private String numeroTelefone;
    private String email;

    public Contato(String nome, String numeroTelefone, String email) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contato: " + nome + ", Telefone: " + numeroTelefone + ", Email: " + email;
    }
}

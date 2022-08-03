import java.util.Scanner;

public class Autor {
    private String nome;
    private String email;
    private Endereco endereco;

    public Autor(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public Autor() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n--- Registrar Autor ---");
        System.out.println("\nNome: ");
        this.nome = leitor.nextLine();
        System.out.println("\nEmail: ");
        this.email = leitor.nextLine();

        this.endereco = new Endereco();
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

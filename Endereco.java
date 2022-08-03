import java.util.Scanner;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;

    public Endereco(String cep, String estado, String cidade) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public Endereco() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\n--- ENDEREÇO ---");
        System.out.println("\nDigite o CEP");
        this.cep = leitor.nextLine();
        System.out.println("\nDigite o estado");
        this.estado = leitor.nextLine();
        System.out.println("\nDigite a cidade");

        this.cidade = leitor.nextLine();
    }

    public String getCep() {
        return this.cep;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}

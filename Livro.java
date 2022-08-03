import java.util.Scanner;

public class Livro {
    private String titulo;
    private String genero;
    private Autor[] autores;

    public Livro() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        this.titulo = leitor.nextLine();
        System.out.println("Digite o genero: ");
        this.genero = leitor.nextLine();
        System.out.println("Informações do autor: ");

        System.out.println("Quantos autores tem o livro? ");
        int numeroAutores = 1;

        do {
            numeroAutores = Integer.parseInt(leitor.nextLine());
            if (numeroAutores >= 1 && numeroAutores <= 4) {
                break;
            } else {
                System.out.println("\nO máximo de autores é 4!");
            }
        } while (true);

        autores = new Autor[numeroAutores];

        for (int i = 0; i < autores.length; i++) {
            autores[i] = new Autor();
        }
    }

    public void exibir() {
        System.out.println("\n--- Livro ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Autores: ");
        for (int i = 0; i < autores.length; i++) {
            System.out.println("\t" + autores[i].getNome());
        }
    }

    public String getTitulo() {
        return this.titulo;
    };

    public String getGenero() {
        return this.genero;
    };

    public Autor[] getAutores() {
        return this.autores;
    };

    public Autor getAutorByName(String nome) {
        return null;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(Autor[] autores) {
        this.autores = autores;
    }

}
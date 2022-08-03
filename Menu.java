import java.util.Scanner;

public class Menu {
    private Livro[] livros;
    private Scanner leitor = new Scanner(System.in);

    public Menu() {
        livros = new Livro[500];
        inicio();
    }

    private void inicio() {
        int opcao;
        do {
            System.out.println("--- Biblioteca ---");
            System.out.println("1. Cadastrar livros ");
            System.out.println("2. Exibir livros ");
            System.out.println("3. Atualizar livro ");// perguntar nome
            System.out.println("4. Exibir livros Arapirquenses ");
            System.out.println("5. Quantos livros determinado autor tem ");
            System.out.println("6. Atualizar endereço de autor ");// pedir nome do autor
            System.out.println("7. Sair ");

            System.out.println("\nDigite a opção: ");
            opcao = Integer.parseInt(leitor.nextLine());
            this.opcoes(opcao);
        } while (opcao != 7);
    }

    private void opcoes(int opcao) {
        switch (opcao) {
            case 1:
                this.cadastrarLivros();
                break;
            case 2:
                this.exibirLivros();
                break;
            case 3:
                this.atualizarLivro();
                break;
            case 4:
                this.exibirLivrosArapiraquenses();
                break;
            case 5:
                this.numeroDeLivrosDeDeterminadoAutor();
                break;
            case 6:
                this.atualizarEnderecoDeAutor();
                break;
            case 7:
                System.out.println("Sair. ");
                break;

            default:
                break;
        }
    }

    private void cadastrarLivros() {
        Livro livro = new Livro();

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                return;
            }
        }
        // se o código chegou nessa linha, é porque o return não aconteceu
        // e nenhuma posição vaiza foi encontrada.
        System.out.println("\nA lista de livros está cheia! 500 livros registrados.");
    }

    private void exibirLivros() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                livros[i].exibir();
            }
        }
    }

    private void atualizarLivro() {
        System.out.println("\nDigite o titulo do livro para atualizar ");
        String tituloPesquisa = leitor.nextLine();
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].getTitulo().equalsIgnoreCase(tituloPesquisa)) {
                    System.out.println("\nDigite o novo gênero do livro: ");
                    String genero = leitor.nextLine();
                    livros[i].setGenero(genero);
                }
            }
        }
    }

    private void exibirLivrosArapiraquenses() {
        for (int i = 0; i < livros.length; i++) { // faz a iteração dos livros
            boolean encontrou = false;
            if (livros[i] != null) {
                for (int j = 0; j < livros[i].getAutores().length; j++) { // faz a iteração dos autores do livro de [i]
                    if (livros[i].getAutores()[j].getEndereco().getCidade().equalsIgnoreCase("arapiraca")) {
                        encontrou = true;
                        break;
                    }
                }
                if (encontrou) {
                    livros[i].exibir();
                }
            }
        }
    }

    private void numeroDeLivrosDeDeterminadoAutor() {
        int numeroDeLivros = 0;

        System.out.println("\nDigite o nome do Autor: ");
        String autorPesquisa = leitor.nextLine();

        for (int i = 0; i < livros.length; i++) { // faz a iteração dos livros
            if (livros[i] != null) {
                for (int j = 0; j < livros[i].getAutores().length; j++) { // faz a iteração de autores do livro [i]
                    if (livros[i].getAutores()[j].getNome().equalsIgnoreCase(autorPesquisa)) {
                        numeroDeLivros++;
                    }
                }
            }
        }

        System.out.println("\nO autor pesquisado tem " + numeroDeLivros + " livro(s) registrados.");
    }

    private void atualizarEnderecoDeAutor() {
        System.out.println("\nDigite o nome do Autor: ");
        String autorPesquisa = leitor.nextLine();

        for (int i = 0; i < livros.length; i++) { // faz a iteração dos livros
            if (livros[i] != null) {
                for (int j = 0; j < livros[i].getAutores().length; j++) { // faz a iteração de autores do livro [i]
                    if (livros[i].getAutores()[j].getNome().equalsIgnoreCase(autorPesquisa)) {
                        Endereco endereco = new Endereco();
                        livros[i].getAutores()[j].setEndereco(endereco);
                    }
                }
            }
        }
    }
}

import java.util.Objects;

class Livro {
    private String titulo;
    private String autor;

    public Livro(String tituloInicial, String autorInicial) {
        this.setTitulo(tituloInicial);
        this.setAutor(autorInicial);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(final String titulo) {
        this.titulo = (titulo == null || titulo.trim().isEmpty()) ? "[Título Desconhecido]" : titulo.trim();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(final String autor) {
         this.autor = (autor == null || autor.trim().isEmpty()) ? "[Autor Desconhecido]" : autor.trim();
    }

    public void exibirDados() {
        System.out.println("Livro -> Título: '" + this.titulo + "', Autor: " + this.autor);
    }
}

public class Exercicio6_3 {
    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 6.3: Classe Livro ---");

        Livro livro1 = new Livro("O Senhor dos Anéis", "não lembro Tolkien");
        livro1.exibirDados();

        Livro livro2 = new Livro(" ", null);
        livro2.exibirDados();

        livro2.setTitulo("Clean Code");
        livro2.setAutor("Robert C. Martin");
        System.out.println("Dados livro2 atualizados:");
        System.out.println("Título via getter: " + livro2.getTitulo());
        System.out.println("Autor via getter: " + livro2.getAutor());
        livro2.exibirDados();

        livro1.setTitulo(""); 
        livro1.exibirDados();


        System.out.println("--- Fim Teste 6.3 ---");
    }
}

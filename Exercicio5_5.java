import java.util.Objects;

public final class Exercicio5_5 {

    private Exercicio5_5() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirItem(final char caractere) {
        System.out.println("Caractere: " + caractere);
    }

    public static void exibirItem(final String texto) {
        String textoValido = Objects.requireNonNullElse(texto, "[String Nula]");
        System.out.println("String: " + textoValido);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 5.5: Overload Char/String ---");
        exibirItem('A');
        exibirItem("Palavra");
        exibirItem('5');
        exibirItem("");
        exibirItem(null);
        System.out.println("--- Fim Teste 5.5 ---");
    }
}
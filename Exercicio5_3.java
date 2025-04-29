import java.util.Objects;

public final class Exercicio5_3 {

    private Exercicio5_3() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirTexto(final String texto) {
        String textoValido = Objects.requireNonNullElse(texto, "[Texto Nulo]");
        System.out.println("Texto Simples: " + textoValido);
    }

    public static void exibirTexto(final String texto, final int repeticoes) {
         String textoValido = Objects.requireNonNullElse(texto, "[Texto Nulo]");
         if (repeticoes <= 0) {
             System.out.println("Texto Repetido: Número de repetições inválido (" + repeticoes + ")");
             return;
         }
         System.out.print("Texto Repetido (" + repeticoes + "x): ");
         for (int i = 0; i < repeticoes; i++) {
             System.out.print(textoValido + " ");
         }
         System.out.println(); 
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 5.3: Overload Texto ---");
        exibirTexto("Java é poderoso!");
        exibirTexto("Repetir", 3);
        exibirTexto(null);
        exibirTexto("Inválido", 0);
        exibirTexto("Inválido", -2);
        exibirTexto(null, 5);
        System.out.println("--- Fim Teste 5.3 ---");
    }
}
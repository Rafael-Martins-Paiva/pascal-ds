import java.util.Objects;

public final class Exercicio4_4 {

     private Exercicio4_4() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static String concatenar(final String texto1, final String texto2) {
        String seguroTexto1 = Objects.requireNonNullElse(texto1, "");
        String seguroTexto2 = Objects.requireNonNullElse(texto2, "");
        return seguroTexto1 + seguroTexto2;
    }

     public static void main(String[] args) {
        System.out.println("--- Testando Exercício 4.4 ---");
        String concat1 = concatenar("Programação ", "Orientada a Amor");
        System.out.println("Resultado 1: '" + concat1 + "'");

        String concat2 = concatenar("Teste ", null);
        System.out.println("Resultado 2: '" + concat2 + "'");

        String concat3 = concatenar(null, " com Nulo");
        System.out.println("Resultado 3: '" + concat3 + "'");

        String concat4 = concatenar(null, null);
        System.out.println("Resultado 4: '" + concat4 + "'");

         String concat5 = concatenar("", "");
        System.out.println("Resultado 5: '" + concat5 + "'");
        System.out.println("--- Fim Teste 4.4 ---");
    }
}

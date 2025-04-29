import java.util.Objects;

public final class Exercicio3_1 {

    private Exercicio3_1() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirMensagem(final String mensagem) {
        String mensagemValida = Objects.requireNonNullElse(mensagem, "[Mensagem Nula Fornecida]");
        System.out.println("Mensagem: " + mensagemValida);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 3.1 ---");
        exibirMensagem("Olá, MB!");
        exibirMensagem("alguma coisa.");
        exibirMensagem(null);
        System.out.println("--- Fim Teste 3.1 ---");
    }
}

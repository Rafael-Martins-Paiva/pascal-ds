public final class Exercicio3_4 {

    private Exercicio3_4() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirSignoNumero(final int numero) {
        if (numero == 0) {
            System.out.println("O número " + numero + " é Zero.");
            return;
        }
        if (numero > 0) {
            System.out.println("O número " + numero + " é Positivo.");
            return;
        }
        System.out.println("O número " + numero + " é Negativo.");
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 3.4 ---");
        exibirSignoNumero(50);
        exibirSignoNumero(-10);
        exibirSignoNumero(0);
        exibirSignoNumero(1);
        exibirSignoNumero(-1);
        System.out.println("--- Fim Teste 3.4 ---");
    }
}
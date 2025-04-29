public final class Exercicio5_1 {

    private Exercicio5_1() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirNumero(final int numero) {
        System.out.println("Número Inteiro: " + numero);
    }

    public static void exibirNumero(final double numero) {
        System.out.println("Número Real (double): " + numero);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 5.1: Overload Int/Double ---");
        exibirNumero(100);
        exibirNumero(25.75);
        exibirNumero(0);
        exibirNumero(-15.5);
        System.out.println("--- Fim Teste 5.1 ---");
    }
}
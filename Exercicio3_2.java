public final class Exercicio3_2 {

    private Exercicio3_2() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirSoma(final int numeroUm, final int numeroDois) {
        int soma = numeroUm + numeroDois;
        System.out.println(numeroUm + " + " + numeroDois + " = " + soma);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 3.2 ---");
        exibirSoma(10, 25);
        exibirSoma(-5, 8);
        exibirSoma(0, 0);
        System.out.println("--- Fim Teste 3.2 ---");
    }
}

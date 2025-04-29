public final class Exercicio5_4 {

    private Exercicio5_4() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void calcularEExibirSoma(final int a, final int b) {
        int soma = a + b;
        System.out.println(a + " + " + b + " = " + soma);
    }

    public static void calcularEExibirSoma(final int a, final int b, final int c) {
        int soma = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + soma);
    }

    public static void calcularEExibirSoma(final int a, final int b, final int c, final int d) {
        int soma = a + b + c + d;
        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + soma);
    }

     public static void main(String[] args) {
        System.out.println("--- Testando Exercício 5.4: Overload Soma ---");
        calcularEExibirSoma(10, 20);
        calcularEExibirSoma(5, 10, 15);
        calcularEExibirSoma(2, 4, 6, 8);
        calcularEExibirSoma(-1, 1);
        calcularEExibirSoma(1, 2, -3);
        System.out.println("--- Fim Teste 5.4 ---");
    }
}
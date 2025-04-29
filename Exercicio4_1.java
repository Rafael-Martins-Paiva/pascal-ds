public final class Exercicio4_1 {

     private Exercicio4_1() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static int multiplicar(final int fator1, final int fator2) {
        return fator1 * fator2;
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 4.1 ---");
        int produto1 = multiplicar(5, 4);
        System.out.println("5 * 4 = " + produto1);

        int produto2 = multiplicar(-6, 3);
        System.out.println("-6 * 3 = " + produto2);

        int produto3 = multiplicar(10, 0);
        System.out.println("10 * 0 = " + produto3);
        System.out.println("--- Fim Teste 4.1 ---");
    }
}
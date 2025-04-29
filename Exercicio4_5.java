public final class Exercicio4_5 {

    private static final int IDADE_MINIMA_MAIORIDADE = 18;

    private Exercicio4_5() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static boolean verificarMaioridade(final int idade) {
        if (idade < 0) {
             return false;
        }
        return idade >= IDADE_MINIMA_MAIORIDADE;
    }

     public static void main(String[] args) {
        System.out.println("--- Testando Exercício 4.5 ---");
        boolean maior1 = verificarMaioridade(20);
        System.out.println("Idade 20 é maior de idade? " + maior1);

        boolean maior2 = verificarMaioridade(18);
        System.out.println("Idade 18 é maior de idade? " + maior2);

        boolean maior3 = verificarMaioridade(17);
        System.out.println("Idade 17 é maior de idade? " + maior3);

        boolean maior4 = verificarMaioridade(0);
        System.out.println("Idade 0 é maior de idade? " + maior4);

        boolean maior5 = verificarMaioridade(-5);
        System.out.println("Idade -5 é maior de idade? " + maior5);
        System.out.println("--- Fim Teste 4.5 ---");
    }
}
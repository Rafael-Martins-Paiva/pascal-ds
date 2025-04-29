public final class Exercicio4_3 {

     private Exercicio4_3() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static int calcularDobro(final int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 4.3 ---");
        int dobro1 = calcularDobro(15);
        System.out.println("Dobro de 15 = " + dobro1);

        int dobro2 = calcularDobro(-7);
        System.out.println("Dobro de -7 = " + dobro2);

        int dobro3 = calcularDobro(0);
        System.out.println("Dobro de 0 = " + dobro3);
        System.out.println("--- Fim Teste 4.3 ---");
    }
}
public final class Exercicio5_2 {

    private Exercicio5_2() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void calcularEExibirArea(final double lado) {
        if (lado < 0) {
            System.out.println("Área do Quadrado: Lado inválido (" + lado + ")");
            return;
        }
        double area = lado * lado;
        System.out.println("Área do Quadrado (lado=" + lado + "): " + area);
    }

    public static void calcularEExibirArea(final double comprimento, final double largura) {
        if (comprimento < 0 || largura < 0) {
            System.out.println("Área do Retângulo: Dimensões inválidas (" + comprimento + ", " + largura + ")");
            return;
        }
        double area = comprimento * largura;
        System.out.println("Área do Retângulo (C=" + comprimento + ", L=" + largura + "): " + area);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 5.2: Overload Área ---");
        calcularEExibirArea(5.0);
        calcularEExibirArea(10.0, 4.0);
        calcularEExibirArea(-2.0);
        calcularEExibirArea(6.0, -3.0);
        calcularEExibirArea(0.0);
        calcularEExibirArea(0.0, 5.0);
        System.out.println("--- Fim Teste 5.2 ---");
    }
}
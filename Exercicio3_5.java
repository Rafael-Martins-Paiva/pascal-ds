public final class Exercicio3_5 {

     private Exercicio3_5() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

     public static void exibirSaudacaoPersonalizada(final String nome) {
         String nomeParaSaudacao = (nome == null || nome.trim().isEmpty()) ? "Visitante" : nome.trim();
         System.out.println("Olá, " + nomeParaSaudacao + "! Tenha um ótimo dia!");
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 3.5 ---");
        exibirSaudacaoPersonalizada("Ana");
        exibirSaudacaoPersonalizada("   João Pedro  ");
        exibirSaudacaoPersonalizada("");
        exibirSaudacaoPersonalizada(null);
        System.out.println("--- Fim Teste 3.5 ---");
    }
}
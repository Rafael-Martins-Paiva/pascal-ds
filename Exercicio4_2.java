public final class Exercicio4_2 {

     private Exercicio4_2() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static String criarMensagemBoasVindas(final String nome) {
        String nomeFormatado = (nome == null || nome.trim().isEmpty()) ? "Prezado(a) Usuário(a)" : nome.trim();
        return "Bem-vindo(a), " + nomeFormatado + "!";
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 4.2 ---");
        String msg1 = criarMensagemBoasVindas("Fernanda");
        System.out.println(msg1);

        String msg2 = criarMensagemBoasVindas("   ");
        System.out.println(msg2);

        String msg3 = criarMensagemBoasVindas(null);
        System.out.println(msg3);
        System.out.println("--- Fim Teste 4.2 ---");
    }
}
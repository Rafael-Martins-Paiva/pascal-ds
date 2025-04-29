public final class Exercicio3_3 {

    private Exercicio3_3() {
        throw new UnsupportedOperationException("Classe utilitária não instanciável.");
    }

    public static void exibirDadosPessoa(final String nome, final int idade) {
        String nomeValido = (nome == null || nome.trim().isEmpty()) ? "[Nome Inválido]" : nome.trim();
        String idadeValida = (idade < 0) ? "[Idade Inválida]" : String.valueOf(idade);

        System.out.println("Pessoa -> Nome: " + nomeValido + ", Idade: " + idadeValida);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 3.3 ---");
        exibirDadosPessoa("Carlos Silva", 30);
        exibirDadosPessoa(" ", 25);
        exibirDadosPessoa(null, -1);
        exibirDadosPessoa("Maria", 0);
        System.out.println("--- Fim Teste 3.3 ---");
    }
}
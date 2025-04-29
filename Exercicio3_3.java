public final class Exercicio3_3 {

    private Exercicio3_3() {
        throw new UnsupportedOperationException("Classe utilitária");
    }

    public static void exibirDadosPessoa(final String nome, final int idade) {
        String nomeValido = (nome == null || nome.trim().isEmpty()) ? "[Nome Inválido]" : nome;
        String idadeValida = (idade < 0) ? "[Idade Inválida]" : String.valueOf(idade);

        System.out.println("Pessoa -> Nome: " + nomeValido + ", Idade: " + idadeValida);
    }

    public static void exibirDadosPessoa(final String nome, final boolean mb) {
        String nomeValido = (nome == null || nome.trim().isEmpty()) ? "[Nome Inválido]" : nome;
        String nota_mb = mb ? "verdadeiro" : "falso";

        System.out.println("Pessoa -> Nome: " + nomeValido + ", nota mb: " + nota_mb);
    }

    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 3.3 ---");
        boolean mb = true;
        exibirDadosPessoa("rafael", mb); 
        exibirDadosPessoa(" ", 25); 
        exibirDadosPessoa(null, -1); 
        exibirDadosPessoa("Maria", 0); 
        System.out.println("--- Fim Teste 3.3 ---");
    }
}

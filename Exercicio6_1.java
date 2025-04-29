import java.util.Objects;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nomeInicial, int idadeInicial) {
        this.setNome(nomeInicial);
        this.setIdade(idadeInicial);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = (nome == null || nome.trim().isEmpty()) ? "[Nome Inválido]" : nome.trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(final int idade) {
        this.idade = (idade < 0) ? 0 : idade; 
    }

    public void exibirDados() {
         System.out.println("Pessoa -> Nome: " + this.nome + ", Idade: " + this.idade);
    }
}

public class Exercicio6_1 {
    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 6.1: Classe Pessoa ---");

        Pessoa p1 = new Pessoa("Maria Silva", 25);
        p1.exibirDados();

        Pessoa p2 = new Pessoa(null, -10);
        p2.exibirDados();

        p2.setNome("João Souza");
        p2.setIdade(30);
        System.out.println("Dados p2 atualizados:");
        System.out.println("Nome via getter: " + p2.getNome());
        System.out.println("Idade via getter: " + p2.getIdade());
        p2.exibirDados();

        p1.setIdade(-177); 
        p1.exibirDados();


        System.out.println("--- Fim Teste 6.1 ---");
    }
}

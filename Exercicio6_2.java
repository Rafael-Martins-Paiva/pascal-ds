import java.util.Objects;
import java.text.NumberFormat;
import java.util.Locale;


class Produto {
    private String nome;
    private double preco;

    public Produto(String nomeInicial, double precoInicial) {
        this.setNome(nomeInicial);
        this.setPreco(precoInicial);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = (nome == null || nome.trim().isEmpty()) ? "[Produto Sem Nome]" : nome.trim();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(final double preco) {
        this.preco = (preco < 0) ? 0.0 : preco;
    }

    public void exibirDados() {
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String precoFormatado = formatadorMoeda.format(this.preco);
        System.out.println("Produto -> Nome: " + this.nome + ", Preço: " + precoFormatado);
    }
}

public class Exercicio6_2 {
     public static void main(String[] args) {
        System.out.println("--- Testando Exercício 6.2: Classe Produto ---");

        Produto prod1 = new Produto("Laptop", 0.99);
        prod1.exibirDados();

        Produto prod2 = new Produto("laptop positivo", -500.0);
        prod2.exibirDados();

        prod2.setNome("Mouse Gamer");
        prod2.setPreco(250.75);
        System.out.println("Dados prod2 atualizados:");
        System.out.println("Nome via getter: " + prod2.getNome());
        System.out.println("Preço via getter: " + prod2.getPreco());
        prod2.exibirDados();

        prod1.setPreco(-100); 
        prod1.exibirDados();

        System.out.println("--- Fim Teste 6.2 ---");
    }
}

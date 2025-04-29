import java.util.Objects;

class Animal {
    private String tipo;
    private String som;

     public Animal(String tipoInicial, String somInicial) {
        this.setTipo(tipoInicial);
        this.setSom(somInicial);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = (tipo == null || tipo.trim().isEmpty()) ? "[Tipo Indefinido]" : tipo.trim();
    }

    public String getSom() {
        return som;
    }

    public void setSom(final String som) {
         this.som = (som == null || som.trim().isEmpty()) ? "[Som Indefinido]" : som.trim();
    }

    public void exibirDados() {
        System.out.println("Animal -> Tipo: " + this.tipo + ", Som: " + this.som);
    }
}

public class Exercicio6_4 {
    public static void main(String[] args) {
        System.out.println("--- Testando Exercício 6.4: Classe Animal ---");

        Animal an1 = new Animal("Cachorro", "Au Au");
        an1.exibirDados();

        Animal an2 = new Animal(null, "");
        an2.exibirDados();

        an2.setTipo("Gato");
        an2.setSom("Miau");
        System.out.println("Dados an2 atualizados:");
        System.out.println("Tipo via getter: " + an2.getTipo());
        System.out.println("Som via getter: " + an2.getSom());
        an2.exibirDados();

        an1.setTipo(null); 
        an1.exibirDados();

        System.out.println("--- Fim Teste 6.4 ---");
    }
}
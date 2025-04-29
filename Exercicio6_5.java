import java.util.Objects;
import java.text.NumberFormat;
import java.util.Locale;

class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titularInicial, double saldoInicial) {
        this.setTitular(titularInicial);
        
        this.saldo = (saldoInicial < 0) ? 0.0 : saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(final String titular) {
        this.titular = (titular == null || titular.trim().isEmpty()) ? "[Titular Inválido]" : titular.trim();
    }

    public double getSaldo() {
        return saldo;
    }

    
    
    public void setSaldo(final double saldo) {
         if (saldo < 0) {
             System.err.println("Aviso: Tentativa de definir saldo negativo. Mantendo saldo atual: " + formatarMoeda(this.saldo));
             
         } else {
            this.saldo = saldo;
         }
    }

    
    private String formatarMoeda(double valor) {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor);
    }

    public void exibirDados() {
        System.out.println("Conta -> Titular: " + this.titular + ", Saldo: " + formatarMoeda(this.saldo));
    }
}

public class Exercicio6_5 {
     public static void main(String[] args) {
        System.out.println("--- Testando Exercício 6.5: Classe ContaBancaria ---");

        ContaBancaria conta1 = new ContaBancaria("Ana Scolary", 1500.50);
        conta1.exibirDados();

        ContaBancaria conta2 = new ContaBancaria(null, -200.0);
        conta2.exibirDados();

        conta2.setTitular("Maria Mara");
        conta2.setSaldo(5000.00);
        System.out.println("Dados conta2 atualizados:");
        System.out.println("Titular via getter: " + conta2.getTitular());
        System.out.println("Saldo via getter: " + conta2.getSaldo()); 
        conta2.exibirDados(); 

        System.out.println("Tentando definir saldo negativo para conta1:");
        conta1.setSaldo(-100.0);
        conta1.exibirDados(); 


        System.out.println("--- Fim Teste 6.5 ---");
    }
}
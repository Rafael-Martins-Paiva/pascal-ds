import java.util.Scanner;

public class name {
    public static void main(String[] args) throws Exception {
        String name;
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe seu nome completo:\n");
        name = ler.next();
        System.out.println("seu nome é: " + name);
        System.out.println("fim...");
    }
}

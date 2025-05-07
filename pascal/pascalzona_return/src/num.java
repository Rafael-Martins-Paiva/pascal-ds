public class num {
    public static class pauloLindo {
        public int getNum(int numero) {
            return numero;
        } // ele retorna o numero
    }
    public static void main(String[] args) {
        int numero = 100; // cria a variavel numero que recebe 100
        pauloLindo num = new pauloLindo();
        System.out.println("numero: " + num.getNum(numero)); // printa a mensagem numero e retorna a variavel numero
    }
}

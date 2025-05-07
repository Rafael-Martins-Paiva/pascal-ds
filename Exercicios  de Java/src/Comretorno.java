public class Comretorno {
    public static class Pessoa {

        public String getNomeCompleto() {
            return "Paulo Roger o mais Lindo";
        }  // retorna o nome completo

        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();
            System.out.printf("Nome completo: " + pessoa.getNomeCompleto()); // printa o nome formatado
        }
    }

}

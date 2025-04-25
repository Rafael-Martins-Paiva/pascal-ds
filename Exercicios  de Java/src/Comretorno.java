public class Comretorno {
    public static class Pessoa {

        public String getNomeCompleto() {
            return "Nylly Linda Perfeita e Mara";
        }

        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Nome completo: " + pessoa.getNomeCompleto());
        }
    }

}

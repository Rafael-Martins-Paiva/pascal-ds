public class PauloLindo {
    public static class truee {
        public int getTrue(boolean booleano) {
            return booleano ? 1 : 0; // ele retorna 1 ou 0, dependendo se o for true ou false
        }
    }

    public static void main(String[] args) {
        boolean booleano = true; // ele define a variavel booleana
        truee pauloLindo = new truee();
        System.out.println(pauloLindo.getTrue(booleano)); // printa o resultado
    }
}

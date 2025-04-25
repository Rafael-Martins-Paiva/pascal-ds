public class PauloLindo {
    public static class truee {
        public int getTrue(boolean booleano) {
            return booleano ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        boolean booleano = true;
        truee pauloLindo = new truee();
        System.out.println(pauloLindo.getTrue(booleano));
    }
}

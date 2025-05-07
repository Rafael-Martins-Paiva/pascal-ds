public class atividade_dois {
        public static class pauloLindo {
            public float getPi(float pi) {
                return pi;
            } // ele retorna o pi
        }
        public static void main(String[] args) {
            float pi = 3.14159F; // cria a variavel numero que recebe o pi
            pauloLindo pii = new pauloLindo();
            System.out.println("numero: " + pii.getPi(pi)); // printa a mensagem numero e retorna a variavel pi
        }
    }


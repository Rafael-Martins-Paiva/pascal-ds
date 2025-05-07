public class return_name {
    public static class pauloLindo {
        public String getNome(String username) {
            return username;
        }
    }
    public static void main(String[] args) {
        String username = System.getProperty("user.name"); // pegar o nome do usuario logado
        pauloLindo pessoa = new pauloLindo();  // ele instancia
        System.out.println("Usuário logado: " + pessoa.getNome(username)); // retorna nome do usuario
    }
}

public class return_name {
    public static class pauloLindo {
        public String getNome(String username) {
            return username;
        }
    }
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        pauloLindo pessoa = new pauloLindo();
        System.out.println("Usuário logado: " + pessoa.getNome(username));
    }
}

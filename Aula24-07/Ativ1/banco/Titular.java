public class Titular {
        private String nome;
        private String cpf;
        private String data;

    Titular(String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
    }

    public void setNome(String novoNome) {
        if (novoNome == null || novoNome.isEmpty()) {
            System.out.println("Nome Invalido");
            return;
        }
        this.nome = novoNome;
        
    }
    public String getNome() {
        return this.nome;
    }


}

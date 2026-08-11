public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Milho";
        p1.preco = 8.50;
        p1.estoque = 2;

        p1.exibirInfo();
        p1.venderProduto();
        p1.venderProduto();
        p1.venderProduto();
        p1.exibirInfo();
    }
    
}

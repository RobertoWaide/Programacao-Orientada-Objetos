public class Produto {
    String nome;
    Double preco;
    int estoque;

    void exibirInfo() {
        System.out.println("\nProduto: " + nome + "\nPreço: " + preco + "\nQnt estoque: " + estoque);
    }

    void venderProduto() {
        if  (estoque <= 0) {
            System.out.println("\nEstoque Insuficiente!");
        } else {
            estoque = estoque - 1;
            System.out.println("\nProduto vendido \nEstoque atualizado: " + estoque);
        }
    }
}

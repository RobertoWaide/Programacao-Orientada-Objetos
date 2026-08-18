public class Pedido {
    String cliente;
    String produto;
    double preco;
    int quantidade;


    public Pedido(String cliente, String produto, double preco, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void resumo(){
        System.out.println("\nUsuario:"+cliente+"\nNome do Produto:"+produto+"\nPreço Final: "+(quantidade*preco));
    }
}

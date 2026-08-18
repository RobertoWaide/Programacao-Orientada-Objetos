public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;


    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    void resumo(){
        System.out.println("\nUsuario: "+cliente.nome+"\nNome do Produto: "+produto.nome+"\nPreço Final: "+(quantidade*produto.preco));
    }
}

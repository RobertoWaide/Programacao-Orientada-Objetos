public class Principal{

    public static void main(String[] args) {
    
    Cliente c1 = new Cliente("Duda", "Maria@duda.com");
    Produto p1 = new Produto("Telefone", 2500);
    Pedido o1 = new Pedido(c1, p1 , 5);

    Cliente c2 = new Cliente("Thiago", "Thiago@gov.br");
    Produto p2 = new Produto("Televisão", 3000);
    Pedido o2 = new Pedido(c2, p2, 2);

    o1.resumo();
    o2.resumo();

    }
}
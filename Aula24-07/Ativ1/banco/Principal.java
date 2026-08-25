public class Principal {

    public static void main(String[] args) {
        Titular titular1 = new Titular("Julia","1500",null);
        ContaBancaria c1 = new ContaBancaria(titular1,500);

        c1.exibir();
        c1.exibir();
        

        c1.depositar(500);
        c1.aplicarPercentual(130);
        c1.aplicarPercentual(50);
        c1.exibir();

        c1.sacar(750);
        c1.sacar(450);
        c1.aplicarPercentual(-10);
        c1.aplicarPercentual(30);
        c1.exibir();
    }
}
public class Principal {

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        c1.titular = "Julia";
        c2.titular = "Pedro";

        c1.saldo = 1500;
        c2.saldo = 500;

        c1.exibir();
        c2.exibir();

        c1.depositar(500);
        c1.exibir();

        c2.sacar(750);
        c2.sacar(450);
        c2.exibir();
    } 
}
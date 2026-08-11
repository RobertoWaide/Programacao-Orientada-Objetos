public class ContaBancaria {
    String titular;
    double saldo;
    

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("\nDeposito concluido!");
    }
    void sacar(double valor) {
        if (saldo - valor > -1) {
            saldo = saldo - valor;
            System.out.println("\nSaque concluido!");
        } else {
            System.out.println("\nSaque Invalido - Valor Exedido");
        }
    }
    void exibir(){
        System.out.println("\nTitular da Conta: " + titular + "\nSaldo atual: " + saldo);
    }
}

public class ContaBancaria {
    String titular;
    double saldo;
    

    depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("\nDeposito concluido!");
    }
    sacar(double valor) {
        if (saldo - valor > -1) {
            saldo = saldo - valor;
            System.out.println("\nSaque concluido!");
        }
    }
    exibir(){
        System.out.println("\nSaldo atual: " + saldo);
    }
}

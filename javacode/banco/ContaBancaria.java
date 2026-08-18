public class ContaBancaria {
    Titular titular;

    double saldo;
    int operacoes = 0;

    ContaBancaria(Titular nome, double saldoInicial) {
        this.titular = nome;
        this.saldo = saldoInicial;
        
    }

    
    

    void depositar(double valor) {
        if (valor < 0){
            saldo += valor;
            System.out.println("\nDeposito concluido!");
            operacoes += 1;
        }else{
            System.out.println("Deposite um saldo positivo!");
        }
    }
    void sacar(double valor) {
        valor += 0.50;
        if (saldo - valor > -1) {
            saldo -= valor;
            System.out.println("\nSaque concluido!");
            operacoes += 1;
        } else {
            System.out.println("\nSaque Invalido - Valor Exedido");
        }
    }
    void exibir(){
        System.out.println("\nTitular da Conta: " + titular.nome + "\nSaldo atual: " + saldo + "\nNúmero de operações:"+operacoes);
    }
    void aplicarPercentual(double percentual){
        if (percentual >= 0 && percentual <= 100){
            double valor = saldo + (saldo*(percentual/100));
            System.out.println("\nSeu percentual de: "+percentual+"% é de: "+valor+" baseado no seu saldo atual!");
        } else {
            System.out.println("\nValor de percentual invalido!");
        }
    }
}
import java.util.ArrayList;

public class Banco {
    private int proximoNumero = 1;
    private ArrayList<ContaBancaria> contas;

    Banco() {
        this.contas = new ArrayList<>();
        this.proximoNumero = 1;
    }

    public void abrirConta(Titular titular, double saldoInicial) {
        ContaBancaria novaConta =
            new ContaBancaria(proximoNumero, titular, saldoInicial);

        contas.add(novaConta);
        proximoNumero++;
    }

    public ContaBancaria buscarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;}
        }
        System.out.println("Conta não encontrada!");
        return null;}

    
    public void depositar(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);}
    }
        public void sacar(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.sacar(valor);}
    }
        public void aplicarPercentual(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.aplicarPercentual(valor);}
    }
    public void exibirExtrato(int numeroConta) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.exibirExtrato();}
    }
    public void totalDepositado(int numeroConta) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.totalDepositado();}
    }
    public void maiorSaque(int numeroConta) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.maiorSaque();}
    }
    
}

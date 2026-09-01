import java.util.ArrayList;

public class ContaBancaria {
    private Titular titular;

    private double saldo;
    private int operacoes;

    private ArrayList<Double> movimentacoes;


    ContaBancaria(Titular nome, double saldoInicial) {
        this.titular = nome;
        this.saldo = saldoInicial;
        this.operacoes = 0;
        this.movimentacoes = new ArrayList<>();
        
    }


    void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.println("\nDeposito concluido!");
            movimentacoes.add(valor);
            operacoes ++;
        }else{
            System.out.println("Deposite um saldo positivo!");
        }
    }
    void sacar(double valor) {
        valor += 0.50;
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("\nSaque concluido!");
            movimentacoes.add((-valor));
            operacoes ++;
        } else {
            System.out.println("\nSaque Invalido - Valor Exedido");
        }
    }


    void aplicarPercentual(double percentual){
        if (percentual >= 0 && percentual <= 100){
            double valor = saldo + (saldo*(percentual/100));
            System.out.println("\nSeu percentual de: "+percentual+"% é de: "+valor+" baseado no seu saldo atual!");
        } else {
            System.out.println("\nValor de percentual invalido!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }   
    
    public int getOperacoes() {
        return this.operacoes;

    }

    public String getNome() {
        return titular.getTitular();
    }

    public void exibirExtrato() {
        System.out.println("\nUltimas movimentações: ");
        for (Double movimentacao : movimentacoes) {
            System.out.println(movimentacao);
    }}

    public void totalDepositado() {
        Double soma = 0.0;
        for (Double movimentacao : movimentacoes) {
            if (movimentacao > 0) {
                soma += movimentacao;
            }}
        System.out.print("\nTotal depositado no mês: "+soma);
    }

    public void maiorSaque() {
        Double maior = 0.0;
        for (Double movimentacao : movimentacoes) {
            if (movimentacao < maior){
                maior = movimentacao;
            }}
        System.out.println("\nSeu maior saque foi de: "+maior);
    }
}

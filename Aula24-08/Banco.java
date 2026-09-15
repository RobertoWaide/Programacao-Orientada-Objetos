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
                return conta;}}
        return null;
    }
    
    public void depositar(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
    public void sacar(int numeroConta, double valor) {
        ContaBancaria conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

}